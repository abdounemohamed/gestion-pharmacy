/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import controls.mycolortable;
import entity.achat;
import entity.midicament;
import entity.stock;
import static forms.frmvalidation.tabcmd;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import work.tools;

/**
 *
 * @author choqib
 */
public class frmAchat extends javax.swing.JFrame {
midicament m= new midicament();
    achat a=new achat();
    stock st=new stock();
int i=0;
String strnlot;String strqte,strnom;

  boolean row_Is_Selected = false;
    int index;
    DefaultTableModel model;
    String nbc=(a.getAutoNumber());
    String name;
   String facture_nb;
    /**
     * Creates new form frmAchat
     */
   
    public frmAchat() {
        
        
        //prixpara.setEditable(false);
    
        
 this.setUndecorated(false);
        this.setAlwaysOnTop(false);
       this.setResizable(false);
        this.setVisible(true);
        
    
        initComponents();
        tabcmd.setDefaultRenderer(Object.class, new mycolortable() );
        tabcmd.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        this.setSize(1440, 750);
        stest.setVisible(false);
        test.setVisible(false);
         stest2.setVisible(false);
        test2.setVisible(false);
        btvalidation1.setVisible(false);
         
 stabmed.setVisible(false);
 stabpara.setVisible(false);
        tabmed.setVisible(false);
         tabpara.setVisible(false);
        // tabforn.setVisible(false);
        // stabforn.setVisible(false);
         
          a.getAllRows1("fournisseur", "nom", combo);
        
            AutoCompleteDecorator.decorate(combo);
          nb.setText(a.getAutoNumber());
          combo.setEditable(false);
          //a.getAllRows(tabcmd);
          grp.add(radm);
 grp.add(radp);
 if(radm.isSelected())
 {
     para.setEnabled(false);
     prixpara.setEnabled(false);
     qtepara.setEnabled(false);
          dateexppara.setEnabled(false);
     ugpa.setEnabled(false);
     prixventpara.setEnabled(false);
 }
  if(radp.isSelected())
 {
     ppa.setEnabled(false);
     prixmed.setEnabled(false);
     qtemed.setEnabled(false);
     ppa.setEnabled(false);
     shp.setEnabled(false);
     prixVente.setEnabled(false);
     marge.setEnabled(false);
     dateexp.setEnabled(false);
     //qtemed.setEnabled(false);
     
 }
  btvalidation.setEnabled(false);
btnvalid.setEnabled(true);
btnmsj.setEnabled(false);
//panevalid.setVisible(false);
combo.requestFocus();
Calendar clndr =Calendar.getInstance();
 datetest.setCalendar(clndr);
 datetest.setVisible(false);
 dateexp.setCalendar(clndr);
  dateexppara.setCalendar(clndr);
 btngroup2.add(rdobl);
 btngroup2.add(rdof);

 tabcmd.setAutoResizeMode(tabcmd.AUTO_RESIZE_OFF);
 TableColumn col=tabcmd.getColumnModel().getColumn(0);
 col.setPreferredWidth(30);
 col=tabcmd.getColumnModel().getColumn(1);
 col.setPreferredWidth(300);
  col=tabcmd.getColumnModel().getColumn(2);
 col.setPreferredWidth(80);
  col=tabcmd.getColumnModel().getColumn(3);
 col.setPreferredWidth(100);
  col=tabcmd.getColumnModel().getColumn(4);
 col.setPreferredWidth(80);
  col=tabcmd.getColumnModel().getColumn(5);
 col.setPreferredWidth(40);
  col=tabcmd.getColumnModel().getColumn(6);
 col.setPreferredWidth(90);
  col=tabcmd.getColumnModel().getColumn(7);
 col.setPreferredWidth(100);
  col=tabcmd.getColumnModel().getColumn(8);
 col.setPreferredWidth(50);
  col=tabcmd.getColumnModel().getColumn(9);
 col.setPreferredWidth(60);
  col=tabcmd.getColumnModel().getColumn(10);
 col.setPreferredWidth(200);
  col=tabcmd.getColumnModel().getColumn(11);
 col.setPreferredWidth(50);
  col=tabcmd.getColumnModel().getColumn(12);
 col.setPreferredWidth(30);
  col=tabcmd.getColumnModel().getColumn(13);
 col.setPreferredWidth(80);
  col=tabcmd.getColumnModel().getColumn(14);
 col.setPreferredWidth(40);
   tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.green);
    tabmed.setRowHeight(23);
       
       
       
      
       
           }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup = new javax.swing.ButtonGroup();
        btngroup2 = new javax.swing.ButtonGroup();
        grp = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdof = new javax.swing.JRadioButton();
        rdobl = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nbf = new javax.swing.JTextField();
        mantant = new javax.swing.JTextField();
        txt = new javax.swing.JLabel();
        ppa = new javax.swing.JTextField();
        stabmed = new javax.swing.JScrollPane();
        tabmed = new javax.swing.JTable();
        med = new javax.swing.JTextField();
        prixmed = new javax.swing.JTextField();
        qtemed = new javax.swing.JTextField();
        nlot = new javax.swing.JTextField();
        shp = new javax.swing.JTextField();
        marge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        stabpara = new javax.swing.JScrollPane();
        tabpara = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabcmd = new javax.swing.JTable();
        para = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        prixpara = new javax.swing.JTextField();
        qtepara = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btvalidation = new javax.swing.JButton();
        btnvalid = new javax.swing.JButton();
        btvalidation1 = new javax.swing.JButton();
        nb = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        ug = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prixVente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        radm = new javax.swing.JRadioButton();
        radp = new javax.swing.JRadioButton();
        ucp = new javax.swing.JLabel();
        ugpa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        prixventpara = new javax.swing.JTextField();
        stest = new javax.swing.JScrollPane();
        test = new javax.swing.JTable();
        margepara = new javax.swing.JTextField();
        margepara1 = new javax.swing.JLabel();
        dateexppara = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnmsj = new javax.swing.JButton();
        dateexp = new com.toedter.calendar.JDateChooser();
        stest2 = new javax.swing.JScrollPane();
        test2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        datetest = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/edit-icon.png"))); // NOI18N
        jMenuItem1.setText("modifié");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/delete.png"))); // NOI18N
        jMenuItem3.setText("Supprimer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem2.setText("jMenuItem2");
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Fournesseurs");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 80, 176, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("N° Cmd");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 60, 21);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Type d'Achat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(860, 80, 99, 21);

        rdof.setBackground(new java.awt.Color(73, 125, 210));
        rdof.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdof.setMnemonic('F');
        rdof.setSelected(true);
        rdof.setText("Facteure");
        getContentPane().add(rdof);
        rdof.setBounds(840, 100, 80, 40);

        rdobl.setBackground(new java.awt.Color(50, 87, 178));
        rdobl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdobl.setMnemonic('b');
        rdobl.setText("BL");
        getContentPane().add(rdobl);
        rdobl.setBounds(920, 100, 60, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("N°  F/BL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(570, 80, 99, 21);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Mantant Facture");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(680, 80, 120, 21);

        nbf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nbf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nbfKeyReleased(evt);
            }
        });
        getContentPane().add(nbf);
        nbf.setBounds(570, 100, 80, 30);

        mantant.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        mantant.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(mantant);
        mantant.setBounds(660, 100, 180, 30);

        txt.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txt.setText("________Les Achats Details_______________________________________________________________________________________");
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });
        getContentPane().add(txt);
        txt.setBounds(0, 130, 1360, 20);

        ppa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ppa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ppaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ppaKeyTyped(evt);
            }
        });
        getContentPane().add(ppa);
        ppa.setBounds(660, 200, 100, 30);

        tabmed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Désignation", "Forme", "Dosage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabmed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabmedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabmedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tabmedKeyTyped(evt);
            }
        });
        stabmed.setViewportView(tabmed);
        if (tabmed.getColumnModel().getColumnCount() > 0) {
            tabmed.getColumnModel().getColumn(0).setResizable(false);
            tabmed.getColumnModel().getColumn(1).setResizable(false);
            tabmed.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(stabmed);
        stabmed.setBounds(20, 230, 510, 130);

        med.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medActionPerformed(evt);
            }
        });
        med.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medKeyTyped(evt);
            }
        });
        getContentPane().add(med);
        med.setBounds(20, 200, 510, 30);

        prixmed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prixmed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prixmedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixmedKeyTyped(evt);
            }
        });
        getContentPane().add(prixmed);
        prixmed.setBounds(10, 270, 80, 30);

        qtemed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qtemed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtemedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtemedKeyTyped(evt);
            }
        });
        getContentPane().add(qtemed);
        qtemed.setBounds(100, 270, 50, 30);

        nlot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nlot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nlotKeyReleased(evt);
            }
        });
        getContentPane().add(nlot);
        nlot.setBounds(540, 200, 100, 30);

        shp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        shp.setText("0");
        shp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shpActionPerformed(evt);
            }
        });
        shp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                shpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                shpKeyTyped(evt);
            }
        });
        getContentPane().add(shp);
        shp.setBounds(300, 270, 100, 30);

        marge.setEditable(false);
        marge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(marge);
        marge.setBounds(410, 270, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Date d'EXP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 240, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("PPA sans SHP");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(670, 180, 100, 15);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Désignation / Nom de Produit");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(40, 180, 230, 14);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Prix d'Achat");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 240, 80, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Qte");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(100, 240, 50, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("N° Lot");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(550, 170, 50, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("SHP");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(300, 240, 70, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Marge");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(410, 240, 70, 30);

        tabpara.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabpara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Désignation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabpara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabparaKeyReleased(evt);
            }
        });
        stabpara.setViewportView(tabpara);
        if (tabpara.getColumnModel().getColumnCount() > 0) {
            tabpara.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(stabpara);
        stabpara.setBounds(840, 230, 410, 130);

        tabcmd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabcmd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Désignation", "PPA", "Date d'Exp", "N° Lot", "QTE", "Prix Achat ", "Prix Vent", "Shp", "Marge", "Fournisseure", "N° F/BL", "UG", "Date d'Achat", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabcmd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabcmdMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabcmdMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabcmd);
        if (tabcmd.getColumnModel().getColumnCount() > 0) {
            tabcmd.getColumnModel().getColumn(0).setResizable(false);
            tabcmd.getColumnModel().getColumn(1).setResizable(false);
            tabcmd.getColumnModel().getColumn(2).setResizable(false);
            tabcmd.getColumnModel().getColumn(3).setResizable(false);
            tabcmd.getColumnModel().getColumn(4).setResizable(false);
            tabcmd.getColumnModel().getColumn(5).setResizable(false);
            tabcmd.getColumnModel().getColumn(6).setResizable(false);
            tabcmd.getColumnModel().getColumn(7).setResizable(false);
            tabcmd.getColumnModel().getColumn(8).setResizable(false);
            tabcmd.getColumnModel().getColumn(9).setResizable(false);
            tabcmd.getColumnModel().getColumn(10).setResizable(false);
            tabcmd.getColumnModel().getColumn(11).setResizable(false);
            tabcmd.getColumnModel().getColumn(12).setResizable(false);
            tabcmd.getColumnModel().getColumn(13).setResizable(false);
            tabcmd.getColumnModel().getColumn(14).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 1320, 340);

        para.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        para.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paraKeyReleased(evt);
            }
        });
        getContentPane().add(para);
        para.setBounds(840, 200, 410, 30);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Désignation / Nom de Produit");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(850, 180, 230, 14);

        prixpara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prixpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixparaActionPerformed(evt);
            }
        });
        prixpara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prixparaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixparaKeyTyped(evt);
            }
        });
        getContentPane().add(prixpara);
        prixpara.setBounds(840, 260, 80, 30);

        qtepara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        qtepara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qteparaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qteparaKeyTyped(evt);
            }
        });
        getContentPane().add(qtepara);
        qtepara.setBounds(930, 260, 50, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Prix d'achat");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(840, 230, 80, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Qte");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(930, 230, 50, 30);

        btnadd.setBackground(new java.awt.Color(0, 0, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setMnemonic('i');
        btnadd.setText("Insérie line Cmd");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(60, 310, 180, 30);

        btvalidation.setBackground(new java.awt.Color(0, 102, 0));
        btvalidation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btvalidation.setForeground(new java.awt.Color(255, 255, 255));
        btvalidation.setMnemonic('s');
        btvalidation.setText("Validation de F/BL");
        btvalidation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvalidationActionPerformed(evt);
            }
        });
        getContentPane().add(btvalidation);
        btvalidation.setBounds(630, 310, 180, 30);

        btnvalid.setBackground(new java.awt.Color(0, 102, 102));
        btnvalid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnvalid.setForeground(new java.awt.Color(255, 255, 255));
        btnvalid.setMnemonic('v');
        btnvalid.setText("Vérification");
        btnvalid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvalidActionPerformed(evt);
            }
        });
        getContentPane().add(btnvalid);
        btnvalid.setBounds(440, 310, 170, 30);

        btvalidation1.setBackground(new java.awt.Color(0, 102, 0));
        btvalidation1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btvalidation1.setForeground(new java.awt.Color(255, 255, 255));
        btvalidation1.setMnemonic('s');
        btvalidation1.setText("Help!!!!!");
        btvalidation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvalidation1ActionPerformed(evt);
            }
        });
        getContentPane().add(btvalidation1);
        btvalidation1.setBounds(550, 20, 180, 30);

        nb.setEditable(false);
        nb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nb);
        nb.setBounds(20, 100, 60, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Date d'Achat");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(120, 80, 99, 21);

        date1.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date1);
        date1.setBounds(90, 100, 130, 30);

        ug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ug.setText("0");
        ug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugActionPerformed(evt);
            }
        });
        ug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ugKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ugKeyTyped(evt);
            }
        });
        getContentPane().add(ug);
        ug.setBounds(490, 270, 50, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Prix Vent");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 250, 70, 15);

        prixVente.setEditable(false);
        prixVente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prixVente.setForeground(new java.awt.Color(0, 153, 0));
        prixVente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prixVenteKeyReleased(evt);
            }
        });
        getContentPane().add(prixVente);
        prixVente.setBounds(550, 270, 110, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("U G");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(490, 250, 34, 15);

        combo.setEditable(true);
        combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        combo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboKeyReleased(evt);
            }
        });
        getContentPane().add(combo);
        combo.setBounds(230, 100, 320, 30);

        radm.setBackground(new java.awt.Color(51, 92, 180));
        radm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radm.setSelected(true);
        radm.setText("Medicament");
        radm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radmMouseClicked(evt);
            }
        });
        radm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radmActionPerformed(evt);
            }
        });
        getContentPane().add(radm);
        radm.setBounds(20, 150, 99, 23);

        radp.setBackground(new java.awt.Color(50, 87, 178));
        radp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radp.setText("Parapharm");
        radp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radpMouseClicked(evt);
            }
        });
        getContentPane().add(radp);
        radp.setBounds(830, 150, 91, 23);

        ucp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/Shopping-cart-add-icon.png"))); // NOI18N
        getContentPane().add(ucp);
        ucp.setBounds(1050, 30, 170, 190);

        ugpa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ugpa.setText("0");
        ugpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugpaActionPerformed(evt);
            }
        });
        ugpa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ugpaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ugpaKeyTyped(evt);
            }
        });
        getContentPane().add(ugpa);
        ugpa.setBounds(1220, 260, 59, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("UG");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1230, 230, 40, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Date EXP");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1000, 230, 70, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Prix de Vente");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(1130, 230, 90, 30);

        prixventpara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prixventpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixventparaActionPerformed(evt);
            }
        });
        prixventpara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prixventparaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixventparaKeyTyped(evt);
            }
        });
        getContentPane().add(prixventpara);
        prixventpara.setBounds(1130, 260, 80, 30);

        test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stest.setViewportView(test);
        if (test.getColumnModel().getColumnCount() > 0) {
            test.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(stest);
        stest.setBounds(1280, 200, 100, 70);

        margepara.setEditable(false);
        margepara.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        margepara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                margeparaActionPerformed(evt);
            }
        });
        margepara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                margeparaKeyReleased(evt);
            }
        });
        getContentPane().add(margepara);
        margepara.setBounds(840, 310, 70, 30);

        margepara1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        margepara1.setText("Marge");
        getContentPane().add(margepara1);
        margepara1.setBounds(840, 290, 40, 20);

        dateexppara.setDateFormatString("yyyy-MM-dd");
        dateexppara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateexpparaKeyReleased(evt);
            }
        });
        getContentPane().add(dateexppara);
        dateexppara.setBounds(990, 260, 130, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 153, 0));
        jLabel33.setText("Nouvelle Commande");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(910, 30, 400, 50);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/ch17.png"))); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(860, 10, 90, 70);

        btnmsj.setBackground(new java.awt.Color(0, 204, 204));
        btnmsj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmsj.setForeground(new java.awt.Color(255, 255, 255));
        btnmsj.setMnemonic('v');
        btnmsj.setText("Valider");
        btnmsj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmsjActionPerformed(evt);
            }
        });
        getContentPane().add(btnmsj);
        btnmsj.setBounds(250, 310, 180, 30);

        dateexp.setDateFormatString("yyyy-MM-dd");
        dateexp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dateexpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateexpKeyReleased(evt);
            }
        });
        getContentPane().add(dateexp);
        dateexp.setBounds(160, 270, 130, 30);

        test2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stest2.setViewportView(test2);
        if (test2.getColumnModel().getColumnCount() > 0) {
            test2.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(stest2);
        stest2.setBounds(1280, 120, 100, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/ch33.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 70, 1390, 750);

        datetest.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(datetest);
        datetest.setBounds(390, 20, 130, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/work/BB_Blue.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1410, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
btvalidation.setEnabled(false);
btnvalid.setEnabled(true);
//panevalid.setVisible(false);
combo.requestFocus();
Calendar clndr =Calendar.getInstance();
 //date1.setCalendar(clndr);
 dateexp.setCalendar(clndr);
 btngroup2.add(rdobl);
 btngroup2.add(rdof);

 tabcmd.setAutoResizeMode(tabcmd.AUTO_RESIZE_OFF);
 TableColumn col=tabcmd.getColumnModel().getColumn(0);
 col.setPreferredWidth(20);
 col=tabcmd.getColumnModel().getColumn(1);
 col.setPreferredWidth(300);
  col=tabcmd.getColumnModel().getColumn(2);
 col.setPreferredWidth(80);
  col=tabcmd.getColumnModel().getColumn(3);
 col.setPreferredWidth(100);
  col=tabcmd.getColumnModel().getColumn(4);
 col.setPreferredWidth(80);
  col=tabcmd.getColumnModel().getColumn(5);
 col.setPreferredWidth(40);
  col=tabcmd.getColumnModel().getColumn(6);
 col.setPreferredWidth(90);
  col=tabcmd.getColumnModel().getColumn(7);
 col.setPreferredWidth(100);
  col=tabcmd.getColumnModel().getColumn(8);
 col.setPreferredWidth(50);
  col=tabcmd.getColumnModel().getColumn(9);
 col.setPreferredWidth(60);
  col=tabcmd.getColumnModel().getColumn(10);
 col.setPreferredWidth(200);
  col=tabcmd.getColumnModel().getColumn(11);
 col.setPreferredWidth(50);
  col=tabcmd.getColumnModel().getColumn(12);
 col.setPreferredWidth(30);
  col=tabcmd.getColumnModel().getColumn(13);
 col.setPreferredWidth(80);
  col=tabcmd.getColumnModel().getColumn(14);
 col.setPreferredWidth(40);
   tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.green);
    tabmed.setRowHeight(23);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void medKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medKeyReleased
if(med.getText().isEmpty()){
tabmed.setVisible(false);
stabmed.setVisible(false);
}
else{
 tabmed.getTableHeader().setBackground(new Color(0,0,100));
tabmed.getTableHeader().setForeground(Color.white);
tabmed.setShowGrid(false);
tabmed.setShowVerticalLines(false);
tabmed.setColumnSelectionAllowed(false);
tabmed.setRowSelectionAllowed(true);
tabmed.setSelectionBackground(Color.green);  
tabmed.setRowHeight(25);
       
    
        m.getCustomRows("select nom,forme,dosage from produit where nom like'"+med.getText()+"%';", tabmed);
        tabmed.setVisible(true);
stabmed.setVisible(true);

if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    if(tabmed.getRowCount()==1){
   // med.setText(tabmed.getValueAt(0, 0).toString());
                     String strno=tabmed.getValueAt(0, 0).toString();
  String strno1=tabmed.getValueAt(0, 1).toString();
   String strno2=tabmed.getValueAt(0, 2).toString();
 med.setText(strno+"  "+strno1+"  "+strno2);
    nlot.requestFocus();
    stabmed.setVisible(false);
    tabmed.setVisible(false);
    }
    else{
tabmed.requestFocus();
    }
}


} // TODO add your handling code here:
    }//GEN-LAST:event_medKeyReleased

    private void medKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medKeyPressed


          // TODO add your handling code here:
    }//GEN-LAST:event_medKeyPressed

    private void tabmedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabmedKeyReleased
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         int row=tabmed.getSelectedRow();
            int rowc=tabmed.getRowCount();
            if(row==0){
                 String strno=tabmed.getValueAt(rowc-1, 0).toString();
  String strno1=tabmed.getValueAt(rowc-1, 1).toString();
   String strno2=tabmed.getValueAt(rowc-1, 2).toString();
 med.setText(strno+"  "+strno1+"  "+strno2);
 nlot.requestFocus();
 tabmed.setVisible(false);
 stabmed.setVisible(false);
            }
            else{      
 
 String strno=tabmed.getValueAt(row-1, 0).toString();
  String strno1=tabmed.getValueAt(row-1, 1).toString();
   String strno2=tabmed.getValueAt(row-1, 2).toString();
 med.setText(strno+"  "+strno1+"  "+strno2);
 nlot.requestFocus();
 tabmed.setVisible(false);
 stabmed.setVisible(false);
            }
 }  // TODO add your handling code here:
    }//GEN-LAST:event_tabmedKeyReleased

    private void medKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medKeyTyped
 //        // TODO add your handling code here:
    }//GEN-LAST:event_medKeyTyped

    private void tabmedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabmedKeyPressed

