/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.*;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.*;

/**
 *
 * @author choqib
 */
    public class jTable extends DefaultTableCellRenderer {

    private static final long serialVersionUID = -1195682136616306875L;

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, column);
        if (!isSelected) {
            if (row % 2 == 0 && row != 1) {
                c.setBackground(new Color(255, 255, 150));
            } else {
                c.setBackground(Color.WHITE);
            }
        } else {
            c.setBackground(new Color(255, 230, 255));
        }
       // c.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        return c;
    }
}
    
