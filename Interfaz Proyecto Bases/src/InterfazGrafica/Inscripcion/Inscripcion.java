/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Inscripcion;

import InterfazGrafica.Inscripcion.InscripcionCancelacion;
import Data.AsignaturasHistAcadConsulta;
import Data.CitasInscripcionActivas;
import Data.CitasInscripcionProximas;
import Data.CitasInscripcionVencidas;
import Data.HistoriaAcademica;
import Data.ProgramaEstudiante;
import InterfazGrafica.Estudiante.PantallaPrincipalEstudGUI;
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
    
    //Citas Activas
    public static ArrayList<String> InicioCAList = new ArrayList<>();
    public static ArrayList<String> FinalCAList = new ArrayList<>();
    public static ArrayList<String> ProgramaCAList = new ArrayList<>();
    public static ArrayList<String> FacultadCAList = new ArrayList<>();
    public static ArrayList<String> UsuarioCAList = new ArrayList<>(); 
    
    //Citas Proximas
    public static ArrayList<String> InicioPRList = new ArrayList<>();
    public static ArrayList<String> FinalPRList = new ArrayList<>();
    public static ArrayList<String> ProgramaPRList = new ArrayList<>();
    public static ArrayList<String> FacultadPRList = new ArrayList<>();
    public static ArrayList<String> UsuarioPRList = new ArrayList<>();
    
    //Citas Vencidas
    public static ArrayList<String> InicioVEList = new ArrayList<>();
    public static ArrayList<String> FinalVEList = new ArrayList<>();
    public static ArrayList<String> ProgramaVEList = new ArrayList<>();
    public static ArrayList<String> FacultadVEList = new ArrayList<>();
    public static ArrayList<String> UsuarioVEList = new ArrayList<>();    
    
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
        
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD); 
        CitasInscripcionActivas.mostrarInicio(nombreBD, ProgramaEstudiante.Id_programa, InicioCAList);        
        CitasInscripcionActivas.mostrarFinal(nombreBD, ProgramaEstudiante.Id_programa, FinalCAList);
        CitasInscripcionActivas.mostrarPrograma(nombreBD, ProgramaEstudiante.Id_programa, ProgramaCAList);
        CitasInscripcionActivas.mostrarFacultad(nombreBD, ProgramaEstudiante.Id_programa, FacultadCAList);
        CitasInscripcionActivas.mostrarUsuario(nombreBD, ProgramaEstudiante.Id_programa, UsuarioCAList);      
        
        CitasInscripcionProximas.mostrarInicio(nombreBD, ProgramaEstudiante.Id_programa, InicioPRList);        
        CitasInscripcionProximas.mostrarFinal(nombreBD, ProgramaEstudiante.Id_programa, FinalPRList);
        CitasInscripcionProximas.mostrarPrograma(nombreBD, ProgramaEstudiante.Id_programa, ProgramaPRList);
        CitasInscripcionProximas.mostrarFacultad(nombreBD, ProgramaEstudiante.Id_programa, FacultadPRList);
        CitasInscripcionProximas.mostrarUsuario(nombreBD, ProgramaEstudiante.Id_programa, UsuarioPRList);   

        CitasInscripcionVencidas.mostrarInicio(nombreBD, ProgramaEstudiante.Id_programa, InicioVEList);        
        CitasInscripcionVencidas.mostrarFinal(nombreBD, ProgramaEstudiante.Id_programa, FinalVEList);
        CitasInscripcionVencidas.mostrarPrograma(nombreBD, ProgramaEstudiante.Id_programa, ProgramaVEList);
        CitasInscripcionVencidas.mostrarFacultad(nombreBD, ProgramaEstudiante.Id_programa, FacultadVEList);
        CitasInscripcionVencidas.mostrarUsuario(nombreBD, ProgramaEstudiante.Id_programa, UsuarioVEList);           
        
        
        AsignaturasHistAcadConsulta asigHistAcad = new AsignaturasHistAcadConsulta();
        asigHistAcad.mostrarUsuarios(nombreBD,asignaturaList);   
        asigHistAcad.mostrarUsuarios(nombreBD,citaVencidaList);           
        String[] fecha = {"12","12","13","13"};
        abrirInscripcion();
        //Agregar las materias al panel para visualizarlas
        for(int i = 0;i<InicioCAList.size();i++){
            InscripcionCancelacion.agregarPanelNuevoCitas(InicioCAList.get(i),FinalCAList.get(i),
                    ProgramaCAList.get(i),FacultadCAList.get(i),InscripcionCancelacion.panelProximaCita,fecha[i] );        
        }        
        for(int i = 0;i<InicioVEList.size();i++){
            InscripcionCancelacion.agregarPanelNuevoCitasVencidas(InicioVEList.get(i),FinalVEList.get(i),
                    ProgramaVEList.get(i),FacultadVEList.get(i) ,InscripcionCancelacion.panelCitaVencida);        
        }                
    }//GEN-LAST:event_panelInscripcionMouseClicked

        public void abrirInscripcion(){
        InscripcionCancelacion inscripcion = new InscripcionCancelacion();   
        
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
        HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa);
        
        
        inscripcion.comboBox_PlanEstudios.removeAllItems();
        inscripcion.comboBox_PlanEstudios.addItem(ProgramaEstudiante.Id_programa + "   " + ProgramaEstudiante.Nombre_programa);

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