// TODO add your handling code here:
    }//GEN-LAST:event_tabmedKeyPressed

    private void tabmedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabmedKeyTyped
// TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_tabmedKeyTyped

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
if(radm.isSelected()){       
        if((prixmed.getText().isEmpty())|(ppa.getText().isEmpty())|
                (prixVente.getText().isEmpty())|(nlot.getText().isEmpty())|(qtemed.getText().isEmpty())|(med.getText().isEmpty())|
              (ug.getText().isEmpty())|(marge.getText().isEmpty())|(shp.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())
                |(dateexp.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
        else{
        a.setId((Integer.parseInt(a.getAutoNumber())));
      
        
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
       //   String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      String HDate = String.valueOf(f.format( dateexp.getDate() ));
      String HDate1 = String.valueOf(f.format( date1.getDate() ));
      a.setDate(HDate);
       st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(med.getText());
      st.setPrix((Float.parseFloat(prixVente.getText())));
      st.setQte((Integer.parseInt(qtemed.getText())));
      st.setN_lot(nlot.getText());
        a.setMge((marge.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        a.setMge((marge.getText()));
        
        a.setNlot(((nlot.getText())));
        a.setPht((Float.parseFloat(prixmed.getText())));
        st.setPrixachat((Float.parseFloat(prixmed.getText())));
        a.setPpa((Float.parseFloat(ppa.getText())));
        a.setPvent((Float.parseFloat(prixVente.getText())));
          a.setShp(Float.parseFloat(shp.getText()));
        a.setQte((Integer.parseInt(qtemed.getText())));
        a.setNom(med.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ug.getText()));
        
            a.getCustomRows("select nom from stock where nom='"+med.getText()+"' AND n_lot='"+nlot.getText()+"'AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixVente.getText())+"' ", test);
           
       
        a.getCustomRows("select nom from stock where n_lot='"+nlot.getText()+"'", test2);
        /*if(test2.getRowCount()>0 &test.getRowCount()==0)
        {
        tools.msgBox("SVP changer le N° de lot \n  Remarque: Ce N° de lot unique avec chaque produit .");
        nlot.requestFocus();
        }
        else{*/
        
         a.add();
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            
            String newid=st.getValueByNamesandnlot();
          
            String oldqte=st.getqteByValue(newid);
           
            int newqte =Integer.parseInt(qtemed.getText());
            
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.green);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();

            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
               // Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexp.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
btvalidation.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
        }}
       
        
        
        
        
       
} 
if(radp.isSelected()){       
        if((para.getText().isEmpty())|(prixventpara.getText().isEmpty())|
                (qtepara.getText().isEmpty())|(dateexppara.getDateFormatString().isEmpty())|(ugpa.getText().isEmpty())|
                (margepara.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
        else{
        a.setId((Integer.parseInt(a.getAutoNumber())));
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
      //    String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      String HDate = String.valueOf(f.format( dateexppara.getDate() ));
      String HDate1 = String.valueOf(f.format( date1.getDate() ));
         st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(para.getText());
      st.setPrix((Float.parseFloat(prixventpara.getText())));
      st.setQte((Integer.parseInt(qtepara.getText())));
      st.setN_lot("");
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setMge((margepara.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      a.setDate(HDate);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        
       a.setNlot("");
        a.setPht((Float.parseFloat(prixpara.getText())));
        st.setPrixachat((Float.parseFloat(prixpara.getText())));
        a.setPpa(0);
        a.setPvent((Float.parseFloat(prixventpara.getText())));
        a.setShp(0);
        a.setQte((Integer.parseInt(qtepara.getText())));
        a.setNom(para.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ugpa.getText()));
       
        a.add();
           a.getCustomRows("select nom from stock where nom='"+para.getText()+"' AND n_lot=''AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixventpara.getText())+"' ", test);
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            String newid=st.getValueByNamesandnlot();
            String oldqte=st.getqteByValue(newid);
            int newqte =Integer.parseInt(qtepara.getText());
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.red);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();
            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
               // Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexppara.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
btvalidation.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
}}
       
        
        
        
        
       
}
// TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medActionPerformed

    private void combofornKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combofornKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_combofornKeyTyped

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyTyped

    private void prixparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixparaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixparaActionPerformed

    private void btvalidationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvalidationActionPerformed
if(tools.confirmMsg("la commande est terminer ?")){
 tools.clearText(this);
 nb.setText(a.getAutoNumber());
 a.getCustomRows("select * from comande where id='"+nb.getText()+"'", tabcmd);
date1.setEnabled(true);
nbf.setEnabled(true);
combo.setEnabled(true);
btnvalid.setEnabled(true);
btvalidation.setEnabled(true);
rdobl.setEnabled(true);
rdof.setEnabled(true); 
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
date1.requestFocus();
}

// TODO add your handling code here:
    }//GEN-LAST:event_btvalidationActionPerformed

    private void tabcmdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabcmdMouseClicked
btnadd.setEnabled(false);
int row=tabcmd.getSelectedRow();
String strno=tabcmd.getValueAt(row, 0).toString(); 
nb.setText(strno);


// TODO add your handling code here:
    }//GEN-LAST:event_tabcmdMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
   if(!(btnmsj.isEnabled())){
        btnadd.setEnabled(true);
      btvalidation.setEnabled(true);
      btnvalid.setEnabled(true);
nb.setText(a.getAutoNumber());
med.requestFocus();
   }// TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void prixmedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixmedKeyReleased

Double marge ;
 marge=(((Double.parseDouble(ppa.getText()))-(Double.parseDouble(prixmed.getText())))/(Double.parseDouble(prixmed.getText())))*100;
 marge =Math.round(marge *100)/100.0;

 //marge=Float.parseFloat(new FloatFormat("##.####").format(marge));
 this.marge.setText(String.valueOf(marge)+"%"); 
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    if(marge<0){
      tools.msgBox("Il y a erreur !\n la marge est négative il faut vérifier prix d'achat et vente.");
   prixmed.requestFocus();}
   qtemed.requestFocus();
   }
  // TODO add your handling code here:
    }//GEN-LAST:event_prixmedKeyReleased

    private void shpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shpActionPerformed
  
    }//GEN-LAST:event_shpActionPerformed

    private void prixVenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixVenteKeyReleased
   // TODO add your handling code here:
    }//GEN-LAST:event_prixVenteKeyReleased

    private void shpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shpKeyReleased
   if(ppa.getText().isEmpty()){tools.msgBox(" Le PPA est vide !");}
   else{
        float pven=((Float.parseFloat(ppa.getText()))+(Float.parseFloat(shp.getText())));
   prixVente.setText(String.valueOf(pven));
   }
   if(evt.getKeyCode()==KeyEvent.VK_ENTER){
  if((evt.getKeyCode()==KeyEvent.VK_ENTER) &!(btnmsj.isEnabled())){
        if((prixmed.getText().isEmpty())|(ppa.getText().isEmpty())|
                (nlot.getText().isEmpty())|(qtemed.getText().isEmpty())|(med.getText().isEmpty())|
                (marge.getText().isEmpty())|(shp.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())
                |(dateexp.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
                else{
        a.setId((Integer.parseInt(a.getAutoNumber())));
      
        
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
       //   String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      String HDate = String.valueOf(f.format( dateexp.getDate() ));
      String HDate1 = String.valueOf(f.format( date1.getDate() ));
      a.setDate(HDate);
       st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(med.getText());
      st.setPrix((Float.parseFloat(prixVente.getText())));
      st.setQte((Integer.parseInt(qtemed.getText())));
      st.setN_lot(nlot.getText());
        a.setMge((marge.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        a.setMge((marge.getText()));
        
        a.setNlot(((nlot.getText())));
        a.setPht((Float.parseFloat(prixmed.getText())));
        a.setPpa((Float.parseFloat(ppa.getText())));
        a.setPvent((Float.parseFloat(prixVente.getText())));
          a.setShp(Float.parseFloat(shp.getText()));
        a.setQte((Integer.parseInt(qtemed.getText())));
        a.setNom(med.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ug.getText()));
        
            a.getCustomRows("select nom from stock where nom='"+med.getText()+"' AND n_lot='"+nlot.getText()+"'AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixVente.getText())+"' ", test);
           
       
        a.getCustomRows("select nom from stock where n_lot='"+nlot.getText()+"'", test2);
        /*if(test2.getRowCount()>0 &test.getRowCount()==0)
        {
        tools.msgBox("SVP changer le N° de lot \n  Remarque: Ce N° de lot unique avec chaque produit .");
        nlot.requestFocus();
        }
        else{*/
        
         a.add();
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            
            String newid=st.getValueByNamesandnlot();
          
            String oldqte=st.getqteByValue(newid);
           
            int newqte =Integer.parseInt(qtemed.getText());
            
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.green);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();

            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
               // Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexp.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
btvalidation.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
        }}

       
        
             
        
  }   
   } // TODO add your handling code here:
    }//GEN-LAST:event_shpKeyReleased

    private void ppaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ppaKeyReleased
Double marge=0.0;
float vent=0;
vent=Float.parseFloat(ppa.getText())+Float.parseFloat(shp.getText());
prixVente.setText(String.valueOf(vent));
        if(!(prixmed.getText().isEmpty())){

 marge=(((Double.parseDouble(ppa.getText()))-(Double.parseDouble(prixmed.getText())))/(Double.parseDouble(prixmed.getText())))*100;
 marge =Math.round(marge *100)/100.0;

 //marge=Float.parseFloat(new FloatFormat("##.####").format(marge));
 this.marge.setText(String.valueOf(marge)+"%");
}
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(marge<0){
    tools.msgBox("Il y a erreur !\n la marge est négative il faut vérifier prix d'achat et vente.");
}
   prixmed.requestFocus();
   }        // TODO add your handling code here:
    }//GEN-LAST:event_ppaKeyReleased

    private void nlotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nlotKeyReleased
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
   ppa.requestFocus();
   }         // TODO add your handling code here:
    }//GEN-LAST:event_nlotKeyReleased

    private void ugKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ugKeyReleased
