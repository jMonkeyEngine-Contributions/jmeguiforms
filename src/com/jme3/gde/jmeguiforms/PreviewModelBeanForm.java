/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PreviewModelBeanForm.java
 *
 * Created on 19/12/2010, 21:54:46
 */
package com.jme3.gde.jmeguiforms;

import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;
import org.jdesktop.swingx.JXPanel;

/**
 *
 * @author Glauco
 */
public class PreviewModelBeanForm extends JXPanel {

    private boolean wireframe;

    /** Creates new form PreviewModelBeanForm */
    public PreviewModelBeanForm() {
        initComponents();
    }

    public void startPreview() {
        offPanel.startPreview();
    }

    public void attach(Spatial spat) {
        offPanel.attach(spat);
    }

    public void detach(Spatial spat) {
        offPanel.detach(spat);
    }

    public void cleanup() {
        offPanel.cleanup();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jXButton1 = new org.jdesktop.swingx.JXButton();
        jXButton2 = new org.jdesktop.swingx.JXButton();
        jXButton3 = new org.jdesktop.swingx.JXButton();
        jXButton4 = new org.jdesktop.swingx.JXButton();
        jXButton6 = new org.jdesktop.swingx.JXButton();
        offPanel = new com.jme3.gde.jmeguiforms.OffScenePanelBeanForm();

        jToolBar1.setRollover(true);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/jmeguiforms/icons/box_wire.gif"))); // NOI18N
        jToggleButton1.setText(org.openide.util.NbBundle.getMessage(PreviewModelBeanForm.class, "PreviewModelBeanForm.jToggleButton1.text")); // NOI18N
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButton1);

        jXButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/jmeguiforms/icons/+zoom.png"))); // NOI18N
        jXButton1.setText(org.openide.util.NbBundle.getMessage(PreviewModelBeanForm.class, "PreviewModelBeanForm.jXButton1.text")); // NOI18N
        jXButton1.setFocusable(false);
        jXButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jXButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jXButton1);

        jXButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/jmeguiforms/icons/-zoom.png"))); // NOI18N
        jXButton2.setText(org.openide.util.NbBundle.getMessage(PreviewModelBeanForm.class, "PreviewModelBeanForm.jXButton2.text")); // NOI18N
        jXButton2.setFocusable(false);
        jXButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jXButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jXButton2);

        jXButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/jmeguiforms/icons/rotate-right.png"))); // NOI18N
        jXButton3.setText(org.openide.util.NbBundle.getMessage(PreviewModelBeanForm.class, "PreviewModelBeanForm.jXButton3.text")); // NOI18N
        jXButton3.setFocusable(false);
        jXButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jXButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jXButton3);

        jXButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/jmeguiforms/icons/rotate-left.png"))); // NOI18N
        jXButton4.setText(org.openide.util.NbBundle.getMessage(PreviewModelBeanForm.class, "PreviewModelBeanForm.jXButton4.text")); // NOI18N
        jXButton4.setFocusable(false);
        jXButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jXButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jXButton4);

        jXButton6.setText(org.openide.util.NbBundle.getMessage(PreviewModelBeanForm.class, "PreviewModelBeanForm.jXButton6.text")); // NOI18N
        jXButton6.setFocusable(false);
        jXButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jXButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jXButton6);

        javax.swing.GroupLayout offPanelLayout = new javax.swing.GroupLayout(offPanel);
        offPanel.setLayout(offPanelLayout);
        offPanelLayout.setHorizontalGroup(
            offPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        offPanelLayout.setVerticalGroup(
            offPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addComponent(offPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(offPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (wireframe) {
            offPanel.disableWireFrame();
        } else {
            offPanel.enableWireFrame();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jXButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton1ActionPerformed
        // TODO add your handling code here:
        offPanel.zoomCamera(.1f);
    }//GEN-LAST:event_jXButton1ActionPerformed

    private void jXButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton2ActionPerformed
        // TODO add your handling code here:
        offPanel.zoomCamera(-.1f);
    }//GEN-LAST:event_jXButton2ActionPerformed

    private void jXButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton3ActionPerformed
        // TODO add your handling code here:
        offPanel.rotateCamera(Vector3f.UNIT_Y.clone(), .1f);
    }//GEN-LAST:event_jXButton3ActionPerformed

    private void jXButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXButton4ActionPerformed
        // TODO add your handling code here:
        offPanel.rotateCamera(Vector3f.UNIT_Y.clone(), -.1f);
    }//GEN-LAST:event_jXButton4ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private org.jdesktop.swingx.JXButton jXButton1;
    private org.jdesktop.swingx.JXButton jXButton2;
    private org.jdesktop.swingx.JXButton jXButton3;
    private org.jdesktop.swingx.JXButton jXButton4;
    private org.jdesktop.swingx.JXButton jXButton6;
    private com.jme3.gde.jmeguiforms.OffScenePanelBeanForm offPanel;
    // End of variables declaration//GEN-END:variables
}