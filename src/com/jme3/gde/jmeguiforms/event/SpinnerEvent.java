/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jme3.gde.jmeguiforms.event;

import java.util.EventObject;
import javax.swing.JSpinner;

/**
 *
 * @author Glauco
 */
public class SpinnerEvent extends EventObject{

    public SpinnerEvent(JSpinner spinner) {
        super(spinner);
    }

    public JSpinner getSpinner() {
        return (JSpinner)getSource();
    }

}
