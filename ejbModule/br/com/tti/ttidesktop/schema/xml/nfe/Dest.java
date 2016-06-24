package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cnpj", "cpf", "idEstrangeiro", "xNome", "enderDest", "indIEDest", "ie", "isuf", "im",
		"email" })
@Embeddable
public class Dest implements Serializable {

	@XmlElement(name = "CNPJ")
	protected String cnpj;
	@XmlElement(name = "CPF")
	protected String cpf;
	protected String idEstrangeiro;
	protected String xNome;
	@Embedded
	protected TEndereco enderDest;
	@XmlElement(required = true)
	protected String indIEDest;
	@XmlElement(name = "IE")
	protected String ie;
	@XmlElement(name = "ISUF")
	protected String isuf;
	@XmlElement(name = "IM")
	protected String im;
	protected String email;
	
	
	


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
	 * Obtém o valor da propriedade idEstrangeiro.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdEstrangeiro() {
		return idEstrangeiro;
	}

	/**
	 * Define o valor da propriedade idEstrangeiro.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdEstrangeiro(String value) {
		this.idEstrangeiro = value;
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
	 * Obtém o valor da propriedade enderDest.
	 * 
	 * @return possible object is {@link TEndereco }
	 * 
	 */
	public TEndereco getEnderDest() {
		return enderDest;
	}

	/**
	 * Define o valor da propriedade enderDest.
	 * 
	 * @param value
	 *            allowed object is {@link TEndereco }
	 * 
	 */
	public void setEnderDest(TEndereco value) {
		this.enderDest = value;
	}

	/**
	 * Obtém o valor da propriedade indIEDest.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndIEDest() {
		return indIEDest;
	}

	/**
	 * Define o valor da propriedade indIEDest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndIEDest(String value) {
		this.indIEDest = value;
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
	 * Obtém o valor da propriedade isuf.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getISUF() {
		return isuf;
	}

	/**
	 * Define o valor da propriedade isuf.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setISUF(String value) {
		this.isuf = value;
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
	 * Obtém o valor da propriedade email.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Define o valor da propriedade email.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

}