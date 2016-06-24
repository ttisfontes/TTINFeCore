package br.com.tti.ttidesktop.schema.xml.nfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java de anonymous complex type.
 * 
 * <p>
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qVol" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{1,15}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/	element>
 *         &lt;element name="esp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="marca" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nVol" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pesoL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203" minOccurs="0"/>
 *         &lt;element name="pesoB" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203" minOccurs="0"/>
 *         &lt;element name="lacres" maxOccurs="5000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nLacre">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "qVol", "esp", "marca", "nVol", "pesoL", "pesoB", "lacres" })
public class Vol {

	protected String qVol;
	protected String esp;
	protected String marca;
	protected String nVol;
	protected String pesoL;
	protected String pesoB;
	protected List<Vol.Lacres> lacres;

	/**
	 * Obtém o valor da propriedade qVol.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQVol() {
		return qVol;
	}

	/**
	 * Define o valor da propriedade qVol.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQVol(String value) {
		this.qVol = value;
	}

	/**
	 * Obtém o valor da propriedade esp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEsp() {
		return esp;
	}

	/**
	 * Define o valor da propriedade esp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEsp(String value) {
		this.esp = value;
	}

	/**
	 * Obtém o valor da propriedade marca.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Define o valor da propriedade marca.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarca(String value) {
		this.marca = value;
	}

	/**
	 * Obtém o valor da propriedade nVol.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNVol() {
		return nVol;
	}

	/**
	 * Define o valor da propriedade nVol.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNVol(String value) {
		this.nVol = value;
	}

	/**
	 * Obtém o valor da propriedade pesoL.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPesoL() {
		return pesoL;
	}

	/**
	 * Define o valor da propriedade pesoL.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPesoL(String value) {
		this.pesoL = value;
	}

	/**
	 * Obtém o valor da propriedade pesoB.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPesoB() {
		return pesoB;
	}

	/**
	 * Define o valor da propriedade pesoB.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPesoB(String value) {
		this.pesoB = value;
	}

	/**
	 * Gets the value of the lacres property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the lacres property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLacres().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Vol.Lacres }
	 * 
	 * 
	 */
	public List<Vol.Lacres> getLacres() {
		if (lacres == null) {
			lacres = new ArrayList<Vol.Lacres>();
		}
		return this.lacres;
	}

	/**
	 * <p>
	 * Classe Java de anonymous complex type.
	 * 
	 * <p>
	 * O seguinte fragmento do esquema especifica o conteúdo esperado contido
	 * dentro desta classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="nLacre">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="60"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "nLacre" })
	public static class Lacres {

		@XmlElement(required = true)
		protected String nLacre;

		/**
		 * Obtém o valor da propriedade nLacre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNLacre() {
			return nLacre;
		}

		/**
		 * Define o valor da propriedade nLacre.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNLacre(String value) {
			this.nLacre = value;
		}

	}

}