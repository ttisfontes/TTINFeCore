package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="nFat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "nFat", "vOrig", "vDesc", "vLiq" })
public class Fat {

	protected String nFat;
	protected String vOrig;
	protected String vDesc;
	protected String vLiq;

	/**
	 * Obtém o valor da propriedade nFat.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNFat() {
		return nFat;
	}

	/**
	 * Define o valor da propriedade nFat.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNFat(String value) {
		this.nFat = value;
	}

	/**
	 * Obtém o valor da propriedade vOrig.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVOrig() {
		return vOrig;
	}

	/**
	 * Define o valor da propriedade vOrig.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVOrig(String value) {
		this.vOrig = value;
	}

	/**
	 * Obtém o valor da propriedade vDesc.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVDesc() {
		return vDesc;
	}

	/**
	 * Define o valor da propriedade vDesc.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVDesc(String value) {
		this.vDesc = value;
	}

	/**
	 * Obtém o valor da propriedade vLiq.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVLiq() {
		return vLiq;
	}

	/**
	 * Define o valor da propriedade vLiq.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVLiq(String value) {
		this.vLiq = value;
	}

}