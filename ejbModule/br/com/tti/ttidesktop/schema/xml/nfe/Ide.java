package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cuf", "cnf", "natOp", "indPag", "mod", "serie", "nnf", "dhEmi", "dhSaiEnt", "tpNF",
		"idDest", "cMunFG", "tpImp", "tpEmis", "cdv", "tpAmb", "finNFe", "indFinal", "indPres", "procEmi", "verProc",
		"dhCont", "xJust", "nFref" })
@Embeddable
public class Ide implements Serializable {

	@XmlElement(name = "cUF", required = true)
	protected String cuf;
	@XmlElement(name = "cNF", required = true)
	protected String cnf;
	@XmlElement(required = true)
	protected String natOp;
	@XmlElement(required = true)
	protected String indPag;
	@XmlElement(required = true)
	protected String mod;
	@XmlElement(required = true)
	protected String serie;
	@XmlElement(name = "nNF", required = true)
	protected String nnf;
	@XmlElement(required = true)
	protected String dhEmi;
	protected String dhSaiEnt;
	@XmlElement(required = true)
	protected String tpNF;
	@XmlElement(required = true)
	protected String idDest;
	@XmlElement(required = true)
	protected String cMunFG;
	@XmlElement(required = true)
	protected String tpImp;
	@XmlElement(required = true)
	protected String tpEmis;
	@XmlElement(name = "cDV", required = true)
	protected String cdv;
	@XmlElement(required = true)
	protected String tpAmb;
	@XmlElement(required = true)
	protected String finNFe;
	@XmlElement(required = true)
	protected String indFinal;
	@XmlElement(required = true)
	protected String indPres;
	@XmlElement(required = true)
	protected String procEmi;
	@XmlElement(required = true)
	protected String verProc;
	protected String dhCont;
	protected String xJust;

	@XmlElement(name = "NFref")
	@Transient
	protected List<Ide.NFref> nFref;

