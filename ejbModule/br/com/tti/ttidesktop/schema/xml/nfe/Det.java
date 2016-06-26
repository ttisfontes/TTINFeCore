package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "prod", "imposto", "impostoDevol", "infAdProd" })
public class Det {

	@XmlElement(required = true)
	protected Prod prod;
	@XmlElement(required = true)
	protected Imposto imposto;
	protected ImpostoDevol impostoDevol;
	protected String infAdProd;
	@XmlAttribute(name = "nItem", required = true)
	protected String nItem;

	/**
	 * Obtém o valor da propriedade prod.
	 * 
	 * @return possible object is {@link Prod }
	 * 
	 */
	public Prod getProd() {
		return prod;
	}

	/**
	 * Define o valor da propriedade prod.
	 * 
	 * @param value
	 *            allowed object is {@link Prod }
	 * 
	 */
	public void setProd(Prod value) {
		this.prod = value;
	}

	/**
	 * Obtém o valor da propriedade imposto.
	 * 
	 * @return possible object is {@link Imposto }
	 * 
	 */
	public Imposto getImposto() {
		return imposto;
	}

	/**
	 * Define o valor da propriedade imposto.
	 * 
	 * @param value
	 *            allowed object is {@link Imposto }
	 * 
	 */
	public void setImposto(Imposto value) {
		this.imposto = value;
	}

	/**
	 * Obtém o valor da propriedade impostoDevol.
	 * 
	 * @return possible object is {@link ImpostoDevol }
	 * 
	 */
	public ImpostoDevol getImpostoDevol() {
		return impostoDevol;
	}

	/**
	 * Define o valor da propriedade impostoDevol.
	 * 
	 * @param value
	 *            allowed object is {@link ImpostoDevol }
	 * 
	 */
	public void setImpostoDevol(ImpostoDevol value) {
		this.impostoDevol = value;
	}

	/**
	 * Obtém o valor da propriedade infAdProd.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfAdProd() {
		return infAdProd;
	}

	/**
	 * Define o valor da propriedade infAdProd.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInfAdProd(String value) {
		this.infAdProd = value;
	}

	/**
	 * Obtém o valor da propriedade nItem.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNItem() {
		return nItem;
	}

	/**
	 * Define o valor da propriedade nItem.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNItem(String value) {
		this.nItem = value;
	}

}