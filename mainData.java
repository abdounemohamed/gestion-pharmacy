
package entity;

import javax.swing.JComboBox;
import javax.swing.JTable;

public interface mainData {
    
    public void add();
    
    public void update();
    
    public void delete();
    
    public String getAutoNumber();
    
    public void getAllRows(JTable table);
     public void getAllRows1(String table,String colum,JComboBox combo);
     public void getAllRows2(JTable table);
    
    
    public void getOneRow(JTable table);
    
    public void getCustomRows(String statement, JTable table);
    
    public String getValueByName(String name);
    
    public String getNameByValue(String value);
    
}
