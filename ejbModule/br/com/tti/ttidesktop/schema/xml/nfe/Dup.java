package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="nDup" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/nfe}TData" minOccurs="0"/>
 *         &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "nDup", "dVenc", "vDup" })
public class Dup {

	protected String nDup;
	protected String dVenc;
	@XmlElement(required = true)
	protected String vDup;

	/**
	 * Obtém o valor da propriedade nDup.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNDup() {
		return nDup;
	}

	/**
	 * Define o valor da propriedade nDup.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNDup(String value) {
		this.nDup = value;
	}

	/**
	 * Obtém o valor da propriedade dVenc.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDVenc() {
		return dVenc;
	}

	/**
	 * Define o valor da propriedade dVenc.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDVenc(String value) {
		this.dVenc = value;
	}

	/**
	 * Obtém o valor da propriedade vDup.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVDup() {
		return vDup;
	}

	/**
	 * Define o valor da propriedade vDup.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVDup(String value) {
		this.vDup = value;
	}

}