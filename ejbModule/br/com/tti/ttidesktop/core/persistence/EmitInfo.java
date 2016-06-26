package br.com.tti.ttidesktop.core.persistence;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.tti.ttidesktop.schema.xml.nfe.Emit;

@Entity
public class EmitInfo {

	@Id
	private String id;

	@Embedded
	private Emit emit;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Emit getEmit() {
		return emit;
	}

	public void setEmit(Emit emit) {
		this.emit = emit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		EmitInfo other = (EmitInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