if((evt.getKeyCode()==KeyEvent.VK_ENTER) &!(btnmsj.isEnabled())){
        if((prixmed.getText().isEmpty())|(ppa.getText().isEmpty())|
                (nlot.getText().isEmpty())|(qtemed.getText().isEmpty())|(med.getText().isEmpty())|
                (marge.getText().isEmpty())|(shp.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())
                |(dateexp.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
        else{
        a.setId((Integer.parseInt(a.getAutoNumber())));
      
        
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
// String HDate = dateexppara.getDateFormatString();
  //     String HDate1 =date1.getDateFormatString();     
String HDate = String.valueOf(f.format( dateexp.getDate() ));
String HDate1 = String.valueOf(f.format( date1.getDate() ));
      a.setDate(HDate);
       st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(med.getText());
      st.setPrix((Float.parseFloat(prixVente.getText())));
      st.setQte((Integer.parseInt(qtemed.getText())));
      st.setN_lot(nlot.getText());
        a.setMge((marge.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        a.setMge((marge.getText()));
        
        a.setNlot(((nlot.getText())));
        a.setPht((Float.parseFloat(prixmed.getText())));
        a.setPpa((Float.parseFloat(ppa.getText())));
        a.setPvent((Float.parseFloat(prixVente.getText())));
          a.setShp(Float.parseFloat(shp.getText()));
        a.setQte((Integer.parseInt(qtemed.getText())));
        a.setNom(med.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ug.getText()));
            a.getCustomRows("select nom from stock where nom='"+med.getText()+"' AND n_lot='"+nlot.getText()+"'AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixVente.getText())+"' ", test);   
       
        a.getCustomRows("select nom from stock where n_lot='"+nlot.getText()+"'", test2);
        if(test2.getRowCount()>0 &test.getRowCount()==0)
        {
        tools.msgBox("SVP changer le N° de lot \n  Remarque: Ce N° de lot unique avec chaque produit .");
        nlot.requestFocus();
        }
        else{
         a.add();
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            String newid=st.getValueByName(med.getText());
          
            String oldqte=st.getqteByValue(newid);
           
            int newqte =Integer.parseInt(qtemed.getText());
            
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.red);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    
String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();
            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
                //Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexp.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
        }}}
       
        
             
        
  }       // TODO add your handling code here:
    }//GEN-LAST:event_ugKeyReleased

    private void qtemedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtemedKeyReleased
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){

 dateexp.requestFocus();

 }        // TODO add your handling code here:
    }//GEN-LAST:event_qtemedKeyReleased

    private void btnvalidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvalidActionPerformed

  frmAchatvalid v=new frmAchatvalid();

 v.nbr.setText(nbf.getText());
  v.nomfr.setText(combo.getSelectedItem().toString());
 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
