package br.com.tti.ttidesktop.core.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.w3c.dom.Node;

public class XMLGenerator {

	public static Hashtable<String, XMLGenerator> tableGen = new Hashtable<String, XMLGenerator>();

	public static XMLGenerator createXMLGenerator(String packageName) {
		XMLGenerator xmlGen = tableGen.get(packageName);
		if (xmlGen == null) {
			xmlGen = new XMLGenerator(packageName);
			tableGen.put(packageName, xmlGen);
		}
		return xmlGen;
	}

	private JAXBContext jc;
	private Unmarshaller unmarshaller;
	private Marshaller marshaller;

	public XMLGenerator(String packageName) {
		try {
			jc = JAXBContext.newInstance(packageName);
			unmarshaller = jc.createUnmarshaller();
			marshaller = jc.createMarshaller();

		} catch (JAXBException ex) {
			ex.printStackTrace();
		}
	}

	synchronized private void toXMLFile(Object obj, File file) throws Exception {
		FileOutputStream os = new FileOutputStream(file);
		this.marshaller.marshal(obj, os);
		os.close();
	}

	synchronized public String toXMLString(Object obj) throws Exception {
		StringWriter w = new StringWriter();
		this.marshaller.marshal(obj, w);
		return w.toString();
	}

	synchronized public Object toObjectFromFile(File file) throws Exception {
		return unmarshaller.unmarshal(file);
	}

	synchronized public <T> T toObjectFromFile(Class<T> classs, File file) throws Exception {

		Object obj = unmarshaller.unmarshal(file);
		if (obj instanceof JAXBElement) {
			JAXBElement<T> jax = (JAXBElement<T>) obj;
			return jax.getValue();
		} else {
			return (T) obj;
		}
	}

	synchronized public <T> T toObject(Class<T> classs, String str) throws Exception {
		StringReader r = new StringReader(str);
		Object obj = unmarshaller.unmarshal(r);
		if (obj instanceof JAXBElement) {
			JAXBElement<T> jax = (JAXBElement<T>) obj;
			return jax.getValue();
		} else {
			return (T) obj;
		}

	}

	synchronized public Object toObject(Node node) throws Exception {
		return unmarshaller.unmarshal(node);
	}

	public Marshaller getMarshaller() {
		return marshaller;
	}

	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}

}
