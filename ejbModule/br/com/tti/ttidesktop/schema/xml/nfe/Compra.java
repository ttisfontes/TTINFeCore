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
 * O seguinte fragmento do esquema especifica o conteúdo esperado
 * contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xNEmp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xPed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xCont" minOccurs="0">
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
@XmlType(name = "", propOrder = { "xnEmp", "xPed", "xCont" })
public class Compra {

	@XmlElement(name = "xNEmp")
	protected String xnEmp;
	protected String xPed;
	protected String xCont;

	/**
	 * Obtém o valor da propriedade xnEmp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXNEmp() {
		return xnEmp;
	}

	/**
	 * Define o valor da propriedade xnEmp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXNEmp(String value) {
		this.xnEmp = value;
	}

	/**
	 * Obtém o valor da propriedade xPed.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXPed() {
		return xPed;
	}

	/**
	 * Define o valor da propriedade xPed.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXPed(String value) {
		this.xPed = value;
	}

	/**
	 * Obtém o valor da propriedade xCont.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXCont() {
		return xCont;
	}

	/**
	 * Define o valor da propriedade xCont.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXCont(String value) {
		this.xCont = value;
	}

}