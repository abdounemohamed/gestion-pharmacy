/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Container;
import java.awt.event.KeyEvent;
import work.tools;

/**
 *
 * @author choqib
 */
public class frmuser extends javax.swing.JFrame {

    /**
     * Creates new form frmuser
     */
    public frmuser() {
                       this.setUndecorated(false);
        this.setAlwaysOnTop(false);
       this.setResizable(false);
        this.setVisible(true);
        
    
        initComponents();
valid2.setVisible(false);
    this.setSize(500, 380);
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
        nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valid = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        valid1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        monpass1 = new javax.swing.JPasswordField();
        monpass2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        valid2 = new javax.swing.JButton();
        valid3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nouveaux Utilisateur(Vendeur/se)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 252, 23);

        nom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomKeyReleased(evt);
            }
        });
        getContentPane().add(nom);
        nom.setBounds(140, 70, 197, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Nom");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 50, 36, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Mot de passe");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 110, 112, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Confirmer Mot de passe");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 170, 197, 16);

        valid.setBackground(new java.awt.Color(0, 102, 0));
        valid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valid.setForeground(new java.awt.Color(255, 255, 255));
        valid.setMnemonic('v');
        valid.setText("Valider");
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });
        getContentPane().add(valid);
        valid.setBounds(20, 230, 170, 30);

        annuler.setBackground(new java.awt.Color(255, 0, 0));
        annuler.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        annuler.setForeground(new java.awt.Color(255, 255, 255));
        annuler.setMnemonic('n');
        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });
        getContentPane().add(annuler);
        annuler.setBounds(200, 230, 180, 30);

        valid1.setBackground(new java.awt.Color(0, 102, 0));
        valid1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valid1.setForeground(new java.awt.Color(255, 255, 255));
        valid1.setMnemonic('v');
        valid1.setText("Mon compte");
        valid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid1ActionPerformed(evt);
            }
        });
        getContentPane().add(valid1);
        valid1.setBounds(10, 280, 146, 34);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Changer le Mot de passe");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 350, 252, 23);

        pass1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass1KeyReleased(evt);
            }
        });
        getContentPane().add(pass1);
        pass1.setBounds(140, 130, 197, 34);

        pass2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2ActionPerformed(evt);
            }
        });
        pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pass2KeyReleased(evt);
            }
        });
        getContentPane().add(pass2);
        pass2.setBounds(140, 190, 197, 34);

        monpass1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monpass1ActionPerformed(evt);
            }
        });
        monpass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monpass1KeyReleased(evt);
            }
        });
        getContentPane().add(monpass1);
        monpass1.setBounds(70, 400, 197, 34);

        monpass2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monpass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monpass2ActionPerformed(evt);
            }
        });
        monpass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monpass2KeyReleased(evt);
            }
        });
        getContentPane().add(monpass2);
        monpass2.setBounds(70, 480, 197, 34);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Mot de passe");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 380, 112, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Confirmer Mot de passe");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 450, 197, 16);

        valid2.setBackground(new java.awt.Color(0, 102, 0));
        valid2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valid2.setForeground(new java.awt.Color(255, 255, 255));
        valid2.setMnemonic('v');
        valid2.setText("Masquer");
        valid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid2ActionPerformed(evt);
            }
        });
        getContentPane().add(valid2);
        valid2.setBounds(340, 280, 146, 34);

        valid3.setBackground(new java.awt.Color(0, 102, 0));
        valid3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valid3.setForeground(new java.awt.Color(255, 255, 255));
        valid3.setMnemonic('v');
        valid3.setText("Valider");
        valid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid3ActionPerformed(evt);
            }
        });
        getContentPane().add(valid3);
        valid3.setBounds(270, 440, 140, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/safe-secure.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, -10, 640, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed
    public void add(String nom,String pass) {
        try{
        String strInsert = "insert into user values("
                + "'" + nom + "',"
                + "'" + pass + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
           tools.msgBox("Avec succes .\n Utélisateur: "+nom+" est ajuter.");  
        }
        else{
            tools.msgBox("Ce Nom existe déja changer le nom");
        }
       } 
        catch(Exception ex){
        tools.msgBox("Ce Nom existe déja changer le nom");}
    }
            public void updateClient(String pass) {
 String strUpdate = "update user set "
          + "pass='" +pass+ "' "
                + " where nom='pharmacy'";
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
           tools.msgBox("Avec succès");
        }    }
    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
