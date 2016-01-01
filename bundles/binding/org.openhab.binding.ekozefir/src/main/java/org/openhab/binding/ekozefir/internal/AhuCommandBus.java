/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.ekozefir.internal;

import org.openhab.binding.ekozefir.ahucommand.AhuCommand;
import org.openhab.binding.ekozefir.ahucommand.AhuCommandListener;

/**
 * Interface for posting commands to ahu through event bus.
 * 
 * @author Michal Marasz
 * @since 1.6.0
 * 
 */
public interface AhuCommandBus {
	/**
	 * Post command to event bus.
	 * 
	 * @param event command
	 */
	void post(AhuCommand event);

	/**
	 * Register listener for ahu commands
	 * 
	 * @param listener listener for commands
	 */
	void register(AhuCommandListener listener);

}
