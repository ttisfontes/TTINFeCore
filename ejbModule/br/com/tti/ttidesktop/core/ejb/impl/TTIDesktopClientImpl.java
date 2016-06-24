package br.com.tti.ttidesktop.core.ejb.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.tti.ttidesktop.core.ejb.TTIDesktopClientRemote;
import br.com.tti.ttidesktop.core.ejb.TTIDesktopClient;
import br.com.tti.ttidesktop.core.persistence.NFeId;
import br.com.tti.ttidesktop.core.persistence.NFeInfo;
import br.com.tti.ttidesktop.core.persistence.Usuario;
import br.com.tti.ttidesktop.core.util.XMLGenerator;
import br.com.tti.ttidesktop.schema.xml.nfe.TNFe;

@Stateful
@Local(TTIDesktopClient.class)
@Remote(TTIDesktopClientRemote.class)
public class TTIDesktopClientImpl implements TTIDesktopClient {

	@PersistenceContext(name = "TTIDesktop")
	private EntityManager em;

	public TTIDesktopClientImpl() {
	}

	@Override
	public <T> T findEntity(Class<T> classs, String id) throws Exception {
		return this.em.find(classs, id);
	}

	@Override
	public <T> void persistEntity(T entity) throws Exception {
		System.out.println("server persist: " + entity);
		this.em.persist(entity);
		this.em.flush();
	}

	@Override
	public <T> List<T> findEntities(Class<T> classs) throws Exception {
		Query q = this.em.createQuery("select e from " + classs.getSimpleName() + " as e");
		return (List<T>) q.getResultList();
	}

	@Override
	public Usuario findUser(String id, String password) throws Exception {
		System.out.println("find user: " + id);
		Usuario user = new Usuario();
		user.setId("usuario");

		System.out.println("server: " + user);
		return user;
	}

	@Override
	public void sendNFe(String nfeId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteNFe(String nfeId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveNFe(String nfeId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadCurrentNFe(NFeId nfeId) throws Exception {
		NFeInfo nfeInfo = this.em.find(NFeInfo.class, nfeId);
		XMLGenerator xmlgen = new XMLGenerator("br.com.tti.ttidesktop.schema.xml.nfe");
		TNFe nfe = xmlgen.toObject(TNFe.class, nfeInfo.getXmlString());

	}
}
