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
 *         &lt;element name="pDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302Max100"/>
 *         &lt;element name="IPI">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
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
@XmlType(name = "", propOrder = { "pDevol", "ipi" })
public class ImpostoDevol {

	@XmlElement(required = true)
	protected String pDevol;
	@XmlElement(name = "IPI", required = true)
	protected ImpostoDevol.IPI ipi;

	/**
	 * Obtém o valor da propriedade pDevol.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPDevol() {
		return pDevol;
	}

	/**
	 * Define o valor da propriedade pDevol.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPDevol(String value) {
		this.pDevol = value;
	}

	/**
	 * Obtém o valor da propriedade ipi.
	 * 
	 * @return possible object is {@link ImpostoDevol.IPI }
	 * 
	 */
	public ImpostoDevol.IPI getIPI() {
		return ipi;
	}

	/**
	 * Define o valor da propriedade ipi.
	 * 
	 * @param value
	 *            allowed object is {@link ImpostoDevol.IPI }
	 * 
	 */
	public void setIPI(ImpostoDevol.IPI value) {
		this.ipi = value;
	}

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
	 *         &lt;element name="vIPIDevol" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vipiDevol" })
	public static class IPI {

		@XmlElement(name = "vIPIDevol", required = true)
		protected String vipiDevol;

		/**
		 * Obtém o valor da propriedade vipiDevol.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVIPIDevol() {
			return vipiDevol;
		}

		/**
		 * Define o valor da propriedade vipiDevol.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVIPIDevol(String value) {
			this.vipiDevol = value;
		}

	}

}