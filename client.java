/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.swing.JComboBox;
import javax.swing.JTable;
import work.tools;

/**
 *
 * @author choqib
 */
public class client implements mainData{
    private String nom;
    private String total;
    private  int id;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
 @Override
    public void add() {
        
        String strInsert = "insert into client values("
                + id + ","
                + "'" + nom + "',"

                + "'" + total + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
           tools.msgBox("Avec succes .\n Client: "+nom+" est ajuter.");  
        }
       }

    @Override
    public void update() {
 String strUpdate = "update client set "
          + "total='" + total + "' "
                + " where id_client=" + id;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
           // tools.msgBox("la comande est mis a jour");
        }    }
        public void updateClient(float oldtot,float versement) {
 String strUpdate = "update client set "
          + "total='" +(oldtot-versement)+ "' "
                + " where id_client=" + id;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
           tools.msgBox("Avec succes .\n Reste: "+(oldtot-versement));
        }    }

    @Override
    public void delete() {
   String strDelete = "delete from client"
                + " where id_client=" + id;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msgBox("le client est supprimer");
        }    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("client", "id");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("select * from client where id_client="+id,table);
    }
     @Override
    public void getAllRows1(String table,String colum,JComboBox combo) {
        db.go.fillCombo(table, colum, combo);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from client "
                + " where id_client=" + id;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select id_client from client"
                + " where nom='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
     public String gettotalbyid(String name) {
        String strSelect = "select total from client"
                + " where id_client='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select total from client"
                + " where id_client=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public void getAllRows2(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
