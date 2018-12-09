/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.Global.println;
import work.tools;
import work.tools.Table;

/**
 *
 * @author choqib
 */
public class go {
     private static String url = ""; 
    public static Connection con;
    
    private static void setURL(){
        //url = "jdbc:mysql://pharmacie1-PC:3306/pharmacy3"
            //  + "?useUnicode=true&characterEncoding=UTF-8";
       url = "jdbc:mysql://localhost:3306/pharmacy3"
        + "?useUnicode=true&characterEncoding=UTF-8";
    }
     public static void setConnection(){                
        try {
            setURL();
       con = DriverManager.getConnection(url,"mohamed","20061988");
       //    con = DriverManager.getConnection(url,"root","");
        } catch (SQLException ex) {
            tools.msgBox("SVP vérifer votre serveure");
        }        
    }
     public static int count(String statment)
     {
     ResultSet rp1 = null;
int rowCount1 = 0;
Statement stat;
         try {
             stat = con.createStatement();
             
rp1 = stat.executeQuery(statment);

if (rp1.next())
       rowCount1 = rp1.getInt("rowcount1");
         } catch (SQLException ex) {
             Logger.getLogger(go.class.getName()).log(Level.SEVERE, null, ex);
         }
return rowCount1;
     }
         public static boolean checkUserAndPass(String username, String password){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strCheck = "select * from user where "
                    + "nom='" + username + "' and "
                    + "pass='" + password + "'";
            stmt.executeQuery(strCheck);
            while( stmt.getResultSet().next() ){
                con.close();
                return true;                
            }
            con.close();
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
        }
        return false;
    }
            public static boolean runNonQuery(String sqlStatement){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            stmt.execute(sqlStatement);
            con.close();
            return true;
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());            
            return false;
        }
    }
            public static String getSum(String tableName, String columnName, String condition){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strAuto = "select sum(" + columnName + ") as autonum"
                    + " from " + tableName+" "+condition;
            stmt.executeQuery(strAuto);
            String Num = "";
            while(stmt.getResultSet().next()){
                Num = stmt.getResultSet().getString("autonum");
            }
            con.close();
            if( Num == null || "".equals(Num) ){
                return "0";
            }
            else{
                return Num;
            }            
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
            return "0";
        }
    }
            
            
            
                public static String getAutoNumber(String tableName, String columnName){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            String strAuto = "select max(" + columnName + ")+1 as autonum"
                    + " from " + tableName;
            stmt.executeQuery(strAuto);
            String Num = "";
            while(stmt.getResultSet().next()){
                Num = stmt.getResultSet().getString("autonum");
            }
            con.close();
            if( Num == null || "".equals(Num) ){
                return "1";
            }
            else{
                return Num;
            }            
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
            return "0";
        }
    }
                   public static Table getTableData(String statement){
        tools t = new tools();
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(statement);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            
            Table table = t.new Table(c);
            
            while(rs.next()){
               Object row[] = new Object[c];
               for(int i = 0 ; i < c ; i++){
                   row[i] = rs.getString(i + 1);
               }
               table.addNewRow(row);
            }
            con.close();
            return table;            
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
            return t.new Table(0);
        }
    }
                    public static void fillCombo(String tableName, String columnName, JComboBox combo){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            String strSelect = "select " + columnName + " from " + tableName;
            rs = stmt.executeQuery(strSelect);
            rs.last();
            int c = rs.getRow();
            rs.beforeFirst();
            
            String values[] = new String[c];
            int i = 0;
            while(rs.next()){
                values[i] = rs.getString(1);
                i++;
            }
            con.close();
            
            combo.setModel(new DefaultComboBoxModel(values));
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
        }
    }
                          public static void filliste(String requet, JList list){
     DefaultListModel model=new DefaultListModel();
                              try{
            
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            
            String strSelect = requet;
            rs = stmt.executeQuery(strSelect);
  int v=0;
  while((stmt.getResultSet().next())){  
  model.addElement(rs.getString("nom"));
  v++;
  }
  list.setModel(model);
  
            con.close();
            
 
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
        }
    }
    
            public static void fillToJTable(String tableNameOrSelectStatement, JTable table){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            String SPart = tableNameOrSelectStatement.substring(0, 7).toLowerCase();
            String strSelect;
            if( "select ".equals( SPart ) ){
                strSelect = tableNameOrSelectStatement;
            }
            else{
                strSelect = "select * from " + tableNameOrSelectStatement +" ORDER BY nom ASC";
            }
            rs = stmt.executeQuery(strSelect);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Vector row = new Vector();
            model.setRowCount(0);
            
            while(rs.next()){
                row = new Vector(c);
                for(int i = 1 ; i <= c ; i++){
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if(table.getColumnCount() != c){
                tools.msgBox("JTable Columns Count Not Equal To Query Columns Count\nJTable Columns Count Is: " + table.getColumnCount() + "\nQuery Columns Count Is: " + c);
            }
            con.close();
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
        }
    }
                 public static void fillToJTableMedicament(JTable table){
        try{
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
          
            String strSelect;
           
                strSelect = "select  nom_dci  from dci" ;
            
            rs = stmt.executeQuery(strSelect);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Vector row = new Vector();
            model.setRowCount(0);
            
            while(rs.next()){
                row = new Vector(c);
                for(int i = 1 ; i <= c ; i++){
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }
            if(table.getColumnCount() != c){
                tools.msgBox("JTable Columns Count Not Equal To Query Columns Count\nJTable Columns Count Is: " + table.getColumnCount() + "\nQuery Columns Count Is: " + c);
            }
            con.close();
        }
        catch(SQLException ex){
            tools.msgBox(ex.getMessage());
        }
    }
    
}
