/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Profesor;


import InterfazGrafica.Estudiante.*;
import InterfazGrafica.Estudiante.PantallaPrincipalEstudGUI;
import Data.DatosPersonalesEstud;
import Data.HistoriaAcademica;
import Data.AsignaturasHistAcadConsulta;
import Data.HorarioProf;
import Data.ProgramaEstudiante;
import static InterfazGrafica.Inscripcion.InscripcionCancelacion.nombreBD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author krist
 */
public class RolDocente extends javax.swing.JPanel {
    
    public String nombreBD = "Academico";
    public static ArrayList<String> cedulaList = new ArrayList<>();
    public static ArrayList<String> nombreList = new ArrayList<>();

    public static ArrayList<String> asignaturaList = new ArrayList<>();
    public static ArrayList<String> creditosList = new ArrayList<>();
    public static ArrayList<String> tipoList = new ArrayList<>();
    public static ArrayList<String> periodoList = new ArrayList<>();
    public static ArrayList<String> notaList = new ArrayList<>();   

    //Horario
    public static ArrayList<String> diaList = new ArrayList<>();
    public static ArrayList<String> horaInicioList = new ArrayList<>();
    public static ArrayList<String> horaFinalList = new ArrayList<>();
    public static ArrayList<String> actividadList = new ArrayList<>();
    public static ArrayList<String> noGrupoList = new ArrayList<>();
    public static ArrayList<String> salonList = new ArrayList<>();
    public static ArrayList<String> edificioList = new ArrayList<>();
    public static ArrayList<String> semestreList = new ArrayList<>();
    public static ArrayList<String> materiaList = new ArrayList<>();
    public static ArrayList<String> EdifNomList = new ArrayList<>();  
    public static ArrayList<String> MateriaIDList = new ArrayList<>(); 
    public static ArrayList<String> SedeList = new ArrayList<>();     
    
    public static Map<String, JPanel> diaPanelMap = new HashMap<>();

    
    public RolDocente() {
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

        panelListaClase = new javax.swing.JPanel();
        labelListaClase = new javax.swing.JLabel();
        panel_Calificaciones = new javax.swing.JPanel();
        label_Calificaciones = new javax.swing.JLabel();
        panel_Horario = new javax.swing.JPanel();
        label_Horario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setPreferredSize(new java.awt.Dimension(1007, 611));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelListaClase.setBackground(new java.awt.Color(186, 186, 186));
        panelListaClase.setPreferredSize(new java.awt.Dimension(261, 263));

        labelListaClase.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelListaClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaClase.setText("LISTAS DE CLASE");
        labelListaClase.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelListaClase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelListaClase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelListaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelListaClaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelListaClaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelListaClaseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelListaClaseLayout = new javax.swing.GroupLayout(panelListaClase);
        panelListaClase.setLayout(panelListaClaseLayout);
        panelListaClaseLayout.setHorizontalGroup(
            panelListaClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelListaClase, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelListaClaseLayout.setVerticalGroup(
            panelListaClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelListaClase, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        add(panelListaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 39, -1, -1));

        panel_Calificaciones.setBackground(new java.awt.Color(186, 186, 186));
        panel_Calificaciones.setPreferredSize(new java.awt.Dimension(261, 263));

        label_Calificaciones.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label_Calificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Calificaciones.setText("CALIFICACIONES");
        label_Calificaciones.setToolTipText("");
        label_Calificaciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_Calificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Calificaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_Calificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_CalificacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_CalificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_CalificacionesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_CalificacionesLayout = new javax.swing.GroupLayout(panel_Calificaciones);
        panel_Calificaciones.setLayout(panel_CalificacionesLayout);
        panel_CalificacionesLayout.setHorizontalGroup(
            panel_CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Calificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        panel_CalificacionesLayout.setVerticalGroup(
            panel_CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Calificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        add(panel_Calificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 39, -1, -1));

        panel_Horario.setBackground(new java.awt.Color(186, 186, 186));
        panel_Horario.setPreferredSize(new java.awt.Dimension(261, 263));

        label_Horario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label_Horario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Horario.setText("HORARIO");
        label_Horario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_Horario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Horario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_HorarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_HorarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_HorarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_HorarioLayout = new javax.swing.GroupLayout(panel_Horario);
        panel_Horario.setLayout(panel_HorarioLayout);
        panel_HorarioLayout.setHorizontalGroup(
            panel_HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Horario, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        panel_HorarioLayout.setVerticalGroup(
            panel_HorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Horario, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        add(panel_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 39, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void labelListaClaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaClaseMouseEntered
        // TODO add your handling code here:
        panelListaClase.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_labelListaClaseMouseEntered

    private void labelListaClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaClaseMouseExited
        // TODO add your handling code here:
        panelListaClase.setBackground(new Color(186,186,186));
    }//GEN-LAST:event_labelListaClaseMouseExited

    private void label_CalificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_CalificacionesMouseExited
        // TODO add your handling code here:
        panel_Calificaciones.setBackground(new Color(186,186,186));
    }//GEN-LAST:event_label_CalificacionesMouseExited

    private void label_CalificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_CalificacionesMouseEntered
        // TODO add your handling code here:
        panel_Calificaciones.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_label_CalificacionesMouseEntered

    private void label_HorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HorarioMouseEntered
        // TODO add your handling code here:
        panel_Horario.setBackground(new Color(239,239,239));        

    }//GEN-LAST:event_label_HorarioMouseEntered

    private void label_HorarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HorarioMouseExited
        // TODO add your handling code here:
        panel_Horario.setBackground(new Color(186,186,186));
    }//GEN-LAST:event_label_HorarioMouseExited

    private void labelListaClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelListaClaseMouseClicked
        // TODO add your handling code here:
        //Rellenar las materias que el estudiante ya vio
        AsignaturasHistAcadConsulta asigHistAcad = new AsignaturasHistAcadConsulta();
        asigHistAcad.mostrarCedula(nombreBD,nombreList);
        asigHistAcad.mostrarUsuarios(nombreBD,cedulaList);
        
        
        abrirListaClase();
        //Agregar las materias al panel para visualizarlas
        for(int i = 0;i<=15;i++){
            ListaDeClase.agregarPanelNuevoLista(cedulaList.get(i),nombreList.get(i));
        }

    }//GEN-LAST:event_labelListaClaseMouseClicked

    private void label_CalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_CalificacionesMouseClicked
        // TODO add your handling code here: 
        AsignaturasHistAcadConsulta asigHistAcad = new AsignaturasHistAcadConsulta();
        asigHistAcad.mostrarCedula(nombreBD,nombreList);
        asigHistAcad.mostrarUsuarios(nombreBD,cedulaList);    
        abrirCalificaciones();
        //Agregar las materias al panel para visualizarlas
        for(int i = 0;i<=15;i++){
            CalificacionesDocente.agregarPanelNuevoLista(nombreList.get(i),cedulaList.get(i));
        }        
    }//GEN-LAST:event_label_CalificacionesMouseClicked

