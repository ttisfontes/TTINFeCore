package br.com.tti.ttidesktop.core.process;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;

import br.com.tti.ttidesktop.core.persistence.DestInfo;
import br.com.tti.ttidesktop.core.persistence.EmitInfo;
import br.com.tti.ttidesktop.core.persistence.NFeId;
import br.com.tti.ttidesktop.core.persistence.NFeInfo;
import br.com.tti.ttidesktop.core.util.XMLGenerator;
import br.com.tti.ttidesktop.schema.xml.nfe.Dest;
import br.com.tti.ttidesktop.schema.xml.nfe.Det;
import br.com.tti.ttidesktop.schema.xml.nfe.Emit;
import br.com.tti.ttidesktop.schema.xml.nfe.TNFe;

public class XMLProcess {

	private TNFe nfe;
	private XMLGenerator gen;
	private String xml;
	private EntityManager em;

	public XMLProcess(String xml, EntityManager em) throws Exception {
		super();
		this.xml = xml;
		this.em = em;
		this.gen = new XMLGenerator("br.com.tti.ttidesktop.schema.xml.nfe");

		int pos1 = this.xml.indexOf("<NFe");
		int pos2 = this.xml.indexOf("</NFe>");

		if (pos1 != -1 && pos2 != -1) {
			this.xml = this.xml.substring(pos1, pos2 + "</NFe>".length());
		}

		this.nfe = this.gen.toObject(TNFe.class, this.xml);
	}

	private boolean checkEmit(EmitInfo emit1, EmitInfo emit2) {
		return emit1.equals(emit2);
	}

	public void process() throws Exception {
		NFeInfo nfeinfo = new NFeInfo();

		NFeId nfeId = new NFeId();
		nfeId.setNfeId(this.nfe.getInfNFe().getId());
		nfeId.setUiId("nfe" + UUID.randomUUID().toString().split("-")[0]);

		nfeinfo.setNfeId(nfeId);
		nfeinfo.setIde(this.nfe.getInfNFe().getIde());
		nfeinfo.setXmlString(this.xml);

		// nfeinfo.setCnpjEmit(this.nfe);

		{
			Emit emit = this.nfe.getInfNFe().getEmit();

			String idEmit = emit.getCNPJ() + emit.getCPF();
			idEmit = idEmit.replace("null", "");

			nfeinfo.setCnpjEmit(idEmit);

			EmitInfo emitinfo = new EmitInfo();
			emitinfo.setId(idEmit);
			emitinfo.setEmit(emit);

			EmitInfo existsEmit = this.em.find(EmitInfo.class, emitinfo.getId());

			if (existsEmit == null) {
				this.em.persist(emitinfo);
			} else if (this.checkEmit(existsEmit, emitinfo)) {
				this.em.merge(emitinfo);
			}

			this.em.flush();

		}

		{
			Dest dest = this.nfe.getInfNFe().getDest();

			DestInfo destinfo = new DestInfo();
			destinfo.setDest(dest);

			String idDest = dest.getCNPJ() + dest.getCPF() + dest.getIdEstrangeiro();

			idDest = idDest.replace("null", "");

			destinfo.setId(idDest);

			if (this.em.find(DestInfo.class, destinfo.getId()) == null) {
				this.em.persist(destinfo);
			} else {
				this.em.merge(destinfo);
			}

			this.em.flush();

			nfeinfo.setCnpjDest(idDest);
		}

		if (this.em.find(NFeInfo.class, nfeinfo.getNfeId()) == null) {
			this.em.persist(nfeinfo);
		} else {
			this.em.merge(nfeinfo);
		}
	}

	public void makeSuggest() {
		List<Det> dets = this.nfe.getInfNFe().getDet();
		dets.forEach(prod -> {

		});
	}

}
