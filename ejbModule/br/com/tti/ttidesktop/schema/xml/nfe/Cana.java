package br.com.tti.ttidesktop.schema.xml.nfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * 	
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="safra">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ref">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="(0[1-9]|1[0-2])([/][2][0-9][0-9][0-9])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="forDia" maxOccurs="31">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qtde" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="dia" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;whiteSpace value="preserve"/>
 *                       &lt;pattern value="[1-9]|[1][0-9]|[2][0-9]|[3][0-1]"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="qTotMes" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
 *         &lt;element name="qTotAnt" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
 *         &lt;element name="qTotGer" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
 *         &lt;element name="deduc" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xDed">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vDed" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vFor" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *         &lt;element name="vTotDed" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *         &lt;element name="vLiqFor" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "safra", "ref", "forDia", "qTotMes", "qTotAnt", "qTotGer", "deduc", "vFor", "vTotDed",
		"vLiqFor" })
public class Cana {

	@XmlElement(required = true)
	protected String safra;
	@XmlElement(required = true)
	protected String ref;
	@XmlElement(required = true)
	protected List<Cana.ForDia> forDia;
	@XmlElement(required = true)
	protected String qTotMes;
	@XmlElement(required = true)
	protected String qTotAnt;
	@XmlElement(required = true)
	protected String qTotGer;
	protected List<Cana.Deduc> deduc;
	@XmlElement(required = true)
	protected String vFor;
	@XmlElement(required = true)
	protected String vTotDed;
	@XmlElement(required = true)
	protected String vLiqFor;

	/**
	 * Obtém o valor da propriedade safra.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSafra() {
		return safra;
	}

	/**
	 * Define o valor da propriedade safra.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSafra(String value) {
		this.safra = value;
	}

	/**
	 * Obtém o valor da propriedade ref.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Define o valor da propriedade ref.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRef(String value) {
		this.ref = value;
	}

	/**
	 * Gets the value of the forDia property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the forDia property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getForDia().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Cana.ForDia }
	 * 
	 * 
	 */
	public List<Cana.ForDia> getForDia() {
		if (forDia == null) {
			forDia = new ArrayList<Cana.ForDia>();
		}
		return this.forDia;
	}

	/**
	 * Obtém o valor da propriedade qTotMes.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQTotMes() {
		return qTotMes;
	}

	/**
	 * Define o valor da propriedade qTotMes.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQTotMes(String value) {
		this.qTotMes = value;
	}

	/**
	 * Obtém o valor da propriedade qTotAnt.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQTotAnt() {
		return qTotAnt;
	}

	/**
	 * Define o valor da propriedade qTotAnt.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQTotAnt(String value) {
		this.qTotAnt = value;
	}

	/**
	 * Obtém o valor da propriedade qTotGer.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQTotGer() {
		return qTotGer;
	}

	/**
	 * Define o valor da propriedade qTotGer.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQTotGer(String value) {
		this.qTotGer = value;
	}

	/**
	 * Gets the value of the deduc property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the deduc property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDeduc().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Cana.Deduc }
	 * 
	 * 
	 */
	public List<Cana.Deduc> getDeduc() {
		if (deduc == null) {
			deduc = new ArrayList<Cana.Deduc>();
		}
		return this.deduc;
	}

	/**
	 * Obtém o valor da propriedade vFor.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVFor() {
		return vFor;
	}

	/**
	 * Define o valor da propriedade vFor.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVFor(String value) {
		this.vFor = value;
	}

	/**
	 * Obtém o valor da propriedade vTotDed.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVTotDed() {
		return vTotDed;
	}

	/**
	 * Define o valor da propriedade vTotDed.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVTotDed(String value) {
		this.vTotDed = value;
	}

	/**
	 * Obtém o valor da propriedade vLiqFor.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVLiqFor() {
		return vLiqFor;
	}

	/**
	 * Define o valor da propriedade vLiqFor.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVLiqFor(String value) {
		this.vLiqFor = value;
	}

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
	 *         &lt;element name="xDed">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="60"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="vDed" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "xDed", "vDed" })
	public static class Deduc {

		@XmlElement(required = true)
		protected String xDed;
		@XmlElement(required = true)
		protected String vDed;

		/**
		 * Obtém o valor da propriedade xDed.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXDed() {
			return xDed;
		}

		/**
		 * Define o valor da propriedade xDed.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXDed(String value) {
			this.xDed = value;
		}

		/**
		 * Obtém o valor da propriedade vDed.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDed() {
			return vDed;
		}

		/**
		 * Define o valor da propriedade vDed.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDed(String value) {
			this.vDed = value;
		}

	}

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
	 *         &lt;element name="qtde" type="{http://www.portalfiscal.inf.br/nfe}TDec_1110v"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="dia" use="required">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *             &lt;whiteSpace value="preserve"/>
	 *             &lt;pattern value="[1-9]|[1][0-9]|[2][0-9]|[3][0-1]"/>
	 *           &lt;/restriction>
	 *         &lt;/simpleType>
	 *       &lt;/attribute>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "qtde" })
	public static class ForDia {

		@XmlElement(required = true)
		protected String qtde;
		@XmlAttribute(name = "dia", required = true)
		protected String dia;

		/**
		 * Obtém o valor da propriedade qtde.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getQtde() {
			return qtde;
		}

		/**
		 * Define o valor da propriedade qtde.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setQtde(String value) {
			this.qtde = value;
		}

		/**
		 * Obtém o valor da propriedade dia.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDia() {
			return dia;
		}

		/**
		 * Define o valor da propriedade dia.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDia(String value) {
			this.dia = value;
		}

	}

}