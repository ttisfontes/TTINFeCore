package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cProd", "cean", "xProd", "ncm", "nve", "cest", "extipi", "cfop", "uCom", "qCom",
		"vUnCom", "vProd", "ceanTrib", "uTrib", "qTrib", "vUnTrib", "vFrete", "vSeg", "vDesc", "vOutro", "indTot", "di",
		"detExport", "xPed", "nItemPed", "nfci", "veicProd", "med", "arma", "comb", "nrecopi" })
@Embeddable
public class Prod implements Serializable {

	@XmlElement(required = true)
	protected String cProd;
	@XmlElement(name = "cEAN", required = true)
	protected String cean;
	@XmlElement(required = true)
	protected String xProd;
	@XmlElement(name = "NCM", required = true)
	protected String ncm;
	@XmlElement(name = "NVE")
	@Transient
	protected List<String> nve;
	@XmlElement(name = "CEST")
	protected String cest;
	@XmlElement(name = "EXTIPI")
	protected String extipi;
	@XmlElement(name = "CFOP", required = true)
	protected String cfop;
	@XmlElement(required = true)
	protected String uCom;
	@XmlElement(required = true)
	protected String qCom;
	@XmlElement(required = true)
	protected String vUnCom;
	@XmlElement(required = true)
	protected String vProd;
	@XmlElement(name = "cEANTrib", required = true)
	protected String ceanTrib;
	@XmlElement(required = true)
	protected String uTrib;
	@XmlElement(required = true)
	protected String qTrib;
	@XmlElement(required = true)
	protected String vUnTrib;
	protected String vFrete;
	protected String vSeg;
	protected String vDesc;
	protected String vOutro;

	@XmlElement(required = true)
	protected String indTot;

	@XmlElement(name = "DI")
	@Transient
	protected List<DI> di;

	@Transient
	protected List<Prod.DetExport> detExport;
	protected String xPed;
	protected String nItemPed;

	@XmlElement(name = "nFCI")
	@Transient
	protected String nfci;
	
	@Transient
	protected Prod.VeicProd veicProd;

	@Transient
	protected List<Prod.Med> med;

	@Transient
	protected List<Prod.Arma> arma;

	@Transient
	protected Prod.Comb comb;

	@XmlElement(name = "nRECOPI")
	protected String nrecopi;

