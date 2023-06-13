/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Inscripcion;

import static InterfazGrafica.Inscripcion.InscripcionFrameSinCita.mostrar_Bienvenida;
import static InterfazGrafica.Login.usuarioLogin;
import java.awt.Color;

/**
 *
 * @author krist
 */
public class InscripcionProximaCita extends javax.swing.JPanel {

    /**
     * Creates new form InscripcionProximaCita
     */
    public InscripcionProximaCita() {
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

        jLabel1 = new javax.swing.JLabel();
        labelCarrera = new javax.swing.JLabel();
        labelIdCarrera = new javax.swing.JLabel();
        labelCarrera1 = new javax.swing.JLabel();
        labelFacultad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelFechaInicial = new javax.swing.JLabel();
        labelFechaFinal = new javax.swing.JLabel();
        panelAcceder = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setMaximumSize(new java.awt.Dimension(860, 90));
        setMinimumSize(new java.awt.Dimension(860, 90));
        setPreferredSize(new java.awt.Dimension(860, 90));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel1.setText("Información de la cita");

        labelCarrera.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelCarrera.setText("INGENIERÍA DE SISTEMAS Y COMPUTACIÓN");

        labelIdCarrera.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelIdCarrera.setText("(81240)");

        labelCarrera1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelCarrera1.setText("FACULTAD DE ");

        labelFacultad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelFacultad.setText("FACULTAD");

        jPanel1.setBackground(new java.awt.Color(186, 186, 186));
        jPanel1.setPreferredSize(new java.awt.Dimension(251, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        labelFechaInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelFechaInicial.setText("30/05/2023");
        jPanel1.add(labelFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        labelFechaFinal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelFechaFinal.setText("30/05/2023");
        jPanel1.add(labelFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        panelAcceder.setBackground(new java.awt.Color(145, 179, 59));
        panelAcceder.setPreferredSize(new java.awt.Dimension(90, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Acceder");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setMaximumSize(new java.awt.Dimension(90, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(90, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(90, 40));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAccederLayout = new javax.swing.GroupLayout(panelAcceder);
        panelAcceder.setLayout(panelAccederLayout);
        panelAccederLayout.setHorizontalGroup(
            panelAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAccederLayout.setVerticalGroup(
            panelAccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCarrera1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFacultad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCarrera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIdCarrera))))
                    .addComponent(jLabel1))
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(panelAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCarrera)
                            .addComponent(labelIdCarrera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCarrera1)
                            .addComponent(labelFacultad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(panelAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        InscripcionFrame inscripcion = new InscripcionFrame();

        inscripcion.setVisible(true); 
     
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        panelAcceder.setBackground(new Color(175,199,107));           
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        panelAcceder.setBackground(new Color(145,179,59));        
    }//GEN-LAST:event_jLabel5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labelCarrera;
    private javax.swing.JLabel labelCarrera1;
    public javax.swing.JLabel labelFacultad;
    public javax.swing.JLabel labelFechaFinal;
    public javax.swing.JLabel labelFechaInicial;
    public javax.swing.JLabel labelIdCarrera;
    public javax.swing.JPanel panelAcceder;
    // End of variables declaration//GEN-END:variables
}
