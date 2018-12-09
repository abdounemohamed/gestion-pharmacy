package entity;


import javax.swing.JComboBox;
import javax.swing.JTable;
import work.tools;

public class midicament implements mainData {
    private int idm;
    private String nom;
    private String dci;
    private String forme;
    private String dosage;

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    

    public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDci() {
        return dci;
    }

    public void setDci(String dci) {
        this.dci = dci;
    }

    @Override
    public void add() {
        
        String strInsert = "insert into produit values("
                + idm + ","
                + "'" + dci + "',"
                + "'" + nom + "',"
                + "'" + forme + "',"
                + "'" + dosage + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msgBox("medicament est ajouter");
        }
       }

    @Override
    public void update() {
 String strUpdate = "update produit set "
          + "dci='" + dci + "', "
          + "nom='" + nom + "',"
         + "forme='" + forme + "', "
         + "dosage='" + dosage + "' "
                + " where id=" + idm;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            tools.msgBox("le medicament est mis a jour");
        }    }

    @Override
    public void delete() {
   String strDelete = "delete from produit"
                + " where id=" + idm;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msgBox("le medicament est supprimer");
        }    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("produit", "id");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("select id,nom,dci,forme,dosage from produit;",table);
    }
     @Override
    public void getAllRows1(String table,String colum,JComboBox combo) {
        db.go.fillCombo(table, colum, combo);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from produit "
                + " where id=" + idm;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select id from produit"
                + " where nom='" + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).Items[0][0];
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select nom from produit"
                + " where id=" + value;
        String strName = (String)db.go.getTableData(strSelect).Items[0][0];
        return strName;
    }

    @Override
    public void getAllRows2(JTable table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