	/**
	 * Obtém o valor da propriedade cProd.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCProd() {
		return cProd;
	}

	/**
	 * Define o valor da propriedade cProd.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCProd(String value) {
		this.cProd = value;
	}

	/**
	 * Obtém o valor da propriedade cean.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCEAN() {
		return cean;
	}

	/**
	 * Define o valor da propriedade cean.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCEAN(String value) {
		this.cean = value;
	}

	/**
	 * Obtém o valor da propriedade xProd.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXProd() {
		return xProd;
	}

	/**
	 * Define o valor da propriedade xProd.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXProd(String value) {
		this.xProd = value;
	}

	/**
	 * Obtém o valor da propriedade ncm.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNCM() {
		return ncm;
	}

	/**
	 * Define o valor da propriedade ncm.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNCM(String value) {
		this.ncm = value;
	}

	/**
	 * Gets the value of the nve property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the nve property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getNVE().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getNVE() {
		if (nve == null) {
			nve = new ArrayList<String>();
		}
		return this.nve;
	}

	/**
	 * Obtém o valor da propriedade cest.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCEST() {
		return cest;
	}

	/**
	 * Define o valor da propriedade cest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCEST(String value) {
		this.cest = value;
	}

	/**
	 * Obtém o valor da propriedade extipi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEXTIPI() {
		return extipi;
	}

	/**
	 * Define o valor da propriedade extipi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEXTIPI(String value) {
		this.extipi = value;
	}

	/**
	 * Obtém o valor da propriedade cfop.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCFOP() {
		return cfop;
	}

	/**
	 * Define o valor da propriedade cfop.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCFOP(String value) {
		this.cfop = value;
	}

	/**
	 * Obtém o valor da propriedade uCom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUCom() {
		return uCom;
	}

	/**
	 * Define o valor da propriedade uCom.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUCom(String value) {
		this.uCom = value;
	}

	/**
	 * Obtém o valor da propriedade qCom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQCom() {
		return qCom;
	}

	/**
	 * Define o valor da propriedade qCom.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQCom(String value) {
		this.qCom = value;
	}

	/**
	 * Obtém o valor da propriedade vUnCom.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVUnCom() {
		return vUnCom;
	}

	/**
	 * Define o valor da propriedade vUnCom.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVUnCom(String value) {
		this.vUnCom = value;
	}

	/**
	 * Obtém o valor da propriedade vProd.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVProd() {
		return vProd;
	}

	/**
	 * Define o valor da propriedade vProd.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVProd(String value) {
		this.vProd = value;
	}

	/**
	 * Obtém o valor da propriedade ceanTrib.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCEANTrib() {
		return ceanTrib;
	}

	/**
	 * Define o valor da propriedade ceanTrib.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCEANTrib(String value) {
		this.ceanTrib = value;
	}

	/**
	 * Obtém o valor da propriedade uTrib.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUTrib() {
		return uTrib;
	}

	/**
	 * Define o valor da propriedade uTrib.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUTrib(String value) {
		this.uTrib = value;
	}

	/**
	 * Obtém o valor da propriedade qTrib.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQTrib() {
		return qTrib;
	}

	/**
	 * Define o valor da propriedade qTrib.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQTrib(String value) {
		this.qTrib = value;
	}

	/**
	 * Obtém o valor da propriedade vUnTrib.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVUnTrib() {
		return vUnTrib;
	}

	/**
	 * Define o valor da propriedade vUnTrib.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVUnTrib(String value) {
		this.vUnTrib = value;
	}

	/**
	 * Obtém o valor da propriedade vFrete.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVFrete() {
		return vFrete;
	}

	/**
	 * Define o valor da propriedade vFrete.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVFrete(String value) {
		this.vFrete = value;
	}

	/**
	 * Obtém o valor da propriedade vSeg.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVSeg() {
		return vSeg;
	}

	/**
	 * Define o valor da propriedade vSeg.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVSeg(String value) {
		this.vSeg = value;
	}

	/**
	 * Obtém o valor da propriedade vDesc.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVDesc() {
		return vDesc;
	}

	/**
	 * Define o valor da propriedade vDesc.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVDesc(String value) {
		this.vDesc = value;
	}

	/**
	 * Obtém o valor da propriedade vOutro.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVOutro() {
		return vOutro;
	}

	/**
	 * Define o valor da propriedade vOutro.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVOutro(String value) {
		this.vOutro = value;
	}

	/**
	 * Obtém o valor da propriedade indTot.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIndTot() {
		return indTot;
	}

	/**
	 * Define o valor da propriedade indTot.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIndTot(String value) {
		this.indTot = value;
	}

	/**
	 * Gets the value of the di property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the di property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDI().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link DI }
	 * 
	 * 
	 */
	public List<DI> getDI() {
		if (di == null) {
			di = new ArrayList<DI>();
		}
		return this.di;
	}

	/**
	 * Gets the value of the detExport property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the detExport property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDetExport().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Prod.DetExport }
	 * 
	 * 
	 */
	public List<Prod.DetExport> getDetExport() {
		if (detExport == null) {
			detExport = new ArrayList<Prod.DetExport>();
		}
		return this.detExport;
	}

	/**
	 * Obtém o valor da propriedade xPed.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXPed() {
		return xPed;
	}

	/**
	 * Define o valor da propriedade xPed.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXPed(String value) {
		this.xPed = value;
	}

	/**
	 * Obtém o valor da propriedade nItemPed.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNItemPed() {
		return nItemPed;
	}

	/**
	 * Define o valor da propriedade nItemPed.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNItemPed(String value) {
		this.nItemPed = value;
	}

	/**
	 * Obtém o valor da propriedade nfci.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNFCI() {
		return nfci;
	}

	/**
	 * Define o valor da propriedade nfci.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNFCI(String value) {
		this.nfci = value;
	}

	/**
	 * Obtém o valor da propriedade veicProd.
	 * 
	 * @return possible object is {@link Prod.VeicProd }
	 * 
	 */
	public Prod.VeicProd getVeicProd() {
		return veicProd;
	}

	/**
	 * Define o valor da propriedade veicProd.
	 * 
	 * @param value
	 *            allowed object is {@link Prod.VeicProd }
	 * 
	 */
	public void setVeicProd(Prod.VeicProd value) {
		this.veicProd = value;
	}

