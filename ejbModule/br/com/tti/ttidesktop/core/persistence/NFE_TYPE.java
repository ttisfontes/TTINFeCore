package br.com.tti.ttidesktop.core.persistence;

public enum NFE_TYPE {

	IMPORTACAO("Importa��o"),

	EXPORTACAO("Exporta��o"),

	COMPLEMENTAR("Complementar");

	private final String description;

	private NFE_TYPE(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
