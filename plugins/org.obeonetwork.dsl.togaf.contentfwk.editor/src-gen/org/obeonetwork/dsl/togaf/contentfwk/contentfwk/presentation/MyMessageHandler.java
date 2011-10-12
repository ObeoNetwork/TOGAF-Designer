package org.obeonetwork.dsl.togaf.contentfwk.contentfwk.presentation;

import org.eclipse.ui.forms.events.HyperlinkEvent;

public abstract class MyMessageHandler {
	
	protected MyMessageProcessor processor;
	
	/**
	 * @param event the event to handle
	 * @return <code>true</code> if the handle have to be processed.
	 */
	public abstract boolean handle(HyperlinkEvent event);
	
	/**
	 * Process the given message.
	 * @param event the event to handle.
	 */
	public abstract void process(HyperlinkEvent event);

	/**
	 * @param superHandler the superHandler to set
	 */
	public void setProcessor(MyMessageProcessor superHandler) {
		this.processor = superHandler;
	}
	
}
