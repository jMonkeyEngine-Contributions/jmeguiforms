/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jme3.gde.jmeguiforms.event;

import java.util.EventObject;
import javax.swing.JTextField;

/**
 *
 * @author Glauco
 */
public class TextFieldEvent extends EventObject{

    public TextFieldEvent(JTextField field) {
        super(field);
    }

    public JTextField getTextField() {
        return (JTextField)getSource();
    }
}
