package br.com.tti.ttidesktop.core.persistence;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

import br.com.tti.ttidesktop.schema.xml.nfe.Dest;
import br.com.tti.ttidesktop.schema.xml.nfe.Emit;
import br.com.tti.ttidesktop.schema.xml.nfe.Ide;
import br.com.tti.ttidesktop.schema.xml.nfe.TNFe;

// classe pesada!!

@Entity
public class NFeInfo implements Serializable {

	@Id
	@EmbeddedId
	private NFeId nfeId;

	@Embedded
	private Ide ide;

	private String cnpjEmit;

	private String cnpjDest;

	@Transient
	private TNFe nfe;

	private NFE_TYPE tipoNfe;

	@Lob
	private String xmlString;

	public NFeId getNfeId() {
		return nfeId;
	}

	public void setNfeId(NFeId nfeId) {
		this.nfeId = nfeId;
	}

	public Ide getIde() {
		return ide;
	}

	public void setIde(Ide ide) {
		this.ide = ide;
	}

	public String getCnpjEmit() {
		return cnpjEmit;
	}

	public void setCnpjEmit(String cnpjEmit) {
		this.cnpjEmit = cnpjEmit;
	}

	public String getCnpjDest() {
		return cnpjDest;
	}

	public void setCnpjDest(String cnpjDest) {
		this.cnpjDest = cnpjDest;
	}

	public TNFe getNfe() {
		return nfe;
	}

	public void setNfe(TNFe nfe) {
		this.nfe = nfe;
	}

	public String getXmlString() {
		return xmlString;
	}

	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}

	public NFE_TYPE getTipoNfe() {
		return tipoNfe;
	}

	public void setTipoNfe(NFE_TYPE tipoNfe) {
		this.tipoNfe = tipoNfe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nfeId == null) ? 0 : nfeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NFeInfo other = (NFeInfo) obj;
		if (nfeId == null) {
			if (other.nfeId != null)
				return false;
		} else if (!nfeId.equals(other.nfeId))
			return false;
		return true;
	}

}
