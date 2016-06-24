//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.06.23 às 02:45:00 PM BRT 
//

package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnderEmi", propOrder = { "xLgr", "nro", "xCpl", "xBairro", "cMun", "xMun", "uf", "cep", "cPais",
		"xPais", "fone" })

@Embeddable
public class TEnderEmi {

	@XmlElement(required = true)
	protected String xLgr;
	@XmlElement(required = true)
	protected String nro;
	protected String xCpl;
	@XmlElement(required = true)
	protected String xBairro;
	@XmlElement(required = true)
	protected String cMun;
	@XmlElement(required = true)
	protected String xMun;
	@XmlElement(name = "UF", required = true)
	@XmlSchemaType(name = "string")
	protected TUfEmi uf;
	@XmlElement(name = "CEP", required = true)
	protected String cep;
	protected String cPais;
	protected String xPais;
	protected String fone;

	/**
	 * Obtém o valor da propriedade xLgr.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXLgr() {
		return xLgr;
	}

	/**
	 * Define o valor da propriedade xLgr.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXLgr(String value) {
		this.xLgr = value;
	}

	/**
	 * Obtém o valor da propriedade nro.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNro() {
		return nro;
	}

	/**
	 * Define o valor da propriedade nro.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNro(String value) {
		this.nro = value;
	}

	/**
	 * Obtém o valor da propriedade xCpl.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXCpl() {
		return xCpl;
	}

	/**
	 * Define o valor da propriedade xCpl.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXCpl(String value) {
		this.xCpl = value;
	}

	/**
	 * Obtém o valor da propriedade xBairro.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXBairro() {
		return xBairro;
	}

	/**
	 * Define o valor da propriedade xBairro.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXBairro(String value) {
		this.xBairro = value;
	}

	/**
	 * Obtém o valor da propriedade cMun.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCMun() {
		return cMun;
	}

	/**
	 * Define o valor da propriedade cMun.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCMun(String value) {
		this.cMun = value;
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
	 * Obtém o valor da propriedade cep.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCEP() {
		return cep;
	}

	/**
	 * Define o valor da propriedade cep.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCEP(String value) {
		this.cep = value;
	}

	/**
	 * Obtém o valor da propriedade cPais.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCPais() {
		return cPais;
	}

	/**
	 * Define o valor da propriedade cPais.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCPais(String value) {
		this.cPais = value;
	}

	/**
	 * Obtém o valor da propriedade xPais.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXPais() {
		return xPais;
	}

	/**
	 * Define o valor da propriedade xPais.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXPais(String value) {
		this.xPais = value;
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

}
