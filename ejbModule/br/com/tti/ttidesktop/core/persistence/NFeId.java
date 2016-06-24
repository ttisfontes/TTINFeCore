package br.com.tti.ttidesktop.core.persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class NFeId implements Serializable {

	private String nfeId;

	private String uiId;

	public String getNfeId() {
		return nfeId;
	}

	public void setNfeId(String nfeId) {
		this.nfeId = nfeId;
	}

	public String getUiId() {
		return uiId;
	}

	public void setUiId(String uiId) {
		this.uiId = uiId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nfeId == null) ? 0 : nfeId.hashCode());
		result = prime * result + ((uiId == null) ? 0 : uiId.hashCode());
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
		NFeId other = (NFeId) obj;
		if (nfeId == null) {
			if (other.nfeId != null)
				return false;
		} else if (!nfeId.equals(other.nfeId))
			return false;
		if (uiId == null) {
			if (other.uiId != null)
				return false;
		} else if (!uiId.equals(other.uiId))
			return false;
		return true;
	}

}
