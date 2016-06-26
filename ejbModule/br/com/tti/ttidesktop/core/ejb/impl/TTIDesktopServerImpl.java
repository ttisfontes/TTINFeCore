package br.com.tti.ttidesktop.core.ejb.impl;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import br.com.tti.ttidesktop.core.ejb.TTIDesktopClient;
import br.com.tti.ttidesktop.core.ejb.TTIDesktopServer;
import br.com.tti.ttidesktop.core.persistence.Usuario;
import br.com.tti.ttidesktop.core.process.XMLProcess;
import br.com.tti.ttidesktop.core.util.ReadFile;

@Singleton
@Startup
@Remote(TTIDesktopServer.class)
public class TTIDesktopServerImpl implements TTIDesktopServer {

	private Logger logger = Logger.getLogger(TTIDesktopServerImpl.class.getCanonicalName());

	@PersistenceContext(name = "TTIDesktop")
	private EntityManager em;

	@Resource
	private SessionContext sessionContext;

	private Hashtable<String, TTIDesktopClient> ejbClients;
	private Hashtable<String, Long> ejbHeartBeats;

	private Timer timer;

	public TTIDesktopServerImpl() {
		this.ejbClients = new Hashtable<>();
		this.ejbHeartBeats = new Hashtable<>();
		this.timer = new Timer();
	}

	@PostConstruct
	public void init() {

		this.timer.schedule(new TimerTask() {

			@Override
			public void run() {
				synchronized (ejbHeartBeats) {
					List<String> toRemove = new ArrayList<>();

					ejbHeartBeats.forEach((client, timeout) -> {
						if ((Calendar.getInstance().getTimeInMillis() - timeout) > 35000) {
							toRemove.add(client);
						}
					});

					toRemove.forEach(userId -> {
						try {

							logger.info("timeout client: " + userId);
							TTIDesktopClient client = ejbClients.get(userId);
							client.killSession("TIME OUT HEART BEAT");
							client.destroy();

						} catch (Exception e) {
							logger.log(Level.INFO, e.getLocalizedMessage(), e);
						}
						ejbClients.remove(userId);
						ejbHeartBeats.remove(userId);
					});
				}
			}
		}, 0, 2000);

		this.timer.schedule(new TimerTask() {

			@Override
			public void run() {
				try {
					UserTransaction t = sessionContext.getUserTransaction();
					t.begin();

					File dir = new File("C:\\TTINFE2.0\\notas\\SIMOLDES\\");

					File[] files = dir.listFiles(new FileFilter() {

						@Override
						public boolean accept(File pathname) {
							return pathname.getName().endsWith(".xml");
						}
					});

					for (File file : files) {
						try {
							String xml = ReadFile.readFile(file.getAbsolutePath(), "UTF-8");
							XMLProcess process = new XMLProcess(xml, em);
							process.process();
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						file.delete();
					}

					t.commit();
				} catch (Exception e) {
					logger.log(Level.INFO, e.getLocalizedMessage(), e);
				}

			}
		}, 0, 2500);
	}

	@Override
	public void registerEJB(TTIDesktopClient client) throws Exception {
		String userId = client.getUserOwner();

		logger.info("registering client: " + client + " user: " + client.getUserOwner());

		if (this.ejbClients.containsKey(userId)) {
			this.ejbClients.get(userId).killSession("USUARIO JA LOGADO");
		}
		this.ejbClients.put(userId, client);
		this.ejbHeartBeats.put(userId, Calendar.getInstance().getTimeInMillis());

		logger.info("current clients: " + this.ejbClients);
	};

	@Override
	public void unRegisterEJB(String userId) throws Exception {
		logger.info("unregister ejb: " + userId);
		if (this.ejbClients.containsKey(userId)) {
			try {
				this.ejbClients.get(userId).killSession("UNREGISTERED");
			} catch (Exception e) {
				logger.log(Level.INFO, e.getLocalizedMessage(), e);
			}
			this.ejbClients.remove(userId);
		}
	}

	@Override
	public Usuario autenthicateUser(String userId, String password) throws Exception {
		Usuario user = this.em.find(Usuario.class, userId);
		if (user == null) {
			throw new Exception("Usuario não cadastrado.");
		}
		if (!user.getPassword().equals(password)) {
			throw new Exception("Senha não confere.");
		}

		return user;
	}

	@Override
	public List<TTIDesktopClient> getAllClients() {
		return new ArrayList<TTIDesktopClient>(this.ejbClients.values());
	}

	@Override
	public void notifyHeartBeat(TTIDesktopClient client) throws Exception {
		synchronized (this.ejbHeartBeats) {
			this.ejbHeartBeats.put(client.getUserOwner(), Calendar.getInstance().getTimeInMillis());
		}
	}
}
