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
 * @author choaib
 */
public class achat implements mainData{

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
     private int id;
     private float ppa;
     private String nlot;

    public String getNlot() {
        return nlot;
    }

    public void setNlot(String nlot) {
        this.nlot = nlot;
    }
     private int qte;
     private int ug;

    public int getUg() {
        return ug;
    }

    public void setUg(int ug) {
        this.ug = ug;
    }
     private String nbf;
     private float pht;
     private float pvent;
     private float shp;
     private String mge;
    private String nom;
    private String date;
    private String nom_forn;
    private String date_achat;
    private String type;

    public String getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(String date_achat) {
        this.date_achat = date_achat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPpa() {
        return ppa;
    }

    public void setPpa(float ppa) {
        this.ppa = ppa;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public float getPht() {
        return pht;
    }

    public void setPht(float pht) {
        this.pht = pht;
    }

    public float getPvent() {
        return pvent;
    }

    public void setPvent(float pvent) {
        this.pvent = pvent;
    }

    public float getShp() {
        return shp;
    }

    public void setShp(float shp) {
        this.shp = shp;
    }

    public String getMge() {
        return mge;
    }

    public void setMge(String mge) {
        this.mge = mge;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom_forn() {
        return nom_forn;
    }

    public void setNom_forn(String nom_forn) {
        this.nom_forn = nom_forn;
    }

   @Override
    public void add() {
        
        String strInsert = "insert into comande values("
                + id + ","
                + "'" + nom + "',"
                + "'" + ppa + "',"
               + "'" + date + "',"
                + "'" + nlot + "',"
                + "'" + qte + "',"
                + "'" + pht + "',"
                + "'" + pvent + "',"
                + "'" + shp + "',"
                + "'" + mge + "',"+
                  "'" + nom_forn + "',"+
                  "'" + nbf + "',"+
                  "'" + ug + "',"+
                "'" + date_achat + "',"
                + "'" + type + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msgBox("comande N°"+id+"est ajouter");
        }
       }

    @Override
    public void update() {
 String strUpdate = "update comande set "                
         + "nom_produit='" + nom + "',"
          + "ppa='" + ppa + "',"
          + "exp='" + date + "', "
         + "n_lot='" + nlot + "', "
         + "qte='" + qte + "', "
         + "pht='" + pht + "', "
         +"pvent='" + pvent + "', "
          + "shp='" + shp + "', "
         + "mge='" + mge + "', "
         + "nom_for='" + nom_forn + "', "
         + "nb_fact='" + nbf + "', "
         + "ug='" + ug + "', "
         + "date_achat='" + date_achat + "', "
         + "type='" + type + "' where id='"+id+"'; ";
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
           // tools.msgBox("la comande est mis a jour");
        }    }
    

    @Override
    public void delete() {
   String strDelete = "delete from comande"
                + " where id=" + id;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msgBox("la commande est supprimer");
        }    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("comande", "id");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("select * from comande where nb_fact='"+nbf+"'",table);
    }
     @Override
    public void getAllRows1(String table,String colum,JComboBox combo) {
        db.go.fillCombo(table, colum, combo);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from comande "
                + " where id=" + id;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select id from comande"
                + " where nom='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select nom_for from comande"
                + " where nb_fact=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
     public String getqteByid(String id) {
        String strSelect = "select qte from comande"
                + " where id=" + id;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }
       public String getDATEByid(String id) {
        String strSelect = "select date_achat from comande"
                + " where id=" + id;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public void getAllRows2(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNbf() {
        return nbf;
    }

    public void setNbf(String nbf) {
        this.nbf = nbf;
    }
    
    
}
