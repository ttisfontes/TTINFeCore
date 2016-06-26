package br.com.tti.ttidesktop.core.persistence;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class NFeStatusInfo {

	public enum NFE_STATUS {
		REJEITADO, AUTORIZADO, CANCELADO
	};

	@EmbeddedId
	private NFeId nfeId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEditada;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEnviada;

	private NFE_STATUS statusNFe;

	public NFeId getNfeId() {
		return nfeId;
	}

	public void setNfeId(NFeId nfeId) {
		this.nfeId = nfeId;
	}

	public Date getDataEditada() {
		return dataEditada;
	}

	public void setDataEditada(Date dataEditada) {
		this.dataEditada = dataEditada;
	}

	public Date getDataEnviada() {
		return dataEnviada;
	}

	public void setDataEnviada(Date dataEnviada) {
		this.dataEnviada = dataEnviada;
	}

	public NFE_STATUS getStatusNFe() {
		return statusNFe;
	}

	public void setStatusNFe(NFE_STATUS statusNFe) {
		this.statusNFe = statusNFe;
	}

}
