/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.event;

import java.util.EventObject;
import javax.swing.JButton;

/**
 *
 * @author Glauco
 */
public class ButtonEvent extends EventObject {

    public ButtonEvent(JButton btn) {
        super(btn);
    }

    public JButton getButton() {
        return (JButton) getSource();
    }
}
