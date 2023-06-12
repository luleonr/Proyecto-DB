/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Estudiante;

import Data.AsignaturasHistAcadConsulta;
import Data.HistoriaAcademica;
import static InterfazGrafica.Estudiante.InformacionAcademica.asignaturaList;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author krist
 */
public class Inscripcion extends javax.swing.JPanel {

    /**
     * Creates new form Inscripcion
     */
    public String nombreBD = "Academico";
    public static ArrayList<String> asignaturaList = new ArrayList<>();
    public static ArrayList<String> citaVencidaList = new ArrayList<>();    
    
    public Inscripcion() {
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
        panelInscripcion = new javax.swing.JPanel();
        labelCitaInsc = new javax.swing.JLabel();
        labelCitaInsc2 = new javax.swing.JLabel();
        labelCitaInsc3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(221, 221, 221));
        setPreferredSize(new java.awt.Dimension(1007, 611));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInscripcion.setBackground(new java.awt.Color(186, 186, 186));
        panelInscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInscripcion.setPreferredSize(new java.awt.Dimension(261, 263));
        panelInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelInscripcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelInscripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelInscripcionMouseExited(evt);
            }
        });
        panelInscripcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCitaInsc.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelCitaInsc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitaInsc.setText("CANCELACIÓN");
        labelCitaInsc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelInscripcion.add(labelCitaInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 237, 261, -1));

        labelCitaInsc2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelCitaInsc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitaInsc2.setText("CITA DE");
        labelCitaInsc2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelInscripcion.add(labelCitaInsc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, -1));

        labelCitaInsc3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelCitaInsc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCitaInsc3.setText("INSCRIPCIÓN /");
        labelCitaInsc3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelInscripcion.add(labelCitaInsc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 210, 260, -1));

        add(panelInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 39, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void panelInscripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInscripcionMouseEntered
        // TODO add your handling code here:
        panelInscripcion.setBackground(new Color(239,239,239));        
    }//GEN-LAST:event_panelInscripcionMouseEntered

    private void panelInscripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInscripcionMouseExited
        // TODO add your handling code here:
        panelInscripcion.setBackground(new Color(186,186,186));        
    }//GEN-LAST:event_panelInscripcionMouseExited

    private void panelInscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInscripcionMouseClicked
        // TODO add your handling code here:
        AsignaturasHistAcadConsulta asigHistAcad = new AsignaturasHistAcadConsulta();
        asigHistAcad.mostrarUsuarios(nombreBD,asignaturaList);   
        asigHistAcad.mostrarUsuarios(nombreBD,citaVencidaList);           
        String[] fecha = {"12","12","13","13"};
        abrirInscripcion();
        //Agregar las materias al panel para visualizarlas
        for(int i = 0;i<=3;i++){
            InscripcionCancelacion.agregarPanelNuevoCitas(asignaturaList.get(i),InscripcionCancelacion.panelProximaCita,fecha[i] );        
        }        
        for(int i = 0;i<=9;i++){
            InscripcionCancelacion.agregarPanelNuevoCitasVencidas(citaVencidaList.get(i),InscripcionCancelacion.panelCitaVencida);        
        }                
    }//GEN-LAST:event_panelInscripcionMouseClicked

        public void abrirInscripcion(){
        InscripcionCancelacion inscripcion = new InscripcionCancelacion();   
        
        HistoriaAcademica.mostrarHistoria_Academica("Academico");
        
        
        inscripcion.comboBox_PlanEstudios.removeAllItems();
        inscripcion.comboBox_PlanEstudios.addItem(HistoriaAcademica.ID_Carrera + "   " + HistoriaAcademica.Carrera);

        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalEstudGUI.mostrarPanel(inscripcion);     
        } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCitaInsc;
    private javax.swing.JLabel labelCitaInsc2;
    private javax.swing.JLabel labelCitaInsc3;
    private javax.swing.JPanel panelInscripcion;
    // End of variables declaration//GEN-END:variables
}
