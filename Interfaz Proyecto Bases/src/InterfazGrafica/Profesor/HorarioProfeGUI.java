/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Profesor;

import InterfazGrafica.Estudiante.*;
import static InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI.colorIndex;
import static InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI.panelColors;
import static InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI.panelList;
import static InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI.panel_Asignaturas;
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
public class HorarioProfeGUI extends javax.swing.JPanel {

    /**
     * Creates new form HorarioEstudianteGUI
     */
    
    public static ArrayList<JPanel> panelList;
    
    public HorarioProfeGUI() {
        
        initComponents();
        panelList = new ArrayList<>();
        
        AgregarPanel(panelLunes,scrollpanelLunes);
        AgregarPanel(panelMartes,scrollpanelMartes);
        AgregarPanel(panelMiercoles,scrollpanelMiercoles);
        AgregarPanel(panelJueves,scrollpanelJueves);
        AgregarPanel(panelViernes,scrollpanelViernes);
        AgregarPanel(panelSabado,scrollpanelSabado);        
     
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        panelLunes = new javax.swing.JPanel();
        scrollpanelLunes = new javax.swing.JScrollPane();
        panelMartes = new javax.swing.JPanel();
        scrollpanelMartes = new javax.swing.JScrollPane();
        panelMiercoles = new javax.swing.JPanel();
        scrollpanelMiercoles = new javax.swing.JScrollPane();
        panelJueves = new javax.swing.JPanel();
        scrollpanelJueves = new javax.swing.JScrollPane();
        panelViernes = new javax.swing.JPanel();
        scrollpanelViernes = new javax.swing.JScrollPane();
        panelSabado = new javax.swing.JPanel();
        scrollpanelSabado = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(221, 221, 221));
        setPreferredSize(new java.awt.Dimension(1007, 611));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Horario");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 26));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(972, 2));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LUNES");
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 28));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MARTES");
        jLabel3.setPreferredSize(new java.awt.Dimension(130, 28));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MIÉRCOLES");
        jLabel4.setPreferredSize(new java.awt.Dimension(130, 28));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("JUEVES");
        jLabel5.setPreferredSize(new java.awt.Dimension(130, 28));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VIERNES");
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 28));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 19)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SÁBADO");
        jLabel7.setPreferredSize(new java.awt.Dimension(130, 28));

        jSeparator2.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator2.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jSeparator2.setPreferredSize(new java.awt.Dimension(2, 320));

        jSeparator3.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator3.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jSeparator3.setPreferredSize(new java.awt.Dimension(2, 320));

        jSeparator4.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator4.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jSeparator4.setPreferredSize(new java.awt.Dimension(2, 320));

        jSeparator5.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator5.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jSeparator5.setPreferredSize(new java.awt.Dimension(2, 320));

        jSeparator6.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator6.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jSeparator6.setPreferredSize(new java.awt.Dimension(2, 320));

        panelLunes.setBackground(new java.awt.Color(221, 221, 221));
        panelLunes.setPreferredSize(new java.awt.Dimension(130, 260));
        panelLunes.setLayout(new javax.swing.BoxLayout(panelLunes, javax.swing.BoxLayout.LINE_AXIS));
        panelLunes.add(scrollpanelLunes);

        panelMartes.setBackground(new java.awt.Color(221, 221, 221));
        panelMartes.setPreferredSize(new java.awt.Dimension(130, 100));
        panelMartes.setLayout(new javax.swing.BoxLayout(panelMartes, javax.swing.BoxLayout.LINE_AXIS));
        panelMartes.add(scrollpanelMartes);

        panelMiercoles.setBackground(new java.awt.Color(221, 221, 221));
        panelMiercoles.setPreferredSize(new java.awt.Dimension(130, 100));
        panelMiercoles.setLayout(new javax.swing.BoxLayout(panelMiercoles, javax.swing.BoxLayout.LINE_AXIS));
        panelMiercoles.add(scrollpanelMiercoles);

        panelJueves.setBackground(new java.awt.Color(221, 221, 221));
        panelJueves.setPreferredSize(new java.awt.Dimension(130, 100));
        panelJueves.setLayout(new javax.swing.BoxLayout(panelJueves, javax.swing.BoxLayout.LINE_AXIS));
        panelJueves.add(scrollpanelJueves);

        panelViernes.setBackground(new java.awt.Color(221, 221, 221));
        panelViernes.setPreferredSize(new java.awt.Dimension(130, 100));
        panelViernes.setLayout(new javax.swing.BoxLayout(panelViernes, javax.swing.BoxLayout.LINE_AXIS));
        panelViernes.add(scrollpanelViernes);

        panelSabado.setBackground(new java.awt.Color(221, 221, 221));
        panelSabado.setPreferredSize(new java.awt.Dimension(130, 100));
        panelSabado.setLayout(new javax.swing.BoxLayout(panelSabado, javax.swing.BoxLayout.LINE_AXIS));
        panelSabado.add(scrollpanelSabado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(panelSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

        public static void agregarPanelNuevoHorario(String hora, String horaF, String materia,String salon,String edificio, JPanel panelDia) {
        HorarioProfePanel panel = new HorarioProfePanel();
        panel.setPreferredSize(new Dimension(130, 45));
        panel.setMaximumSize(new Dimension(130,45));
        panel.setMinimumSize(new Dimension(130,45));
        panel.setBackground(new Color(221,221,221));

        panel.labelHorario.setText(hora +":00  "+ materia);
        
        panel.labelHoraInicio.setText(hora +":00H");
        panel.labelHoraFinal.setText(horaF + ":00H");
        
        panel.labelMateria.setText(materia);
        
        panel.labelSalon.setText(salon);
        panel.labelEdificio.setText(edificio);
        /*panel.labelEdifNom.setText(edificioNom);
        
        panel.labelPeriodo.setText(semestre);
        panel.labelActividad.setText(actividad);
        
        panel.labelGrupo.setText("Grupo " + noGrupo);
        panel.labelMateriaID.setText(materiaID);
        panel.labelSede.setText("SEDE " + sede);*/
        
        panelList.add(panel);
        panelDia.add(panel);
        panelDia.revalidate();
        panelDia.repaint();
    }
        
        public void AgregarPanel(JPanel panel, JScrollPane scrollpanel){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        scrollpanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollpanel, BorderLayout.CENTER);   
            
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public static javax.swing.JPanel panelJueves;
    public static javax.swing.JPanel panelLunes;
    public static javax.swing.JPanel panelMartes;
    public static javax.swing.JPanel panelMiercoles;
    public static javax.swing.JPanel panelSabado;
    public static javax.swing.JPanel panelViernes;
    private javax.swing.JScrollPane scrollpanelJueves;
    private javax.swing.JScrollPane scrollpanelLunes;
    private javax.swing.JScrollPane scrollpanelMartes;
    private javax.swing.JScrollPane scrollpanelMiercoles;
    private javax.swing.JScrollPane scrollpanelSabado;
    private javax.swing.JScrollPane scrollpanelViernes;
    // End of variables declaration//GEN-END:variables
}
