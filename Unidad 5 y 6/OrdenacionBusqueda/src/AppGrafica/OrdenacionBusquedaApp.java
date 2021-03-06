/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author friosa
 */
public class OrdenacionBusquedaApp extends javax.swing.JFrame {
    final int MAX = 10;
    QuickSort qs = new QuickSort();
    InsSimple is = new InsSimple();
    ShellSort ss = new ShellSort();
    Hashing hash = new Hashing();
    ArrayList<TipoElem> x = new ArrayList<>();
    Binaria bin = new Binaria();
    Secuencial sec = new Secuencial();
    BinariaRecursiva binRec = new BinariaRecursiva();
    BusqHash busqHash = new BusqHash();
    
    //Hashing hash = new Hashing(); 
    /**
     * Creates new form OrdenacionBusquedaApp
     */
    public OrdenacionBusquedaApp() {
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
        jPanel1 = new javax.swing.JPanel();
        rbQuickSort = new javax.swing.JRadioButton();
        rbInsSimple = new javax.swing.JRadioButton();
        rbShellSort = new javax.swing.JRadioButton();
        rbHashing = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinOrdenar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVisuaSinOrdenar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        rbBinRec = new javax.swing.JPanel();
        rbSec = new javax.swing.JRadioButton();
        rbBin = new javax.swing.JRadioButton();
        rbDesmenu = new javax.swing.JRadioButton();
        rbBinRecBis = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txfNomBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaResul = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ORDENACI??N", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        buttonGroup1.add(rbQuickSort);
        rbQuickSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbQuickSort.setSelected(true);
        rbQuickSort.setText("QUICK SORT");

        buttonGroup1.add(rbInsSimple);
        rbInsSimple.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbInsSimple.setText("INSERCI??N SIMPLE");

        buttonGroup1.add(rbShellSort);
        rbShellSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbShellSort.setText("SHELL SORT");

        buttonGroup1.add(rbHashing);
        rbHashing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbHashing.setText("HASHING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbQuickSort)
                    .addComponent(rbInsSimple)
                    .addComponent(rbShellSort)
                    .addComponent(rbHashing))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbQuickSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbInsSimple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbShellSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbHashing)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tblSinOrdenar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.", "NO.CTRL", "NOMBRE", "CALIFICACI??N"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSinOrdenar);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ARREGLO SIN ORDENAR");

        btnVisuaSinOrdenar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisuaSinOrdenar.setText("VISUA X");
        btnVisuaSinOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuaSinOrdenarActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCargar.setText("CARGAR");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        rbBinRec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "B??SQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        rbBinRec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup2.add(rbSec);
        rbSec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSec.setSelected(true);
        rbSec.setText("SECUENCIAL");

        buttonGroup2.add(rbBin);
        rbBin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbBin.setText("BINARIA");

        buttonGroup2.add(rbDesmenu);
        rbDesmenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDesmenu.setText("DESMENUZAMIENTO");
        rbDesmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDesmenuActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbBinRecBis);
        rbBinRecBis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbBinRecBis.setText("BINARIA RECURSIVA");

        javax.swing.GroupLayout rbBinRecLayout = new javax.swing.GroupLayout(rbBinRec);
        rbBinRec.setLayout(rbBinRecLayout);
        rbBinRecLayout.setHorizontalGroup(
            rbBinRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbBinRecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rbBinRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBin)
                    .addComponent(rbSec)
                    .addComponent(rbDesmenu)
                    .addComponent(rbBinRecBis))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        rbBinRecLayout.setVerticalGroup(
            rbBinRecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbBinRecLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbSec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbBin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbBinRecBis)
                .addGap(5, 5, 5)
                .addComponent(rbDesmenu)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE A BUSCAR:");

        txfNomBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txaResul.setColumns(20);
        txaResul.setRows(5);
        jScrollPane2.setViewportView(txaResul);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txfNomBuscar)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVisuaSinOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbBinRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar)
                        .addGap(23, 23, 23)
                        .addComponent(btnVisuaSinOrdenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnOrdenar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfNomBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addComponent(rbBinRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        String[] nombres ={"YAZMIN","JUAN CARLOS","PETRA","ALONSO","FRANCISCO",
                                 "JUAN GABRIEL","YEINIEL","PAMELA","EDMUNDO","LUIS FELIPE"};
        String[] tels ={"871-7132090","871-4567890","871-1232345","871-1696969","871-7525252",
                                 "871-7656212","871-1786754","871-2908765","871-3454556","871-7414141"};
        int[] edades ={20,19,40,21,53,60,21,20,22,21};
        x.clear();
        for(int i=0;i < nombres.length;i++) 
            x.add(new TipoElem(tels[i],nombres[i],edades[i]));
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnVisuaSinOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuaSinOrdenarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblSinOrdenar.getModel();
        modelo.setRowCount(0);
        for(TipoElem alu : x) {
            Object[] o = new Object[4];
            o[0] = tblSinOrdenar.getRowCount()+1;
            o[1] = alu.NoCon();
            o[2] = alu.Nombre();
            o[3] = alu.Calif();
            modelo.addRow(o);
        }
    }//GEN-LAST:event_btnVisuaSinOrdenarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        IOrdenacion ifce = null;
        if (rbQuickSort.isSelected())
            ifce = qs;
        else if (rbInsSimple.isSelected())
            ifce = is;
        else if (rbShellSort.isSelected())
            ifce = ss;
        else 
            ifce = hash;
        ifce.Ordenar(x, 0, 9);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void rbDesmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDesmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDesmenuActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        TipoElem oElem=new TipoElem(Integer.parseInt(txfNomBuscar.getText()));
        IBusqueda busqueda = null;
        if (rbSec.isSelected())
            busqueda = sec;
        else if (rbBin.isSelected())
            busqueda = bin;
        else if (rbBinRecBis.isSelected())
            busqueda = binRec;
        if (rbDesmenu.isSelected())
            oElem = busqHash.Buscar(hash.Tabla(),oElem);
        else 
            oElem = busqueda.Buscar(x,0, MAX - 1,oElem);
        String resul = oElem.Nombre() + "\n";
        resul += oElem.NoCon() + "\n";
        resul += oElem.Calif() + "\n";
        txaResul.setText(resul);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenacionBusquedaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenacionBusquedaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenacionBusquedaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenacionBusquedaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenacionBusquedaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnVisuaSinOrdenar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbBin;
    private javax.swing.JPanel rbBinRec;
    private javax.swing.JRadioButton rbBinRecBis;
    private javax.swing.JRadioButton rbDesmenu;
    private javax.swing.JRadioButton rbHashing;
    private javax.swing.JRadioButton rbInsSimple;
    private javax.swing.JRadioButton rbQuickSort;
    private javax.swing.JRadioButton rbSec;
    private javax.swing.JRadioButton rbShellSort;
    private javax.swing.JTable tblSinOrdenar;
    private javax.swing.JTextArea txaResul;
    private javax.swing.JTextField txfNomBuscar;
    // End of variables declaration//GEN-END:variables
}
