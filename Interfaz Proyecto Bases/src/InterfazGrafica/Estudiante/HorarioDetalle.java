/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica.Estudiante;

/**
 *
 * @author krist
 */
public class HorarioDetalle extends javax.swing.JFrame {

    /**
     * Creates new form HorarioDetalle
     */
    public HorarioDetalle() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelAtras = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelNombreEdif = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelCarrera = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelSalon = new javax.swing.JLabel();
        labelNombreSal = new javax.swing.JLabel();
        labelAño = new javax.swing.JLabel();
        labelGrupo = new javax.swing.JLabel();
        labelNombreProf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(880, 440));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));
        jPanel1.setMaximumSize(new java.awt.Dimension(880, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 440));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("0121512");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("MATERIA 1");

        jPanel2.setBackground(new java.awt.Color(145, 179, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(212, 55));

        labelAtras.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelAtras.setForeground(new java.awt.Color(255, 255, 255));
        labelAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAtras.setText("Atras");
        labelAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAtras.setMaximumSize(new java.awt.Dimension(212, 55));
        labelAtras.setMinimumSize(new java.awt.Dimension(212, 55));
        labelAtras.setPreferredSize(new java.awt.Dimension(212, 55));
        labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAtrasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator1.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel4.setText("Fecha/Hora:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel5.setText("Lugar:");

        labelNombreEdif.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelNombreEdif.setText("NombreEdificio");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel7.setText("Período:");

        jSeparator2.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator2.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel8.setText("Plan:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel9.setText("Actividad:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel10.setText("Grupo:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel11.setText("Profesor");

        labelCarrera.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelCarrera.setText("CARRERA");

        labelFecha.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelFecha.setText("Fecha");

        labelHora.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelHora.setText("Hora");

        labelSalon.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelSalon.setText("EdifSalon");

        labelNombreSal.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelNombreSal.setText("NombreSalon");

        labelAño.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelAño.setText("2023-1S");

        labelGrupo.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelGrupo.setText("Grupo 5 ( )");

        labelNombreProf.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        labelNombreProf.setText("NombreProfesor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNombreProf, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAño)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelSalon)
                                .addGap(18, 18, 18)
                                .addComponent(labelNombreSal))
                            .addComponent(labelNombreEdif))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelFecha)
                    .addComponent(labelHora))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelSalon)
                    .addComponent(labelNombreSal))
                .addGap(6, 6, 6)
                .addComponent(labelNombreEdif)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelAño))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelNombreProf))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAtrasMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_labelAtrasMouseClicked

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
            java.util.logging.Logger.getLogger(HorarioDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorarioDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorarioDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorarioDetalle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorarioDetalle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAtras;
    private javax.swing.JLabel labelAño;
    public javax.swing.JLabel labelCarrera;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelGrupo;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelNombreEdif;
    private javax.swing.JLabel labelNombreProf;
    private javax.swing.JLabel labelNombreSal;
    private javax.swing.JLabel labelSalon;
    // End of variables declaration//GEN-END:variables
}
