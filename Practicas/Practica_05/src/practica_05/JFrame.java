/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_05;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author terry
 */
public class JFrame extends javax.swing.JFrame {
    Lista grupo1 = new Lista();
    Lista grupo2 = new Lista();
    /**
     * Creates new form JFrame
     */
    public JFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabMascota = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextNoCtrl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jButInsBegin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabAlumnos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabNoAlumnos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButEliSegundo = new javax.swing.JButton();
        jButEliMenosPrimYUlt = new javax.swing.JButton();
        jButCompPrimYUlt = new javax.swing.JButton();
        jButEliminarSegFrame = new javax.swing.JButton();
        jButEliMenosPrimYUltFrame = new javax.swing.JButton();
        jButCompPrimYUltFrame = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButVisualizarGpo = new javax.swing.JButton();
        jButInsEnd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextCalif = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabMascota.setText("ALUMNOS");

        jLabel2.setText("No. Ctrl");

        jLabel1.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jLabel7.setText("Grupo");

        buttonGroup2.add(rb2);
        rb2.setText("Grupo 2");

        buttonGroup2.add(rb1);
        rb1.setSelected(true);
        rb1.setText("Grupo 1");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        jButInsBegin.setText("InsBegin");
        jButInsBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInsBeginActionPerformed(evt);
            }
        });

        jTabAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabAlumnos);

        jLabel8.setText("Número de mascotas en cada grupo");

        jLabel9.setText("GRUPO");

        jTabNoAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Grupo 1", "Grupo 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTabNoAlumnos);
        if (jTabNoAlumnos.getColumnModel().getColumnCount() > 0) {
            jTabNoAlumnos.getColumnModel().getColumn(0).setResizable(false);
            jTabNoAlumnos.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel10.setText("COMPETENCIA 3");

        jButEliSegundo.setText("ELI SEGUNDO");
        jButEliSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliSegundoActionPerformed(evt);
            }
        });

        jButEliMenosPrimYUlt.setText("ELI MENOS PRIM Y ULT");
        jButEliMenosPrimYUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliMenosPrimYUltActionPerformed(evt);
            }
        });

        jButCompPrimYUlt.setText("COMP PRIM Y ULT");
        jButCompPrimYUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCompPrimYUltActionPerformed(evt);
            }
        });

        jButEliminarSegFrame.setText("ELI SEGUNDO");
        jButEliminarSegFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliminarSegFrameActionPerformed(evt);
            }
        });

        jButEliMenosPrimYUltFrame.setText("ELI MENOS PRIM Y ULT");
        jButEliMenosPrimYUltFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliMenosPrimYUltFrameActionPerformed(evt);
            }
        });

        jButCompPrimYUltFrame.setText("COMP PRIM Y ULT");
        jButCompPrimYUltFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCompPrimYUltFrameActionPerformed(evt);
            }
        });

        jLabel11.setText("COMPETENCIA 4");

        jButVisualizarGpo.setText("Visualizar Gpo");
        jButVisualizarGpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButVisualizarGpoActionPerformed(evt);
            }
        });

        jButInsEnd.setText("InsEnd");
        jButInsEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInsEndActionPerformed(evt);
            }
        });

        jLabel3.setText("Calif");

        jTextCalif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCalifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabMascota)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb2)
                                    .addComponent(rb1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jTextNoCtrl)
                                    .addComponent(jTextCalif)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButInsBegin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButInsEnd)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(75, 75, 75)
                        .addComponent(jButVisualizarGpo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButEliMenosPrimYUlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButCompPrimYUlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jButEliSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButEliminarSegFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButEliMenosPrimYUltFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(jButCompPrimYUltFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabMascota)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNoCtrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextCalif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButInsBegin)
                            .addComponent(jButInsEnd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButEliSegundo)
                                .addGap(18, 18, 18)
                                .addComponent(jButEliMenosPrimYUlt)
                                .addGap(18, 18, 18)
                                .addComponent(jButCompPrimYUlt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButEliminarSegFrame)
                                .addGap(18, 18, 18)
                                .addComponent(jButEliMenosPrimYUltFrame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButCompPrimYUltFrame))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jButVisualizarGpo)))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void actualizarNoAlumnosGpos() {
        jTabNoAlumnos.setValueAt(grupo1.Length(), 0, 0);
        jTabNoAlumnos.setValueAt(grupo2.Length(), 0, 1);
    }
    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButInsBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInsBeginActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(jTextNoCtrl.getText().isEmpty() || jTextNombre.getText().isEmpty()
           || jTextCalif.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO SE PUDO GUARDAR LA MASCOTA"
                    + " , DEBE LLENAR TODOS LOS CAMPOS",
                    "ERROR", JOptionPane.ERROR_MESSAGE); } 
        
        else  {        
            TipoElem elem = new TipoElem(jTextNoCtrl.getText(), jTextNombre.getText(), 
                                         Integer.parseInt(jTextCalif.getText()));   
            grupoSel.InsBegin(elem);
            actualizarNoAlumnosGpos();
        }
    }//GEN-LAST:event_jButInsBeginActionPerformed

    private void jButVisualizarGpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButVisualizarGpoActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        DefaultTableModel modelo = (DefaultTableModel) jTabAlumnos.getModel();
        modelo.setColumnCount(0);
        for(int i=1; i<= grupoSel.Length(); i++)
            modelo.addColumn(i);
        int col = 0;
        Nodo p = grupoSel.Cab();
        while (p != null) {
            jTabAlumnos.setValueAt(p.Info().NoCon(),0,col);
            jTabAlumnos.setValueAt(p.Info().Nombre(),1,col);
            jTabAlumnos.setValueAt(p.Info().Calif(),2,col++);
            p = p.Sig();
        }
    }//GEN-LAST:event_jButVisualizarGpoActionPerformed

    private void jButEliSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliSegundoActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.EliminarSegundo();
        actualizarNoAlumnosGpos();
    }//GEN-LAST:event_jButEliSegundoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTabNoAlumnos.setValueAt(grupo1.Length(), 0, 0);
        jTabNoAlumnos.setValueAt(grupo2.Length(), 0, 1);    
    }//GEN-LAST:event_formWindowOpened

    private void jButEliminarSegFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliminarSegFrameActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(grupoSel.Length() > 1) {
            grupoSel.Cab().Sig(grupoSel.Cab().Sig().Sig());
            grupoSel.Length(grupoSel.Length()-1);
            actualizarNoAlumnosGpos();     
        }
    }//GEN-LAST:event_jButEliminarSegFrameActionPerformed

    private void jButEliMenosPrimYUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliMenosPrimYUltActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.EliminarMenosPrimYUlt();
        actualizarNoAlumnosGpos();
    }//GEN-LAST:event_jButEliMenosPrimYUltActionPerformed

    private void jButCompPrimYUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCompPrimYUltActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        boolean c =  grupoSel.CompararPrimYUlt();
        if(c)
            JOptionPane.showMessageDialog(null, "Verdadero");
        else
            JOptionPane.showMessageDialog(null, "Falso");
    }//GEN-LAST:event_jButCompPrimYUltActionPerformed

    private void jButEliMenosPrimYUltFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliMenosPrimYUltFrameActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(grupoSel.Length() > 2) {
            Nodo p = grupoSel.Cab();
            while(p.Sig() != null)
                p = p.Sig();
            grupoSel.Cab().Sig(p);
            grupoSel.Length(2);
            actualizarNoAlumnosGpos();
        }         
    }//GEN-LAST:event_jButEliMenosPrimYUltFrameActionPerformed

    private void jButCompPrimYUltFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCompPrimYUltFrameActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(grupoSel.Length() > 1) {
            Nodo p = grupoSel.Cab();
            while(p.Sig() != null)
                p = p.Sig();
            boolean c = grupoSel.Cab().Info().compararAlums(p.Info());
            if(c)
                JOptionPane.showMessageDialog(null, "Verdadero");
            else
                JOptionPane.showMessageDialog(null, "Falso");
        }
        else
            JOptionPane.showMessageDialog(null, "Falso");         
    }//GEN-LAST:event_jButCompPrimYUltFrameActionPerformed

    private void jButInsEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInsEndActionPerformed
        Lista grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(jTextNoCtrl.getText().isEmpty() || jTextNombre.getText().isEmpty()
           || jTextCalif.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO SE PUDO GUARDAR LA MASCOTA"
                    + " , DEBE LLENAR TODOS LOS CAMPOS",
                    "ERROR", JOptionPane.ERROR_MESSAGE); } 
        
        else  {        
            TipoElem elem = new TipoElem(jTextNoCtrl.getText(), jTextNombre.getText(), 
                                         Integer.parseInt(jTextCalif.getText()));   
            grupoSel.InsEnd(elem);
            actualizarNoAlumnosGpos();
        }
    }//GEN-LAST:event_jButInsEndActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rb1ActionPerformed

    private void jTextCalifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCalifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCalifActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButCompPrimYUlt;
    private javax.swing.JButton jButCompPrimYUltFrame;
    private javax.swing.JButton jButEliMenosPrimYUlt;
    private javax.swing.JButton jButEliMenosPrimYUltFrame;
    private javax.swing.JButton jButEliSegundo;
    private javax.swing.JButton jButEliminarSegFrame;
    private javax.swing.JButton jButInsBegin;
    private javax.swing.JButton jButInsEnd;
    private javax.swing.JButton jButVisualizarGpo;
    private javax.swing.JLabel jLabMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabAlumnos;
    private javax.swing.JTable jTabNoAlumnos;
    private javax.swing.JTextField jTextCalif;
    private javax.swing.JTextField jTextNoCtrl;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables
}