package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cnpj", "cpf", "xNome", "xFant", "enderEmit", "ie", "iest", "im", "cnae", "crt" })
@Embeddable
public class Emit implements Serializable{

	@XmlElement(name = "CNPJ")
	protected String cnpj;
	@XmlElement(name = "CPF")
	protected String cpf;
	@XmlElement(required = true)
	protected String xNome;
	protected String xFant;
	@XmlElement(required = true)
	@Transient
	protected TEnderEmi enderEmit;
	@XmlElement(name = "IE", required = true)
	protected String ie;
	@XmlElement(name = "IEST")
	protected String iest;
	@XmlElement(name = "IM")
	protected String im;
	@XmlElement(name = "CNAE")
	protected String cnae;
	@XmlElement(name = "CRT", required = true)
	protected String crt;

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
	 * Obtém o valor da propriedade cpf.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCPF() {
		return cpf;
	}

	/**
	 * Define o valor da propriedade cpf.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCPF(String value) {
		this.cpf = value;
	}

	/**
	 * Obtém o valor da propriedade xNome.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXNome() {
		return xNome;
	}

	/**
	 * Define o valor da propriedade xNome.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXNome(String value) {
		this.xNome = value;
	}

	/**
	 * Obtém o valor da propriedade xFant.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXFant() {
		return xFant;
	}

	/**
	 * Define o valor da propriedade xFant.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXFant(String value) {
		this.xFant = value;
	}

	/**
	 * Obtém o valor da propriedade enderEmit.
	 * 
	 * @return possible object is {@link TEnderEmi }
	 * 
	 */
	public TEnderEmi getEnderEmit() {
		return enderEmit;
	}

	/**
	 * Define o valor da propriedade enderEmit.
	 * 
	 * @param value
	 *            allowed object is {@link TEnderEmi }
	 * 
	 */
	public void setEnderEmit(TEnderEmi value) {
		this.enderEmit = value;
	}

	/**
	 * Obtém o valor da propriedade ie.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIE() {
		return ie;
	}

	/**
	 * Define o valor da propriedade ie.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIE(String value) {
		this.ie = value;
	}

	/**
	 * Obtém o valor da propriedade iest.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIEST() {
		return iest;
	}

	/**
	 * Define o valor da propriedade iest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIEST(String value) {
		this.iest = value;
	}

	/**
	 * Obtém o valor da propriedade im.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIM() {
		return im;
	}

	/**
	 * Define o valor da propriedade im.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIM(String value) {
		this.im = value;
	}

	/**
	 * Obtém o valor da propriedade cnae.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNAE() {
		return cnae;
	}

	/**
	 * Define o valor da propriedade cnae.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNAE(String value) {
		this.cnae = value;
	}

	/**
	 * Obtém o valor da propriedade crt.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCRT() {
		return crt;
	}

	/**
	 * Define o valor da propriedade crt.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCRT(String value) {
		this.crt = value;
	}

}