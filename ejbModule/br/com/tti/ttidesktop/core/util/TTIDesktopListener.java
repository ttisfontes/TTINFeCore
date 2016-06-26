package br.com.tti.ttidesktop.core.util;

import br.com.tti.ttidesktop.core.events.TTIEvent;

public interface TTIDesktopListener {

	public void process(TTIEvent event) throws Exception;

	public void killSession(String message);
}
