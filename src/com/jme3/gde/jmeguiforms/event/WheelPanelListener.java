/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.event;

/**
 *
 * @author Glauco
 */
public interface WheelPanelListener {

    public void valueChanged(WheelPanelEvent e);

    public void loadSpatialActionPerformed(WheelPanelEvent e);

    public void closeActionPerformed(WheelPanelEvent e);
}
