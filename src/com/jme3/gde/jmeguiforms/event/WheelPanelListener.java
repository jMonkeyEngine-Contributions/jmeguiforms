/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.jmeguiforms.event;

/**
 *
 * @author Glauco
 */
public interface WheelPanelListener {

    public void connectionPointXStateChanged(SpinnerEvent e);

    public void connectionPointYStateChanged(SpinnerEvent e);

    public void connectionPointZStateChanged(SpinnerEvent e);

    public void directionXStateChanged(SpinnerEvent e);

    public void directionYStateChanged(SpinnerEvent e);

    public void directionZStateChanged(SpinnerEvent e);

    public void axleXStateChanged(SpinnerEvent e);

    public void axleYStateChanged(SpinnerEvent e);

    public void axleZStateChanged(SpinnerEvent e);

    public void restLengthStateChanged(SpinnerEvent e);

    public void radiusStateChanged(SpinnerEvent e);

    public void frontWheelActionPerformed(ComboBoxEvent e);

    public void spatialActionPerformed(TextFieldEvent e);

    public void loadSpatialActionPerformed(ButtonEvent e);

    public void nameActionPerformed(TextFieldEvent e);

    public void closeActionPerformed(ButtonEvent e);
}
