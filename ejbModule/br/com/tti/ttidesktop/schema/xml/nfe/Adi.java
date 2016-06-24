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
 *         &lt;element name="nAdicao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nSeqAdic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cFabricante">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vDescDI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *         &lt;element name="nDraw" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{0,11}"/>
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
@XmlType(name = "", propOrder = { "nAdicao", "nSeqAdic", "cFabricante", "vDescDI", "nDraw" })
public class Adi {

	@XmlElement(required = true)
	protected String nAdicao;
	@XmlElement(required = true)
	protected String nSeqAdic;
	@XmlElement(required = true)
	protected String cFabricante;
	protected String vDescDI;
	protected String nDraw;

	/**
	 * Obtém o valor da propriedade nAdicao.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNAdicao() {
		return nAdicao;
	}

	/**
	 * Define o valor da propriedade nAdicao.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNAdicao(String value) {
		this.nAdicao = value;
	}

	/**
	 * Obtém o valor da propriedade nSeqAdic.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNSeqAdic() {
		return nSeqAdic;
	}

	/**
	 * Define o valor da propriedade nSeqAdic.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNSeqAdic(String value) {
		this.nSeqAdic = value;
	}

	/**
	 * Obtém o valor da propriedade cFabricante.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCFabricante() {
		return cFabricante;
	}

	/**
	 * Define o valor da propriedade cFabricante.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCFabricante(String value) {
		this.cFabricante = value;
	}

	/**
	 * Obtém o valor da propriedade vDescDI.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVDescDI() {
		return vDescDI;
	}

	/**
	 * Define o valor da propriedade vDescDI.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVDescDI(String value) {
		this.vDescDI = value;
	}

	/**
	 * Obtém o valor da propriedade nDraw.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNDraw() {
		return nDraw;
	}

	/**
	 * Define o valor da propriedade nDraw.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNDraw(String value) {
		this.nDraw = value;
	}

}