package br.com.tti.ttidesktop.core.ejb;

import java.util.List;

import br.com.tti.ttidesktop.core.persistence.Usuario;

public interface TTIDesktopServer {

	public void registerEJB(TTIDesktopClient client) throws Exception;

	public void unRegisterEJB(String userId) throws Exception;

	public List<TTIDesktopClient> getAllClients();

	public void notifyHeartBeat(TTIDesktopClient client) throws Exception;

	public Usuario autenthicateUser(String userId, String password) throws Exception;

}
