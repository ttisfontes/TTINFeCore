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
 *         &lt;element name="ICMSTot">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                   &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                   &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                   &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vSeg" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
 *                   &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ISSQNtot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vISS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="dCompet" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
 *                   &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="cRegTrib" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                         &lt;enumeration value="5"/>
 *                         &lt;enumeration value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="retTrib" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vRetPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vRetCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vRetCSLL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vBCIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vBCRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "icmsTot", "issqNtot", "retTrib" })
public class Total {

	@XmlElement(name = "ICMSTot", required = true)
	protected Total.ICMSTot icmsTot;
	@XmlElement(name = "ISSQNtot")
	protected Total.ISSQNtot issqNtot;
	protected Total.RetTrib retTrib;

	/**
	 * Obtém o valor da propriedade icmsTot.
	 * 
	 * @return possible object is {@link Total.ICMSTot }
	 * 
	 */
	public Total.ICMSTot getICMSTot() {
		return icmsTot;
	}

	/**
	 * Define o valor da propriedade icmsTot.
	 * 
	 * @param value
	 *            allowed object is {@link Total.ICMSTot }
	 * 
	 */
	public void setICMSTot(Total.ICMSTot value) {
		this.icmsTot = value;
	}

	/**
	 * Obtém o valor da propriedade issqNtot.
	 * 
	 * @return possible object is {@link Total.ISSQNtot }
	 * 
	 */
	public Total.ISSQNtot getISSQNtot() {
		return issqNtot;
	}

	/**
	 * Define o valor da propriedade issqNtot.
	 * 
	 * @param value
	 *            allowed object is {@link Total.ISSQNtot }
	 * 
	 */
	public void setISSQNtot(Total.ISSQNtot value) {
		this.issqNtot = value;
	}

	/**
	 * Obtém o valor da propriedade retTrib.
	 * 
	 * @return possible object is {@link Total.RetTrib }
	 * 
	 */
	public Total.RetTrib getRetTrib() {
		return retTrib;
	}

