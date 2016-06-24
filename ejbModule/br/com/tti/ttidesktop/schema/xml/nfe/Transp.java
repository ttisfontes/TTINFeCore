package br.com.tti.ttidesktop.schema.xml.nfe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "modFrete", "transporta", "retTransp", "veicTransp", "reboque", "vagao", "balsa",
		"vol" })

public class Transp implements Serializable {

	@XmlElement(required = true)
	protected String modFrete;
	protected Transporta transporta;
	protected Transp.RetTransp retTransp;

	protected TVeiculo veicTransp;
	protected List<TVeiculo> reboque;
	protected String vagao;
	protected String balsa;
	protected List<Vol> vol;

	/**
	 * Obtém o valor da propriedade modFrete.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModFrete() {
		return modFrete;
	}

	/**
	 * Define o valor da propriedade modFrete.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModFrete(String value) {
		this.modFrete = value;
	}

	/**
	 * Obtém o valor da propriedade transporta.
	 * 
	 * @return possible object is {@link Transporta }
	 * 
	 */
	public Transporta getTransporta() {
		return transporta;
	}

	/**
	 * Define o valor da propriedade transporta.
	 * 
	 * @param value
	 *            allowed object is {@link Transporta }
	 * 
	 */
	public void setTransporta(Transporta value) {
		this.transporta = value;
	}

	/**
	 * Obtém o valor da propriedade retTransp.
	 * 
	 * @return possible object is {@link Transp.RetTransp }
	 * 
	 */
	public Transp.RetTransp getRetTransp() {
		return retTransp;
	}

	/**
	 * Define o valor da propriedade retTransp.
	 * 
	 * @param value
	 *            allowed object is {@link Transp.RetTransp }
	 * 
	 */
	public void setRetTransp(Transp.RetTransp value) {
		this.retTransp = value;
	}

	/**
	 * Obtém o valor da propriedade veicTransp.
	 * 
	 * @return possible object is {@link TVeiculo }
	 * 
	 */
	public TVeiculo getVeicTransp() {
		return veicTransp;
	}

	/**
	 * Define o valor da propriedade veicTransp.
	 * 
	 * @param value
	 *            allowed object is {@link TVeiculo }
	 * 
	 */
	public void setVeicTransp(TVeiculo value) {
		this.veicTransp = value;
	}

	/**
	 * Gets the value of the reboque property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the reboque property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReboque().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TVeiculo
	 * }
	 * 
	 * 
	 */
	public List<TVeiculo> getReboque() {
		if (reboque == null) {
			reboque = new ArrayList<TVeiculo>();
		}
		return this.reboque;
	}

	/**
	 * Obtém o valor da propriedade vagao.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVagao() {
		return vagao;
	}

	/**
	 * Define o valor da propriedade vagao.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVagao(String value) {
		this.vagao = value;
	}

	/**
	 * Obtém o valor da propriedade balsa.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBalsa() {
		return balsa;
	}

	/**
	 * Define o valor da propriedade balsa.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBalsa(String value) {
		this.balsa = value;
	}

	/**
	 * Gets the value of the vol property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the vol property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVol().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Vol }
	 * 
	 * 
	 */
	public List<Vol> getVol() {
		if (vol == null) {
			vol = new ArrayList<Vol>();
		}
		return this.vol;
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
	 *         &lt;element name="vServ" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="vBCRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="pICMSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_0302a04"/>
	 *         &lt;element name="vICMSRet" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302"/>
	 *         &lt;element name="CFOP">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *               &lt;whiteSpace value="preserve"/>
	 *               &lt;pattern value="[1,2,3,5,6,7]{1}[0-9]{3}"/>
	 *             &lt;/restriction>
	 *           &lt;/simpleType>
	 *         &lt;/element>
	 *         &lt;element name="cMunFG" type="{http://www.portalfiscal.inf.br/nfe}TCodMunIBGE"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "vServ", "vbcRet", "picmsRet", "vicmsRet", "cfop", "cMunFG" })
	public static class RetTransp {

		@XmlElement(required = true)
		protected String vServ;
		@XmlElement(name = "vBCRet", required = true)
		protected String vbcRet;
		@XmlElement(name = "pICMSRet", required = true)
		protected String picmsRet;
		@XmlElement(name = "vICMSRet", required = true)
		protected String vicmsRet;
		@XmlElement(name = "CFOP", required = true)
		protected String cfop;
		@XmlElement(required = true)
		protected String cMunFG;

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
		 * Obtém o valor da propriedade vbcRet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVBCRet() {
			return vbcRet;
		}

		/**
		 * Define o valor da propriedade vbcRet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVBCRet(String value) {
			this.vbcRet = value;
		}

		/**
		 * Obtém o valor da propriedade picmsRet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPICMSRet() {
			return picmsRet;
		}

		/**
		 * Define o valor da propriedade picmsRet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setPICMSRet(String value) {
			this.picmsRet = value;
		}

		/**
		 * Obtém o valor da propriedade vicmsRet.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVICMSRet() {
			return vicmsRet;
		}

		/**
		 * Define o valor da propriedade vicmsRet.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setVICMSRet(String value) {
			this.vicmsRet = value;
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

	}

}