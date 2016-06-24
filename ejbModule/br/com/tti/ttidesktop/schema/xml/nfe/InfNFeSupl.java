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
 *         &lt;element name="qrCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="100"/>
 *               &lt;maxLength value="600"/>
 *               &lt;pattern value="((HTTPS?|https?)://.*\?chNFe=[0-9]{44}&amp;nVersao=[0-9]{3}&amp;tpAmb=[1-2](&amp;cDest=([A-Za-z0-9.:+-/)(]{0}|[A-Za-z0-9.:+-/)(]{5,20})?)?&amp;dhEmi=[A-Fa-f0-9]{50}&amp;vNF=(0|0\.[0-9]{2}|[1-9]{1}[0-9]{0,12}(\.[0-9]{2})?)&amp;vICMS=(0|0\.[0-9]{2}|[1-9]{1}[0-9]{0,12}(\.[0-9]{2})?)&amp;digVal=[A-Fa-f0-9]{56}&amp;cIdToken=[0-9]{6}&amp;cHashQRCode=[A-Fa-f0-9]{40})"/>
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
@XmlType(name = "", propOrder = { "qrCode" })
public class InfNFeSupl {

	@XmlElement(required = true)
	protected String qrCode;

	/**
	 * Obtém o valor da propriedade qrCode.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQrCode() {
		return qrCode;
	}

	/**
	 * Define o valor da propriedade qrCode.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQrCode(String value) {
		this.qrCode = value;
	}

}