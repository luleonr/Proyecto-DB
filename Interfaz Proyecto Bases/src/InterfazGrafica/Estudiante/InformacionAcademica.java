/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Estudiante;


import InterfazGrafica.Estudiante.PantallaPrincipalEstudGUI;
import Data.DatosPersonalesEstud;
import Data.HistoriaAcademica;
import Data.AsignaturasHistAcadConsulta;
import Data.Calificaciones;
import Data.HorarioEstud;
import Data.MostrarAsignaturasHistoriaAcad;
import Data.ProgramaEstudiante;
import Data.ResumenCreditos;
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
public class InformacionAcademica extends javax.swing.JPanel {
    
    public String nombreBD = "Academico";
    public static ArrayList<String> asignaturaList = new ArrayList<>();
    public static ArrayList<String> creditosList = new ArrayList<>();
    public static ArrayList<String> tipoList = new ArrayList<>();
    public static ArrayList<String> periodoList = new ArrayList<>();
    public static ArrayList<String> notaList = new ArrayList<>();    
    
    //MateriasHistoriaAcademica
    public static ArrayList<String> AsignaturaVistaList = new ArrayList<>();
    public static ArrayList<String> CodigoVistaList = new ArrayList<>();
    public static ArrayList<String> CreditosVistaList = new ArrayList<>();
    public static ArrayList<String> TipologiaVistaList = new ArrayList<>();
    public static ArrayList<String> PeriodoVistaList = new ArrayList<>();
    public static ArrayList<String> CalificacionVistaList = new ArrayList<>();
    public static ArrayList<String> EstadoVistaList = new ArrayList<>();    
    
    
    //ResumenCreditos
    public static ArrayList<String> TipologiaCList = new ArrayList<>();
    public static ArrayList<String> ExigidosCList = new ArrayList<>();
    public static ArrayList<String> CursadosCList = new ArrayList<>();
    public static ArrayList<String> AprobadosCList = new ArrayList<>();
    public static ArrayList<String> InscritosCList = new ArrayList<>();
    public static ArrayList<String> PendientesCList = new ArrayList<>();

    //Calificaciones
    public static ArrayList<String> AsignaturaCaList = new ArrayList<>();
    public static ArrayList<String> CodigoCaList = new ArrayList<>();
    public static ArrayList<String> CalificacionCaList = new ArrayList<>();
    public static ArrayList<String> EstadoCaList = new ArrayList<>();    
    
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
    public static ArrayList<String> SalonNomList = new ArrayList<>();
    public static ArrayList<String> ProfeNomList = new ArrayList<>();  
    public static ArrayList<String> MateriaIDList = new ArrayList<>(); 
    public static ArrayList<String> SedeList = new ArrayList<>();     
    
    public static Map<String, JPanel> diaPanelMap = new HashMap<>();
    
    public InformacionAcademica() {
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

        panel_HistoriaAcademica = new javax.swing.JPanel();
        label_HistoriaAcademica = new javax.swing.JLabel();
        panel_Calificaciones = new javax.swing.JPanel();
        label_Calificaciones = new javax.swing.JLabel();
        panel_Horario = new javax.swing.JPanel();
        label_Horario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setPreferredSize(new java.awt.Dimension(1007, 611));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_HistoriaAcademica.setBackground(new java.awt.Color(186, 186, 186));
        panel_HistoriaAcademica.setPreferredSize(new java.awt.Dimension(261, 263));

        label_HistoriaAcademica.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label_HistoriaAcademica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_HistoriaAcademica.setText("HISTORIA ACADÉMICA");
        label_HistoriaAcademica.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        label_HistoriaAcademica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_HistoriaAcademica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label_HistoriaAcademica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_HistoriaAcademicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_HistoriaAcademicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_HistoriaAcademicaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_HistoriaAcademicaLayout = new javax.swing.GroupLayout(panel_HistoriaAcademica);
        panel_HistoriaAcademica.setLayout(panel_HistoriaAcademicaLayout);
        panel_HistoriaAcademicaLayout.setHorizontalGroup(
            panel_HistoriaAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_HistoriaAcademica, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_HistoriaAcademicaLayout.setVerticalGroup(
            panel_HistoriaAcademicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_HistoriaAcademica, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        add(panel_HistoriaAcademica, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 39, -1, -1));

        panel_Calificaciones.setBackground(new java.awt.Color(186, 186, 186));
        panel_Calificaciones.setPreferredSize(new java.awt.Dimension(261, 263));

        label_Calificaciones.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        label_Calificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Calificaciones.setText("MIS CALIFICACIONES");
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
        label_Horario.setText("MI HORARIO");
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

    private void label_HistoriaAcademicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HistoriaAcademicaMouseEntered
        // TODO add your handling code here:
        panel_HistoriaAcademica.setBackground(new Color(239,239,239));
    }//GEN-LAST:event_label_HistoriaAcademicaMouseEntered

    private void label_HistoriaAcademicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HistoriaAcademicaMouseExited
        // TODO add your handling code here:
        panel_HistoriaAcademica.setBackground(new Color(186,186,186));
    }//GEN-LAST:event_label_HistoriaAcademicaMouseExited

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

