/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.util;

import javax.swing.JComponent;
import org.jdesktop.swingx.JXTitledPanel;

/**
 *
 * @author Glauco
 */
public class ComponentUtilities {

    public static boolean isLeftDecorationOf(JComponent component, JXTitledPanel titledPanel) {
        if (titledPanel.getLeftDecoration().equals(component)) {
            return true;
        }
        return false;
    }

    public static boolean isRighttDecorationOf(JComponent component, JXTitledPanel titledPanel) {
        if (titledPanel.getRightDecoration().equals(component)) {
            return true;
        }
        return false;
    }
}