	/**
	 * Gets the value of the med property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the med property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMed().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Prod.Med }
	 * 
	 * 
	 */
	public List<Prod.Med> getMed() {
		if (med == null) {
			med = new ArrayList<Prod.Med>();
		}
		return this.med;
	}

	/**
	 * Gets the value of the arma property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the arma property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getArma().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Prod.Arma }
	 * 
	 * 
	 */
	public List<Prod.Arma> getArma() {
		if (arma == null) {
			arma = new ArrayList<Prod.Arma>();
		}
		return this.arma;
	}

	/**
	 * Obtém o valor da propriedade comb.
	 * 
	 * @return possible object is {@link Prod.Comb }
	 * 
	 */
	public Prod.Comb getComb() {
		return comb;
	}

	/**
	 * Define o valor da propriedade comb.
	 * 
	 * @param value
	 *            allowed object is {@link Prod.Comb }
	 * 
	 */
	public void setComb(Prod.Comb value) {
		this.comb = value;
	}

	/**
	 * Obtém o valor da propriedade nrecopi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNRECOPI() {
		return nrecopi;
	}

	/**
	 * Define o valor da propriedade nrecopi.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNRECOPI(String value) {
		this.nrecopi = value;
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
	 *         &lt;element name="tpArma">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="0"/>
	 *               &lt;enumeration value="1"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="nSerie">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="15"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="nCano">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="15"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="descr">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="256"/>
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
	@XmlType(name = "", propOrder = { "tpArma", "nSerie", "nCano", "descr" })
	public static class Arma {

		@XmlElement(required = true)
		protected String tpArma;
		@XmlElement(required = true)
		protected String nSerie;
		@XmlElement(required = true)
		protected String nCano;
		@XmlElement(required = true)
		protected String descr;

		/**
		 * Obtém o valor da propriedade tpArma.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpArma() {
			return tpArma;
		}

		/**
		 * Define o valor da propriedade tpArma.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpArma(String value) {
			this.tpArma = value;
		}

		/**
		 * Obtém o valor da propriedade nSerie.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNSerie() {
			return nSerie;
		}

		/**
		 * Define o valor da propriedade nSerie.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNSerie(String value) {
			this.nSerie = value;
		}

		/**
		 * Obtém o valor da propriedade nCano.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNCano() {
			return nCano;
		}

		/**
		 * Define o valor da propriedade nCano.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNCano(String value) {
			this.nCano = value;
		}

		/**
		 * Obtém o valor da propriedade descr.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescr() {
			return descr;
		}

		/**
		 * Define o valor da propriedade descr.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescr(String value) {
			this.descr = value;
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
	 *         &lt;element name="cProdANP">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{9}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="pMixGN" type="{http://www.portalfiscal.inf.br/nfe}TDec_0204v" minOccurs="0"/>
	 *         &lt;element name="CODIF" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{1,21}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="qTemp" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204temperatura" minOccurs="0"/>
	 *         &lt;element name="UFCons" type="{http://www.portalfiscal.inf.br/nfe}TUf"/>
	 *         &lt;element name="CIDE" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
	 *                   &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
	 *                   &lt;element name="vCIDE" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="encerrante" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="nBico">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{1,3}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nBomba" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{1,3}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="nTanque">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                         &lt;whiteSpace value="preserve"/>
	 *                         &lt;pattern value="[0-9]{1,3}"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="vEncIni" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
	 *                   &lt;element name="vEncFin" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
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
	@XmlType(name = "", propOrder = { "cProdANP", "pMixGN", "codif", "qTemp", "ufCons", "cide", "encerrante" })
	public static class Comb {

		@XmlElement(required = true)
		protected String cProdANP;
		protected String pMixGN;
		@XmlElement(name = "CODIF")
		protected String codif;
		protected String qTemp;
		@XmlElement(name = "UFCons", required = true)
		@XmlSchemaType(name = "string")
		protected TUf ufCons;
		@XmlElement(name = "CIDE")
		protected Prod.Comb.CIDE cide;
		protected Prod.Comb.Encerrante encerrante;

		/**
		 * Obtém o valor da propriedade cProdANP.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCProdANP() {
			return cProdANP;
		}

		/**
		 * Define o valor da propriedade cProdANP.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCProdANP(String value) {
			this.cProdANP = value;
		}

		/**
		 * Obtém o valor da propriedade pMixGN.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPMixGN() {
			return pMixGN;
		}

		/**
		 * Define o valor da propriedade pMixGN.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPMixGN(String value) {
			this.pMixGN = value;
		}

		/**
		 * Obtém o valor da propriedade codif.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCODIF() {
			return codif;
		}

		/**
		 * Define o valor da propriedade codif.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCODIF(String value) {
			this.codif = value;
		}

		/**
		 * Obtém o valor da propriedade qTemp.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getQTemp() {
			return qTemp;
		}

		/**
		 * Define o valor da propriedade qTemp.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setQTemp(String value) {
			this.qTemp = value;
		}

		/**
		 * Obtém o valor da propriedade ufCons.
		 * 
		 * @return possible object is {@link TUf }
		 * 
		 */
		public TUf getUFCons() {
			return ufCons;
		}

