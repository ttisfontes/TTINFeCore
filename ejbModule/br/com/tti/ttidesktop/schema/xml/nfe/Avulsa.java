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
 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
 *         &lt;element name="xOrgao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xAgente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{6,14}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/nfe}TUfEmi"/>
 *         &lt;element name="nDAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/nfe}TData" minOccurs="0"/>
 *         &lt;element name="vDAR" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *         &lt;element name="repEmi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dPag" type="{http://www.portalfiscal.inf.br/nfe}TData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cnpj", "xOrgao", "matr", "xAgente", "fone", "uf", "ndar", "dEmi", "vdar",
		"repEmi", "dPag" })
public class Avulsa {

	@XmlElement(name = "CNPJ", required = true)
	protected String cnpj;
	@XmlElement(required = true)
	protected String xOrgao;
	@XmlElement(required = true)
	protected String matr;
	@XmlElement(required = true)
	protected String xAgente;
	protected String fone;
	@XmlElement(name = "UF", required = true)
	@XmlSchemaType(name = "string")
	protected TUfEmi uf;
	@XmlElement(name = "nDAR")
	protected String ndar;
	protected String dEmi;
	@XmlElement(name = "vDAR")
	protected String vdar;
	@XmlElement(required = true)
	protected String repEmi;
	protected String dPag;

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
	 * Obtém o valor da propriedade xOrgao.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXOrgao() {
		return xOrgao;
	}

	/**
	 * Define o valor da propriedade xOrgao.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXOrgao(String value) {
		this.xOrgao = value;
	}

	/**
	 * Obtém o valor da propriedade matr.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMatr() {
		return matr;
	}

	/**
	 * Define o valor da propriedade matr.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMatr(String value) {
		this.matr = value;
	}

	/**
	 * Obtém o valor da propriedade xAgente.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAgente() {
		return xAgente;
	}

	/**
	 * Define o valor da propriedade xAgente.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAgente(String value) {
		this.xAgente = value;
	}

	/**
	 * Obtém o valor da propriedade fone.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * Define o valor da propriedade fone.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFone(String value) {
		this.fone = value;
	}

	/**
	 * Obtém o valor da propriedade uf.
	 * 
	 * @return possible object is {@link TUfEmi }
	 * 
	 */
	public TUfEmi getUF() {
		return uf;
	}

	/**
	 * Define o valor da propriedade uf.
	 * 
	 * @param value
	 *            allowed object is {@link TUfEmi }
	 * 
	 */
	public void setUF(TUfEmi value) {
		this.uf = value;
	}

	/**
	 * Obtém o valor da propriedade ndar.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNDAR() {
		return ndar;
	}

	/**
	 * Define o valor da propriedade ndar.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNDAR(String value) {
		this.ndar = value;
	}

	/**
	 * Obtém o valor da propriedade dEmi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDEmi() {
		return dEmi;
	}

	/**
	 * Define o valor da propriedade dEmi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDEmi(String value) {
		this.dEmi = value;
	}

	/**
	 * Obtém o valor da propriedade vdar.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVDAR() {
		return vdar;
	}

	/**
	 * Define o valor da propriedade vdar.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVDAR(String value) {
		this.vdar = value;
	}

	/**
	 * Obtém o valor da propriedade repEmi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRepEmi() {
		return repEmi;
	}

	/**
	 * Define o valor da propriedade repEmi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRepEmi(String value) {
		this.repEmi = value;
	}

	/**
	 * Obtém o valor da propriedade dPag.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDPag() {
		return dPag;
	}

	/**
	 * Define o valor da propriedade dPag.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDPag(String value) {
		this.dPag = value;
	}

}