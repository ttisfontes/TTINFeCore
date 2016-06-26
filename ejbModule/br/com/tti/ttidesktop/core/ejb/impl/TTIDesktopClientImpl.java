package br.com.tti.ttidesktop.core.ejb.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.tti.ttidesktop.core.ejb.TTIDesktopClientRemote;
import br.com.tti.ttidesktop.core.ejb.TTIDesktopClient;
import br.com.tti.ttidesktop.core.persistence.NFeId;
import br.com.tti.ttidesktop.core.persistence.NFeInfo;
import br.com.tti.ttidesktop.core.persistence.Usuario;
import br.com.tti.ttidesktop.core.util.TTIDesktopListener;
import br.com.tti.ttidesktop.core.util.XMLGenerator;
import br.com.tti.ttidesktop.schema.xml.nfe.TNFe;

@Stateful
@Local(TTIDesktopClient.class)
@Remote(TTIDesktopClientRemote.class)
public class TTIDesktopClientImpl implements TTIDesktopClient {

	private Logger logger = Logger.getLogger(TTIDesktopServerImpl.class.getCanonicalName());

	@PersistenceContext(name = "TTIDesktop")
	private EntityManager em;
	private String userOwnser;
	private List<TTIDesktopListener> listeners;

	public TTIDesktopClientImpl() {
		this.listeners = new ArrayList<TTIDesktopListener>();
	}

	@PostConstruct
	public void init() {
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
	public void resgisterListener(TTIDesktopListener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void sendNFe(String nfeId) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAlive() throws Exception {
		return true;
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

	@Override
	public String getUserOwner() {
		return this.userOwnser;
	}

	@Override
	public void setUserOwner(String user) {
		this.userOwnser = user;
	}

	@Override
	public void killSession(String message) throws Exception {
		this.listeners.forEach(listener -> new Thread(() -> {
			try {
				listener.killSession(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start());
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
		System.gc();
	}

	@Remove
	@Override
	public void destroy() {

	}
}
