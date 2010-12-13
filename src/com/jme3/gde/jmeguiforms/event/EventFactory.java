/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.event;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Glauco
 */
public class EventFactory {

    public static SpinnerEvent createSpinnerEvent(ChangeEvent e) {
        return new SpinnerEvent((JSpinner) e.getSource());
    }

    public static ButtonEvent createButtonEvent(ActionEvent e) {
        return new ButtonEvent((JButton) e.getSource());
    }

    public static ComboBoxEvent createComboBoxEvent(ActionEvent e) {
        return new ComboBoxEvent((JComboBox) e.getSource());
    }

    public static TextFieldEvent createTextFieldEvent(ActionEvent e) {
        return new TextFieldEvent((JTextField) e.getSource());
    }
}
