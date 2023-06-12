/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica.Inscripcion;

import Data.DatosPersonalesEstud;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author krist
 */
public class InscripcionFrameSinCita extends javax.swing.JFrame {


    /**
     * Creates new form DatosEstudiante
     */
    public InscripcionFrameSinCita() {
        
        initComponents();
        setLocationRelativeTo(null);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Principal = new javax.swing.JPanel();
        Label_Escudo = new javax.swing.JLabel();
        Panel_Superior_Gris = new javax.swing.JPanel();
        labelAño = new javax.swing.JLabel();
        Label_Portal_Servicios1 = new javax.swing.JLabel();
        Label_Portal_Servicios2 = new javax.swing.JLabel();
        labelAño2 = new javax.swing.JLabel();
        labelPeriodo = new javax.swing.JLabel();
        labelCarrera = new javax.swing.JLabel();
        panelSuperior = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        panelBienvenida = new javax.swing.JPanel();
        labelBienvenida = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel_Principal.setBackground(new java.awt.Color(221, 221, 221));
        panel_Principal.setPreferredSize(new java.awt.Dimension(1350, 700));
        panel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escudoUnal.jpg"))); // NOI18N
        Label_Escudo.setPreferredSize(new java.awt.Dimension(294, 106));
        panel_Principal.add(Label_Escudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, -1, 80));

        Panel_Superior_Gris.setBackground(new java.awt.Color(83, 85, 86));
        Panel_Superior_Gris.setPreferredSize(new java.awt.Dimension(1366, 84));

        labelAño.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelAño.setForeground(new java.awt.Color(255, 255, 255));
        labelAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAño.setText("-");

        Label_Portal_Servicios1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Label_Portal_Servicios1.setForeground(new java.awt.Color(255, 255, 255));
        Label_Portal_Servicios1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Portal_Servicios1.setText("INSCRIPCIÓN CANCELACIÓN DE MATERIAS");

        Label_Portal_Servicios2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        Label_Portal_Servicios2.setForeground(new java.awt.Color(255, 255, 255));
        Label_Portal_Servicios2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Portal_Servicios2.setText("MATRÍCULA");

        labelAño2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelAño2.setForeground(new java.awt.Color(255, 255, 255));
        labelAño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAño2.setText("2023");

        labelPeriodo.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        labelPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPeriodo.setText("2S");

        labelCarrera.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelCarrera.setForeground(new java.awt.Color(255, 255, 255));
        labelCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCarrera.setText("CARRERA");

        javax.swing.GroupLayout Panel_Superior_GrisLayout = new javax.swing.GroupLayout(Panel_Superior_Gris);
        Panel_Superior_Gris.setLayout(Panel_Superior_GrisLayout);
        Panel_Superior_GrisLayout.setHorizontalGroup(
            Panel_Superior_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Superior_GrisLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addGroup(Panel_Superior_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Portal_Servicios1)
                    .addGroup(Panel_Superior_GrisLayout.createSequentialGroup()
                        .addComponent(Label_Portal_Servicios2)
                        .addGap(5, 5, 5)
                        .addComponent(labelAño2)
                        .addGap(8, 8, 8)
                        .addComponent(labelAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPeriodo)
                        .addGap(18, 18, 18)
                        .addComponent(labelCarrera)))
                .addGap(501, 501, 501))
        );
        Panel_Superior_GrisLayout.setVerticalGroup(
            Panel_Superior_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Superior_GrisLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Label_Portal_Servicios1)
                .addGap(1, 1, 1)
                .addGroup(Panel_Superior_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Portal_Servicios2)
                    .addComponent(labelAño2)
                    .addGroup(Panel_Superior_GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelAño)
                        .addComponent(labelPeriodo)
                        .addComponent(labelCarrera)))
                .addGap(15, 15, 15))
        );

        panel_Principal.add(Panel_Superior_Gris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelSuperior.setBackground(new java.awt.Color(221, 221, 221));

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 2));

        panelBienvenida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelBienvenida.setPreferredSize(new java.awt.Dimension(140, 50));

        labelBienvenida.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBienvenida.setText("Bienvenida");
        labelBienvenida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBienvenidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(panelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_Principal.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 1350, 100));

        Content.setBackground(new java.awt.Color(221, 221, 221));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        panel_Principal.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 184, 1350, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_Principal.getAccessibleContext().setAccessibleName("");
        panel_Principal.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelBienvenidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBienvenidaMouseClicked
        // TODO add your handling code here:
        mostrar_Bienvenida();
        InscripcionBienvenida.agregarPanelBienvenida(this);
        
    }//GEN-LAST:event_labelBienvenidaMouseClicked

        public static void mostrar_Bienvenida(){
        InscripcionBienvenida bienvenida = new InscripcionBienvenida();
        mostrarPanel(bienvenida);            
            
        }
 
        public static void mostrarPanel(JPanel panel){

        panel.setSize(1350,1000); //Tener cuidado! debe tener el mismo tamaño del content para que esteticamente se vea bien
        panel.setLocation(0,0);
        
        Content.removeAll();
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();        
   
    }        
    
    public static void ejecutar_pricipal(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscripcionFrameSinCita().setVisible(true);
            }
        });
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InscripcionFrameSinCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscripcionFrameSinCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscripcionFrameSinCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscripcionFrameSinCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscripcionFrameSinCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Content;
    private javax.swing.JLabel Label_Escudo;
    private javax.swing.JLabel Label_Portal_Servicios1;
    private javax.swing.JLabel Label_Portal_Servicios2;
    private javax.swing.JPanel Panel_Superior_Gris;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAño;
    private javax.swing.JLabel labelAño2;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelCarrera;
    private javax.swing.JLabel labelPeriodo;
    private javax.swing.JPanel panelBienvenida;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panel_Principal;
    // End of variables declaration//GEN-END:variables
}