    private void label_HistoriaAcademicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HistoriaAcademicaMouseClicked
        // TODO add your handling code here:
        //Rellenar las materias que el estudiante ya vio
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);  
        MostrarAsignaturasHistoriaAcad.mostrarAsignatura(nombreBD,ProgramaEstudiante.Id_programa,AsignaturaVistaList);
        MostrarAsignaturasHistoriaAcad.mostrarCodigo(nombreBD,ProgramaEstudiante.Id_programa,CodigoVistaList);        
        MostrarAsignaturasHistoriaAcad.mostrarCreditos(nombreBD, ProgramaEstudiante.Id_programa, CreditosVistaList);
        MostrarAsignaturasHistoriaAcad.mostrarTipologia(nombreBD, ProgramaEstudiante.Id_programa, TipologiaVistaList);
        MostrarAsignaturasHistoriaAcad.mostrarPeriodo(nombreBD, ProgramaEstudiante.Id_programa, PeriodoVistaList);
        MostrarAsignaturasHistoriaAcad.mostrarCalificacion(nombreBD, ProgramaEstudiante.Id_programa, CalificacionVistaList);
        MostrarAsignaturasHistoriaAcad.mostrarEstado(nombreBD, ProgramaEstudiante.Id_programa, EstadoVistaList);
       
        abrirHistoriaAcademica();
        //Agregar las materias al panel para visualizarlas
        for(int i = 0;i< AsignaturaVistaList.size();i++){
            HistoriaAcademicaEstudGUI.agregarPanelNuevoAsignaturas(AsignaturaVistaList.get(i),CodigoVistaList.get(i),CreditosVistaList.get(i),
                    TipologiaVistaList.get(i),PeriodoVistaList.get(i),CalificacionVistaList.get(i),EstadoVistaList.get(i));
        }

    }//GEN-LAST:event_label_HistoriaAcademicaMouseClicked

    private void label_CalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_CalificacionesMouseClicked
        // TODO add your handling code here:
        abrirCalificaciones();        
    }//GEN-LAST:event_label_CalificacionesMouseClicked

    private void label_HorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_HorarioMouseClicked
        // TODO add your handling code here:
        HorarioEstud.mostrarHorarioDia(nombreBD, diaList);     
        HorarioEstud.mostrarHorarioHoraInicio(nombreBD,horaInicioList);
        HorarioEstud.mostrarHorarioHoraFinal(nombreBD,horaFinalList);
        HorarioEstud.mostrarHorarioActividad(nombreBD,actividadList);
        HorarioEstud.mostrarHorarioGrupo(nombreBD,noGrupoList);         
        HorarioEstud.mostrarHorarioSalon(nombreBD,salonList);
        HorarioEstud.mostrarHorarioEdificio(nombreBD,edificioList);        
        HorarioEstud.mostrarHorarioSemestre(nombreBD, semestreList);
        HorarioEstud.mostrarHorarioMateria(nombreBD, materiaList);   
        HorarioEstud.mostrarHorarioEdificioNom(nombreBD,EdifNomList);         
        HorarioEstud.mostrarHorarioSalonNom(nombreBD,SalonNomList);
        HorarioEstud.mostrarHorarioProfeNom(nombreBD,ProfeNomList);
        HorarioEstud.mostrarHorarioMateriaID(nombreBD,MateriaIDList);
        HorarioEstud.mostrarHorarioSede(nombreBD,SedeList);        

        abrirHorario();
        //Agregar las materias al panel para visualizarlas
        // Crear el mapa para mapear días de la semana a los paneles correspondientes
        diaPanelMap.put("Lunes", HorarioEstudGUI.panelLunes);
        diaPanelMap.put("Martes", HorarioEstudGUI.panelMartes);
        diaPanelMap.put("Miércoles", HorarioEstudGUI.panelMiercoles);
        diaPanelMap.put("Jueves", HorarioEstudGUI.panelJueves);
        diaPanelMap.put("Viernes", HorarioEstudGUI.panelViernes);
        diaPanelMap.put("Sábado", HorarioEstudGUI.panelSabado);

        // Iterar sobre la lista de horarios
        for (int i = 0; i < horaInicioList.size(); i++) {
            String dia = diaList.get(i);

            // Verificar si el día existe en el mapa
            if (diaPanelMap.containsKey(dia)) {
                JPanel panel = diaPanelMap.get(dia);
                HorarioEstudGUI.agregarPanelNuevoHorario(horaInicioList.get(i), horaFinalList.get(i), materiaList.get(i),
                        salonList.get(i),edificioList.get(i),EdifNomList.get(i),SalonNomList.get(i),semestreList.get(i),
                        actividadList.get(i),noGrupoList.get(i),ProfeNomList.get(i),MateriaIDList.get(i), SedeList.get(i),panel);
            }
        }

        
    }//GEN-LAST:event_label_HorarioMouseClicked

        public void abrirHistoriaAcademica(){
        HistoriaAcademicaEstudGUI histAcad = new HistoriaAcademicaEstudGUI();   
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
        HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa);

        histAcad.labelIDHistoria.setText(HistoriaAcademica.ID_historia_academica);
        histAcad.labelEstado.setText(HistoriaAcademica.Estado);
        histAcad.label_PAPA.setText(HistoriaAcademica.PAPA);
        histAcad.label_PAPPI.setText(HistoriaAcademica.PAPPI);
        histAcad.labelPromedioAcumulado.setText(HistoriaAcademica.Promedio_acumulado);
        histAcad.labelPorcentajeAvance.setText(HistoriaAcademica.Porcentaje_Avance);
        histAcad.labelCreditosAdicionales.setText(HistoriaAcademica.Creditos_Adici);
        histAcad.labelCupoCreditos.setText(HistoriaAcademica.Cupo_Creditos);
        histAcad.labelCreditosDisponibles.setText(HistoriaAcademica.Creditos_Dispo);
        histAcad.labelCreditosDoble.setText(HistoriaAcademica.Creditos_Doble);
        
        histAcad.label_Carrera.setText(ProgramaEstudiante.Nombre_programa);
        histAcad.label_Facultad.setText(ProgramaEstudiante.Nombre_facultad);
       
        histAcad.comboBox_PlanEstudios.removeAllItems();
        histAcad.comboBox_PlanEstudios.addItem(ProgramaEstudiante.Id_programa + "   " + ProgramaEstudiante.Nombre_programa);
        
        
        //ResumenCreditos
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);
        ResumenCreditos.mostrarExigidos(nombreBD,ProgramaEstudiante.Id_programa, ExigidosCList);
        ResumenCreditos.mostrarAprobados(nombreBD,ProgramaEstudiante.Id_programa, AprobadosCList);
        ResumenCreditos.mostrarPendientes(nombreBD,ProgramaEstudiante.Id_programa, PendientesCList);
        ResumenCreditos.mostrarInscritos(nombreBD,ProgramaEstudiante.Id_programa, InscritosCList);
        ResumenCreditos.mostrarCursados(nombreBD,ProgramaEstudiante.Id_programa, CursadosCList);        
        
 
            //Exigidos
            histAcad.labelExigidos1.setText(ExigidosCList.get(2));
            //histAcad.labelExigidos2.setText(ExigidosCList.get(1));
            histAcad.labelExigidos3.setText(ExigidosCList.get(1));
            histAcad.labelExigidos4.setText(ExigidosCList.get(0));
            //histAcad.labelExigidos5.setText(ExigidosCList.get(4));
            //histAcad.labelExigidos6.setText(ExigidosCList.get(5));
            histAcad.labelExigidos7.setText(ExigidosCList.get(3));
            //histAcad.labelExigidos8.setText(ExigidosCList.get(7));
            histAcad.labelExigidos9.setText(ExigidosCList.get(4)); 
            
            //Aprobados
            histAcad.labelAprobados1.setText(AprobadosCList.get(2));
            //histAcad.labelAprobados2.setText(AprobadosCList.get(1));
            histAcad.labelAprobados3.setText(AprobadosCList.get(1));
            histAcad.labelAprobados4.setText(AprobadosCList.get(0));
            //histAcad.labelAprobados5.setText(AprobadosCList.get(4));
            //histAcad.labelAprobados6.setText(AprobadosCList.get(5));
            histAcad.labelAprobados7.setText(AprobadosCList.get(3));
            //histAcad.labelAprobados8.setText(AprobadosCList.get(7));
            histAcad.labelAprobados9.setText(AprobadosCList.get(4));

            //Pendientes
            // Cambiar los nombres de los componentes y la lista
            histAcad.labelPendientes1.setText(PendientesCList.get(2));
            //histAcad.labelPendientes2.setText(PendienteCList.get(1));
            histAcad.labelPendientes3.setText(PendientesCList.get(1));
            histAcad.labelPendientes4.setText(PendientesCList.get(0));
            //histAcad.labelPendientes5.setText(PendienteCList.get(4));
            //histAcad.labelPendientes6.setText(PendienteCList.get(5));
            histAcad.labelPendientes7.setText(PendientesCList.get(3));
            //histAcad.labelPendientes8.setText(PendienteCList.get(7));
            histAcad.labelPendientes9.setText(PendientesCList.get(4));

            //Inscritos
            // Cambiar los nombres de los componentes y la lista
            histAcad.labelInscritos1.setText(InscritosCList.get(2));
            //histAcad.labelInscritos2.setText(InscritosCList.get(1));
            histAcad.labelInscritos3.setText(InscritosCList.get(1));
            histAcad.labelInscritos4.setText(InscritosCList.get(0));
            //histAcad.labelInscritos5.setText(InscritosCList.get(4));
            //histAcad.labelInscritos6.setText(InscritosCList.get(5));
            histAcad.labelInscritos7.setText(InscritosCList.get(3));
            //histAcad.labelInscritos8.setText(InscritosCList.get(7));
            histAcad.labelInscritos9.setText(InscritosCList.get(4));
            
            //Cursados
            // Cambiar los nombres de los componentes y la lista
            histAcad.labelCursados1.setText(CursadosCList.get(2));
            //histAcad.labelCursados2.setText(CursadosCList.get(1));
            histAcad.labelCursados3.setText(CursadosCList.get(1));
            histAcad.labelCursados4.setText(CursadosCList.get(0));
            //histAcad.labelCursados5.setText(CursadosCList.get(4));
            //histAcad.labelCursados6.setText(CursadosCList.get(5));
            histAcad.labelCursados7.setText(CursadosCList.get(3));
            //histAcad.labelCursados8.setText(CursadosCList.get(7));
            histAcad.labelCursados9.setText(CursadosCList.get(4));
            
        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalEstudGUI.mostrarPanel(histAcad);     
        }
        
        public void abrirCalificaciones(){
        CalificacionesEstudGUI calificaciones = new CalificacionesEstudGUI();   
        
        String Periodo = calificaciones.comboboxPeriodo.getSelectedItem().toString();
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
        HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa);
        Calificaciones.mostrarAsignatura(nombreBD, ProgramaEstudiante.Nombre_programa,Periodo, AsignaturaCaList);
        Calificaciones.mostrarCalificacion(nombreBD, ProgramaEstudiante.Nombre_programa,Periodo, CalificacionCaList);
        Calificaciones.mostrarCodigo(nombreBD, ProgramaEstudiante.Nombre_programa,Periodo, CodigoCaList);
        Calificaciones.mostrarEstado(nombreBD, ProgramaEstudiante.Nombre_programa,Periodo, EstadoCaList);        
        calificaciones.labelCarrera.setText(ProgramaEstudiante.Nombre_programa);
        //calificaciones.labelMateria1.setText(AsignaturaCaList.get(0));
            System.out.println(Periodo);
        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalEstudGUI.mostrarPanel(calificaciones);     
        } 
                
        public void abrirHorario(){
        HorarioEstudGUI horario = new HorarioEstudGUI();   
        
        ProgramaEstudiante.mostrarProgramaEstudiante(nombreBD);       
        //HistoriaAcademica.mostrarHistoria_Academica("Academico",ProgramaEstudiante.Id_programa);
        
        horario.labelCarrera.setText(ProgramaEstudiante.Nombre_programa);
            
        // --------------------------------------------------------------------------------------------------

        PantallaPrincipalEstudGUI.mostrarPanel(horario);     
        }       
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_Calificaciones;
    private javax.swing.JLabel label_HistoriaAcademica;
    private javax.swing.JLabel label_Horario;
    private javax.swing.JPanel panel_Calificaciones;
    private javax.swing.JPanel panel_HistoriaAcademica;
    private javax.swing.JPanel panel_Horario;
    // End of variables declaration//GEN-END:variables
}