// String HDate = dateexppara.getDateFormatString();
  //     String HDate1 =date1.getDateFormatString();     
String HDate = String.valueOf(f.format(date1.getDate() ));
  v.date.setText(HDate);
  v.setVisible(true);
 //v.save2.setText(nbf.getText());
    /*a.getCustomRows("select nom_produit,n_lot,ppa,pht,pvent,exp,qte,shp,mge,ug from comande where nb_fact='"+
            nbf.getText().toString()+"'", v.tabcmd);
    /*a.getCustomRows("select nom_for,date_achat,type from comande where nb_fact='"+
            nbf.getText()+"'", v.test);
v.fourn.setText(v.test.getValueAt(0,0).toString());
v.dateachat.setText(v.test.getValueAt(0,1).toString());
int count =v.test.getRowCount();
float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(v.tabcmd.getValueAt(i,6).toString())-Integer.parseInt(v.tabcmd.getValueAt(i,9).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(v.tabcmd.getValueAt(i,4).toString());
stock=stock+(q*som); 
}
     v.total.setText(String.valueOf(stock)+" DA");
 //v.sv.setText(nbf.getText());
  v.setVisible(true);
  //this.dispose();*/
    }//GEN-LAST:event_btnvalidActionPerformed

    private void nbfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nbfKeyReleased
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     
    facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+nbf.getText()+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){
             a.getCustomRows("select * from comande where nb_fact='"+facture_nb+"'", tabcmd);
         med.requestFocus();
         nbf.setEnabled(false);
         int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+tabcmd.getValueAt(0,10).toString()+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();

            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
               // Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexp.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
            String Test= tabcmd.getValueAt(0, 14).toString();
                if(Test.equals("F")){rdof.setSelected(true);rdobl.setSelected(false);}
                if(Test.equals("BL")){rdof.setSelected(false);rdobl.setSelected(true);}
ug.setText("0");
shp.setText("0");
ugpa.setText("0");
date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
btvalidation.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
    
        }
        else{ }
     med.requestFocus(); 
 }// TODO add your handling code here:
    }//GEN-LAST:event_nbfKeyReleased

    private void ppaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ppaKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}
