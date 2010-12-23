/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jme3.gde.jmeguiforms.event;

import com.jme3.gde.jmeguiforms.WheelPanelContainer;
import java.util.EventObject;

/**
 *
 * @author Glauco
 */
public class WheelPanelContentEvent extends EventObject{

    public WheelPanelContentEvent(WheelPanelContainer wheelPanelcontent) {
        super(wheelPanelcontent);
    }

    @Override
    public WheelPanelContainer getSource() {
        return (WheelPanelContainer) source;
    }

}
