/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.event;

import com.jme3.gde.jmeguiforms.WheelPanel;
import java.util.EventObject;

/**
 *
 * @author Glauco
 */
public class WheelPanelBeanFormEvent extends EventObject {

    public WheelPanelBeanFormEvent(WheelPanel wheelPanel) {
        super(wheelPanel);
    }

    public WheelPanel getSource() {
        return (WheelPanel) source;
    }
}
