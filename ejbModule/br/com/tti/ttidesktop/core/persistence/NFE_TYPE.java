package br.com.tti.ttidesktop.core.persistence;

public enum NFE_TYPE {

	IMPORTACAO("Importação"),

	EXPORTACAO("Exportação"),

	COMPLEMENTAR("Complementar");

	private final String description;

	private NFE_TYPE(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
