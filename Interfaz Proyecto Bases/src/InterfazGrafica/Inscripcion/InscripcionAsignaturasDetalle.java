/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InterfazGrafica.Inscripcion;

/**
 *
 * @author krist
 */
public class InscripcionAsignaturasDetalle extends javax.swing.JPanel {

    /**
     * Creates new form InscripcionAsignaturas
     */
    public InscripcionAsignaturasDetalle() {
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

        jPanel1 = new javax.swing.JPanel();
        labelNombreMateria = new javax.swing.JLabel();
        labelMateriaID = new javax.swing.JLabel();
        labelCuposLibres = new javax.swing.JLabel();
        labelMateriaID2 = new javax.swing.JLabel();
        labelMateriaID3 = new javax.swing.JLabel();
        labelCreditos = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(1160, 50));
        setMinimumSize(new java.awt.Dimension(1160, 50));
        setPreferredSize(new java.awt.Dimension(1160, 50));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(145, 179, 59));
        jPanel1.setMaximumSize(new java.awt.Dimension(4, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(4, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(4, 46));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

        labelNombreMateria.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelNombreMateria.setText("Nombre Asignatura");
        add(labelNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 6, 260, -1));

        labelMateriaID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        labelMateriaID.setText("Nombre Asignatura");
        add(labelMateriaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 6, -1, -1));

        labelCuposLibres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCuposLibres.setText("99");
        add(labelCuposLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 31, -1, -1));

        labelMateriaID2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelMateriaID2.setText("Cupos libres:");
        add(labelMateriaID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 31, -1, -1));

        labelMateriaID3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelMateriaID3.setText("Créditos");
        add(labelMateriaID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 0, -1, -1));

        labelCreditos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCreditos.setText("6");
        add(labelCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 23, -1, -1));

        jCheckBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 221, 211)));
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 6, 36, 32));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labelCreditos;
    public javax.swing.JLabel labelCuposLibres;
    public javax.swing.JLabel labelMateriaID;
    private javax.swing.JLabel labelMateriaID2;
    private javax.swing.JLabel labelMateriaID3;
    public javax.swing.JLabel labelNombreMateria;
    // End of variables declaration//GEN-END:variables
}