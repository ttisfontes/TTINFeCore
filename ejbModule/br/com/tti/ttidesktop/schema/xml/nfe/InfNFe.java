package br.com.tti.ttidesktop.schema.xml.nfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ide", "emit", "avulsa", "dest", "retirada", "entrega", "autXML", "det", "total",
		"transp", "cobr", "pag", "infAdic", "exporta", "compra", "cana" })
public class InfNFe {

	@XmlElement(required = true)
	protected Ide ide;
	@XmlElement(required = true)
	protected Emit emit;
	protected Avulsa avulsa;
	protected Dest dest;
	protected TLocal retirada;
	protected TLocal entrega;
	protected List<AutXML> autXML;
	@XmlElement(required = true)
	protected List<Det> det;
	@XmlElement(required = true)
	protected Total total;
	@XmlElement(required = true)
	protected Transp transp;
	protected Cobr cobr;
	protected List<Pag> pag;
	protected InfAdic infAdic;
	protected Exporta exporta;
	protected Compra compra;
	protected Cana cana;
	@XmlAttribute(name = "versao", required = true)
	protected String versao;
	@XmlAttribute(name = "Id", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	protected String id;

	/**
	 * Obtém o valor da propriedade ide.
	 * 
	 * @return possible object is {@link Ide }
	 * 
	 */
	public Ide getIde() {
		return ide;
	}

	/**
	 * Define o valor da propriedade ide.
	 * 
	 * @param value
	 *            allowed object is {@link Ide }
	 * 
	 */
	public void setIde(Ide value) {
		this.ide = value;
	}

	/**
	 * Obtém o valor da propriedade emit.
	 * 
	 * @return possible object is {@link Emit }
	 * 
	 */
	public Emit getEmit() {
		return emit;
	}

	/**
	 * Define o valor da propriedade emit.
	 * 
	 * @param value
	 *            allowed object is {@link Emit }
	 * 
	 */
	public void setEmit(Emit value) {
		this.emit = value;
	}

	/**
	 * Obtém o valor da propriedade avulsa.
	 * 
	 * @return possible object is {@link Avulsa }
	 * 
	 */
	public Avulsa getAvulsa() {
		return avulsa;
	}

	/**
	 * Define o valor da propriedade avulsa.
	 * 
	 * @param value
	 *            allowed object is {@link Avulsa }
	 * 
	 */
	public void setAvulsa(Avulsa value) {
		this.avulsa = value;
	}

	/**
	 * Obtém o valor da propriedade dest.
	 * 
	 * @return possible object is {@link Dest }
	 * 
	 */
	public Dest getDest() {
		return dest;
	}

	/**
	 * Define o valor da propriedade dest.
	 * 
	 * @param value
	 *            allowed object is {@link Dest }
	 * 
	 */
	public void setDest(Dest value) {
		this.dest = value;
	}

	/**
	 * Obtém o valor da propriedade retirada.
	 * 
	 * @return possible object is {@link TLocal }
	 * 
	 */
	public TLocal getRetirada() {
		return retirada;
	}

	/**
	 * Define o valor da propriedade retirada.
	 * 
	 * @param value
	 *            allowed object is {@link TLocal }
	 * 
	 */
	public void setRetirada(TLocal value) {
		this.retirada = value;
	}

	/**
	 * Obtém o valor da propriedade entrega.
	 * 
	 * @return possible object is {@link TLocal }
	 * 
	 */
	public TLocal getEntrega() {
		return entrega;
	}

	/**
	 * Define o valor da propriedade entrega.
	 * 
	 * @param value
	 *            allowed object is {@link TLocal }
	 * 
	 */
	public void setEntrega(TLocal value) {
		this.entrega = value;
	}

	/**
	 * Gets the value of the autXML property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the autXML property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAutXML().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AutXML }
	 * 
	 * 
	 */
	public List<AutXML> getAutXML() {
		if (autXML == null) {
			autXML = new ArrayList<AutXML>();
		}
		return this.autXML;
	}

	/**
	 * Gets the value of the det property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the det property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDet().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Det }
	 * 
	 * 
	 */
	public List<Det> getDet() {
		if (det == null) {
			det = new ArrayList<Det>();
		}
		return this.det;
	}

	/**
	 * Obtém o valor da propriedade total.
	 * 
	 * @return possible object is {@link Total }
	 * 
	 */
	public Total getTotal() {
		return total;
	}

	/**
	 * Define o valor da propriedade total.
	 * 
	 * @param value
	 *            allowed object is {@link Total }
	 * 
	 */
	public void setTotal(Total value) {
		this.total = value;
	}

	/**
	 * Obtém o valor da propriedade transp.
	 * 
	 * @return possible object is {@link Transp }
	 * 
	 */
	public Transp getTransp() {
		return transp;
	}

	/**
	 * Define o valor da propriedade transp.
	 * 
	 * @param value
	 *            allowed object is {@link Transp }
	 * 
	 */
	public void setTransp(Transp value) {
		this.transp = value;
	}

	/**
	 * Obtém o valor da propriedade cobr.
	 * 
	 * @return possible object is {@link Cobr }
	 * 
	 */
	public Cobr getCobr() {
		return cobr;
	}

	/**
	 * Define o valor da propriedade cobr.
	 * 
	 * @param value
	 *            allowed object is {@link Cobr }
	 * 
	 */
	public void setCobr(Cobr value) {
		this.cobr = value;
	}

	/**
	 * Gets the value of the pag property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pag property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPag().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Pag }
	 * 
	 * 
	 */
	public List<Pag> getPag() {
		if (pag == null) {
			pag = new ArrayList<Pag>();
		}
		return this.pag;
	}

	/**
	 * Obtém o valor da propriedade infAdic.
	 * 
	 * @return possible object is {@link InfAdic }
	 * 
	 */
	public InfAdic getInfAdic() {
		return infAdic;
	}

	/**
	 * Define o valor da propriedade infAdic.
	 * 
	 * @param value
	 *            allowed object is {@link InfAdic }
	 * 
	 */
	public void setInfAdic(InfAdic value) {
		this.infAdic = value;
	}

	/**
	 * Obtém o valor da propriedade exporta.
	 * 
	 * @return possible object is {@link Exporta }
	 * 
	 */
	public Exporta getExporta() {
		return exporta;
	}

	/**
	 * Define o valor da propriedade exporta.
	 * 
	 * @param value
	 *            allowed object is {@link Exporta }
	 * 
	 */
	public void setExporta(Exporta value) {
		this.exporta = value;
	}

	/**
	 * Obtém o valor da propriedade compra.
	 * 
	 * @return possible object is {@link Compra }
	 * 
	 */
	public Compra getCompra() {
		return compra;
	}

	/**
	 * Define o valor da propriedade compra.
	 * 
	 * @param value
	 *            allowed object is {@link Compra }
	 * 
	 */
	public void setCompra(Compra value) {
		this.compra = value;
	}

	/**
	 * Obtém o valor da propriedade cana.
	 * 
	 * @return possible object is {@link Cana }
	 * 
	 */
	public Cana getCana() {
		return cana;
	}

	/**
	 * Define o valor da propriedade cana.
	 * 
	 * @param value
	 *            allowed object is {@link Cana }
	 * 
	 */
	public void setCana(Cana value) {
		this.cana = value;
	}

	/**
	 * Obtém o valor da propriedade versao.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVersao() {
		return versao;
	}

	/**
	 * Define o valor da propriedade versao.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVersao(String value) {
		this.versao = value;
	}

	/**
	 * Obtém o valor da propriedade id.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Define o valor da propriedade id.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

}