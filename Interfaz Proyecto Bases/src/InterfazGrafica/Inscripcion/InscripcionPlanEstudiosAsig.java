/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Inscripcion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author krist
 */
public class InscripcionPlanEstudiosAsig extends javax.swing.JPanel {

    /**
     * Creates new form PlanEstudiosAsignatura
     */
    public static ArrayList<JPanel> panelList;    
    public InscripcionPlanEstudiosAsig() {
        initComponents();
        panelList = new ArrayList<>();        
        AgregarPanel(panelDisciplinarOptativa, scrollpanelDisciplinar); 
        AgregarPanel(panelFundObligatoria, scrollpanelFundObligatoria);   
        AgregarPanel(panelFundOptativa, scrollpanelFundOptativa);    
        AgregarPanel(panelDisciplinarObligatoria, scrollpanelDisciplinarObligatoria);            
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelDisciplinarOptativa = new javax.swing.JPanel();
        scrollpanelDisciplinar = new javax.swing.JScrollPane();
        panelFundObligatoria = new javax.swing.JPanel();
        scrollpanelFundObligatoria = new javax.swing.JScrollPane();
        panelFundOptativa = new javax.swing.JPanel();
        scrollpanelFundOptativa = new javax.swing.JScrollPane();
        panelDisciplinarObligatoria = new javax.swing.JPanel();
        scrollpanelDisciplinarObligatoria = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelCreditosSeleccionados = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setPreferredSize(new java.awt.Dimension(1350, 4000));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1350, 4000));

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));
        jPanel1.setPreferredSize(new java.awt.Dimension(2650, 4000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selección de Plan de Estudio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(1160, 87));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione el plan de estudios del cual quiere hacer la inscripción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(676, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 75, -1, 60));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20101 ESTADÍSCTICA" }));
        jComboBox1.setBorder(null);
        jComboBox1.setPreferredSize(new java.awt.Dimension(430, 32));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 155, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel3.setText("Selección de asignaturas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 240, -1, -1));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setPreferredSize(new java.awt.Dimension(1160, 111));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Seleccione las asignaturas que desea cursar de la lista disponible para cada componente (Disciplinar, Fundamentación, Nivelación, etc.) Seleccione la ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("casilla del costado derecho para la asignatura que desea inscribir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel6.setText("Disciplinar Obligatoria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 2516, -1, -1));

        panelDisciplinarOptativa.setBackground(new java.awt.Color(230, 230, 230));
        panelDisciplinarOptativa.setMaximumSize(new java.awt.Dimension(1160, 600));
        panelDisciplinarOptativa.setMinimumSize(new java.awt.Dimension(1160, 600));
        panelDisciplinarOptativa.setPreferredSize(new java.awt.Dimension(1160, 600));
        panelDisciplinarOptativa.setLayout(new javax.swing.BoxLayout(panelDisciplinarOptativa, javax.swing.BoxLayout.LINE_AXIS));
        panelDisciplinarOptativa.add(scrollpanelDisciplinar);

        jPanel1.add(panelDisciplinarOptativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 517, -1, -1));

        panelFundObligatoria.setBackground(new java.awt.Color(230, 230, 230));
        panelFundObligatoria.setMaximumSize(new java.awt.Dimension(1160, 600));
        panelFundObligatoria.setMinimumSize(new java.awt.Dimension(1160, 600));
        panelFundObligatoria.setPreferredSize(new java.awt.Dimension(1160, 600));
        panelFundObligatoria.setLayout(new javax.swing.BoxLayout(panelFundObligatoria, javax.swing.BoxLayout.LINE_AXIS));
        panelFundObligatoria.add(scrollpanelFundObligatoria);

        jPanel1.add(panelFundObligatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 1200, -1, -1));

        panelFundOptativa.setBackground(new java.awt.Color(230, 230, 230));
        panelFundOptativa.setMaximumSize(new java.awt.Dimension(1160, 600));
        panelFundOptativa.setMinimumSize(new java.awt.Dimension(1160, 600));
        panelFundOptativa.setPreferredSize(new java.awt.Dimension(1160, 600));
        panelFundOptativa.setLayout(new javax.swing.BoxLayout(panelFundOptativa, javax.swing.BoxLayout.LINE_AXIS));
        panelFundOptativa.add(scrollpanelFundOptativa);

        jPanel1.add(panelFundOptativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 1883, -1, -1));

        panelDisciplinarObligatoria.setBackground(new java.awt.Color(230, 230, 230));
        panelDisciplinarObligatoria.setMaximumSize(new java.awt.Dimension(1160, 600));
        panelDisciplinarObligatoria.setMinimumSize(new java.awt.Dimension(1160, 600));
        panelDisciplinarObligatoria.setPreferredSize(new java.awt.Dimension(1160, 600));
        panelDisciplinarObligatoria.setLayout(new javax.swing.BoxLayout(panelDisciplinarObligatoria, javax.swing.BoxLayout.LINE_AXIS));
        panelDisciplinarObligatoria.add(scrollpanelDisciplinarObligatoria);

        jPanel1.add(panelDisciplinarObligatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 2566, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel7.setText("Disciplinar Optativa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 482, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel8.setText("Fund. Obligatoria");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel9.setText("Fund. Optativa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 1838, -1, -1));

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));
        jPanel4.setPreferredSize(new java.awt.Dimension(1160, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCreditosSeleccionados.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        labelCreditosSeleccionados.setText("20");
        jPanel4.add(labelCreditosSeleccionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 21, -1, -1));

        jPanel5.setBackground(new java.awt.Color(145, 179, 59));
        jPanel5.setPreferredSize(new java.awt.Dimension(3, 35));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 15, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Seleccionados");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 35, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Créditos");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 15, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1073, 410, 190, 70));

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

        public static void agregarPanelNuevoAsignaturaDisciplinarOptativa(String materia , String tipo, String credito) {
        InscripcionAsignaturasDetalle panel = new InscripcionAsignaturasDetalle();
        panel.setPreferredSize(new Dimension(1160, 50));
        panel.setMaximumSize(new Dimension(1160,50));
        panel.setMinimumSize(new Dimension(1160,50));


        panel.labelNombreMateria.setText(materia);
        panel.labelMateriaID.setText(tipo);
        panel.labelCreditos.setText(credito);

        panelList.add(panel);
        panelDisciplinarOptativa.add(panel);
        panelDisciplinarOptativa.revalidate();
        panelDisciplinarOptativa.repaint();
    }      
        public static void agregarPanelNuevoAsignaturasFundObligatoria(String materia , String tipo, String credito) {
        InscripcionAsignaturasDetalle panel = new InscripcionAsignaturasDetalle();
        panel.setPreferredSize(new Dimension(1160, 50));
        panel.setMaximumSize(new Dimension(1160,50));
        panel.setMinimumSize(new Dimension(1160,50));


        panel.labelNombreMateria.setText(materia);
        panel.labelMateriaID.setText(tipo);
        panel.labelCreditos.setText(credito);

        panelList.add(panel);
        panelFundObligatoria.add(panel);
        panelFundObligatoria.revalidate();
        panelFundObligatoria.repaint();
    }  
        public static void agregarPanelNuevoAsignaturasFundOptativa(String materia , String tipo, String credito) {
        InscripcionAsignaturasDetalle panel = new InscripcionAsignaturasDetalle();
        panel.setPreferredSize(new Dimension(1160, 50));
        panel.setMaximumSize(new Dimension(1160,50));
        panel.setMinimumSize(new Dimension(1160,50));


        panel.labelNombreMateria.setText(materia);
        panel.labelMateriaID.setText(tipo);
        panel.labelCreditos.setText(credito);

        panelList.add(panel);
        panelFundOptativa.add(panel);
        panelFundOptativa.revalidate();
        panelFundOptativa.repaint();
    }  
        
        public static void agregarPanelNuevoAsignaturasDisciplinarObligatoria(String materia , String tipo, String credito) {
        InscripcionAsignaturasDetalle panel = new InscripcionAsignaturasDetalle();
        panel.setPreferredSize(new Dimension(1160, 50));
        panel.setMaximumSize(new Dimension(1160,50));
        panel.setMinimumSize(new Dimension(1160,50));


        panel.labelNombreMateria.setText(materia);
        panel.labelMateriaID.setText(tipo);
        panel.labelCreditos.setText(credito);


        panelList.add(panel);
        panelDisciplinarObligatoria.add(panel);
        panelDisciplinarObligatoria.revalidate();
        panelDisciplinarObligatoria.repaint();
    }  
        
        public void AgregarPanel(JPanel panel, JScrollPane scrollpanel){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        scrollpanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollpanel, BorderLayout.CENTER);   
            
        } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCreditosSeleccionados;
    private static javax.swing.JPanel panelDisciplinarObligatoria;
    private static javax.swing.JPanel panelDisciplinarOptativa;
    private static javax.swing.JPanel panelFundObligatoria;
    private static javax.swing.JPanel panelFundOptativa;
    private javax.swing.JScrollPane scrollpanelDisciplinar;
    private javax.swing.JScrollPane scrollpanelDisciplinarObligatoria;
    private javax.swing.JScrollPane scrollpanelFundObligatoria;
    private javax.swing.JScrollPane scrollpanelFundOptativa;
    // End of variables declaration//GEN-END:variables
}
