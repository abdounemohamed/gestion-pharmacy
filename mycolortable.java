/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author choqib
 */
public class mycolortable extends DefaultTableCellRenderer {
private Component component;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 

      if(row%2==0)
   {
       component.setBackground(new Color(250,255,255));
   }
   else
   {
 component.setBackground(new Color(200,255,255));
 //0, 103, 122

   }
      if(table.isRowSelected(row))
{
    component.setBackground(Color.green);
}
        
        return component;

    
    }

}
