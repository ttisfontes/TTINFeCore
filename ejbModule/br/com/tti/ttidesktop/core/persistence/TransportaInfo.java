package br.com.tti.ttidesktop.core.persistence;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.tti.ttidesktop.schema.xml.nfe.Transporta;

@Entity
public class TransportaInfo implements Serializable{
	
	@Id
	private String id;
	
	@Embedded
	private Transporta transporta;

}