if(!(nom.getText().isEmpty())& !(pass1.getText().isEmpty())&!(pass2.getText().isEmpty())){
     char[] s3 = pass1.getPassword();

            char[] s4 = pass2.getPassword(); 

            String s8 = new String(s3);

            String s9 = new String(s4);
if((s8.equals(s9)))
{
    
    add(nom.getText(),pass1.getText());

}
else{tools.msgBox("les deaux mot de passes sont diférants");}

}
else{
tools.msgBox("SVP continue touts les Champs");
}
    }//GEN-LAST:event_validActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed

        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_annulerActionPerformed

    private void valid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid1ActionPerformed
this.setSize(500, 550);
valid1.setVisible(false);
valid2.setVisible(true);
monpass1.requestFocus();

// TODO add your handling code here:
    }//GEN-LAST:event_valid1ActionPerformed

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1ActionPerformed

    private void pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2ActionPerformed

    private void monpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monpass1ActionPerformed

    private void monpass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monpass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monpass2ActionPerformed

    private void nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     pass1.requestFocus();}         // TODO add your handling code here:
    }//GEN-LAST:event_nomKeyReleased

    private void pass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass1KeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
pass2.requestFocus();
}         // TODO add your handling code here:
    }//GEN-LAST:event_pass1KeyReleased

    private void pass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass2KeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
        if(!(nom.getText().isEmpty())& !(pass1.getText().isEmpty())&!(pass2.getText().isEmpty())){
     char[] s3 = pass1.getPassword();

            char[] s4 = pass2.getPassword(); 

            String s8 = new String(s3);

            String s9 = new String(s4);
if((s8.equals(s9)))
{
    
    add(nom.getText(),pass1.getText());
    tools.clearText(this);

}
else{tools.msgBox("les deaux mot de passes sont diférants");}

}
else{
tools.msgBox("SVP continue touts les Champs");
}
}        // TODO add your handling code here:
    }//GEN-LAST:event_pass2KeyReleased

    private void valid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid2ActionPerformed
this.setSize(500,380);
valid2.setVisible(false);
valid1.setVisible(true);
nom.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_valid2ActionPerformed

    private void valid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid3ActionPerformed

        if(!(monpass1.getText().isEmpty())&!(monpass2.getText().isEmpty())){
     char[] s3 = monpass1.getPassword();

            char[] s4 = monpass2.getPassword(); 

            String s8 = new String(s3);

            String s9 = new String(s4);
if((s8.equals(s9)))
{
    
    updateClient(monpass1.getText());
    tools.clearText(this);

}
else{tools.msgBox("les deaux mot de passes sont diférants");}

}
else{
tools.msgBox("SVP continue touts les Champs");
}        // TODO add your handling code here:
    }//GEN-LAST:event_valid3ActionPerformed

    private void monpass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monpass1KeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
monpass2.requestFocus();
}        // TODO add your handling code here:
    }//GEN-LAST:event_monpass1KeyReleased

    private void monpass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monpass2KeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(!(monpass1.getText().isEmpty())&!(monpass2.getText().isEmpty())){
     char[] s3 = monpass1.getPassword();

            char[] s4 = monpass2.getPassword(); 

            String s8 = new String(s3);

            String s9 = new String(s4);
if((s8.equals(s9)))
{
    
    updateClient(monpass1.getText());
    tools.clearText(this);

}
else{tools.msgBox("les deaux mot de passes sont diférants");}

}
else{
tools.msgBox("SVP continue touts les Champs");
}
}// TODO add your handling code here:
    }//GEN-LAST:event_monpass2KeyReleased

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
            java.util.logging.Logger.getLogger(frmuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField monpass1;
    private javax.swing.JPasswordField monpass2;
    private javax.swing.JTextField nom;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JButton valid;
    private javax.swing.JButton valid1;
    private javax.swing.JButton valid2;
    private javax.swing.JButton valid3;
    // End of variables declaration//GEN-END:variables
}