	/**
	 * Obtém o valor da propriedade cuf.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCUF() {
		return cuf;
	}

	/**
	 * Define o valor da propriedade cuf.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCUF(String value) {
		this.cuf = value;
	}

	/**
	 * Obtém o valor da propriedade cnf.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNF() {
		return cnf;
	}

	/**
	 * Define o valor da propriedade cnf.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNF(String value) {
		this.cnf = value;
	}

	/**
	 * Obtém o valor da propriedade natOp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNatOp() {
		return natOp;
	}

	/**
	 * Define o valor da propriedade natOp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNatOp(String value) {
		this.natOp = value;
	}

	/**
	 * Obtém o valor da propriedade indPag.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndPag() {
		return indPag;
	}

	/**
	 * Define o valor da propriedade indPag.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndPag(String value) {
		this.indPag = value;
	}

	/**
	 * Obtém o valor da propriedade mod.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMod() {
		return mod;
	}

	/**
	 * Define o valor da propriedade mod.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMod(String value) {
		this.mod = value;
	}

	/**
	 * Obtém o valor da propriedade serie.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSerie() {
		return serie;
	}

	/**
	 * Define o valor da propriedade serie.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSerie(String value) {
		this.serie = value;
	}

	/**
	 * Obtém o valor da propriedade nnf.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNNF() {
		return nnf;
	}

	/**
	 * Define o valor da propriedade nnf.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNNF(String value) {
		this.nnf = value;
	}

	/**
	 * Obtém o valor da propriedade dhEmi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDhEmi() {
		return dhEmi;
	}

	/**
	 * Define o valor da propriedade dhEmi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDhEmi(String value) {
		this.dhEmi = value;
	}

	/**
	 * Obtém o valor da propriedade dhSaiEnt.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDhSaiEnt() {
		return dhSaiEnt;
	}

	/**
	 * Define o valor da propriedade dhSaiEnt.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDhSaiEnt(String value) {
		this.dhSaiEnt = value;
	}

	/**
	 * Obtém o valor da propriedade tpNF.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpNF() {
		return tpNF;
	}

	/**
	 * Define o valor da propriedade tpNF.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpNF(String value) {
		this.tpNF = value;
	}

	/**
	 * Obtém o valor da propriedade idDest.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdDest() {
		return idDest;
	}

	/**
	 * Define o valor da propriedade idDest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdDest(String value) {
		this.idDest = value;
	}

	/**
	 * Obtém o valor da propriedade cMunFG.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCMunFG() {
		return cMunFG;
	}

	/**
	 * Define o valor da propriedade cMunFG.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCMunFG(String value) {
		this.cMunFG = value;
	}

	/**
	 * Obtém o valor da propriedade tpImp.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpImp() {
		return tpImp;
	}

	/**
	 * Define o valor da propriedade tpImp.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpImp(String value) {
		this.tpImp = value;
	}

	/**
	 * Obtém o valor da propriedade tpEmis.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpEmis() {
		return tpEmis;
	}

	/**
	 * Define o valor da propriedade tpEmis.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpEmis(String value) {
		this.tpEmis = value;
	}

	/**
	 * Obtém o valor da propriedade cdv.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCDV() {
		return cdv;
	}

	/**
	 * Define o valor da propriedade cdv.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCDV(String value) {
		this.cdv = value;
	}

	/**
	 * Obtém o valor da propriedade tpAmb.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTpAmb() {
		return tpAmb;
	}

	/**
	 * Define o valor da propriedade tpAmb.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTpAmb(String value) {
		this.tpAmb = value;
	}

	/**
	 * Obtém o valor da propriedade finNFe.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFinNFe() {
		return finNFe;
	}

	/**
	 * Define o valor da propriedade finNFe.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFinNFe(String value) {
		this.finNFe = value;
	}

	/**
	 * Obtém o valor da propriedade indFinal.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndFinal() {
		return indFinal;
	}

	/**
	 * Define o valor da propriedade indFinal.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndFinal(String value) {
		this.indFinal = value;
	}

	/**
	 * Obtém o valor da propriedade indPres.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndPres() {
		return indPres;
	}

	/**
	 * Define o valor da propriedade indPres.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndPres(String value) {
		this.indPres = value;
	}

	/**
	 * Obtém o valor da propriedade procEmi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProcEmi() {
		return procEmi;
	}

	/**
	 * Define o valor da propriedade procEmi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProcEmi(String value) {
		this.procEmi = value;
	}

	/**
	 * Obtém o valor da propriedade verProc.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVerProc() {
		return verProc;
	}

	/**
	 * Define o valor da propriedade verProc.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVerProc(String value) {
		this.verProc = value;
	}

	/**
	 * Obtém o valor da propriedade dhCont.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDhCont() {
		return dhCont;
	}

	/**
	 * Define o valor da propriedade dhCont.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDhCont(String value) {
		this.dhCont = value;
	}

	/**
	 * Obtém o valor da propriedade xJust.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXJust() {
		return xJust;
	}

	/**
	 * Define o valor da propriedade xJust.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXJust(String value) {
		this.xJust = value;
	}

	/**
	 * Gets the value of the nFref property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the nFref property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNFref().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Ide.NFref }
	 * 
	 * 
	 */
	public List<Ide.NFref> getNFref() {
		if (nFref == null) {
			nFref = new ArrayList<Ide.NFref>();
		}
		return this.nFref;
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
	 *       &lt;choice>
	 *         &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
	 *         &lt;element name="refNF">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
	 *                   &lt;element name="AAMM">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
	 *                   &lt;element name="mod">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="01"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
	 *                   &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="refNFP">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
	 *                   &lt;element name="AAMM">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;choice>
	 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
	 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
	 *                   &lt;/choice>
	 *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest"/>
	 *                   &lt;element name="mod">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="01"/>
	 *                         &lt;enumeration value="04"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
	 *                   &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="refCTe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
	 *         &lt;element name="refECF">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="mod">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;enumeration value="2B"/>
	 *                         &lt;enumeration value="2C"/>
	 *                         &lt;enumeration value="2D"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nECF">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{1,3}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nCOO">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{1,6}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/choice>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "refNFe", "refNF", "refNFP", "refCTe", "refECF" })
	public static class NFref {

		protected String refNFe;
		protected Ide.NFref.RefNF refNF;
		protected Ide.NFref.RefNFP refNFP;
		protected String refCTe;
		protected Ide.NFref.RefECF refECF;

		/**
		 * Obtém o valor da propriedade refNFe.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRefNFe() {
			return refNFe;
		}

		/**
		 * Define o valor da propriedade refNFe.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRefNFe(String value) {
			this.refNFe = value;
		}

		/**
		 * Obtém o valor da propriedade refNF.
		 * 
		 * @return possible object is {@link Ide.NFref.RefNF }
		 * 
		 */
		public Ide.NFref.RefNF getRefNF() {
			return refNF;
		}

		/**
		 * Define o valor da propriedade refNF.
		 * 
		 * @param value
		 *            allowed object is {@link Ide.NFref.RefNF }
		 * 
		 */
		public void setRefNF(Ide.NFref.RefNF value) {
			this.refNF = value;
		}

		/**
		 * Obtém o valor da propriedade refNFP.
		 * 
		 * @return possible object is {@link Ide.NFref.RefNFP }
		 * 
		 */
		public Ide.NFref.RefNFP getRefNFP() {
			return refNFP;
		}

		/**
		 * Define o valor da propriedade refNFP.
		 * 
		 * @param value
		 *            allowed object is {@link Ide.NFref.RefNFP }
		 * 
		 */
		public void setRefNFP(Ide.NFref.RefNFP value) {
			this.refNFP = value;
		}

		/**
		 * Obtém o valor da propriedade refCTe.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRefCTe() {
			return refCTe;
		}

		/**
		 * Define o valor da propriedade refCTe.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRefCTe(String value) {
			this.refCTe = value;
		}

		/**
		 * Obtém o valor da propriedade refECF.
		 * 
		 * @return possible object is {@link Ide.NFref.RefECF }
		 * 
		 */
		public Ide.NFref.RefECF getRefECF() {
			return refECF;
		}

		/**
		 * Define o valor da propriedade refECF.
		 * 
		 * @param value
		 *            allowed object is {@link Ide.NFref.RefECF }
		 * 
		 */
		public void setRefECF(Ide.NFref.RefECF value) {
			this.refECF = value;
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
		 *         &lt;element name="mod">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="2B"/>
		 *               &lt;enumeration value="2C"/>
		 *               &lt;enumeration value="2D"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nECF">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{1,3}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nCOO">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{1,6}"/>
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
		@XmlType(name = "", propOrder = { "mod", "necf", "ncoo" })
		public static class RefECF {

			@XmlElement(required = true)
			protected String mod;
			@XmlElement(name = "nECF", required = true)
			protected String necf;
			@XmlElement(name = "nCOO", required = true)
			protected String ncoo;

			/**
			 * Obtém o valor da propriedade mod.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMod() {
				return mod;
			}

			/**
			 * Define o valor da propriedade mod.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMod(String value) {
				this.mod = value;
			}

			/**
			 * Obtém o valor da propriedade necf.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNECF() {
				return necf;
			}

			/**
			 * Define o valor da propriedade necf.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNECF(String value) {
				this.necf = value;
			}

			/**
			 * Obtém o valor da propriedade ncoo.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNCOO() {
				return ncoo;
			}

			/**
			 * Define o valor da propriedade ncoo.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNCOO(String value) {
				this.ncoo = value;
			}

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
		 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
		 *         &lt;element name="AAMM">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
		 *         &lt;element name="mod">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="01"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
		 *         &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cuf", "aamm", "cnpj", "mod", "serie", "nnf" })
		public static class RefNF {

			@XmlElement(name = "cUF", required = true)
			protected String cuf;
			@XmlElement(name = "AAMM", required = true)
			protected String aamm;
			@XmlElement(name = "CNPJ", required = true)
			protected String cnpj;
			@XmlElement(required = true)
			protected String mod;
			@XmlElement(required = true)
			protected String serie;
			@XmlElement(name = "nNF", required = true)
			protected String nnf;

			/**
			 * Obtém o valor da propriedade cuf.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCUF() {
				return cuf;
			}

			/**
			 * Define o valor da propriedade cuf.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCUF(String value) {
				this.cuf = value;
			}

			/**
			 * Obtém o valor da propriedade aamm.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAAMM() {
				return aamm;
			}

			/**
			 * Define o valor da propriedade aamm.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAAMM(String value) {
				this.aamm = value;
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
			 * Obtém o valor da propriedade mod.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMod() {
				return mod;
			}

			/**
			 * Define o valor da propriedade mod.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMod(String value) {
				this.mod = value;
			}

			/**
			 * Obtém o valor da propriedade serie.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSerie() {
				return serie;
			}

			/**
			 * Define o valor da propriedade serie.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setSerie(String value) {
				this.serie = value;
			}

			/**
			 * Obtém o valor da propriedade nnf.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNNF() {
				return nnf;
			}

			/**
			 * Define o valor da propriedade nnf.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNNF(String value) {
				this.nnf = value;
			}

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
		 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
		 *         &lt;element name="AAMM">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;choice>
		 *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpj"/>
		 *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/>
		 *         &lt;/choice>
		 *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/nfe}TIeDest"/>
		 *         &lt;element name="mod">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;enumeration value="01"/>
		 *               &lt;enumeration value="04"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/nfe}TSerie"/>
		 *         &lt;element name="nNF" type="{http://www.portalfiscal.inf.br/nfe}TNF"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "cuf", "aamm", "cnpj", "cpf", "ie", "mod", "serie", "nnf" })
		public static class RefNFP {

			@XmlElement(name = "cUF", required = true)
			protected String cuf;
			@XmlElement(name = "AAMM", required = true)
			protected String aamm;
			@XmlElement(name = "CNPJ")
			protected String cnpj;
			@XmlElement(name = "CPF")
			protected String cpf;
			@XmlElement(name = "IE", required = true)
			protected String ie;
			@XmlElement(required = true)
			protected String mod;
			@XmlElement(required = true)
			protected String serie;
			@XmlElement(name = "nNF", required = true)
			protected String nnf;

			/**
			 * Obtém o valor da propriedade cuf.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCUF() {
				return cuf;
			}

			/**
			 * Define o valor da propriedade cuf.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCUF(String value) {
				this.cuf = value;
			}

			/**
			 * Obtém o valor da propriedade aamm.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getAAMM() {
				return aamm;
			}

			/**
			 * Define o valor da propriedade aamm.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setAAMM(String value) {
				this.aamm = value;
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
			 * Obtém o valor da propriedade mod.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getMod() {
				return mod;
			}

			/**
			 * Define o valor da propriedade mod.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setMod(String value) {
				this.mod = value;
			}

			/**
			 * Obtém o valor da propriedade serie.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSerie() {
				return serie;
			}

			/**
			 * Define o valor da propriedade serie.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setSerie(String value) {
				this.serie = value;
			}

			/**
			 * Obtém o valor da propriedade nnf.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNNF() {
				return nnf;
			}

			/**
			 * Define o valor da propriedade nnf.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNNF(String value) {
				this.nnf = value;
			}

		}

	}

}