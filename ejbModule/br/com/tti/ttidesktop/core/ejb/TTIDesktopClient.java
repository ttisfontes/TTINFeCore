package br.com.tti.ttidesktop.core.ejb;

import java.util.List;

import br.com.tti.ttidesktop.core.persistence.NFeId;
import br.com.tti.ttidesktop.core.persistence.Usuario;
import br.com.tti.ttidesktop.core.util.TTIDesktopListener;

public interface TTIDesktopClient {

	/////////////////////////////////////////////////////
	public <T> T findEntity(Class<T> classs, String id) throws Exception;

	public <T> void persistEntity(T entity) throws Exception;

	public <T> List<T> findEntities(Class<T> classs) throws Exception;

	//////////////////////////////////////////////////////////////////////

	public void resgisterListener(TTIDesktopListener listener);

	//////////////////////////////////////////////////////////////////////

	public Usuario findUser(String id, String password) throws Exception;

	public void sendNFe(String nfeId) throws Exception;

	public void deleteNFe(String nfeId) throws Exception;

	public void saveNFe(String nfeId) throws Exception;

	public void loadCurrentNFe(NFeId nfeId) throws Exception;

	public boolean isAlive() throws Exception;

	public void setUserOwner(String user);

	public String getUserOwner();

	public void killSession(String message) throws Exception;

	public void destroy();

}
