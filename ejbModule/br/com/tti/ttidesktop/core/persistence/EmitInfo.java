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

}
