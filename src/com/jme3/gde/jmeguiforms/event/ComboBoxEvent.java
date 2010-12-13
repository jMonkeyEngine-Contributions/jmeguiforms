/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jme3.gde.jmeguiforms.event;

import java.util.EventObject;
import javax.swing.JComboBox;

/**
 *
 * @author Glauco
 */
public class ComboBoxEvent extends EventObject{

    public ComboBoxEvent(JComboBox comboBox) {
        super(comboBox);
    }

    public JComboBox getComboBox() {
        return (JComboBox)getSource();
    }
}
