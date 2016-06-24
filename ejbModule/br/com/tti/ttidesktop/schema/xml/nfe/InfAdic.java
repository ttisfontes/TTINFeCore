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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infAdF	isco" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;maxLength value="2000"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infCpl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;maxLength value="5000"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="obsCont" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xTexto">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="xCampo" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="20"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="obsFisco" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xTexto">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="xCampo" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="20"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procRef" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indProc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="9"/>
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
@XmlType(name = "", propOrder = { "infAdFisco", "infCpl", "obsCont", "obsFisco", "procRef" })
public class InfAdic {

	protected String infAdFisco;
	protected String infCpl;
	protected List<InfAdic.ObsCont> obsCont;
	protected List<InfAdic.ObsFisco> obsFisco;
	protected List<InfAdic.ProcRef> procRef;

	/**
	 * Obtém o valor da propriedade infAdFisco.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfAdFisco() {
		return infAdFisco;
	}

	/**
	 * Define o valor da propriedade infAdFisco.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInfAdFisco(String value) {
		this.infAdFisco = value;
	}

	/**
	 * Obtém o valor da propriedade infCpl.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfCpl() {
		return infCpl;
	}

	/**
	 * Define o valor da propriedade infCpl.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInfCpl(String value) {
		this.infCpl = value;
	}

	/**
	 * Gets the value of the obsCont property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the obsCont property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getObsCont().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InfAdic.ObsCont }
	 * 
	 * 
	 */
	public List<InfAdic.ObsCont> getObsCont() {
		if (obsCont == null) {
			obsCont = new ArrayList<InfAdic.ObsCont>();
		}
		return this.obsCont;
	}

	/**
	 * Gets the value of the obsFisco property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the obsFisco property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getObsFisco().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InfAdic.ObsFisco }
	 * 
	 * 
	 */
	public List<InfAdic.ObsFisco> getObsFisco() {
		if (obsFisco == null) {
			obsFisco = new ArrayList<InfAdic.ObsFisco>();
		}
		return this.obsFisco;
	}

	/**
	 * Gets the value of the procRef property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the procRef property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProcRef().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link InfAdic.ProcRef }
	 * 
	 * 
	 */
	public List<InfAdic.ProcRef> getProcRef() {
		if (procRef == null) {
			procRef = new ArrayList<InfAdic.ProcRef>();
		}
		return this.procRef;
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
	 *         &lt;element name="xTexto">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="60"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="xCampo" use="required">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *             &lt;minLength value="1"/>
	 *             &lt;maxLength value="20"/>
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
	@XmlType(name = "", propOrder = { "xTexto" })
	public static class ObsCont {

		@XmlElement(required = true)
		protected String xTexto;
		@XmlAttribute(name = "xCampo", required = true)
		protected String xCampo;

		/**
		 * Obtém o valor da propriedade xTexto.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXTexto() {
			return xTexto;
		}

		/**
		 * Define o valor da propriedade xTexto.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXTexto(String value) {
			this.xTexto = value;
		}

		/**
		 * Obtém o valor da propriedade xCampo.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXCampo() {
			return xCampo;
		}

		/**
		 * Define o valor da propriedade xCampo.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXCampo(String value) {
			this.xCampo = value;
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
	 *         &lt;element name="xTexto">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="60"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="xCampo" use="required">
	 *         &lt;simpleType>
	 *           &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *             &lt;minLength value="1"/>
	 *             &lt;maxLength value="20"/>
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
	@XmlType(name = "", propOrder = { "xTexto" })
	public static class ObsFisco {

		@XmlElement(required = true)
		protected String xTexto;
		@XmlAttribute(name = "xCampo", required = true)
		protected String xCampo;

		/**
		 * Obtém o valor da propriedade xTexto.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXTexto() {
			return xTexto;
		}

		/**
		 * Define o valor da propriedade xTexto.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXTexto(String value) {
			this.xTexto = value;
		}

		/**
		 * Obtém o valor da propriedade xCampo.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXCampo() {
			return xCampo;
		}

		/**
		 * Define o valor da propriedade xCampo.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXCampo(String value) {
			this.xCampo = value;
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
	 *         &lt;element name="nProc">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="60"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="indProc">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="0"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *               &lt;enumeration value="3"/>
	 *               &lt;enumeration value="9"/>
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
	@XmlType(name = "", propOrder = { "nProc", "indProc" })
	public static class ProcRef {

		@XmlElement(required = true)
		protected String nProc;
		@XmlElement(required = true)
		protected String indProc;

		/**
		 * Obtém o valor da propriedade nProc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNProc() {
			return nProc;
		}

		/**
		 * Define o valor da propriedade nProc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNProc(String value) {
			this.nProc = value;
		}

		/**
		 * Obtém o valor da propriedade indProc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIndProc() {
			return indProc;
		}

		/**
		 * Define o valor da propriedade indProc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIndProc(String value) {
			this.indProc = value;
		}

	}

}