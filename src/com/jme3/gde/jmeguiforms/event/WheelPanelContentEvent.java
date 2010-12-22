/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jme3.gde.jmeguiforms.event;

import com.jme3.gde.jmeguiforms.WheelPanelContent;
import java.util.EventObject;

/**
 *
 * @author Glauco
 */
public class WheelPanelContentEvent extends EventObject{

    public WheelPanelContentEvent(WheelPanelContent wheelPanelcontent) {
        super(wheelPanelcontent);
    }

    @Override
    public WheelPanelContent getSource() {
        return (WheelPanelContent) source;
    }

}
