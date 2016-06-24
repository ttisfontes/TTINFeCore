package br.com.tti.ttidesktop.core.persistence;

import java.io.Serializable;

import javax.persistence.Id;

import br.com.tti.ttidesktop.schema.xml.nfe.TVeiculo;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class VeiculoInfo implements Serializable {

	@Id
	private String id;

	@Embedded
	private TVeiculo veiculo;

}
