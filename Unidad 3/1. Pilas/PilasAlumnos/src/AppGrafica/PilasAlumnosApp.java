/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author friosa
 */
public class PilasAlumnosApp extends javax.swing.JFrame {
    private Pila grupo1 = new Pila();
    private Pila grupo2 = new Pila(30);
    /**
     * Creates new form PilasAlumnosApp
     */
    public PilasAlumnosApp() {
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
        jPanel1 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLeerAlu = new javax.swing.JTable();
        btnLeerAlu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNoAlusGpo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblGrupo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVisuaGrupo = new javax.swing.JTable();
        btnVisuaGrupo = new javax.swing.JButton();
        btnInterFondos = new javax.swing.JButton();
        btnInterPenulFondo = new javax.swing.JButton();
        btnInterPenFondoArre = new javax.swing.JButton();
        btnReacomodo = new javax.swing.JButton();
        btnInvertirPilasAux = new javax.swing.JButton();
        btnInvertirPilasRef = new javax.swing.JButton();
        btnInvertirArreAux = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PILAS DE ALUMNOS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(rb1);
        rb1.setSelected(true);
        rb1.setText("GRUPO 1");

        buttonGroup1.add(rb2);
        rb2.setText("GRUPO 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb2)
                    .addComponent(rb1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rb1)
                .addGap(18, 18, 18)
                .addComponent(rb2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("INGRESA DATOS DEL ALUMNO");

        tblLeerAlu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NO.CTRL", "ALUMNO", "CALIFICACIÓN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLeerAlu);

        btnLeerAlu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLeerAlu.setText("LEER ALUMNO");
        btnLeerAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerAluActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLeerAlu)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeerAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tblNoAlusGpo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "GRUPO 1", "GRUPO 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNoAlusGpo);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGrupo.setText("GRUPO 1");

        tblVisuaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO.CTRL", "ALUMNO", "CALIFICACION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblVisuaGrupo);

        btnVisuaGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVisuaGrupo.setText("VISUA GRUPO");
        btnVisuaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuaGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrupo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisuaGrupo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisuaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnInterFondos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInterFondos.setText("INTER FONDOS");
        btnInterFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterFondosActionPerformed(evt);
            }
        });

        btnInterPenulFondo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInterPenulFondo.setText("INTER PENUL FONDO -PILAS-");
        btnInterPenulFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterPenulFondoActionPerformed(evt);
            }
        });

        btnInterPenFondoArre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInterPenFondoArre.setText("INTER PENUL FONDO -ARRE-");
        btnInterPenFondoArre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterPenFondoArreActionPerformed(evt);
            }
        });

        btnReacomodo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReacomodo.setText("REACOMODO");
        btnReacomodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReacomodoActionPerformed(evt);
            }
        });

        btnInvertirPilasAux.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInvertirPilasAux.setText("INVERTIR -PILAS AUX-");
        btnInvertirPilasAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirPilasAuxActionPerformed(evt);
            }
        });

        btnInvertirPilasRef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInvertirPilasRef.setText("INVERTIR -PILAS REF-");
        btnInvertirPilasRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirPilasRefActionPerformed(evt);
            }
        });

        btnInvertirArreAux.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInvertirArreAux.setText("INVERTIR -ARRE AUX-");
        btnInvertirArreAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirArreAuxActionPerformed(evt);
            }
        });

        jButton1.setText("EXAMEN C7");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXAMEN C8");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnInterFondos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInterPenulFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInterPenFondoArre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnReacomodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInvertirPilasAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInvertirPilasRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnInvertirArreAux, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4)
                                                .addGap(56, 56, 56))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInterFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInterPenulFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInterPenFondoArre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReacomodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInvertirPilasAux, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInvertirPilasRef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInvertirArreAux, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tblNoAlusGpo.setValueAt(grupo1.Length(), 0, 0);
        tblNoAlusGpo.setValueAt(grupo2.Length(), 0, 1);
    }//GEN-LAST:event_formWindowOpened

    private void btnLeerAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerAluActionPerformed
        Pila grupo = rb1.isSelected()? grupo1 : grupo2;
        if (! grupo.Full()) {
            TipoElem alu = new TipoElem(tblLeerAlu.getValueAt(0,0).toString(),
                                        tblLeerAlu.getValueAt(0,1).toString(),
                      Integer.parseInt(tblLeerAlu.getValueAt(0,2).toString()));
            grupo.Push(alu);
            tblNoAlusGpo.setValueAt(grupo.Length(), 0, rb1.isSelected()? 0 : 1);
        }
        else
            JOptionPane.showMessageDialog(this, "YA ESTA LLENO EL GRUPO",
                    "ERROR ...", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnLeerAluActionPerformed

    private void btnVisuaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuaGrupoActionPerformed
        Pila grupo = rb1.isSelected()? grupo1 : grupo2;
        Pila aux = new Pila(grupo.Length());
        lblGrupo.setText(rb1.isSelected()? "GRUPO 1" : "GRUPO 2");
        DefaultTableModel modelo = (DefaultTableModel) tblVisuaGrupo.getModel();
        while (modelo.getRowCount() > 0)
            modelo.removeRow(0);
        while(! grupo.Empty()) {
            TipoElem elem = grupo.Pop();
            aux.Push(elem);
            Object[] o = new Object[3];
            o[0] = elem.getNoCon();
            o[1] = elem.getNombre();
            o[2] = elem.getCalif();
            modelo.addRow(o);
        }
        while(! aux.Empty()) 
            grupo.Push(aux.Pop());
    }//GEN-LAST:event_btnVisuaGrupoActionPerformed

    private void btnInterFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterFondosActionPerformed
        Pila aux1 = new Pila();
        Pila aux2 = new Pila();
        
        while(!grupo1.Empty())
            aux1.Push(grupo1.Pop());
        while(!grupo2.Empty())
            aux2.Push(grupo2.Pop());
        grupo1.Push(aux2.Pop());
        grupo2.Push(aux1.Pop());
        
        while(!aux1.Empty())
            grupo1.Push(aux1.Pop());
        while(!aux2.Empty())
            grupo2.Push(aux2.Pop());
        JOptionPane.showMessageDialog(this, "TERMINO EL INTERCAMBIO! ",
                    "INTERCAMBIO DE FONDOS ...", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnInterFondosActionPerformed

    private void btnInterPenulFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterPenulFondoActionPerformed
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 2) {
            Pila aux = new Pila();
            aux.Push(grupoSel.Pop());
            TipoElem penul = grupoSel.Pop();
            while(grupoSel.Length()>1)
                aux.Push(grupoSel.Pop());
            TipoElem fondo = grupoSel.Pop();
            grupoSel.Push(penul);
            while(aux.Length()>1)
                grupoSel.Push(aux.Pop());
            grupoSel.Push(fondo);
            grupoSel.Push(aux.Pop());
            JOptionPane.showMessageDialog(this, "TERMINO EL INTERCAMBIO! ",
                    "INTERCAMBIO DE FONDO con PENÚLTIMO ...", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnInterPenulFondoActionPerformed

    private void btnInterPenFondoArreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterPenFondoArreActionPerformed
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 2) {
            ArrayList<TipoElem> aux = new ArrayList<>();
            while(! grupoSel.Empty())
                aux.add(grupoSel.Pop());
            grupoSel.Push(aux.get(1));
            for(int i=aux.size()-2;i>1;i--) 
                grupoSel.Push(aux.get(i));
            grupoSel.Push(aux.get(aux.size()-1));
            grupoSel.Push(aux.get(0));
            JOptionPane.showMessageDialog(this, 
                                       "SE EFECTUO EL INTERCAMBIO CON ARREGLO AUXILIAR",
                                        "INTERCAMBIO DE FONDO CON PENULTIMO", 
                                        JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnInterPenFondoArreActionPerformed

    private void btnReacomodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReacomodoActionPerformed
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 1) {
            Pila aprob = new Pila();
            Pila reprob = new Pila();
            while(!grupoSel.Empty()) {
                TipoElem alu = grupoSel.Pop();
                if (alu.getCalif() < 70)
                    reprob.Push(alu);
                else
                    aprob.Push(alu);  
            } 
            while(!aprob.Empty())
                grupoSel.Push(aprob.Pop());
            while(!reprob.Empty())
                grupoSel.Push(reprob.Pop());
        }
        else
            JOptionPane.showMessageDialog(this,"REACOMODO ..","operacion no hecha",
                    JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnReacomodoActionPerformed

    private void btnInvertirPilasAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirPilasAuxActionPerformed
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 1) {
            Pila aux1 = new Pila();
            Pila aux2 = new Pila();
            while(!grupoSel.Empty())
                aux1.Push(grupoSel.Pop());
            while(!aux1.Empty())
                aux2.Push(aux1.Pop());
            while(!aux2.Empty())
                grupoSel.Push(aux2.Pop());
            JOptionPane.showMessageDialog(this,"INVERTIR PILAS AUX ..",
                    "SE HA INVERTIDO EL GRUPO SELECCIONADO ...",
                    JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"INVERTIR PILAS AUX ..",
                    "operacion no hecha",
                    JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnInvertirPilasAuxActionPerformed

    private void btnInvertirPilasRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirPilasRefActionPerformed
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 1) {
            Pila aux1 = new Pila();
            while(!grupoSel.Empty())
                aux1.Push(grupoSel.Pop());
            if (rb1.isSelected())
                grupo1 = aux1;
            else
                grupo2 = aux1;
            JOptionPane.showMessageDialog(this,"INVERTIR PILAS AUX REFERENCIAS..",
                    "SE HA INVERTIDO EL GRUPO SELECCIONADO ...",
                    JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"INVERTIR PILAS AUX REFERENCIAS..",
                    "operacion no hecha",
                    JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnInvertirPilasRefActionPerformed

    private void btnInvertirArreAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirArreAuxActionPerformed
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if (grupoSel.Length() > 1) {
            ArrayList<TipoElem> aux = new ArrayList<>();
            while(!grupoSel.Empty())
                aux.add(grupoSel.Pop());
            for(TipoElem elem : aux)
                grupoSel.Push(elem);
            JOptionPane.showMessageDialog(this,"INVERTIR ARREGLO AUX ..",
                    "SE HA INVERTIDO EL GRUPO SELECCIONADO ...",
                    JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this,"INVERTIR ARREGLO AUX ..",
                    "operacion no hecha",
                    JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnInvertirArreAuxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.eliminarMenosTresFondos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(grupoSel.Length() > 3) {
            Pila aux = new Pila();
            while(!grupoSel.Empty())
                aux.Push(grupoSel.Pop());
            grupoSel.Push(aux.Pop());
            grupoSel.Push(aux.Pop());
            grupoSel.Push(aux.Pop());           
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.IntercambiarFondos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(grupoSel.Length() > 1) {
            Pila aux = new Pila();
            while(!grupoSel.Empty())
                aux.Push(grupoSel.Pop());
            Pila aux2 = new Pila();
            aux2.Push(aux.Pop());
            aux2.Push(aux.Pop());
            
            while(!aux2.Empty())
                grupoSel.Push(aux2.Pop());
            while(!aux.Empty())
                grupoSel.Push(aux.Pop());            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        grupoSel.IntercambiarTopes();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Pila grupoSel = rb1.isSelected()? grupo1 : grupo2;
        if(grupoSel.Length()>1) {
            Pila aux = new Pila();
            aux.Push(grupoSel.Pop());
            aux.Push(grupoSel.Pop());
            Pila aux2 = new Pila();
            while(!aux.Empty())
                aux2.Push(aux.Pop());
            while(!aux2.Empty())
                grupoSel.Push(aux2.Pop());
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(PilasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilasAlumnosApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilasAlumnosApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInterFondos;
    private javax.swing.JButton btnInterPenFondoArre;
    private javax.swing.JButton btnInterPenulFondo;
    private javax.swing.JButton btnInvertirArreAux;
    private javax.swing.JButton btnInvertirPilasAux;
    private javax.swing.JButton btnInvertirPilasRef;
    private javax.swing.JButton btnLeerAlu;
    private javax.swing.JButton btnReacomodo;
    private javax.swing.JButton btnVisuaGrupo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTable tblLeerAlu;
    private javax.swing.JTable tblNoAlusGpo;
    private javax.swing.JTable tblVisuaGrupo;
    // End of variables declaration//GEN-END:variables
}
