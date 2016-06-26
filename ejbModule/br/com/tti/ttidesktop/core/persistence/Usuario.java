package br.com.tti.ttidesktop.core.persistence;

import java.util.Hashtable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Usuario {

	@Id
	private String id;
	private String nome;
	private String[] cnpj;
	private String senha;
	private Hashtable<String, Object> permissoes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getCnpj() {
		return cnpj;
	}

	public void setCnpj(String[] cnpj) {
		this.cnpj = cnpj;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Hashtable<String, Object> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Hashtable<String, Object> permissoes) {
		this.permissoes = permissoes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