// TODO add your handling code here:
    }//GEN-LAST:event_ppaKeyTyped

    private void prixmedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixmedKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_prixmedKeyTyped

    private void shpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shpKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_shpKeyTyped

    private void qtemedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtemedKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_qtemedKeyTyped

    private void ugKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ugKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_ugKeyTyped

    private void comboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboKeyReleased
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       nbf.requestFocus(); 
 }     // TODO add your handling code here:
    }//GEN-LAST:event_comboKeyReleased

    private void radmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radmMouseClicked
 grp.add(radm);
 grp.add(radp);
 if(radm.isSelected())
 {
     para.setEnabled(false);
     prixpara.setEnabled(false);
     qtepara.setEnabled(false);
     dateexppara.setEnabled(false);
     ugpa.setEnabled(false);
     prixventpara.setEnabled(false);
     stabpara.setVisible(false);
    tabpara.setVisible(false);
     //
          ppa.setEnabled(true);
     prixmed.setEnabled(true);
     qtemed.setEnabled(true);
     ppa.setEnabled(true);
     shp.setEnabled(true);
     prixVente.setEnabled(true);
     marge.setEnabled(true);
     dateexp.setEnabled(true);
     nlot.setEnabled(true);
      med.setEnabled(true);
      ug.setEnabled(true);
      med.requestFocus();
 }
  if(radp.isSelected())
 {
     ppa.setEnabled(false);
     prixmed.setEnabled(false);
     qtemed.setEnabled(false);
     ppa.setEnabled(false);
     shp.setEnabled(false);
     prixVente.setEnabled(false);
     marge.setEnabled(false);
     dateexp.setEnabled(false);
     nlot.setEnabled(false);
      med.setEnabled(false);
      ug.setEnabled(false);
      stabmed.setVisible(false);
    tabmed.setVisible(false);
     //qtemed.setEnabled(false);
      para.setEnabled(true);
     prixpara.setEnabled(true);
     qtepara.setEnabled(true);
     dateexppara.setEnabled(true);
     ugpa.setEnabled(true);
     prixventpara.setEnabled(true);
     para.requestFocus();
     
 }       // TODO add your handling code here:
    }//GEN-LAST:event_radmMouseClicked

    private void radpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radpMouseClicked
 grp.add(radm);
 grp.add(radp);
 if(radm.isSelected())
 {
     para.setEnabled(false);
     prixpara.setEnabled(false);
     qtepara.setEnabled(false);
     dateexppara.setEnabled(false);
     ugpa.setEnabled(false);
     prixventpara.setEnabled(false);
     
     //
          ppa.setEnabled(true);
     prixmed.setEnabled(true);
     qtemed.setEnabled(true);
     ppa.setEnabled(true);
     shp.setEnabled(true);
     prixVente.setEnabled(true);
     marge.setEnabled(true);
     dateexp.setEnabled(true);
     nlot.setEnabled(true);
      med.setEnabled(true);
      ug.setEnabled(true);
      med.requestFocus();
 }
  if(radp.isSelected())
 {
     
     ppa.setEnabled(false);
     prixmed.setEnabled(false);
     qtemed.setEnabled(false);
     ppa.setEnabled(false);
     shp.setEnabled(false);
     prixVente.setEnabled(false);
     marge.setEnabled(false);
     dateexp.setEnabled(false);
     nlot.setEnabled(false);
      med.setEnabled(false);
      ug.setEnabled(false);
      stabmed.setVisible(false);
    tabmed.setVisible(false);
     //qtemed.setEnabled(false);
      para.setEnabled(true);
     prixpara.setEnabled(true);
     qtepara.setEnabled(true);
          dateexppara.setEnabled(true);
     ugpa.setEnabled(true);
     prixventpara.setEnabled(true);
     para.requestFocus();
     
 }        // TODO add your handling code here:
    }//GEN-LAST:event_radpMouseClicked

    private void ugpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugpaActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_ugpaActionPerformed

    private void prixventparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixventparaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixventparaActionPerformed

    private void radmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radmActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void paraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paraKeyReleased