		/**
		 * Define o valor da propriedade ufCons.
		 * 
		 * @param value
		 *            allowed object is {@link TUf }
		 * 
		 */
		public void setUFCons(TUf value) {
			this.ufCons = value;
		}

		/**
		 * Obtém o valor da propriedade cide.
		 * 
		 * @return possible object is {@link Prod.Comb.CIDE }
		 * 
		 */
		public Prod.Comb.CIDE getCIDE() {
			return cide;
		}

		/**
		 * Define o valor da propriedade cide.
		 * 
		 * @param value
		 *            allowed object is {@link Prod.Comb.CIDE }
		 * 
		 */
		public void setCIDE(Prod.Comb.CIDE value) {
			this.cide = value;
		}

		/**
		 * Obtém o valor da propriedade encerrante.
		 * 
		 * @return possible object is {@link Prod.Comb.Encerrante }
		 * 
		 */
		public Prod.Comb.Encerrante getEncerrante() {
			return encerrante;
		}

		/**
		 * Define o valor da propriedade encerrante.
		 * 
		 * @param value
		 *            allowed object is {@link Prod.Comb.Encerrante }
		 * 
		 */
		public void setEncerrante(Prod.Comb.Encerrante value) {
			this.encerrante = value;
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
		 *         &lt;element name="qBCProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1204v"/>
		 *         &lt;element name="vAliqProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104"/>
		 *         &lt;element name="vCIDE" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "qbcProd", "vAliqProd", "vcide" })
		public static class CIDE {

			@XmlElement(name = "qBCProd", required = true)
			protected String qbcProd;
			@XmlElement(required = true)
			protected String vAliqProd;
			@XmlElement(name = "vCIDE", required = true)
			protected String vcide;

			/**
			 * Obtém o valor da propriedade qbcProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQBCProd() {
				return qbcProd;
			}

			/**
			 * Define o valor da propriedade qbcProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQBCProd(String value) {
				this.qbcProd = value;
			}

			/**
			 * Obtém o valor da propriedade vAliqProd.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVAliqProd() {
				return vAliqProd;
			}

			/**
			 * Define o valor da propriedade vAliqProd.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVAliqProd(String value) {
				this.vAliqProd = value;
			}

			/**
			 * Obtém o valor da propriedade vcide.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVCIDE() {
				return vcide;
			}

			/**
			 * Define o valor da propriedade vcide.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVCIDE(String value) {
				this.vcide = value;
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
		 *         &lt;element name="nBico">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{1,3}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nBomba" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{1,3}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="nTanque">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{1,3}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="vEncIni" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
		 *         &lt;element name="vEncFin" type="{http://www.portalfiscal.inf.br/nfe}TDec_1203"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "nBico", "nBomba", "nTanque", "vEncIni", "vEncFin" })
		public static class Encerrante {

			@XmlElement(required = true)
			protected String nBico;
			protected String nBomba;
			@XmlElement(required = true)
			protected String nTanque;
			@XmlElement(required = true)
			protected String vEncIni;
			@XmlElement(required = true)
			protected String vEncFin;

			/**
			 * Obtém o valor da propriedade nBico.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNBico() {
				return nBico;
			}

			/**
			 * Define o valor da propriedade nBico.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNBico(String value) {
				this.nBico = value;
			}

			/**
			 * Obtém o valor da propriedade nBomba.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNBomba() {
				return nBomba;
			}

			/**
			 * Define o valor da propriedade nBomba.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNBomba(String value) {
				this.nBomba = value;
			}

			/**
			 * Obtém o valor da propriedade nTanque.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNTanque() {
				return nTanque;
			}

			/**
			 * Define o valor da propriedade nTanque.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNTanque(String value) {
				this.nTanque = value;
			}

			/**
			 * Obtém o valor da propriedade vEncIni.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVEncIni() {
				return vEncIni;
			}

			/**
			 * Define o valor da propriedade vEncIni.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVEncIni(String value) {
				this.vEncIni = value;
			}

			/**
			 * Obtém o valor da propriedade vEncFin.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getVEncFin() {
				return vEncFin;
			}

			/**
			 * Define o valor da propriedade vEncFin.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setVEncFin(String value) {
				this.vEncFin = value;
			}

		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "nDraw", "exportInd" })
	public static class DetExport {

		protected String nDraw;
		protected Prod.DetExport.ExportInd exportInd;

		/**
		 * Obtém o valor da propriedade nDraw.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNDraw() {
			return nDraw;
		}

		/**
		 * Define o valor da propriedade nDraw.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNDraw(String value) {
			this.nDraw = value;
		}

		/**
		 * Obtém o valor da propriedade exportInd.
		 * 
		 * @return possible object is {@link Prod.DetExport.ExportInd }
		 * 
		 */
		public Prod.DetExport.ExportInd getExportInd() {
			return exportInd;
		}

		/**
		 * Define o valor da propriedade exportInd.
		 * 
		 * @param value
		 *            allowed object is {@link Prod.DetExport.ExportInd }
		 * 
		 */
		public void setExportInd(Prod.DetExport.ExportInd value) {
			this.exportInd = value;
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
		 *         &lt;element name="nRE">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *               &lt;whiteSpace value="preserve"/>
		 *               &lt;pattern value="[0-9]{0,12}"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe"/>
		 *         &lt;element name="qExport" type="{http://www.portalfiscal.inf.br/nfe}TDec_1104v"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "nre", "chNFe", "qExport" })
		public static class ExportInd {

			@XmlElement(name = "nRE", required = true)
			protected String nre;
			@XmlElement(required = true)
			protected String chNFe;
			@XmlElement(required = true)
			protected String qExport;

			/**
			 * Obtém o valor da propriedade nre.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNRE() {
				return nre;
			}

			/**
			 * Define o valor da propriedade nre.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setNRE(String value) {
				this.nre = value;
			}

			/**
			 * Obtém o valor da propriedade chNFe.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getChNFe() {
				return chNFe;
			}

			/**
			 * Define o valor da propriedade chNFe.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setChNFe(String value) {
				this.chNFe = value;
			}

			/**
			 * Obtém o valor da propriedade qExport.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQExport() {
				return qExport;
			}

			/**
			 * Define o valor da propriedade qExport.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQExport(String value) {
				this.qExport = value;
			}

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
	 *         &lt;element name="nLote">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="20"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="qLote" type="{http://www.portalfiscal.inf.br/nfe}TDec_0803v"/>
	 *         &lt;element name="dFab" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
	 *         &lt;element name="dVal" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
	 *         &lt;element name="vPMC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "nLote", "qLote", "dFab", "dVal", "vpmc" })
	public static class Med {

		@XmlElement(required = true)
		protected String nLote;
		@XmlElement(required = true)
		protected String qLote;
		@XmlElement(required = true)
		protected String dFab;
		@XmlElement(required = true)
		protected String dVal;
		@XmlElement(name = "vPMC", required = true)
		protected String vpmc;

		/**
		 * Obtém o valor da propriedade nLote.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNLote() {
			return nLote;
		}

		/**
		 * Define o valor da propriedade nLote.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNLote(String value) {
			this.nLote = value;
		}

		/**
		 * Obtém o valor da propriedade qLote.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getQLote() {
			return qLote;
		}

		/**
		 * Define o valor da propriedade qLote.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setQLote(String value) {
			this.qLote = value;
		}

		/**
		 * Obtém o valor da propriedade dFab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDFab() {
			return dFab;
		}

		/**
		 * Define o valor da propriedade dFab.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDFab(String value) {
			this.dFab = value;
		}

		/**
		 * Obtém o valor da propriedade dVal.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDVal() {
			return dVal;
		}

		/**
		 * Define o valor da propriedade dVal.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDVal(String value) {
			this.dVal = value;
		}

		/**
		 * Obtém o valor da propriedade vpmc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVPMC() {
			return vpmc;
		}

		/**
		 * Define o valor da propriedade vpmc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVPMC(String value) {
			this.vpmc = value;
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
	 *         &lt;element name="tpOp">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="0"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *               &lt;enumeration value="3"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="chassi">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;length value="17"/>
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[A-Z0-9]+"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cCor">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="4"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="xCor">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="40"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="pot">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="4"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cilin">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="4"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="pesoL">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="9"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="pesoB">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="9"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="nSerie">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="9"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="tpComb">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="2"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="nMotor">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="21"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="CMT">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="9"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="dist">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="4"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="anoMod">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{4}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="anoFab">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{4}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="tpPint">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;length value="1"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="tpVeic">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{1,2}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="espVeic">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{1}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="VIN">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
	 *               &lt;length value="1"/>
	 *               &lt;enumeration value="R"/>
	 *               &lt;enumeration value="N"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="condVeic">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *               &lt;enumeration value="3"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cMod">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{1,6}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cCorDENATRAN">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="2"/>
	 *               &lt;pattern value="[0-9]{1,2}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="lota">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;minLength value="1"/>
	 *               &lt;maxLength value="3"/>
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[0-9]{1,3}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="tpRest">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="0"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *               &lt;enumeration value="3"/>
	 *               &lt;enumeration value="4"/>
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
	@XmlType(name = "", propOrder = { "tpOp", "chassi", "cCor", "xCor", "pot", "cilin", "pesoL", "pesoB", "nSerie",
			"tpComb", "nMotor", "cmt", "dist", "anoMod", "anoFab", "tpPint", "tpVeic", "espVeic", "vin", "condVeic",
			"cMod", "cCorDENATRAN", "lota", "tpRest" })
	public static class VeicProd {

		@XmlElement(required = true)
		protected String tpOp;
		@XmlElement(required = true)
		protected String chassi;
		@XmlElement(required = true)
		protected String cCor;
		@XmlElement(required = true)
		protected String xCor;
		@XmlElement(required = true)
		protected String pot;
		@XmlElement(required = true)
		protected String cilin;
		@XmlElement(required = true)
		protected String pesoL;
		@XmlElement(required = true)
		protected String pesoB;
		@XmlElement(required = true)
		protected String nSerie;
		@XmlElement(required = true)
		protected String tpComb;
		@XmlElement(required = true)
		protected String nMotor;
		@XmlElement(name = "CMT", required = true)
		protected String cmt;
		@XmlElement(required = true)
		protected String dist;
		@XmlElement(required = true)
		protected String anoMod;
		@XmlElement(required = true)
		protected String anoFab;
		@XmlElement(required = true)
		protected String tpPint;
		@XmlElement(required = true)
		protected String tpVeic;
		@XmlElement(required = true)
		protected String espVeic;
		@XmlElement(name = "VIN", required = true)
		protected String vin;
		@XmlElement(required = true)
		protected String condVeic;
		@XmlElement(required = true)
		protected String cMod;
		@XmlElement(required = true)
		protected String cCorDENATRAN;
		@XmlElement(required = true)
		protected String lota;
		@XmlElement(required = true)
		protected String tpRest;

		/**
		 * Obtém o valor da propriedade tpOp.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpOp() {
			return tpOp;
		}

		/**
		 * Define o valor da propriedade tpOp.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpOp(String value) {
			this.tpOp = value;
		}

		/**
		 * Obtém o valor da propriedade chassi.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getChassi() {
			return chassi;
		}

		/**
		 * Define o valor da propriedade chassi.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setChassi(String value) {
			this.chassi = value;
		}

		/**
		 * Obtém o valor da propriedade cCor.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCCor() {
			return cCor;
		}

		/**
		 * Define o valor da propriedade cCor.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCCor(String value) {
			this.cCor = value;
		}

		/**
		 * Obtém o valor da propriedade xCor.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getXCor() {
			return xCor;
		}

		/**
		 * Define o valor da propriedade xCor.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setXCor(String value) {
			this.xCor = value;
		}

		/**
		 * Obtém o valor da propriedade pot.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPot() {
			return pot;
		}

		/**
		 * Define o valor da propriedade pot.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPot(String value) {
			this.pot = value;
		}

		/**
		 * Obtém o valor da propriedade cilin.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCilin() {
			return cilin;
		}

		/**
		 * Define o valor da propriedade cilin.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCilin(String value) {
			this.cilin = value;
		}

		/**
		 * Obtém o valor da propriedade pesoL.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPesoL() {
			return pesoL;
		}

		/**
		 * Define o valor da propriedade pesoL.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPesoL(String value) {
			this.pesoL = value;
		}

		/**
		 * Obtém o valor da propriedade pesoB.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPesoB() {
			return pesoB;
		}

		/**
		 * Define o valor da propriedade pesoB.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPesoB(String value) {
			this.pesoB = value;
		}

		/**
		 * Obtém o valor da propriedade nSerie.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNSerie() {
			return nSerie;
		}

		/**
		 * Define o valor da propriedade nSerie.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNSerie(String value) {
			this.nSerie = value;
		}

		/**
		 * Obtém o valor da propriedade tpComb.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpComb() {
			return tpComb;
		}

		/**
		 * Define o valor da propriedade tpComb.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpComb(String value) {
			this.tpComb = value;
		}

		/**
		 * Obtém o valor da propriedade nMotor.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNMotor() {
			return nMotor;
		}

		/**
		 * Define o valor da propriedade nMotor.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setNMotor(String value) {
			this.nMotor = value;
		}

		/**
		 * Obtém o valor da propriedade cmt.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCMT() {
			return cmt;
		}

		/**
		 * Define o valor da propriedade cmt.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCMT(String value) {
			this.cmt = value;
		}

		/**
		 * Obtém o valor da propriedade dist.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDist() {
			return dist;
		}

		/**
		 * Define o valor da propriedade dist.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDist(String value) {
			this.dist = value;
		}

		/**
		 * Obtém o valor da propriedade anoMod.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAnoMod() {
			return anoMod;
		}

		/**
		 * Define o valor da propriedade anoMod.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAnoMod(String value) {
			this.anoMod = value;
		}

		/**
		 * Obtém o valor da propriedade anoFab.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAnoFab() {
			return anoFab;
		}

		/**
		 * Define o valor da propriedade anoFab.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAnoFab(String value) {
			this.anoFab = value;
		}

		/**
		 * Obtém o valor da propriedade tpPint.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpPint() {
			return tpPint;
		}

		/**
		 * Define o valor da propriedade tpPint.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpPint(String value) {
			this.tpPint = value;
		}

		/**
		 * Obtém o valor da propriedade tpVeic.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpVeic() {
			return tpVeic;
		}

		/**
		 * Define o valor da propriedade tpVeic.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpVeic(String value) {
			this.tpVeic = value;
		}

		/**
		 * Obtém o valor da propriedade espVeic.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getEspVeic() {
			return espVeic;
		}

		/**
		 * Define o valor da propriedade espVeic.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setEspVeic(String value) {
			this.espVeic = value;
		}

		/**
		 * Obtém o valor da propriedade vin.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVIN() {
			return vin;
		}

		/**
		 * Define o valor da propriedade vin.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVIN(String value) {
			this.vin = value;
		}

		/**
		 * Obtém o valor da propriedade condVeic.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCondVeic() {
			return condVeic;
		}

		/**
		 * Define o valor da propriedade condVeic.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCondVeic(String value) {
			this.condVeic = value;
		}

		/**
		 * Obtém o valor da propriedade cMod.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCMod() {
			return cMod;
		}

		/**
		 * Define o valor da propriedade cMod.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCMod(String value) {
			this.cMod = value;
		}

		/**
		 * Obtém o valor da propriedade cCorDENATRAN.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCCorDENATRAN() {
			return cCorDENATRAN;
		}

		/**
		 * Define o valor da propriedade cCorDENATRAN.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCCorDENATRAN(String value) {
			this.cCorDENATRAN = value;
		}

		/**
		 * Obtém o valor da propriedade lota.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLota() {
			return lota;
		}

		/**
		 * Define o valor da propriedade lota.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setLota(String value) {
			this.lota = value;
		}

		/**
		 * Obtém o valor da propriedade tpRest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTpRest() {
			return tpRest;
		}

		/**
		 * Define o valor da propriedade tpRest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTpRest(String value) {
			this.tpRest = value;
		}

	}

}