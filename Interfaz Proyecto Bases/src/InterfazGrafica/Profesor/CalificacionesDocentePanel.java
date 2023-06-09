/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica.Profesor;

import Data.ListaClase;
import InterfazGrafica.Estudiante.*;
import static InterfazGrafica.Profesor.RolDocente.cedulaClaseList;
import static InterfazGrafica.Profesor.RolDocente.nombreClaseList;
import static InterfazGrafica.Profesor.RolDocente.textNota1;
import static InterfazGrafica.Profesor.RolDocente.textNota2;
import static InterfazGrafica.Profesor.RolDocente.textNota3;
import static InterfazGrafica.Profesor.RolDocente.textPorcent1;
import static InterfazGrafica.Profesor.RolDocente.textPorcent2;
import static InterfazGrafica.Profesor.RolDocente.textPorcent3;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author krist
 */
public class CalificacionesDocentePanel extends javax.swing.JFrame {

    /**
     * Creates new form HorarioDetalle
     */
    public String nombreBD = "Academico";
    public static ArrayList<String> nombreClaseList = new ArrayList<>();
    public static ArrayList<String> cedulaClaseList = new ArrayList<>(); 
    
    public static String[] DtextNota1 = new String[15];
    public static String[] DtextNota2 = new String[15];
    public static String[] DtextNota3 = new String[15];   
    public static String[] DtextPorcent1 = new String[15]; 
    public static String[] DtextPorcent2 = new String[15]; 
    public static String[] DtextPorcent3 = new String[15];
    
    public CalificacionesDocentePanel() {
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
        labelCedula = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        panelGuardar = new javax.swing.JPanel();
        labelGuardar = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        labelAtras = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CtextNota1 = new javax.swing.JTextField();
        CtextPorcent1 = new javax.swing.JTextField();
        CtextNota2 = new javax.swing.JTextField();
        CtextPorcent3 = new javax.swing.JTextField();
        CtextNota3 = new javax.swing.JTextField();
        CtextPorcent2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));
        jPanel1.setMaximumSize(new java.awt.Dimension(880, 440));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCedula.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelCedula.setText("1000874569");
        jPanel1.add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 15, -1, -1));

        labelNombre.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelNombre.setText("ALV");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 15, -1, -1));

        panelGuardar.setBackground(new java.awt.Color(145, 179, 59));
        panelGuardar.setPreferredSize(new java.awt.Dimension(212, 55));

        labelGuardar.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelGuardar.setForeground(new java.awt.Color(255, 255, 255));
        labelGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuardar.setText("Guardar");
        labelGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelGuardar.setMaximumSize(new java.awt.Dimension(212, 55));
        labelGuardar.setMinimumSize(new java.awt.Dimension(212, 55));
        labelGuardar.setPreferredSize(new java.awt.Dimension(212, 55));
        labelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelGuardarLayout = new javax.swing.GroupLayout(panelGuardar);
        panelGuardar.setLayout(panelGuardarLayout);
        panelGuardarLayout.setHorizontalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE)
        );
        panelGuardarLayout.setVerticalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 310, 123, 46));

        panelAtras.setBackground(new java.awt.Color(145, 179, 59));
        panelAtras.setPreferredSize(new java.awt.Dimension(212, 55));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAtrasLayout = new javax.swing.GroupLayout(panelAtras);
        panelAtras.setLayout(panelAtrasLayout);
        panelAtrasLayout.setHorizontalGroup(
            panelAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE)
        );
        panelAtrasLayout.setVerticalGroup(
            panelAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 385, 123, 46));

        jSeparator1.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator1.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 47, 826, 2));

        jSeparator2.setBackground(new java.awt.Color(186, 186, 186));
        jSeparator2.setForeground(new java.awt.Color(186, 186, 186));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 186, 186)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 232, 826, 2));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOTA 1");
        jLabel1.setPreferredSize(new java.awt.Dimension(76, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 77, 100, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("%");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 77, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOTA 2");
        jLabel3.setPreferredSize(new java.awt.Dimension(76, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 77, 100, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("%");
        jLabel4.setMaximumSize(new java.awt.Dimension(30, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(30, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 77, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NOTA 3");
        jLabel5.setPreferredSize(new java.awt.Dimension(76, 40));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 77, 100, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("%");
        jLabel6.setMaximumSize(new java.awt.Dimension(30, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(30, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(30, 40));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        CtextNota1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        CtextNota1.setText("4.5");
        CtextNota1.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(CtextNota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 129, 76, -1));

        CtextPorcent1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        CtextPorcent1.setText("30");
        CtextPorcent1.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(CtextPorcent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 129, -1, -1));

        CtextNota2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        CtextNota2.setText("4.0");
        CtextNota2.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(CtextNota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 129, 76, -1));

        CtextPorcent3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        CtextPorcent3.setText("50");
        CtextPorcent3.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(CtextPorcent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        CtextNota3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        CtextNota3.setText("5.0");
        CtextNota3.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel1.add(CtextNota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 129, 76, -1));

        CtextPorcent2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        CtextPorcent2.setText("20");
        CtextPorcent2.setPreferredSize(new java.awt.Dimension(32, 30));
        jPanel1.add(CtextPorcent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 129, -1, -1));

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

    private void labelAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAtrasMouseEntered
        // TODO add your handling code here:
        panelAtras.setBackground(new Color(175,199,107));
    }//GEN-LAST:event_labelAtrasMouseEntered

    private void labelAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAtrasMouseExited
        // TODO add your handling code here:
        panelAtras.setBackground(new Color(145,179,59));        
    }//GEN-LAST:event_labelAtrasMouseExited

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
        // TODO add your handling code here:
        
        ListaClase.mostrarCedula(nombreBD,cedulaClaseList);
        ListaClase.mostrarNombre(nombreBD,nombreClaseList);

        //Agregar las materias al panel para visualizarlas
        this.dispose();  
        
        for (int i = 0; i < 10; i++) {
            if(labelNombre.getText().compareTo(nombreClaseList.get(i)) == 0){
                textNota1[i] = CtextNota1.getText();
                textNota2[i] = CtextNota2.getText();
                textNota3[i] = CtextNota3.getText();
                textPorcent1[i] = CtextPorcent1.getText();
                textPorcent2[i] = CtextPorcent2.getText();
                textPorcent3[i] = CtextPorcent3.getText();
               
            }else{
            }
        }  
        
        for(int i = 0;i<10;i++){
            CalificacionesDocente.agregarPanelNuevoListaConNota(cedulaClaseList.get(i),nombreClaseList.get(i),
                    textNota1[i],textPorcent1[i],
                    textNota2[i],textPorcent2[i],
                    textNota3[i],textPorcent3[i]);
        }    

   
    }//GEN-LAST:event_labelGuardarMouseClicked

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        // TODO add your handling code here:
        panelGuardar.setBackground(new Color(175,199,107));        
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        // TODO add your handling code here:
        panelGuardar.setBackground(new Color(145,179,59));          
    }//GEN-LAST:event_labelGuardarMouseExited
        
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
            java.util.logging.Logger.getLogger(CalificacionesDocentePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalificacionesDocentePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalificacionesDocentePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalificacionesDocentePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalificacionesDocentePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CtextNota1;
    public javax.swing.JTextField CtextNota2;
    public javax.swing.JTextField CtextNota3;
    public javax.swing.JTextField CtextPorcent1;
    public javax.swing.JTextField CtextPorcent2;
    public javax.swing.JTextField CtextPorcent3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAtras;
    public javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelGuardar;
    public javax.swing.JLabel labelNombre;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelGuardar;
    // End of variables declaration//GEN-END:variables
}
