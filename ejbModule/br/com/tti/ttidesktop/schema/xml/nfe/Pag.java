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
 * O seguinte fragmento do esquema especifica o conteúdo esperado
 * contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tPag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="vPag" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *         &lt;element name="card" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpIntegra" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
 *                   &lt;element name="tBand" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cAut" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
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
@XmlType(name = "", propOrder = { "tPag", "vPag", "card" })
public class Pag {

	@XmlElement(required = true)
	protected String tPag;
	@XmlElement(required = true)
	protected String vPag;
	protected Pag.Card card;

	/**
	 * Obtém o valor da propriedade tPag.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTPag() {
		return tPag;
	}

	/**
	 * Define o valor da propriedade tPag.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTPag(String value) {
		this.tPag = value;
	}

	/**
	 * Obtém o valor da propriedade vPag.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVPag() {
		return vPag;
	}

	/**
	 * Define o valor da propriedade vPag.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVPag(String value) {
		this.vPag = value;
	}

	/**
	 * Obtém o valor da propriedade card.
	 * 
	 * @return possible object is {@link Pag.Card }
	 * 
	 */
	public Pag.Card getCard() {
		return card;
	}

	/**
	 * Define o valor da propriedade card.
	 * 
	 * @param value
	 *            allowed object is {@link Pag.Card }
	 * 
	 */
	public void setCard(Pag.Card value) {
		this.card = value;
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
	 *         &lt;element name="tpIntegra" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj" minOccurs="0"/>
	 *         &lt;element name="tBand" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="01"/>
	 *               &lt;enumeration value="02"/>
	 *               &lt;enumeration value="03"/>
	 *               &lt;enumeration value="04"/>
	 *               &lt;enumeration value="99"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cAut" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="20"/>
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
	@XmlType(name = "", propOrder = { "tpIntegra", "cnpj", "tBand", "cAut" })
	public static class Card {

		protected String tpIntegra;
		@XmlElement(name = "CNPJ")
		protected String cnpj;
		protected String tBand;
		protected String cAut;

		/**
		 * Obtém o valor da propriedade tpIntegra.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpIntegra() {
			return tpIntegra;
		}

		/**
		 * Define o valor da propriedade tpIntegra.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpIntegra(String value) {
			this.tpIntegra = value;
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
		 * Obtém o valor da propriedade tBand.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTBand() {
			return tBand;
		}

		/**
		 * Define o valor da propriedade tBand.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTBand(String value) {
			this.tBand = value;
		}

		/**
		 * Obtém o valor da propriedade cAut.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCAut() {
			return cAut;
		}

		/**
		 * Define o valor da propriedade cAut.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCAut(String value) {
			this.cAut = value;
		}

	}

}