    private void label_HorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HorarioMouseClicked
        // TODO add your handling code here:     
        HorarioProf.mostrarHorarioDia(nombreBD, diaList);     
        HorarioProf.mostrarHorarioHoraInicio(nombreBD,horaInicioList);
        HorarioProf.mostrarHorarioHoraFinal(nombreBD,horaFinalList);
        HorarioProf.mostrarHorarioActividad(nombreBD,actividadList);
        HorarioProf.mostrarHorarioGrupo(nombreBD,noGrupoList);         
        HorarioProf.mostrarHorarioSalon(nombreBD,salonList);
        HorarioProf.mostrarHorarioEdificio(nombreBD,edificioList);        
        HorarioProf.mostrarHorarioSemestre(nombreBD, semestreList);
        HorarioProf.mostrarHorarioMateria(nombreBD, materiaList);   
        HorarioProf.mostrarHorarioEdificioNom(nombreBD,EdifNomList);         
        HorarioProf.mostrarHorarioMateriaID(nombreBD,MateriaIDList);
        HorarioProf.mostrarHorarioSede(nombreBD,SedeList);        

        abrirHorario();
        //Agregar las materias al panel para visualizarlas
        // Crear el mapa para mapear días de la semana a los paneles correspondientes
        diaPanelMap.put("Lunes", HorarioProfeGUI.panelLunes);
        diaPanelMap.put("Martes", HorarioProfeGUI.panelMartes);
        diaPanelMap.put("Miércoles", HorarioProfeGUI.panelMiercoles);
        diaPanelMap.put("Jueves", HorarioProfeGUI.panelJueves);
        diaPanelMap.put("Viernes", HorarioProfeGUI.panelViernes);
        diaPanelMap.put("Sábado", HorarioProfeGUI.panelSabado);

        // Iterar sobre la lista de horarios
        for (int i = 0; i < horaInicioList.size(); i++) {
            String dia = diaList.get(i);

            // Verificar si el día existe en el mapa
            if (diaPanelMap.containsKey(dia)) {
                JPanel panel = diaPanelMap.get(dia);
                HorarioProfeGUI.agregarPanelNuevoHorario(horaInicioList.get(i), horaFinalList.get(i), materiaList.get(i),
                        salonList.get(i),edificioList.get(i),EdifNomList.get(i),semestreList.get(i),
                        actividadList.get(i),noGrupoList.get(i),MateriaIDList.get(i), SedeList.get(i),panel);
            }
        }   
    }//GEN-LAST:event_label_HorarioMouseClicked

        public void abrirListaClase(){
        ListaDeClase listClase = new ListaDeClase();   
        
            ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
            HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa);
        
        
        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalProfGUI.mostrarPanel(listClase);     
        }
        
        public void abrirCalificaciones(){
        CalificacionesDocente calificaciones = new CalificacionesDocente();   
        
            ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
            HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa); 
     
        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalProfGUI.mostrarPanel(calificaciones);     
        } 
                
        public void abrirHorario(){
        HorarioProfeGUI horario = new HorarioProfeGUI();   
        
            ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
            HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa);
        
            
        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalProfGUI.mostrarPanel(horario);     
        }       
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelListaClase;
    private javax.swing.JLabel label_Calificaciones;
    private javax.swing.JLabel label_Horario;
    private javax.swing.JPanel panelListaClase;
    private javax.swing.JPanel panel_Calificaciones;
    private javax.swing.JPanel panel_Horario;
    // End of variables declaration//GEN-END:variables
}
