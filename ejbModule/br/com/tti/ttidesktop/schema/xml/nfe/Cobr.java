package br.com.tti.ttidesktop.schema.xml.nfe;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="fat" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nFat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                   &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dup" maxOccurs="120" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nDup" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                         &lt;maxLength value="60"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/nfe}TData" minOccurs="0"/>
 *                   &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/nfe}TDec_1302Opc"/>
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
@XmlType(name = "", propOrder = { "fat", "dup" })
public class Cobr {

	protected Fat fat;
	protected List<Dup> dup;

	/**
	 * Obtém o valor da propriedade fat.
	 * 
	 * @return possible object is {@link Fat }
	 * 
	 */
	public Fat getFat() {
		return fat;
	}

	/**
	 * Define o valor da propriedade fat.
	 * 
	 * @param value
	 *            allowed object is {@link Fat }
	 * 
	 */
	public void setFat(Fat value) {
		this.fat = value;
	}

	/**
	 * Gets the value of the dup property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the dup property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getDup().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Dup }
	 * 
	 * 
	 */
	public List<Dup> getDup() {
		if (dup == null) {
			dup = new ArrayList<Dup>();
		}
		return this.dup;
	}

}