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
public class forn implements mainData{
    private int id;
    private String nom;
    private String email;
     private String address;
    private String ntel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNtel() {
        return ntel;
    }

    public void setNtel(String ntel) {
        this.ntel = ntel;
    }

    @Override
    public void add() {
   String strInsert = "insert into fournisseur values("
                + id + ","
                + "'" + nom + "',"
                + "'" + address + "',"
                + "'" + email + "',"
                + "'" + ntel + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msgBox("le Fournisseure   "+nom+" est ajouter");
        }    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAutoNumber() {
 return db.go.getAutoNumber("fournisseur", "id");    }

    @Override
    public void getAllRows(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRows1(String table, String colum, JComboBox combo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllRows2(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getOneRow(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
 db.go.fillToJTable(statement, table);    }

    @Override
    public String getValueByName(String name) {
  String strSelect = "select id from comande"
                + " where nb_fact='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;    }

    @Override
    public String getNameByValue(String value) {
String strSelect = "select nom_for from comande"
                + " where id=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;    }

    public String getAddress() {
        return address;
    }
       public String getValueByName1(String name) {
  String strSelect = "select  id from comande"
                + " where n_lot='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;    }
           public String getNameByValue1(String value) {
String strSelect = "select nom_for from comande"
                + " where id=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
