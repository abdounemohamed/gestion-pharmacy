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
public class ordonance implements mainData{
     private int id;
    private String nom;
    private String type;
    private float prix;
    private float total;
    private int qte;
    private int qtestock;
    private int nbr;    
    private String date;
    private String date_exp;
    private String n_lot;
       private String client;
    

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

     @Override
    public void add() {
        
        String strInsert = "insert into ordonanace values("
                + id + ","
                + "'" + nom + "',"
                + "'" + date_exp + "',"
                + "'" + n_lot + "',"
                + "'" + prix + "',"
                + "'" + total+ "',"
                + "'" + nbr+ "',"
                + "'" + type+ "',"
                + "'" + qte+ "',"
                + "'" + date+ "',"
                + "'" +client + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
           // tools.msgBox("ordonance +");
        } 
       
       }
     /* @Override
    public void update() {
 String strUpdate = "update ordonanace set "
          + "id_ord='" + id + "', "
          + "nom_produit='" + nom + "',"
         + "prix='" + prix + "', "
         + "total='" + total + "', "
         + "nbr='" + nbr + "', "
         + "type='" + type + "', "
        + "qte='" + qte + "', "
         + "date='" + date + "' "
                + " where id=" + id;
      boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            tools.msgBox("le medicament est mis a jour");
        }   
    }*/

    @Override
    public void update() {
 String strUpdate = "update stock set "
          + "qte='" + (qtestock-qte) + "' "
                + " where n_lot='" + n_lot+"'"
         + "AND prix='"+prix+"'"
         + "AND date='"+date_exp+"' AND nom='"+nom+"'";
      boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
           // tools.msgBox("le medicament est mis a jour");
        }   
    }
       public void updateordonance(int qte,int qteold,float p,float pold,int id) {
 String strUpdate = "update ordonanace set "
          + "qte='" + (qteold-qte) + "', "
         + "total='" + (pold-p) + "' "
                + " where id_ord='" + id+"'";
      boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
       // tools.msgBox("le medicament est mis a jour");
        }   
    }
              public void updatecmd(int qte,int qteold,String nlot,String date,float price,String nom) {
 String strUpdate = "update stock set "
          + "qte='" + (qteold+qte) + "' "
                + " where "
         + "n_lot='"+nlot+"' AND "
         + "date='"+date+"'  AND "
         + "prix='"+price+"' "
         + "AND nom='"+nom+"' ;";
      boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
        tools.msgBox("la commande est mis a jour");
        }   
    }

    public int getQtestock() {
        return qtestock;
    }

    public void setQtestock(int qtestock) {
        this.qtestock = qtestock;
    }

    @Override
    public void delete() {
   String strDelete = "delete from ordonanace"
                + " where id_ord=" + id;
       boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msgBox("le produit est supprimer");
        }    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("ordonanace", "id_ord");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("select nbr,nom_produit,prix,qte,total from ordonanace;",table);
    }
     @Override
    public void getAllRows1(String table,String colum,JComboBox combo) {
        db.go.fillCombo(table, colum, combo);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from ordonanace "
                + " where id_ord=" + id;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select qte from comande"
                + " where n_lot='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
       public String getqteByName(String name,String nlot,float prix,String date) {
        String strSelect = "select qte from stock"
                + " where n_lot='" + nlot + "' AND prix='"+prix+"' AND date='"+date+"' AND nom='"+name+"'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
        }
       public String getqteByid_stock(int id_stock) {
        String strSelect = "select qte from stock"
                + " where id='" + id_stock + "';";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
        }
       public String getqteByName1(String nlot,float prix,String date) {
        String strSelect = "select qte from stock"
                + " where n_lot='" + nlot + "' AND prix='"+prix+"' AND date='"+date+"'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
        }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select nom_ord from ordonanace"
                + " where id_ord=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
     public String getqte(String id) {
        String strSelect = "select qte from ordonanace"
                + " where id_ord=" + id;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
       public String getqtecmd(String id) {
        String strSelect = "select qte from stock"
                + " where id=" + id;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
      public String getprixtotal(String id) {
        String strSelect = "select total from ordonanace"
                + " where id_ord=" + id;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
    
    public String getValueByName1(String name) {
        String strSelect = "select id_ord from ordonanace"
                + " where nom_produit='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
     public String getByName(String name,int nbr,float price) {
        String strSelect = "select id_ord from ordonanace"
                + " where nom_produit='" + name + "'AND nbr='" + nbr + "'AND prix='" + price + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }
       public String getByNamecmd(String nlot,String name,String date) {
        String strSelect = "select id from stock"
                + " where n_lot='" + nlot+ "'AND nom='"+name+"' AND date='"+date+"'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

   
    public String getNameByValue1(String value) {
        String strSelect = value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public void getAllRows2(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(String date_exp) {
        this.date_exp = date_exp;
    }

    public String getN_lot() {
        return n_lot;
    }

    public void setN_lot(String n_lot) {
        this.n_lot = n_lot;
    }
    
    
}
