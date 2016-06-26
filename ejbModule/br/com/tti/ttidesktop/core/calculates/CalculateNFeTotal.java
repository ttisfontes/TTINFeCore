package br.com.tti.ttidesktop.core.calculates;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import br.com.tti.ttidesktop.core.util.XMLGenerator;
import br.com.tti.ttidesktop.schema.xml.nfe.Det;
import br.com.tti.ttidesktop.schema.xml.nfe.Imposto;
import br.com.tti.ttidesktop.schema.xml.nfe.Prod;
import br.com.tti.ttidesktop.schema.xml.nfe.TIpi;
import br.com.tti.ttidesktop.schema.xml.nfe.TNFe;
import br.com.tti.ttidesktop.schema.xml.nfe.TNfeProc;
import br.com.tti.ttidesktop.schema.xml.nfe.Total;

public class CalculateNFeTotal {

	private TNFe nfe;

	public CalculateNFeTotal(TNFe nfe) {
		super();
		this.nfe = nfe;
	}

	private <T> List<Object> findNotNull(T obj) throws Exception {
		Class<?> classs = obj.getClass();

		List<Object> list = new ArrayList<>();
		Field[] fields = classs.getDeclaredFields();
		Method[] methods = classs.getMethods();
		for (Field field : fields) {

			for (Method method : methods) {
				if (method.getName().toLowerCase().equals("get" + field.getName().toLowerCase())
						&& method.getParameterCount() == 0) {
					Object obj1 = method.invoke(obj, new Object[] {});
					if (obj1 != null) {
						list.add(obj1);
						break;
					}
				}
			}

		}

		List<Object> subList = new ArrayList<>();
		list.forEach(obj1 -> {
			try {
				List<Object> ll = this.findNotNull(obj1);
				subList.addAll(ll);
			} catch (Exception e) {
				e.printStackTrace();
			}

		});

		list.addAll(subList);
		return list;
	}

	private Hashtable<String, List<String>> valuesForTag(Object obj, List<String> tagNames) throws Exception {
		Hashtable<String, List<String>> tableValues = new Hashtable<String, List<String>>();

		Class<?> classs = obj.getClass();
		Method[] methods = classs.getMethods();

		for (String tagName : tagNames) {
			for (Method method : methods) {
				String tagg = "get" + tagName;
				if (method.getName().toLowerCase().startsWith(tagg.toLowerCase()) && method.getParameterCount() == 0) {
					Object value = method.invoke(obj, new Object[] {});
					if (value != null) {
						List<String> listValue = tableValues.get(tagName);
						if (listValue == null) {
							listValue = new ArrayList<>();
						}
						listValue.add(value.toString());
						tableValues.put(tagName + "@" + obj.getClass().getCanonicalName(), listValue);
					}
				}
			}
		}

		return tableValues;

	}

	private void processDet(Det det) {
		Imposto impostos = det.getImposto();

	}

	public void calculateTotals() {
		List<Det> dets = this.nfe.getInfNFe().getDet();
		Total totals = new Total();

		dets.forEach(prod -> {
			String valorProdS = prod.getProd().getVProd();
			String valorVBC = prod.getProd().getVUnTrib();
			// rod.getProd().get
			BigDecimal valorProd = new BigDecimal(valorProdS);
			// BigDecimal valorVBC = new BigDecimal(prod.getP)
		});

	}

	public Hashtable<String, BigDecimal> executeCommandToList(Command comm, List<?> list, List<String> tagNames)
			throws Exception {

		Hashtable<String, BigDecimal> accumulators = new Hashtable<>();
		for (Object object : list) {
			List<Object> nestedObject = this.findNotNull(object);

			System.out.println("nestedObject: " + nestedObject);
			for (Object nestedObj : nestedObject) {
				// System.out.println(obj);

				try {
					Hashtable<String, List<String>> table = this.valuesForTag(nestedObj, tagNames);

					if (!table.isEmpty()) {
						System.out.println("table: " + table);
					}

					for (String tagName : table.keySet()) {
						List<String> values = table.get(tagName);

						System.out.println("values: " + values);
						for (String value : values) {
							BigDecimal accumulator = accumulators.get(tagName);
							if (accumulator == null) {
								accumulator = new BigDecimal(0);
							}
							accumulator = comm.op(accumulator, new BigDecimal(value));
						}

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

		return accumulators;
	}

	public void calculateProdValues() throws Exception {
		List<String> tags = new ArrayList<>();
		tags.add("cst");
		tags.add("vbc");
		System.out.println(this.executeCommandToList(new Command() {

			@Override
			public BigDecimal op(BigDecimal i1, BigDecimal i2) {

				return i1.add(i2);
			}

		}, nfe.getInfNFe().getDet(), tags));
	}

	public static void main(String[] args) {
		File dirTest = new File("C:\\android\\wiki");

		File[] files = dirTest.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".xml") || pathname.getName().endsWith(".XML");
			}
		});

		XMLGenerator gen = new XMLGenerator("br.com.tti.ttidesktop.schema.xml.nfe");

		for (File file : files) {
			try {
				System.out.println(file.getAbsolutePath());
				TNfeProc nfe = gen.toObjectFromFile(TNfeProc.class, file);
				CalculateNFeTotal cal = new CalculateNFeTotal(nfe.getNFe());
				cal.calculateProdValues();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	public static interface Command {

		public BigDecimal op(BigDecimal i1, BigDecimal i2);
	}
}
