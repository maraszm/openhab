/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.ekozefir;

import org.openhab.binding.ekozefir.ahucommand.AhuCommandCreator;

/**
 * Interface for collecting all command creators for ahu.
 * 
 * @author Michal Marasz
 * @since 1.6.0
 */
public interface AhuCommandCreators extends Creators<String, AhuCommandCreator> {
}
