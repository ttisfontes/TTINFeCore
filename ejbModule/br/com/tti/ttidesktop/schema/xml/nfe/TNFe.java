//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2016.06.23 �s 02:45:00 PM BRT 
//

package br.com.tti.ttidesktop.schema.xml.nfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNFe", propOrder = { "infNFe", "infNFeSupl", "signature" })
public class TNFe {

	@XmlElement(required = true)
	protected InfNFe infNFe;
	protected InfNFeSupl infNFeSupl;
	@XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
	protected SignatureType signature;

	/**
	 * Obt�m o valor da propriedade infNFe.
	 * 
	 * @return possible object is {@link InfNFe }
	 * 
	 */
	public InfNFe getInfNFe() {
		return infNFe;
	}

	/**
	 * Define o valor da propriedade infNFe.
	 * 
	 * @param value
	 *            allowed object is {@link InfNFe }
	 * 
	 */
	public void setInfNFe(InfNFe value) {
		this.infNFe = value;
	}

	/**
	 * Obt�m o valor da propriedade infNFeSupl.
	 * 
	 * @return possible object is {@link InfNFeSupl }
	 * 
	 */
	public InfNFeSupl getInfNFeSupl() {
		return infNFeSupl;
	}

	/**
	 * Define o valor da propriedade infNFeSupl.
	 * 
	 * @param value
	 *            allowed object is {@link InfNFeSupl }
	 * 
	 */
	public void setInfNFeSupl(InfNFeSupl value) {
		this.infNFeSupl = value;
	}

	/**
	 * Obt�m o valor da propriedade signature.
	 * 
	 * @return possible object is {@link SignatureType }
	 * 
	 */
	public SignatureType getSignature() {
		return signature;
	}

	/**
	 * Define o valor da propriedade signature.
	 * 
	 * @param value
	 *            allowed object is {@link SignatureType }
	 * 
	 */
	public void setSignature(SignatureType value) {
		this.signature = value;
	}

}
