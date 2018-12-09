/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import controls.mycolortable;
import entity.dci;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ListSelectionModel;
import work.tools;

/**
 *
 * @author choqib
 */
public class frmDci extends javax.swing.JFrame {
    dci d=new dci();

    /**
     * Creates new form frmDci
     */
    public frmDci() {
                this.setUndecorated(false);
        this.setAlwaysOnTop(false);
       this.setResizable(false);
        this.setVisible(true);
        
    
        initComponents();
 tabmed.setDefaultRenderer(Object.class, new mycolortable() ); 
       tabdci.setDefaultRenderer(Object.class, new mycolortable() );
       tabmed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       tabdci.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setSize(920,620);
        dci.requestFocus();
       
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
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabdci = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabmed = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dci = new javax.swing.JTextField();
        bntMedParDci = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        med = new javax.swing.JTextField();
        btnDciParMed = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnaffiche = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(null);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/ch17.png"))); // NOI18N
        jPanel1.add(jLabel32);
        jLabel32.setBounds(470, 0, 70, 60);

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Dci");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(580, 14, 360, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 893, 60);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabdci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabdci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DCI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabdci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabdciKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabdci);
        if (tabdci.getColumnModel().getColumnCount() > 0) {
            tabdci.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 210, 439, 338);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tabmed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicament"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabmed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabmedKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabmed);
        if (tabmed.getColumnModel().getColumnCount() > 0) {
            tabmed.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(500, 210, 396, 338);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DCI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 29, 29);

        dci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dciKeyReleased(evt);
            }
        });
        getContentPane().add(dci);
        dci.setBounds(30, 100, 439, 29);

        bntMedParDci.setBackground(new java.awt.Color(255, 255, 0));
        bntMedParDci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntMedParDci.setText("Recharcher Medicament par le Dci");
        bntMedParDci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMedParDciActionPerformed(evt);
            }
        });
        getContentPane().add(bntMedParDci);
        bntMedParDci.setBounds(30, 150, 239, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Medicament");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 70, 241, 29);

        med.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        med.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medKeyReleased(evt);
            }
        });
        getContentPane().add(med);
        med.setBounds(500, 100, 396, 29);

        btnDciParMed.setBackground(new java.awt.Color(255, 255, 0));
        btnDciParMed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDciParMed.setText("Recharcher  Dci par le Medicament  ");
        btnDciParMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDciParMedActionPerformed(evt);
            }
        });
        getContentPane().add(btnDciParMed);
        btnDciParMed.setBounds(610, 150, 251, 23);

        btnAdd.setBackground(new java.awt.Color(0, 0, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Ajouter Nouvelle Dci");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(280, 150, 194, 23);

        btnaffiche.setBackground(new java.awt.Color(0, 153, 0));
        btnaffiche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnaffiche.setText("Afficher touts les Dci Disponibles");
        btnaffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnafficheActionPerformed(evt);
            }
        });
        getContentPane().add(btnaffiche);
        btnaffiche.setBounds(30, 180, 439, 23);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Afficher Touts Les Medicamment Disponibles");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 180, 396, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntMedParDciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMedParDciActionPerformed
     d.getCustomRows("select nom from produit where dci ='"+dci.getText()+"';", tabmed);
     tabmed.requestFocus();
dci.setText("");
med.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_bntMedParDciActionPerformed

    private void btnDciParMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDciParMedActionPerformed
  d.getCustomRows("select dci from produit where nom ='"+med.getText()+"';", tabdci);
  tabdci.requestFocus();
  dci.setText("");
med.setText("");
    }//GEN-LAST:event_btnDciParMedActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     d.setDci(dci.getText()); 
     d.add();
dci.setText("");
dci.requestFocus();
  dci.setText("");
med.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void tabdciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabdciKeyReleased
int row=tabdci.getSelectedRow();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            dci.setText(tabdci.getValueAt(row-1,0).toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_tabdciKeyReleased

    private void tabmedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabmedKeyReleased
int row=tabmed.getSelectedRow();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            med.setText(tabmed.getValueAt(row-1,0).toString());
            med.requestFocus();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_tabmedKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 tabmed.getTableHeader().setVisible(true);
tabmed.getTableHeader().setBackground(new Color(0,0,100));
tabmed.getTableHeader().setForeground(Color.white);
tabmed.setShowGrid(false);
tabmed.setShowVerticalLines(false);
   tabmed.setColumnSelectionAllowed(false);
    tabmed.setRowSelectionAllowed(true);
    tabmed.setSelectionBackground(Color.green);

tabmed.setRowHeight(24);

tabdci.getTableHeader().setVisible(true);
tabdci.getTableHeader().setBackground(new Color(0,0,100));
tabdci.getTableHeader().setForeground(Color.white);
tabdci.setShowGrid(false);
tabdci.setShowVerticalLines(false);
   tabdci.setColumnSelectionAllowed(false);
    tabdci.setRowSelectionAllowed(true);
    tabdci.setSelectionBackground(Color.green);

tabdci.setRowHeight(24);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void medKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medKeyReleased
      if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        d.getCustomRows("select dci from produit where nom ='"+med.getText()+"';", tabdci);
  tabdci.requestFocus();
  dci.setText("");
med.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_medKeyReleased

    private void dciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dciKeyReleased
  if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        d.getCustomRows("select nom from produit where dci ='"+dci.getText()+"';", tabmed);
     tabmed.requestFocus();
dci.setText("");
med.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_dciKeyReleased

    private void btnafficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnafficheActionPerformed
    d.getCustomRows("select nom_dci from dci ;", tabdci);  
    tabdci.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_btnafficheActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     d.getCustomRows("select nom from produit ;", tabmed);  
    tabmed.requestFocus();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmDci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntMedParDci;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDciParMed;
    private javax.swing.JButton btnaffiche;
    private javax.swing.JTextField dci;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField med;
    private javax.swing.JTable tabdci;
    private javax.swing.JTable tabmed;
    // End of variables declaration//GEN-END:variables
}