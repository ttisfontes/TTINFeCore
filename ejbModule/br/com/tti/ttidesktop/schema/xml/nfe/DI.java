package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
 * O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro
 * desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nDI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dDI" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *         &lt;element name="xLocDesemb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UFDesemb" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
 *         &lt;element name="dDesemb" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *         &lt;element name="tpViaTransp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vAFRMM" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *         &lt;element name="tpIntermedio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
 *         &lt;element name="UFTerceiro" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi" minOccurs="0"/>
 *         &lt;element name="cExportador">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="adi" maxOccurs="100">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nAdicao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nSeqAdic">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cFabricante">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vDescDI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="nDraw" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{0,11}"/>
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
@XmlType(name = "", propOrder = { "ndi", "ddi", "xLocDesemb", "ufDesemb", "dDesemb", "tpViaTransp", "vafrmm",
		"tpIntermedio", "cnpj", "ufTerceiro", "cExportador", "adi" })
public class DI {

	@XmlElement(name = "nDI", required = true)
	protected String ndi;
	@XmlElement(name = "dDI", required = true)
	protected String ddi;
	@XmlElement(required = true)
	protected String xLocDesemb;
	@XmlElement(name = "UFDesemb", required = true)
	@XmlSchemaType(name = "string")
	protected TUfEmi ufDesemb;
	@XmlElement(required = true)
	protected String dDesemb;
	@XmlElement(required = true)
	protected String tpViaTransp;
	@XmlElement(name = "vAFRMM")
	protected String vafrmm;
	@XmlElement(required = true)
	protected String tpIntermedio;
	@XmlElement(name = "CNPJ")
	protected String cnpj;
	@XmlElement(name = "UFTerceiro")
	@XmlSchemaType(name = "string")
	protected TUfEmi ufTerceiro;
	@XmlElement(required = true)
	protected String cExportador;
	@XmlElement(required = true)
	protected List<Adi> adi;

	/**
	 * Obtém o valor da propriedade ndi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNDI() {
		return ndi;
	}

	/**
	 * Define o valor da propriedade ndi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNDI(String value) {
		this.ndi = value;
	}

	/**
	 * Obtém o valor da propriedade ddi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDDI() {
		return ddi;
	}

	/**
	 * Define o valor da propriedade ddi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDDI(String value) {
		this.ddi = value;
	}

	/**
	 * Obtém o valor da propriedade xLocDesemb.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXLocDesemb() {
		return xLocDesemb;
	}

	/**
	 * Define o valor da propriedade xLocDesemb.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXLocDesemb(String value) {
		this.xLocDesemb = value;
	}

	/**
	 * Obtém o valor da propriedade ufDesemb.
	 * 
	 * @return possible object is {@link TUfEmi }
	 * 
	 */
	public TUfEmi getUFDesemb() {
		return ufDesemb;
	}

	/**
	 * Define o valor da propriedade ufDesemb.
	 * 
	 * @param value
	 *            allowed object is {@link TUfEmi }
	 * 
	 */
	public void setUFDesemb(TUfEmi value) {
		this.ufDesemb = value;
	}

	/**
	 * Obtém o valor da propriedade dDesemb.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDDesemb() {
		return dDesemb;
	}

	/**
	 * Define o valor da propriedade dDesemb.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDDesemb(String value) {
		this.dDesemb = value;
	}

	/**
	 * Obtém o valor da propriedade tpViaTransp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpViaTransp() {
		return tpViaTransp;
	}

	/**
	 * Define o valor da propriedade tpViaTransp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpViaTransp(String value) {
		this.tpViaTransp = value;
	}

	/**
	 * Obtém o valor da propriedade vafrmm.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVAFRMM() {
		return vafrmm;
	}

	/**
	 * Define o valor da propriedade vafrmm.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVAFRMM(String value) {
		this.vafrmm = value;
	}

	/**
	 * Obtém o valor da propriedade tpIntermedio.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpIntermedio() {
		return tpIntermedio;
	}

	/**
	 * Define o valor da propriedade tpIntermedio.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpIntermedio(String value) {
		this.tpIntermedio = value;
	}

	/**
	 * Obtém o valor da propriedade cnpj.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNPJ() {
		return cnpj;
	}

	/**
	 * Define o valor da propriedade cnpj.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNPJ(String value) {
		this.cnpj = value;
	}

	/**
	 * Obtém o valor da propriedade ufTerceiro.
	 * 
	 * @return possible object is {@link TUfEmi }
	 * 
	 */
	public TUfEmi getUFTerceiro() {
		return ufTerceiro;
	}

	/**
	 * Define o valor da propriedade ufTerceiro.
	 * 
	 * @param value
	 *            allowed object is {@link TUfEmi }
	 * 
	 */
	public void setUFTerceiro(TUfEmi value) {
		this.ufTerceiro = value;
	}

	/**
	 * Obtém o valor da propriedade cExportador.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCExportador() {
		return cExportador;
	}

	/**
	 * Define o valor da propriedade cExportador.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCExportador(String value) {
		this.cExportador = value;
	}

	/**
	 * Gets the value of the adi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the adi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAdi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Adi }
	 * 
	 * 
	 */
	public List<Adi> getAdi() {
		if (adi == null) {
			adi = new ArrayList<Adi>();
		}
		return this.adi;
	}

}