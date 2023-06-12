/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Inscripcion;

import InterfazGrafica.Inscripcion.InscripcionCitaVencida;
import InterfazGrafica.Inscripcion.InscripcionProximaCita;
import Data.HistoriaAcademica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author krist
 */
public class InscripcionCancelacion extends javax.swing.JPanel {

    /**
     * Creates new form InscripcionCancelacion
     */
    public static ArrayList<JPanel> panelList; 
    
    public InscripcionCancelacion() {
        initComponents();
        panelList = new ArrayList<>();
        
        AgregarPanel(panelProximaCita,scrollpanelProximaCita); 
        AgregarPanel(panelCitaVencida,scrollpanelCitaVencida);         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        comboBox_PlanEstudios = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelProximaCita = new javax.swing.JPanel();
        scrollpanelProximaCita = new javax.swing.JScrollPane();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panelCitaVencida = new javax.swing.JPanel();
        scrollpanelCitaVencida = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(221, 221, 221));
        setPreferredSize(new java.awt.Dimension(1007, 2500));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 2500));

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 2500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel1.setText("Citas vencidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(970, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Plan de estudios");
        jLabel2.setPreferredSize(new java.awt.Dimension(133, 32));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        comboBox_PlanEstudios.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBox_PlanEstudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox_PlanEstudios.setBorder(null);
        comboBox_PlanEstudios.setPreferredSize(new java.awt.Dimension(430, 32));
        jPanel1.add(comboBox_PlanEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel3.setText("Cita de inscripción/cancelación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(970, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        panelProximaCita.setMaximumSize(new java.awt.Dimension(860, 360));
        panelProximaCita.setMinimumSize(new java.awt.Dimension(860, 360));
        panelProximaCita.setPreferredSize(new java.awt.Dimension(860, 360));
        panelProximaCita.setLayout(new javax.swing.BoxLayout(panelProximaCita, javax.swing.BoxLayout.LINE_AXIS));
        panelProximaCita.add(scrollpanelProximaCita);

        jPanel1.add(panelProximaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setText("Mi próxima cita");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(970, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        panelCitaVencida.setMaximumSize(new java.awt.Dimension(860, 900));
        panelCitaVencida.setMinimumSize(new java.awt.Dimension(860, 900));
        panelCitaVencida.setPreferredSize(new java.awt.Dimension(860, 900));
        panelCitaVencida.setLayout(new javax.swing.BoxLayout(panelCitaVencida, javax.swing.BoxLayout.LINE_AXIS));
        panelCitaVencida.add(scrollpanelCitaVencida);

        jPanel1.add(panelCitaVencida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
        
        public static void agregarPanelNuevoCitas(String materia, JPanel panel1, String fecha) {
            InscripcionProximaCita panel = new InscripcionProximaCita();
            panel.setPreferredSize(new Dimension(860, 90));
            panel.setMaximumSize(new Dimension(860,90));
            panel.setMinimumSize(new Dimension(860,90));
            panel.setBackground(new Color(221,221,221));


            HistoriaAcademica.mostrarHistoria_Academica("Academico");        
            panel.labelFechaInicial.setText(materia);
            panel.labelCarrera.setText(HistoriaAcademica.Carrera);
            panel.labelFacultad.setText(HistoriaAcademica.Facultad);
            panel.labelIdCarrera.setText("(" + HistoriaAcademica.ID_Carrera + ")");

            if(fecha.compareTo("12") == 0){
                panel.panelAcceder.setVisible(true);
            }else{
                panel.panelAcceder.setVisible(false);
            }

            panelList.add(panel);
            panel1.add(panel);
            panel1.revalidate();
            panel1.repaint();
        }
        
        
        public static void agregarPanelNuevoCitasVencidas(String materia, JPanel panel1) {
            InscripcionCitaVencida panel = new InscripcionCitaVencida();
            panel.setPreferredSize(new Dimension(860, 90));
            panel.setMaximumSize(new Dimension(860,90));
            panel.setMinimumSize(new Dimension(860,90));
            panel.setBackground(new Color(221,221,221));


            HistoriaAcademica.mostrarHistoria_Academica("Academico");        
            panel.labelFechaInicial.setText(materia);
            panel.labelCarrera.setText(HistoriaAcademica.Carrera);
            panel.labelFacultad.setText(HistoriaAcademica.Facultad);
            panel.labelIdCarrera.setText("(" + HistoriaAcademica.ID_Carrera + ")");

            panelList.add(panel);
            panel1.add(panel);
            panel1.revalidate();
            panel1.repaint();
        }
        
        public void AgregarPanel(JPanel panel, JScrollPane scrollpanel){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        scrollpanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollpanel, BorderLayout.CENTER);   
            
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> comboBox_PlanEstudios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JPanel panelCitaVencida;
    public static javax.swing.JPanel panelProximaCita;
    private javax.swing.JScrollPane scrollpanelCitaVencida;
    private javax.swing.JScrollPane scrollpanelProximaCita;
    // End of variables declaration//GEN-END:variables
}