if(para.getText().isEmpty()){
tabpara.setVisible(false);
stabpara.setVisible(false);}
else{
        tabpara.getTableHeader().setBackground(new Color(0,0,100));
tabpara.getTableHeader().setForeground(Color.white);
tabpara.setShowGrid(false);
tabpara.setShowVerticalLines(false);
tabpara.setColumnSelectionAllowed(false);
tabpara.setRowSelectionAllowed(true);
tabpara.setSelectionBackground(Color.green); 
tabpara.setRowHeight(25);

        m.getCustomRows("select * from parapharm where nom like'"+para.getText()+"%';", tabpara);
        tabpara.setVisible(true);
stabpara.setVisible(true);

if(evt.getKeyCode()==KeyEvent.VK_DOWN){
tabpara.requestFocus();
}


}        // TODO add your handling code here:
    }//GEN-LAST:event_paraKeyReleased

    private void tabparaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabparaKeyReleased
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         int row=tabpara.getSelectedRow();
            int rowc=tabpara.getRowCount();
            if(row==0){
                 String strno=tabpara.getValueAt(rowc-1, 0).toString();
 
 para.setText(strno);
 prixpara.requestFocus();
 tabpara.setVisible(false);
 stabpara.setVisible(false);
            }
            else{      
 
  String strno=tabpara.getValueAt(row-1, 0).toString();
 
 para.setText(strno);
 prixpara.requestFocus();
 tabpara.setVisible(false);
 stabpara.setVisible(false);
            }
 }        // TODO add your handling code here:
    }//GEN-LAST:event_tabparaKeyReleased

    private void prixparaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixparaKeyReleased
    Double marge=0.0;
 
        if(!(prixventpara.getText().isEmpty())){
   
 marge=(((Double.parseDouble(prixventpara.getText()))-(Double.parseDouble(prixpara.getText())))/(Double.parseDouble(prixpara.getText())))*100;
 DecimalFormat dtime = new DecimalFormat("0.00"); 
 marge =Math.round(marge *100)/100.0;
 this.margepara.setText(String.valueOf(marge)+"%");
    }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             if(marge<0){
      tools.msgBox("Il y a erreur !\n la marge est négative il faut vérifer prix d'achat et vente.");
      prixpara.requestFocus();
    }
     qtepara.requestFocus();
     }// TODO add your handling code here:
    }//GEN-LAST:event_prixparaKeyReleased

    private void qteparaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qteparaKeyReleased
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     dateexppara.requestFocus();
     }        // TODO add your handling code here:
    }//GEN-LAST:event_qteparaKeyReleased

    private void ugpaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ugpaKeyReleased
 if((evt.getKeyCode()==KeyEvent.VK_ENTER)&!(btnmsj.isEnabled())){
               if((para.getText().isEmpty())|(prixventpara.getText().isEmpty())|
                (qtepara.getText().isEmpty())|(dateexppara.getDateFormatString().isEmpty())|(ugpa.getText().isEmpty())|
                (margepara.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
        else{
        a.setId((Integer.parseInt(a.getAutoNumber())));
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
      String HDate = String.valueOf(f.format( dateexppara.getDate() ));
       String HDate1 = String.valueOf(f.format( date1.getDate() ));
       // String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
         st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(para.getText());
      st.setPrix((Float.parseFloat(prixventpara.getText())));
      st.setQte((Integer.parseInt(qtepara.getText())));
      st.setN_lot("");
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setMge((margepara.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      a.setDate(HDate);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        
       a.setNlot("");
        a.setPht((Float.parseFloat(prixpara.getText())));
        a.setPpa(0);
        a.setPvent((Float.parseFloat(prixventpara.getText())));
        a.setShp(0);
        a.setQte((Integer.parseInt(qtepara.getText())));
        a.setNom(para.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ugpa.getText()));
       
        a.add();
           a.getCustomRows("select nom from stock where nom='"+para.getText()+"' AND n_lot=''AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixventpara.getText())+"' ", test);
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            String newid=st.getValueByNameparapharm(para.getText());
          
            String oldqte=st.getqteByValue(newid);
           
            int newqte =Integer.parseInt(qtepara.getText());
            
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.red);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
                Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date);
                dateexppara.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
med.requestFocus();
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
//date1.setDateFormatString(tabcmd.getValueAt(0,13).toString());
date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
}}
       
        

     
     }        // TODO add your handling code here:
    }//GEN-LAST:event_ugpaKeyReleased

    private void prixventparaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixventparaKeyReleased
 
if(prixventpara.getText().isEmpty()){
   Double marge ;
 marge=(((Double.parseDouble(prixventpara.getText()))-(Double.parseDouble(prixpara.getText())))/(Double.parseDouble(prixpara.getText())))*100;
 DecimalFormat dtime = new DecimalFormat("0.00"); 
 marge =Math.round(marge *100)/100.0;
 this.margepara.setText("NULL");  
} 
 Double marge ;
 marge=(((Double.parseDouble(prixventpara.getText()))-(Double.parseDouble(prixpara.getText())))/(Double.parseDouble(prixpara.getText())))*100;
 DecimalFormat dtime = new DecimalFormat("0.00"); 
 marge =Math.round(marge *100)/100.0;
 this.margepara.setText(String.valueOf(marge)+"%");
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      if(marge<0){
      tools.msgBox("Il y a erreur !\n la marge est négative il faut vérifer prix d'achat et vente.");
   prixventpara.requestFocus(); }
      else{
      if((evt.getKeyCode()==KeyEvent.VK_ENTER)&!(btnmsj.isEnabled())){
               if((para.getText().isEmpty())|(prixventpara.getText().isEmpty())|
                (qtepara.getText().isEmpty())|(dateexppara.getDateFormatString().isEmpty())|(ugpa.getText().isEmpty())|
                (margepara.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
 
               else{
        a.setId((Integer.parseInt(a.getAutoNumber())));
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
      //    String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      String HDate = String.valueOf(f.format( dateexppara.getDate() ));
      String HDate1 = String.valueOf(f.format( date1.getDate() ));
         st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(para.getText());
      st.setPrix((Float.parseFloat(prixventpara.getText())));
      st.setQte((Integer.parseInt(qtepara.getText())));
      st.setN_lot("");
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setMge((margepara.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      a.setDate(HDate);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        
       a.setNlot("");
        a.setPht((Float.parseFloat(prixpara.getText())));
        a.setPpa(0);
        a.setPvent((Float.parseFloat(prixventpara.getText())));
        a.setShp(0);
        a.setQte((Integer.parseInt(qtepara.getText())));
        a.setNom(para.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ugpa.getText()));
       
        a.add();
           a.getCustomRows("select nom from stock where nom='"+para.getText()+"' AND n_lot=''AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixventpara.getText())+"' ", test);
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            String newid=st.getValueByNamesandnlot();
            String oldqte=st.getqteByValue(newid);
            int newqte =Integer.parseInt(qtepara.getText());
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.red);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();
            try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
               // Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexppara.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
date1.setEnabled(false);
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
btvalidation.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
}}
        

     
     }  }
    
     }
    }//GEN-LAST:event_prixventparaKeyReleased

    private void margeparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_margeparaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_margeparaActionPerformed

    private void margeparaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_margeparaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_margeparaKeyReleased

    private void prixparaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixparaKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_prixparaKeyTyped

    private void qteparaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qteparaKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_qteparaKeyTyped

    private void ugpaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ugpaKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_ugpaKeyTyped

    private void prixventparaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixventparaKeyTyped
char c=evt.getKeyChar();
if(!((Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_ENTER))){
    getToolkit().beep();
    evt.consume();


}        // TODO add your handling code here:
    }//GEN-LAST:event_prixventparaKeyTyped

    private void dateexpparaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateexpparaKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
       prixventpara.requestFocus();
       }  // TODO add your handling code here:
    }//GEN-LAST:event_dateexpparaKeyReleased

    private void btnmsjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmsjActionPerformed
