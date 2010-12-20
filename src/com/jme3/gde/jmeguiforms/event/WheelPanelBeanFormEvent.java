/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.event;

import com.jme3.gde.jmeguiforms.WheelPanelBeanForm;
import java.util.EventObject;

/**
 *
 * @author Glauco
 */
public class WheelPanelBeanFormEvent extends EventObject {

    public WheelPanelBeanFormEvent(WheelPanelBeanForm wheelPanel) {
        super(wheelPanel);
    }

    public WheelPanelBeanForm getSource() {
        return (WheelPanelBeanForm) source;
    }
}
