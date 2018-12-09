/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import controls.mycolortable;
import entity.forn;
import entity.midicament;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import work.tools;

/**
 *
 * @author choqib
 */
public class frmForRech extends javax.swing.JFrame {
forn f= new forn();
midicament m=new midicament();
    /**
     * Creates new form frmForRech
     */
    public frmForRech() {
        this.setUndecorated(false);
        this.setAlwaysOnTop(false);
       this.setResizable(false);
        this.setVisible(true);
        
    
        initComponents();
         tabfor.setDefaultRenderer(Object.class, new mycolortable() );
         tabfor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     //  jTable1.setDefaultRenderer(Object.class, new mycolortable() );
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        this.setSize(850,700);
        med.requestFocus();
        tabfor.getTableHeader().setVisible(true);
tabfor.getTableHeader().setBackground(new Color(0,0,100));
tabfor.getTableHeader().setForeground(Color.white);
tabfor.setShowGrid(false);
tabfor.setShowVerticalLines(false);
   tabfor.setColumnSelectionAllowed(false);
    tabfor.setRowSelectionAllowed(true);
    tabfor.setSelectionBackground(Color.green);
       m.getAllRows1("comande", "nom_produit", med);
        AutoCompleteDecorator.decorate(med);

tabfor.setRowHeight(24);
 TableColumn col=tabfor.getColumnModel().getColumn(0);
 col.setPreferredWidth(100);
 col=tabfor.getColumnModel().getColumn(1);
 col.setPreferredWidth(180);
  col=tabfor.getColumnModel().getColumn(2);
 col.setPreferredWidth(250);
  col=tabfor.getColumnModel().getColumn(3);
 col.setPreferredWidth(100);
  col=tabfor.getColumnModel().getColumn(4);
 col.setPreferredWidth(100);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nlot = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabfor = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        med = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(null);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/ch6.png"))); // NOI18N
        jPanel1.add(jLabel32);
        jLabel32.setBounds(100, 0, 90, 70);

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Recherche Fournisseures");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(170, 10, 480, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1380, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Recharche  par :_____________________________________________________________________________");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 110, 830, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("_______________________________________________________________________________");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 220, 750, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Désignation");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(23, 138, 167, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("N° de Lot");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(349, 138, 177, 30);

        nlot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nlot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nlotKeyReleased(evt);
            }
        });
        getContentPane().add(nlot);
        nlot.setBounds(349, 174, 148, 32);

        tabfor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabfor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Facture", "Fournisseur", "Désignation", "N° Lot", "Date Exp", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabfor);
        if (tabfor.getColumnModel().getColumnCount() > 0) {
            tabfor.getColumnModel().getColumn(0).setResizable(false);
            tabfor.getColumnModel().getColumn(1).setResizable(false);
            tabfor.getColumnModel().getColumn(2).setResizable(false);
            tabfor.getColumnModel().getColumn(3).setResizable(false);
            tabfor.getColumnModel().getColumn(4).setResizable(false);
            tabfor.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 259, 823, 399);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Rechercher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 174, 296, 32);

        med.setEditable(true);
        med.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        med.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medKeyReleased(evt);
            }
        });
        getContentPane().add(med);
        med.setBounds(23, 176, 320, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        f.getCustomRows("select nb_fact,nom_for,nom_produit,n_lot,exp,qte from comande where nom_produit='"+med.getSelectedItem().toString()+"' AND n_lot='"+nlot.getText()+"' AND (type='F' OR type='BL');", tabfor);        // TODO add your handling code here:
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void medKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
  {
  nlot.requestFocus();
  }        // TODO add your handling code here:
    }//GEN-LAST:event_medKeyReleased

    private void nlotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nlotKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
  {
        f.getCustomRows("select nb_fact,nom_for,nom_produit,n_lot,exp,qte from comande where nom_produit='"+med.getSelectedItem().toString()+"' AND n_lot='"+nlot.getText()+"';", tabfor);        // TODO add your handling code here:

  }        // TODO add your handling code here:
    }//GEN-LAST:event_nlotKeyReleased

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
            java.util.logging.Logger.getLogger(frmForRech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmForRech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmForRech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmForRech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmForRech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> med;
    private javax.swing.JTextField nlot;
    private javax.swing.JTable tabfor;
    // End of variables declaration//GEN-END:variables
}
