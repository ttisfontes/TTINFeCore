package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cnpj", "cpf", "xNome", "ie", "xEnder", "xMun", "uf" })
@Embeddable
public class Transporta implements Serializable {

	@XmlElement(name = "CNPJ")
	protected String cnpj;
	@XmlElement(name = "CPF")
	protected String cpf;
	protected String xNome;
	@XmlElement(name = "IE")
	protected String ie;
	protected String xEnder;
	protected String xMun;
	@XmlElement(name = "UF")
	@XmlSchemaType(name = "string")
	protected TUf uf;

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
	 * Obtém o valor da propriedade xEnder.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXEnder() {
		return xEnder;
	}

	/**
	 * Define o valor da propriedade xEnder.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXEnder(String value) {
		this.xEnder = value;
	}

	/**
	 * Obtém o valor da propriedade xMun.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXMun() {
		return xMun;
	}

	/**
	 * Define o valor da propriedade xMun.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXMun(String value) {
		this.xMun = value;
	}

	/**
	 * Obtém o valor da propriedade uf.
	 * 
	 * @return possible object is {@link TUf }
	 * 
	 */
	public TUf getUF() {
		return uf;
	}

	/**
	 * Define o valor da propriedade uf.
	 * 
	 * @param value
	 *            allowed object is {@link TUf }
	 * 
	 */
	public void setUF(TUf value) {
		this.uf = value;
	}

}