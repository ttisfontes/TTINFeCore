package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="UFSaidaPais" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
 *         &lt;element name="xLocExporta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xLocDespacho" minOccurs="0">
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
@XmlType(name = "", propOrder = { "ufSaidaPais", "xLocExporta", "xLocDespacho" })
public class Exporta {

	@XmlElement(name = "UFSaidaPais", required = true)
	@XmlSchemaType(name = "string")
	protected TUfEmi ufSaidaPais;
	@XmlElement(required = true)
	protected String xLocExporta;
	protected String xLocDespacho;

	/**
	 * Obtém o valor da propriedade ufSaidaPais.
	 * 
	 * @return possible object is {@link TUfEmi }
	 * 
	 */
	public TUfEmi getUFSaidaPais() {
		return ufSaidaPais;
	}

	/**
	 * Define o valor da propriedade ufSaidaPais.
	 * 
	 * @param value
	 *            allowed object is {@link TUfEmi }
	 * 
	 */
	public void setUFSaidaPais(TUfEmi value) {
		this.ufSaidaPais = value;
	}

	/**
	 * Obtém o valor da propriedade xLocExporta.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXLocExporta() {
		return xLocExporta;
	}

	/**
	 * Define o valor da propriedade xLocExporta.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXLocExporta(String value) {
		this.xLocExporta = value;
	}

	/**
	 * Obtém o valor da propriedade xLocDespacho.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXLocDespacho() {
		return xLocDespacho;
	}

	/**
	 * Define o valor da propriedade xLocDespacho.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXLocDespacho(String value) {
		this.xLocDespacho = value;
	}

}