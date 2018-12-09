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
public class stock implements mainData{
  private int id,qte;
  private String nom;
  private String date,n_lot;
  private float prix,prixachat;

    public float getPrixachat() {
        return prixachat;
    }

    public void setPrixachat(float prixachat) {
        this.prixachat = prixachat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
  @Override
    public void add() {
        
        String strInsert = "insert into stock values("
                + id + ","
                + "'" + nom + "',"
                + "'" + prix + "',"
               + "'" + date + "',"
                 + "'" + qte + "',"
                + "'" + n_lot + "',"
                + "'',"
                + "'',"
                + "'"+prixachat+"')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
           // tools.msgBox("STOCK N°"+id+"est ajouter");
        }
       }

    @Override
    public void update() {
 String strUpdate = "update stock set "
         + "qte='" + qte + "'"
                + " where "
          + "id=" + id + " ";
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            //tools.msgBox("le stock est mis a jour ");
        }    }
    

    @Override
    public void delete() {
   String strDelete = "delete from stock"
                + " where id=" + id;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            //tools.msgBox("la commande est supprimer");
        }    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("stock", "id");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("select * from stock ",table);
    }
     @Override
    public void getAllRows1(String table,String colum,JComboBox combo) {
        db.go.fillCombo(table, colum, combo);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from stock "
                + " where id=" + id;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select id from stock"
                + " where n_lot='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
      public String getValueByNamesandnlot() {
        String strSelect = "select id from stock"
                + " where n_lot='" + n_lot + "' AND nom='"+nom+"' AND prix='"+prix+"' AND date='"+date+"'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
        public String getValueByNameparapharm(String name) {
        String strSelect = "select id from stock"
                + " where nom='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
     public String getValueByNames(String name,String nlot,String date,float prix) {
        String strSelect = "select id from stock"
                + " where nom='" + name + "' AND n_lot='"+nlot+"' AND date='"+date+"' AND prix="+prix+"";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
     }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select nom from stock"
                + " where id=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
     public String getqteByValue(String value) {
        String strSelect = "select qte from stock"
                + " where id=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
      public String getnlotByValue(String value) {
        String strSelect = "select n_lot from stock"
                + " where id=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public void getAllRows2(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getN_lot() {
        return n_lot;
    }

    public void setN_lot(String n_lot) {
        this.n_lot = n_lot;
    }
    
    
}