if(radm.isSelected()){       
        if((prixmed.getText().isEmpty())|(ppa.getText().isEmpty())|
                (prixVente.getText().isEmpty())|(nlot.getText().isEmpty())|(qtemed.getText().isEmpty())|(med.getText().isEmpty())|
              (ug.getText().isEmpty())|(marge.getText().isEmpty())|(shp.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())
                |(dateexp.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
        else{
        a.setId((Integer.parseInt(nb.getText())));
       String stockid=st.getValueByNamesandnlot();
       st.setId(Integer.parseInt(stockid));
      String stockqte=st.getqteByValue(stockid);
     //tools.msgBox(stockid+" et qte=  "+stockqte+" et qte de cet cmd est :"+strqte);
      int stockfinal=Integer.parseInt(stockqte)-Integer.parseInt(strqte);
      st.setQte(stockfinal);
      st.update();
      if(stockfinal==0){
          //st.setId(Integer.parseInt(stockid));
          st.delete();}
       
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
     
      // String HDate=dateexp.getDateFormatString();
       String HDate1 = String.valueOf(f.format( date1.getDate() ));
       String HDate =String.valueOf(f.format( dateexp.getDate() ));
       //String HDate1 =date1.getDateFormatString();
      a.setDate(HDate);
       st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(med.getText());
      st.setPrix((Float.parseFloat(prixVente.getText())));
      st.setQte((Integer.parseInt(qtemed.getText())));
      st.setN_lot(nlot.getText());
        a.setMge((marge.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
      //  tools.msgBox("select nom from stock where nom='"+med.getText()+"' AND n_lot='"+nlot.getText()+"'AND date='"
        //        +HDate+"'AND prix='"
          //      +Float.parseFloat(prixVente.getText())+"' ");
                    a.getCustomRows("select nom from stock where nom='"+med.getText()+"' AND n_lot='"+nlot.getText()+"'AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(prixVente.getText())+"' ", test);   
       
        a.getCustomRows("select nom from stock where n_lot='"+nlot.getText()+"'", test2);
     /*   if(test2.getRowCount()>0 &test.getRowCount()==0)
        {
        tools.msgBox("SVP changer le N° de lot \n  Remarque: Ce N° de lot unique avec chaque produit .");
        nlot.requestFocus();
      stockid=st.getValueByName(strnlot);
      stockqte=st.getqteByValue(stockid);
    //  tools.msgBox(stockid+" et qte=  "+stockqte+" et qte de cet cmd est :"+strqte);
      stockfinal=Integer.parseInt(stockqte)+Integer.parseInt(strqte);
      st.setQte(stockfinal);
       st.update();
        }
        else{
      */
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{

        a.setMge((marge.getText())); 
        a.setNlot(((nlot.getText())));
        a.setPht((Float.parseFloat(prixmed.getText())));
        st.setPrixachat((Float.parseFloat(prixmed.getText())));
        
        a.setPpa((Float.parseFloat(ppa.getText())));
        a.setPvent((Float.parseFloat(prixVente.getText())));
        a.setShp(Float.parseFloat(shp.getText()));
        a.setQte((Integer.parseInt(qtemed.getText())));
        a.setNom(med.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ug.getText()));
       
        a.update();
        a.getCustomRows("select nom from stock where n_lot='"+nlot.getText()+"'", test);
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            String newid=st.getValueByNamesandnlot();
          
            String oldqte=st.getqteByValue(newid);
          // tools.msgBox("old qte "+oldqte);
            int newqte =Integer.parseInt(qtemed.getText());
            
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
            }
        
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.red);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
btnmsj.setEnabled(false);
        }
       
        
        }      
        
        
       
} 
if(radp.isSelected()){       
        if((para.getText().isEmpty())|(prixventpara.getText().isEmpty())|
                (qtepara.getText().isEmpty())|(dateexppara.getDateFormatString().isEmpty())|(ugpa.getText().isEmpty())|
                (margepara.getText().isEmpty())|(nbf.getText().isEmpty())|(date1.getDateFormatString().isEmpty())){
            tools.msgBox("SVP countinue touts les champs");}
        else{
          //tools.msgBox(strnom);
        String stockid=st.getValueByNamesandnlot();
      String stockqte=st.getqteByValue(stockid);
     // tools.msgBox(stockid+" et qte=  "+stockqte+" et qte de cet cmd est :"+strqte);
      int stockfinal=Integer.parseInt(stockqte)-Integer.parseInt(strqte);
      st.setQte(stockfinal);
       st.update();
        a.setId((Integer.parseInt(nb.getText())));
         SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
       String HDate = String.valueOf(f.format( dateexppara.getDate() ));
       //String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
       String HDate1 = String.valueOf(f.format( date1.getDate() ));
         st.setId((Integer.parseInt(st.getAutoNumber())));
      st.setDate(HDate);
      st.setNom(para.getText());
      st.setPrix((Float.parseFloat(prixventpara.getText())));
      st.setQte((Integer.parseInt(qtepara.getText())));
      st.setN_lot("");
      a.setDate(HDate);
      a.setDate_achat(HDate1);
        a.setMge((margepara.getText()));
        if(rdof.isSelected()){
        a.setType("F");};
        if(rdobl.isSelected()){
        a.setType("BL");};
      a.setDate(HDate);
        a.setNbf(((nbf.getText())));
        facture_nb=nbf.getText();
        a.getCustomRows("select nom_produit from comande where nb_fact='"+facture_nb+"'", test);
        int s1=test.getRowCount();
        if((s1>0) & (tabcmd.getRowCount()==0)){tools.msgBox("ce N° facture/BL existe il faut changer"); nbf.requestFocus();}
        else{
        
       a.setNlot("");
        a.setPht((Float.parseFloat(prixpara.getText())));
        st.setPrixachat((Float.parseFloat(prixpara.getText())));
        a.setPpa(0);
        a.setPvent((Float.parseFloat(prixventpara.getText())));
        
        a.setShp(0);
        a.setQte((Integer.parseInt(qtepara.getText())));
        a.setNom(para.getText());
        a.setNom_forn(combo.getSelectedItem().toString());
        name=combo.getSelectedItem().toString();
        a.setUg(Integer.parseInt(ugpa.getText()));
       
        a.update();
           a.getCustomRows("select nom from stock where nom='"+para.getText()+"'", test);
        if(test.getRowCount()==0){st.add();}
        if(test.getRowCount()>00){
            String newid=st.getValueByNameparapharm(para.getText());
          
            String oldqte=st.getqteByValue(newid);
           
            int newqte =Integer.parseInt(qtepara.getText());
            
            int newqte1=Integer.parseInt(oldqte)+newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);
            st.setPrix(Float.parseFloat(prixventpara.getText()));
            st.setPrixachat(Float.parseFloat(prixventpara.getText()));
            st.setDate(HDate);
            st.update();
            }
        a.getAllRows(tabcmd);
        tabcmd.getTableHeader().setBackground(new Color(0,0,100));
tabcmd.getTableHeader().setForeground(Color.white);
tabcmd.setShowGrid(false);
tabcmd.setShowVerticalLines(false);
   tabcmd.setColumnSelectionAllowed(false);
    tabcmd.setRowSelectionAllowed(true);
    tabcmd.setSelectionBackground(Color.red);  
    int count=tabcmd.getRowCount();

        tools.clearText(this);
        nb.setText(a.getAutoNumber());
        Calendar clndr =Calendar.getInstance();
        date1.setCalendar(clndr);
        nbf.setText(facture_nb);
             a.getAllRows1("fournisseur where nom='"+name+"'", "nom", combo);
              
   float stock=0;
int q;float som;
     for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
 //q=q-((Integer.parseInt(qtemed.getText())));
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}    


String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
med.requestFocus();
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
nbf.setEnabled(false);
combo.setEnabled(false);
btnvalid.setEnabled(true);
rdobl.setEnabled(false);
rdof.setEnabled(false);
para.setEnabled(true);
}}
       
        
        
        
        
       
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmsjActionPerformed

    private void tabcmdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabcmdMouseReleased
 if(evt.isPopupTrigger()){
           
           jPopupMenu1.show(this,evt.getXOnScreen(),evt.getYOnScreen());
    
   
   }          // TODO add your handling code here:
    }//GEN-LAST:event_tabcmdMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   btnmsj.setEnabled(true);
        int row =tabcmd.getSelectedRow();
   String strno=tabcmd.getValueAt(row, 0).toString();
   String strnom=tabcmd.getValueAt(row, 1).toString();
   String strppa=tabcmd.getValueAt(row, 2).toString();
   String strdatexp=tabcmd.getValueAt(row, 3).toString();
 
    strnlot=tabcmd.getValueAt(row, 4).toString();
    strqte=tabcmd.getValueAt(row, 5).toString();
   String strprixachat=tabcmd.getValueAt(row, 6).toString();
   String strprixvent=tabcmd.getValueAt(row, 7).toString();
   String strnshp=tabcmd.getValueAt(row, 8).toString();
   String strmarge=tabcmd.getValueAt(row, 9).toString();
   String strug=tabcmd.getValueAt(row, 12).toString();
   if(tabcmd.getValueAt(row,4).toString().isEmpty()){
   radp.setSelected(true);
   nb.setText(strno);
   para.setText(strnom);
   para.setEnabled(false);
   //ppa.setText(strppa);
   //dateexppara.setDateFormatString(strdatexp);
               try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
                Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row,3));
                Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
               
               date1.setDate(date2);
                dateexppara.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
   
   qtepara.setText(strqte);
   //nlot.setText(strnlot);
   prixpara.setText(strprixachat);
   prixventpara.setText(strprixvent);
   st.setN_lot("");
   st.setNom(para.getText());
   st.setPrix(Float.parseFloat(prixventpara.getText()));
     SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
       //   String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      String HDate = String.valueOf(f.format( dateexppara.getDate() ));
   st.setDate(HDate);
   //shp.setText(strnshp);
   margepara.setText(strmarge);
   ugpa.setText(strug);
   nb.setEditable(false);
   btnadd.setEnabled(false);
   btvalidation.setEnabled(false);
   btnmsj.setVisible(true);
   btnvalid.setEnabled(false);
   
   }
   else{
   radm.setSelected(true);
   nb.setEditable(false);
   nb.setText(strno);
   med.setText(strnom);
   ppa.setText(strppa);
   
   //dateexp.setDateFormatString(strdatexp);
               try {
                DefaultTableModel model =(DefaultTableModel)tabcmd.getModel();
                Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row,3));
                 Date date2=new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(0,13));
                date1.setDate(date2);
                dateexp.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
            }
   qtemed.setText(strqte);
   nlot.setText(strnlot);
   prixmed.setText(strprixachat);
   prixVente.setText(strprixvent);
   shp.setText(strnshp);
   marge.setText(strmarge);
   ug.setText(strug);
      st.setN_lot(nlot.getText());
   st.setNom(med.getText());
   st.setPrix(Float.parseFloat(prixVente.getText()));
     SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
       //   String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      String HDate = String.valueOf(f.format( dateexp.getDate() ));
   st.setDate(HDate);
   btnadd.setEnabled(false);
   btvalidation.setEnabled(false);
   btnmsj.setVisible(true);
   btnvalid.setEnabled(false);
   }
     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
