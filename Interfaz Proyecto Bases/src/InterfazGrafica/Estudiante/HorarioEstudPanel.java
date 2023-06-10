/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Estudiante;

import Data.HistoriaAcademica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author krist
 */
public class HorarioEstudPanel extends javax.swing.JPanel {

    /**
     * Creates new form HorarioEstudPanel
     */
    
    public static Color colorViejo;       
    public HorarioEstudPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMateria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setMaximumSize(new java.awt.Dimension(130, 45));
        setMinimumSize(new java.awt.Dimension(130, 45));
        setPreferredSize(new java.awt.Dimension(130, 45));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMateria.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        labelMateria.setText("7:00 Materia 1 bsfgfhff");
        labelMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMateria.setMaximumSize(new java.awt.Dimension(130, 45));
        labelMateria.setMinimumSize(new java.awt.Dimension(130, 45));
        labelMateria.setPreferredSize(new java.awt.Dimension(130, 45));
        labelMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMateriaMouseExited(evt);
            }
        });
        add(labelMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void labelMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMateriaMouseEntered
        // TODO add your handling code here:
        colorViejo = labelMateria.getForeground();
        labelMateria.setBackground(new Color(145,179,59));
        labelMateria.setForeground(new Color(145,179,59));
    }//GEN-LAST:event_labelMateriaMouseEntered

    private void labelMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMateriaMouseExited
        // TODO add your handling code here:
        labelMateria.setBackground(colorViejo);
        labelMateria.setForeground(colorViejo);
    }//GEN-LAST:event_labelMateriaMouseExited

    private void labelMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMateriaMouseClicked
        // TODO add your handling code here:
        HorarioDetalle horar = new HorarioDetalle();
        horar.setVisible(true);
        //horar.setLocationRelativeTo(null);
        horar.setDefaultCloseOperation(horar.DISPOSE_ON_CLOSE);

        horar.setLocation(400, 175);   
        
        HistoriaAcademica.mostrarHistoria_Academica("Academico");
        
        horar.labelCarrera.setText(HistoriaAcademica.Carrera);
        
    }//GEN-LAST:event_labelMateriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel labelMateria;
    // End of variables declaration//GEN-END:variables
}
