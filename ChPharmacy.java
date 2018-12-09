/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.pharmacy;

import forms.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import work.Login_Scream;

import work.tools;

/**
 *
 * @author ABDOUNE
 */
public class ChPharmacy {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // tools.openForm(new Login_Scr());
splashscreen sp = new splashscreen();
sp.setVisible(true);
for(int i=0;i<=100;i++)
{
    try {
        Thread.sleep(30);
        sp.jTextField1.setText(Integer.toString(i));
        sp.jProgressBar1.setValue(i);
        if(i==100)
        {
        sp.dispose();
        tools.openForm(new Login_Scr());
        }
        
    } catch (InterruptedException ex) {
        Logger.getLogger(ChPharmacy.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    
    }
    
}