if(tools.confirmMsg("êtes-vous sûr de supprimer?"))
{
  int rowval=tabcmd.getSelectedRow();
  st.setNom(tabcmd.getValueAt(rowval,1).toString());
  st.setN_lot(tabcmd.getValueAt(rowval,4).toString());
  st.setPrix(Float.parseFloat(tabcmd.getValueAt(rowval,2).toString()));
  st.setDate(tabcmd.getValueAt(rowval,3).toString());
  tools.msgBox("date    ="+tabcmd.getValueAt(rowval,3).toString());
           String newid=st.getValueByNamesandnlot();
           // String newid="91";
//tools.msgBox("yup row="+rowval+"   id "+newid);
            String oldqte=st.getqteByValue(newid);
           
            int newqte =Integer.parseInt(tabcmd.getValueAt(0,5).toString());
            
            int newqte1=Integer.parseInt(oldqte)-newqte;
            st.setId(Integer.parseInt(newid));
            st.setQte(newqte1);   
            st.update();
      
a.setId(Integer.parseInt(nb.getText()));
a.delete();
a.getCustomRows("select * from comande where nb_fact='"+nbf.getText()+"'", tabcmd);  
int count=tabcmd.getRowCount();
float stock=0;
int q;float som;
for(int i=0;i<count;i++)
{
  //  tools.msgBox("hello");
  q= Integer.parseInt(tabcmd.getValueAt(i,5).toString())-Integer.parseInt(tabcmd.getValueAt(i,12).toString());
som= Float.parseFloat(tabcmd.getValueAt(i,6).toString());
stock=stock+(q*som);   
}
med.requestFocus();
if(stock==0.0){combo.setEnabled(true);combo.requestFocus();
String s=String.valueOf(stock);
s=s+"   DA";
mantant.setText(s);
btnadd.setEnabled(true);
btnvalid.setEnabled(false);
btvalidation.setEnabled(false);
rdobl.setEnabled(true);
rdof.setEnabled(true);
date1.setEnabled(true);
nbf.setEditable(true);    
}
String s=String.valueOf(stock);
s=s+"   DA";
ug.setText("0");
ugpa.setText("0");
shp.setText("0");
mantant.setText(s);
btnadd.setEnabled(true);
btvalidation.setEnabled(false);

}          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void dateexpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateexpKeyReleased

 SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
       //   String HDate = dateexppara.getDateFormatString();
       //String HDate1 =date1.getDateFormatString();
      Date HDate=null,hd2=null;
    try {
        HDate = f.parse(f.format( dateexp.getDate() ));
        hd2=f.parse(f.format( datetest.getDate() ));
    } catch (ParseException ex) {
        Logger.getLogger(frmAchat.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(HDate.compareTo(hd2)>0){
    tools.msgBox("mmmmmmmmm");
    }
    shp.requestFocus();


    }//GEN-LAST:event_dateexpKeyReleased

    private void ugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_ugActionPerformed

    private void dateexpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateexpKeyPressed
 if(evt.getKeyCode()==KeyEvent.VK_ENTER){
     shp.requestFocus(); 
      }    }//GEN-LAST:event_dateexpKeyPressed

    private void btvalidation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvalidation1ActionPerformed
       
        int count=tabcmd.getRowCount();

        for(int i =0;i<count;i++)
        {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            st.setId((Integer.parseInt(st.getAutoNumber())));
            String HDate =( tabcmd.getValueAt(i, 3).toString() );
            st.setDate(HDate);
            st.setPrixachat((Float.parseFloat(tabcmd.getValueAt(i, 6).toString())));
            st.setNom(tabcmd.getValueAt(i, 1).toString());
            st.setPrix((Float.parseFloat(tabcmd.getValueAt(i, 7).toString())));
            st.setQte((Integer.parseInt(tabcmd.getValueAt(i, 5).toString())));
            st.setN_lot(tabcmd.getValueAt(i, 4).toString());

            a.getCustomRows("select nom from stock where nom='"+tabcmd.getValueAt(i, 1).toString()+"' AND n_lot='"+tabcmd.getValueAt(i, 4).toString()+"'AND date='"
                +HDate+"'AND prix='"
                +Float.parseFloat(tabcmd.getValueAt(i, 7).toString())+"' ", test);

            a.getCustomRows("select nom from stock where n_lot='"+nlot.getText()+"'", test2);
            test.setVisible(true);
            stest.setVisible(true);
            if(test.getRowCount()==0){st.add();
                if(i==count-1)
                {
                    tools.msgBox("end");
                }
            }
            if(test.getRowCount()>00){
                String newid=st.getValueByNamesandnlot();
                String oldqte=st.getqteByValue(newid);
                int newqte =Integer.parseInt(tabcmd.getValueAt(i, 5).toString());
                int newqte1=Integer.parseInt(oldqte)+newqte;
                st.setId(Integer.parseInt(newid));
                st.setQte(newqte1);
                st.update();
                if(i==count-1)
                {
                    tools.msgBox("end");
                }
            }

        }
      
// TODO add your handling code here:
    }//GEN-LAST:event_btvalidation1ActionPerformed
 public void resetColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(240,240,240));
 }
  public void resetColorv(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(45,118,232));
 }
  public void setColorv(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(255,0,0));
 }
  public void setColor(JPanel panel)
 {
     panel.setBackground(new java.awt.Color(0,128,0));
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAchat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAchat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.ButtonGroup btngroup;
    private javax.swing.ButtonGroup btngroup2;
    private javax.swing.JButton btnmsj;
    private javax.swing.JButton btnvalid;
    private javax.swing.JButton btvalidation;
    private javax.swing.JButton btvalidation1;
    private javax.swing.JComboBox<String> combo;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser dateexp;
    private com.toedter.calendar.JDateChooser dateexppara;
    private com.toedter.calendar.JDateChooser datetest;
    private javax.swing.ButtonGroup grp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mantant;
    private javax.swing.JTextField marge;
    private javax.swing.JTextField margepara;
    private javax.swing.JLabel margepara1;
    private javax.swing.JTextField med;
    private javax.swing.JTextField nb;
    public static javax.swing.JTextField nbf;
    private javax.swing.JTextField nlot;
    private javax.swing.JTextField para;
    private javax.swing.JTextField ppa;
    private javax.swing.JTextField prixVente;
    private javax.swing.JTextField prixmed;
    private javax.swing.JTextField prixpara;
    private javax.swing.JTextField prixventpara;
    private javax.swing.JTextField qtemed;
    private javax.swing.JTextField qtepara;
    private javax.swing.JRadioButton radm;
    private javax.swing.JRadioButton radp;
    private javax.swing.JRadioButton rdobl;
    private javax.swing.JRadioButton rdof;
    private javax.swing.JTextField shp;
    private javax.swing.JScrollPane stabmed;
    private javax.swing.JScrollPane stabpara;
    private javax.swing.JScrollPane stest;
    private javax.swing.JScrollPane stest2;
    private javax.swing.JTable tabcmd;
    private javax.swing.JTable tabmed;
    private javax.swing.JTable tabpara;
    private javax.swing.JTable test;
    private javax.swing.JTable test2;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel ucp;
    private javax.swing.JTextField ug;
    private javax.swing.JTextField ugpa;
    // End of variables declaration//GEN-END:variables
}
