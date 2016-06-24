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
}