	/**
	 * Define o valor da propriedade retTrib.
	 * 
	 * @param value
	 *            allowed object is {@link Total.RetTrib }
	 * 
	 */
	public void setRetTrib(Total.RetTrib value) {
		this.retTrib = value;
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
	 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vFCPUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *         &lt;element name="vICMSUFDest" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *         &lt;element name="vICMSUFRemet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vST" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vSeg" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vII" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vIPI" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vTotTrib" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vbc", "vicms", "vicmsDeson", "vfcpufDest", "vicmsufDest", "vicmsufRemet",
			"vbcst", "vst", "vProd", "vFrete", "vSeg", "vDesc", "vii", "vipi", "vpis", "vcofins", "vOutro",
			"vnf", "vTotTrib" })
	public static class ICMSTot {

		@XmlElement(name = "vBC", required = true)
		protected String vbc;
		@XmlElement(name = "vICMS", required = true)
		protected String vicms;
		@XmlElement(name = "vICMSDeson", required = true)
		protected String vicmsDeson;
		@XmlElement(name = "vFCPUFDest")
		protected String vfcpufDest;
		@XmlElement(name = "vICMSUFDest")
		protected String vicmsufDest;
		@XmlElement(name = "vICMSUFRemet")
		protected String vicmsufRemet;
		@XmlElement(name = "vBCST", required = true)
		protected String vbcst;
		@XmlElement(name = "vST", required = true)
		protected String vst;
		@XmlElement(required = true)
		protected String vProd;
		@XmlElement(required = true)
		protected String vFrete;
		@XmlElement(required = true)
		protected String vSeg;
		@XmlElement(required = true)
		protected String vDesc;
		@XmlElement(name = "vII", required = true)
		protected String vii;
		@XmlElement(name = "vIPI", required = true)
		protected String vipi;
		@XmlElement(name = "vPIS", required = true)
		protected String vpis;
		@XmlElement(name = "vCOFINS", required = true)
		protected String vcofins;
		@XmlElement(required = true)
		protected String vOutro;
		@XmlElement(name = "vNF", required = true)
		protected String vnf;
		protected String vTotTrib;

		/**
		 * Obtém o valor da propriedade vbc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBC() {
			return vbc;
		}

		/**
		 * Define o valor da propriedade vbc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBC(String value) {
			this.vbc = value;
		}

		/**
		 * Obtém o valor da propriedade vicms.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMS() {
			return vicms;
		}

		/**
		 * Define o valor da propriedade vicms.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMS(String value) {
			this.vicms = value;
		}

		/**
		 * Obtém o valor da propriedade vicmsDeson.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMSDeson() {
			return vicmsDeson;
		}

		/**
		 * Define o valor da propriedade vicmsDeson.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMSDeson(String value) {
			this.vicmsDeson = value;
		}

		/**
		 * Obtém o valor da propriedade vfcpufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVFCPUFDest() {
			return vfcpufDest;
		}

		/**
		 * Define o valor da propriedade vfcpufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVFCPUFDest(String value) {
			this.vfcpufDest = value;
		}

		/**
		 * Obtém o valor da propriedade vicmsufDest.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMSUFDest() {
			return vicmsufDest;
		}

		/**
		 * Define o valor da propriedade vicmsufDest.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMSUFDest(String value) {
			this.vicmsufDest = value;
		}

		/**
		 * Obtém o valor da propriedade vicmsufRemet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMSUFRemet() {
			return vicmsufRemet;
		}

		/**
		 * Define o valor da propriedade vicmsufRemet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMSUFRemet(String value) {
			this.vicmsufRemet = value;
		}

		/**
		 * Obtém o valor da propriedade vbcst.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBCST() {
			return vbcst;
		}

		/**
		 * Define o valor da propriedade vbcst.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBCST(String value) {
			this.vbcst = value;
		}

		/**
		 * Obtém o valor da propriedade vst.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVST() {
			return vst;
		}

		/**
		 * Define o valor da propriedade vst.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVST(String value) {
			this.vst = value;
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
		 * Obtém o valor da propriedade vii.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVII() {
			return vii;
		}

		/**
		 * Define o valor da propriedade vii.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVII(String value) {
			this.vii = value;
		}

		/**
		 * Obtém o valor da propriedade vipi.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVIPI() {
			return vipi;
		}

		/**
		 * Define o valor da propriedade vipi.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVIPI(String value) {
			this.vipi = value;
		}

		/**
		 * Obtém o valor da propriedade vpis.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVPIS() {
			return vpis;
		}

		/**
		 * Define o valor da propriedade vpis.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVPIS(String value) {
			this.vpis = value;
		}

		/**
		 * Obtém o valor da propriedade vcofins.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVCOFINS() {
			return vcofins;
		}

		/**
		 * Define o valor da propriedade vcofins.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVCOFINS(String value) {
			this.vcofins = value;
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
		 * Obtém o valor da propriedade vnf.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVNF() {
			return vnf;
		}

		/**
		 * Define o valor da propriedade vnf.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVNF(String value) {
			this.vnf = value;
		}

		/**
		 * Obtém o valor da propriedade vTotTrib.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVTotTrib() {
			return vTotTrib;
		}

		/**
		 * Define o valor da propriedade vTotTrib.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVTotTrib(String value) {
			this.vTotTrib = value;
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
	 *         &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vISS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="dCompet" type="{http://www.portalfiscal.inf.br/nfe}TData"/>
	 *         &lt;element name="vDeducao" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vOutro" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vDescIncond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vDescCond" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vISSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="cRegTrib" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;enumeration value="1"/>
	 *               &lt;enumeration value="2"/>
	 *               &lt;enumeration value="3"/>
	 *               &lt;enumeration value="4"/>
	 *               &lt;enumeration value="5"/>
	 *               &lt;enumeration value="6"/>
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
	@XmlType(name = "", propOrder = { "vServ", "vbc", "viss", "vpis", "vcofins", "dCompet", "vDeducao",
			"vOutro", "vDescIncond", "vDescCond", "vissRet", "cRegTrib" })
	public static class ISSQNtot {

		protected String vServ;
		@XmlElement(name = "vBC")
		protected String vbc;
		@XmlElement(name = "vISS")
		protected String viss;
		@XmlElement(name = "vPIS")
		protected String vpis;
		@XmlElement(name = "vCOFINS")
		protected String vcofins;
		@XmlElement(required = true)
		protected String dCompet;
		protected String vDeducao;
		protected String vOutro;
		protected String vDescIncond;
		protected String vDescCond;
		@XmlElement(name = "vISSRet")
		protected String vissRet;
		protected String cRegTrib;

		/**
		 * Obtém o valor da propriedade vServ.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVServ() {
			return vServ;
		}

		/**
		 * Define o valor da propriedade vServ.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVServ(String value) {
			this.vServ = value;
		}

		/**
		 * Obtém o valor da propriedade vbc.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBC() {
			return vbc;
		}

		/**
		 * Define o valor da propriedade vbc.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBC(String value) {
			this.vbc = value;
		}

		/**
		 * Obtém o valor da propriedade viss.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVISS() {
			return viss;
		}

		/**
		 * Define o valor da propriedade viss.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVISS(String value) {
			this.viss = value;
		}

		/**
		 * Obtém o valor da propriedade vpis.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVPIS() {
			return vpis;
		}

		/**
		 * Define o valor da propriedade vpis.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVPIS(String value) {
			this.vpis = value;
		}

		/**
		 * Obtém o valor da propriedade vcofins.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVCOFINS() {
			return vcofins;
		}

		/**
		 * Define o valor da propriedade vcofins.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVCOFINS(String value) {
			this.vcofins = value;
		}

		/**
		 * Obtém o valor da propriedade dCompet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDCompet() {
			return dCompet;
		}

		/**
		 * Define o valor da propriedade dCompet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDCompet(String value) {
			this.dCompet = value;
		}

		/**
		 * Obtém o valor da propriedade vDeducao.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDeducao() {
			return vDeducao;
		}

		/**
		 * Define o valor da propriedade vDeducao.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDeducao(String value) {
			this.vDeducao = value;
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
		 * Obtém o valor da propriedade vDescIncond.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDescIncond() {
			return vDescIncond;
		}

		/**
		 * Define o valor da propriedade vDescIncond.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDescIncond(String value) {
			this.vDescIncond = value;
		}

		/**
		 * Obtém o valor da propriedade vDescCond.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVDescCond() {
			return vDescCond;
		}

		/**
		 * Define o valor da propriedade vDescCond.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVDescCond(String value) {
			this.vDescCond = value;
		}

		/**
		 * Obtém o valor da propriedade vissRet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVISSRet() {
			return vissRet;
		}

		/**
		 * Define o valor da propriedade vissRet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVISSRet(String value) {
			this.vissRet = value;
		}

		/**
		 * Obtém o valor da propriedade cRegTrib.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCRegTrib() {
			return cRegTrib;
		}

		/**
		 * Define o valor da propriedade cRegTrib.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCRegTrib(String value) {
			this.cRegTrib = value;
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
	 *         &lt;element name="vRetPIS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vRetCOFINS" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vRetCSLL" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vBCIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vIRRF" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vBCRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *         &lt;element name="vRetPrev" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vRetPIS", "vRetCOFINS", "vRetCSLL", "vbcirrf", "virrf", "vbcRetPrev",
			"vRetPrev" })
	public static class RetTrib {

		protected String vRetPIS;
		protected String vRetCOFINS;
		protected String vRetCSLL;
		@XmlElement(name = "vBCIRRF")
		protected String vbcirrf;
		@XmlElement(name = "vIRRF")
		protected String virrf;
		@XmlElement(name = "vBCRetPrev")
		protected String vbcRetPrev;
		protected String vRetPrev;

		/**
		 * Obtém o valor da propriedade vRetPIS.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVRetPIS() {
			return vRetPIS;
		}

		/**
		 * Define o valor da propriedade vRetPIS.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVRetPIS(String value) {
			this.vRetPIS = value;
		}

		/**
		 * Obtém o valor da propriedade vRetCOFINS.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVRetCOFINS() {
			return vRetCOFINS;
		}

		/**
		 * Define o valor da propriedade vRetCOFINS.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVRetCOFINS(String value) {
			this.vRetCOFINS = value;
		}

		/**
		 * Obtém o valor da propriedade vRetCSLL.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVRetCSLL() {
			return vRetCSLL;
		}

		/**
		 * Define o valor da propriedade vRetCSLL.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVRetCSLL(String value) {
			this.vRetCSLL = value;
		}

		/**
		 * Obtém o valor da propriedade vbcirrf.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBCIRRF() {
			return vbcirrf;
		}

		/**
		 * Define o valor da propriedade vbcirrf.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBCIRRF(String value) {
			this.vbcirrf = value;
		}

		/**
		 * Obtém o valor da propriedade virrf.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVIRRF() {
			return virrf;
		}

		/**
		 * Define o valor da propriedade virrf.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVIRRF(String value) {
			this.virrf = value;
		}

		/**
		 * Obtém o valor da propriedade vbcRetPrev.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBCRetPrev() {
			return vbcRetPrev;
		}

		/**
		 * Define o valor da propriedade vbcRetPrev.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBCRetPrev(String value) {
			this.vbcRetPrev = value;
		}

		/**
		 * Obtém o valor da propriedade vRetPrev.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVRetPrev() {
			return vRetPrev;
		}

		/**
		 * Define o valor da propriedade vRetPrev.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVRetPrev(String value) {
			this.vRetPrev = value;
		}

	}

}