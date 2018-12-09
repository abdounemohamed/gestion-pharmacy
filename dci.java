package entity;


import javax.swing.JComboBox;
import javax.swing.JTable;
import work.tools;

public class dci implements mainData {
  
    private String dci;

    public String getDci() {
        return dci;
    }

    public void setDci(String dci) {
        this.dci = dci;
    }

    @Override
    public void add() {
        
        String strInsert = "insert into dci values('"
                 + dci + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msgBox(" "+dci+"  est ajouter comme DCI");
        }
       }

    @Override
    public void update() {
  }

    @Override
    public void delete() {
   String strDelete = "delete from dci"
                + " where nom_dci like '" + dci+"'";
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msgBox("le DCI est supprimer");
        }    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("medicamant", "id_mid");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("select * from dci",table);
    }
     @Override
    public void getAllRows2(JTable table) {
        db.go.fillToJTableMedicament(table);
    }

    @Override
    public void getOneRow(JTable table) {
       
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select id_mid from medicamant"
                + " where nom='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select nom from medicamant"
                + " where id_mid=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public void getAllRows1(String table, String colum, JComboBox combo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

