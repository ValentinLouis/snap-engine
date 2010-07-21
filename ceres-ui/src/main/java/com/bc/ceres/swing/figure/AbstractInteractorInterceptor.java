/*
 * Copyright (C) 2010 Brockmann Consult GmbH (info@brockmann-consult.de)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */

package com.bc.ceres.swing.figure;

import com.bc.ceres.swing.figure.Interactor;
import com.bc.ceres.swing.figure.InteractorListener;

import java.awt.event.InputEvent;

public class AbstractInteractorInterceptor extends AbstractInteractorListener implements InteractorInterceptor {
    /**
     * @param interactor The interactor.
     * @return The default implementation returns {@code true}.
     */
    @Override
    public boolean interactorAboutToActivate(Interactor interactor) {
        return true;
    }

    /**
     * @param interactor The interactor.
     * @param inputEvent The interactor.
     * @return The default implementation returns {@code true}.
     */
    @Override
    public boolean interactionAboutToStart(Interactor interactor, InputEvent inputEvent) {
        return true;
    }
}