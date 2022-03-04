
package view.EntryNotes;

import controller.ManageCategory;
import controller.ManageGoodReceiveNote;
import controller.ManageItem;
import controller.ManageStore;
import controller.ManageSupplies;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.GRN;
import view.BasicInformation.ItemList;

public class GoodReceiveNote extends javax.swing.JDialog {
    
    String description = "";
    int items = 0,Code, freeItems=0;
    
    double bPrice, sPrice, totalBPrice, totalSPrice, qty, stockQty, GRNBprice=0.00, GRNSprice=0.00,freeItemPrice=0.00;
    GRN grn = new GRN();
    ManageGoodReceiveNote manageGrn;
    
    Icon arrow = new ImageIcon("arrow.png");

    public GoodReceiveNote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        generateID();
        
        grnTable.getTableHeader().setFont(new Font("Nirmala UI", Font.PLAIN, 12));
        date.setDateToToday();        
        
        totalItems.setText(Integer.toString(items));
        loadUnsavedGRN();
        
        
    }
    
    public void generateID(){
        try {
            String grn="";
            manageGrn = new ManageGoodReceiveNote();
            ResultSet rs = manageGrn.displayGRNall();
            while(rs.next()){
                grn = rs.getString("F16No").toString();
            } 

            if(grn == ""){
                grn = "GRN22KT000001";
            }else{
                int no = Integer.valueOf(grn.substring(8));
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    grn = "GRN22KT00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    grn = "GRN22KT0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    grn = "GRN22KT000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    grn = "GRN22KT00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    grn = "GRN22KT0" + String.valueOf(nno);
                }else{
                    grn = "GRN22KT" + String.valueOf(nno);
                }
            }            
            
            System.out.println(grn);
            F16BNo.setText(grn);
        } catch (Exception ex) {
            System.out.println("line 55" + ex.getMessage());
        }
    }
    
    public void loadUnsavedGRN(){
        try{
            ManageGoodReceiveNote display = new ManageGoodReceiveNote();
            ResultSet result = display.displayNonSavedGRN();
            
            
            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();

            while(result.next()){
                Vector vec = new Vector();
                vec.add(result.getString("F16No"));
                vec.add(result.getDate("date"));
                vec.add(result.getDouble("SubTotalSellingPrice"));
                System.out.println("unsaves grn " + result.getString("F16No") + result.getDate("date") + result.getDouble("SubTotalSellingPrice"));
                model.addRow(vec);
            }
            
            jTable4.setModel(model);
        }catch(Exception e){
            System.out.println("line 59: " +e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        grnTable = new javax.swing.JTable();
        itemCode = new javax.swing.JTextField();
        itemDescription = new javax.swing.JTextField();
        itemTotalPrice = new javax.swing.JTextField();
        itemBuyingPrice = new javax.swing.JTextField();
        itemSellingPrice = new javax.swing.JTextField();
        itemStockQty = new javax.swing.JTextField();
        itemQty = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnTemporySave = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        F16BNo = new javax.swing.JTextField();
        billNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        storeCode = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        storeName = new javax.swing.JTextField();
        payType = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        dsfsd = new javax.swing.JLabel();
        supplierName = new javax.swing.JTextField();
        supplierCode = new javax.swing.JTextField();
        date = new com.github.lgooddatepicker.components.DatePicker();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        grnFreeDescription = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        grnFreeItemQTY = new javax.swing.JTextField();
        txtdno25 = new javax.swing.JTextField();
        sellingPrice = new javax.swing.JTextField();
        grnFreeTotalQty = new javax.swing.JTextField();
        grnFreeItemPrice = new javax.swing.JTextField();
        grmFreeTotalPrice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        grnFreeItemCode = new javax.swing.JTextField();
        totalSellingPrice = new javax.swing.JTextField();
        buyingPrice = new javax.swing.JTextField();
        vatPercentage = new javax.swing.JTextField();
        vat = new javax.swing.JTextField();
        itemDecreasePrice = new javax.swing.JTextField();
        loadingCharge = new javax.swing.JTextField();
        freeIssuse = new javax.swing.JTextField();
        totalBuyingPrice = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        discountPercentage = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        totalItems = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kGradientPanel1FocusGained(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("භාණ්ඩ භාරගැනීමේ සටහන");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 330, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1130, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grnTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        grnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "අනු අංකය", "විස්තරය", "ගැනුම්  මිල", "විකුණුම්  මිල", "පවතින තොගය ", "ප්‍රමාණය ", "ගැණුම් එකතුව", "විකුණුම් එකතුව", "මුළු ප්‍රමාණය "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grnTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        grnTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        grnTable.setDoubleBuffered(true);
        grnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grnTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(grnTable);
        if (grnTable.getColumnModel().getColumnCount() > 0) {
            grnTable.getColumnModel().getColumn(0).setResizable(false);
            grnTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            grnTable.getColumnModel().getColumn(1).setResizable(false);
            grnTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            grnTable.getColumnModel().getColumn(2).setResizable(false);
            grnTable.getColumnModel().getColumn(2).setPreferredWidth(130);
            grnTable.getColumnModel().getColumn(3).setResizable(false);
            grnTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            grnTable.getColumnModel().getColumn(4).setResizable(false);
            grnTable.getColumnModel().getColumn(4).setPreferredWidth(85);
            grnTable.getColumnModel().getColumn(5).setResizable(false);
            grnTable.getColumnModel().getColumn(5).setPreferredWidth(100);
            grnTable.getColumnModel().getColumn(6).setResizable(false);
            grnTable.getColumnModel().getColumn(6).setPreferredWidth(70);
            grnTable.getColumnModel().getColumn(7).setResizable(false);
            grnTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            grnTable.getColumnModel().getColumn(8).setResizable(false);
            grnTable.getColumnModel().getColumn(8).setPreferredWidth(100);
            grnTable.getColumnModel().getColumn(9).setResizable(false);
            grnTable.getColumnModel().getColumn(9).setPreferredWidth(80);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 740, 280));

        itemCode.setEditable(false);
        itemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCodeActionPerformed(evt);
            }
        });
        itemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemCodeKeyPressed(evt);
            }
        });
        jPanel2.add(itemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 25));

        itemDescription.setEditable(false);
        itemDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDescriptionActionPerformed(evt);
            }
        });
        itemDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemDescriptionKeyPressed(evt);
            }
        });
        jPanel2.add(itemDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 130, 25));

        itemTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTotalPriceActionPerformed(evt);
            }
        });
        itemTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemTotalPriceKeyPressed(evt);
            }
        });
        jPanel2.add(itemTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 110, 25));

        itemBuyingPrice.setBackground(new java.awt.Color(0, 204, 0));
        itemBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuyingPriceActionPerformed(evt);
            }
        });
        itemBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemBuyingPriceKeyPressed(evt);
            }
        });
        jPanel2.add(itemBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 80, 25));

        itemSellingPrice.setBackground(new java.awt.Color(0, 204, 0));
        itemSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSellingPriceActionPerformed(evt);
            }
        });
        itemSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemSellingPriceKeyPressed(evt);
            }
        });
        jPanel2.add(itemSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, 25));

        itemStockQty.setEditable(false);
        itemStockQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStockQtyActionPerformed(evt);
            }
        });
        itemStockQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemStockQtyKeyPressed(evt);
            }
        });
        jPanel2.add(itemStockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 100, 25));

        itemQty.setBackground(new java.awt.Color(255, 255, 0));
        itemQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQtyActionPerformed(evt);
            }
        });
        itemQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemQtyKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemQtyKeyTyped(evt);
            }
        });
        jPanel2.add(itemQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 70, 25));

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setText("Add");
        btnAdd.setActionCommand("");
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 50, 30));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 780, 350));

        btnTemporySave.setText("Temporary Save");
        btnTemporySave.setActionCommand("");
        btnTemporySave.setBackground(new java.awt.Color(204, 255, 204));
        btnTemporySave.setBorder(null);
        btnTemporySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemporySaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnTemporySave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 140, 30));

        btnSave.setText("  Save");
        btnSave.setActionCommand("");
        btnSave.setBackground(new java.awt.Color(204, 255, 204));
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 110, 30));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("F3 Edit");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("F1 Help");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("F2 New");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 20));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1130, 20));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel27.setText("අවසන නොකල F16B");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 20));

        jTable4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN No", "Date", "Amount"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable4MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 90));

        kGradientPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 320, 150));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel17.setText("බිල් අංකය");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 90, 20));

        F16BNo.setEditable(false);
        F16BNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F16BNoActionPerformed(evt);
            }
        });
        F16BNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F16BNoKeyPressed(evt);
            }
        });
        jPanel4.add(F16BNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, 25));

        billNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billNoActionPerformed(evt);
            }
        });
        billNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                billNoKeyPressed(evt);
            }
        });
        jPanel4.add(billNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 110, 25));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel7.setText("ස්ථානය");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, 20));

        jCheckBox1.setText("If Bags");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 20));

        storeCode.setEditable(false);
        storeCode.setText("1");
        storeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeCodeActionPerformed(evt);
            }
        });
        storeCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                storeCodeKeyPressed(evt);
            }
        });
        jPanel4.add(storeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 50, 25));

        jLabel25.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel25.setText("සැපයැම්කරු");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, 20));

        jLabel26.setText("ගෙවීම්");
        jLabel26.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 70, 20));

        storeName.setEditable(false);
        storeName.setText("Colombo");
        storeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeNameActionPerformed(evt);
            }
        });
        storeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                storeNameKeyPressed(evt);
            }
        });
        jPanel4.add(storeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 120, 25));

        payType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Cheque", "PettyCash", "ApprovedBuy", "Stores" }));
        jPanel4.add(payType, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 100, 25));

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel28.setText("F16B අංකය");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        dsfsd.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        dsfsd.setText("දිනය");
        jPanel4.add(dsfsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 70, 40));

        supplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierNameActionPerformed(evt);
            }
        });
        supplierName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierNameKeyPressed(evt);
            }
        });
        jPanel4.add(supplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 130, 25));

        supplierCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierCodeActionPerformed(evt);
            }
        });
        supplierCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierCodeKeyPressed(evt);
            }
        });
        jPanel4.add(supplierCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 60, 25));

        date.setFocusable(false);
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 200, 30));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 90));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("GRN Free Items");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, -1));

        grnFreeDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnFreeDescriptionActionPerformed(evt);
            }
        });
        grnFreeDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grnFreeDescriptionKeyPressed(evt);
            }
        });
        jPanel6.add(grnFreeDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 25));

        jTable2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Code", "Description", "Price", "Qty", "Total price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, 90));

        grnFreeItemQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnFreeItemQTYActionPerformed(evt);
            }
        });
        grnFreeItemQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grnFreeItemQTYKeyPressed(evt);
            }
        });
        jPanel6.add(grnFreeItemQTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 60, 25));

        txtdno25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno25ActionPerformed(evt);
            }
        });
        txtdno25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno25KeyPressed(evt);
            }
        });
        jPanel6.add(txtdno25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 25));

        sellingPrice.setEditable(false);
        sellingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sellingPrice.setText("0.00");
        sellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingPriceActionPerformed(evt);
            }
        });
        sellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellingPriceKeyPressed(evt);
            }
        });
        jPanel6.add(sellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 23));

        grnFreeTotalQty.setEditable(false);
        grnFreeTotalQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        grnFreeTotalQty.setText("0.00");
        grnFreeTotalQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnFreeTotalQtyActionPerformed(evt);
            }
        });
        grnFreeTotalQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grnFreeTotalQtyKeyPressed(evt);
            }
        });
        jPanel6.add(grnFreeTotalQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, 25));

        grnFreeItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnFreeItemPriceActionPerformed(evt);
            }
        });
        grnFreeItemPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grnFreeItemPriceKeyPressed(evt);
            }
        });
        jPanel6.add(grnFreeItemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 60, 25));

        grmFreeTotalPrice.setEditable(false);
        grmFreeTotalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        grmFreeTotalPrice.setText("0.00");
        grmFreeTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grmFreeTotalPriceActionPerformed(evt);
            }
        });
        grmFreeTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grmFreeTotalPriceKeyPressed(evt);
            }
        });
        jPanel6.add(grmFreeTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 80, 25));

        jLabel23.setText("විකුණුම්");
        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 70, 30));

        jLabel31.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel31.setText("මුළු එකතුව");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        jLabel32.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel32.setText("ගැණුම්");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 70, 30));

        grnFreeItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnFreeItemCodeActionPerformed(evt);
            }
        });
        grnFreeItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                grnFreeItemCodeKeyPressed(evt);
            }
        });
        jPanel6.add(grnFreeItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 25));

        totalSellingPrice.setEditable(false);
        totalSellingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalSellingPrice.setText("0.00");
        totalSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSellingPriceActionPerformed(evt);
            }
        });
        totalSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalSellingPriceKeyPressed(evt);
            }
        });
        jPanel6.add(totalSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 80, 23));

        buyingPrice.setEditable(false);
        buyingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buyingPrice.setText("0.00");
        buyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyingPriceActionPerformed(evt);
            }
        });
        buyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buyingPriceKeyPressed(evt);
            }
        });
        jPanel6.add(buyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 80, 23));

        vatPercentage.setText("0.00");
        vatPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatPercentageActionPerformed(evt);
            }
        });
        vatPercentage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vatPercentageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vatPercentageKeyReleased(evt);
            }
        });
        jPanel6.add(vatPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 40, 20));

        vat.setEditable(false);
        vat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        vat.setText("0.00");
        vat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vatActionPerformed(evt);
            }
        });
        vat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vatKeyPressed(evt);
            }
        });
        jPanel6.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, 23));

        itemDecreasePrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        itemDecreasePrice.setText("0.00");
        itemDecreasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDecreasePriceActionPerformed(evt);
            }
        });
        itemDecreasePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemDecreasePriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemDecreasePriceKeyReleased(evt);
            }
        });
        jPanel6.add(itemDecreasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 80, 23));

        loadingCharge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loadingCharge.setText("0.00");
        loadingCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadingChargeActionPerformed(evt);
            }
        });
        loadingCharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loadingChargeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                loadingChargeKeyReleased(evt);
            }
        });
        jPanel6.add(loadingCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 80, 23));

        freeIssuse.setEditable(false);
        freeIssuse.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        freeIssuse.setText("0.00");
        freeIssuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeIssuseActionPerformed(evt);
            }
        });
        freeIssuse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                freeIssuseKeyPressed(evt);
            }
        });
        jPanel6.add(freeIssuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, 23));

        totalBuyingPrice.setEditable(false);
        totalBuyingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalBuyingPrice.setText("0.00");
        totalBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBuyingPriceActionPerformed(evt);
            }
        });
        totalBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalBuyingPriceKeyPressed(evt);
            }
        });
        jPanel6.add(totalBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, 23));

        jLabel33.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel33.setText("එකතුව");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, 20));

        jLabel34.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel34.setText("වට්ටම්");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 70, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel35.setText("Free Issue");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, -1));

        jLabel36.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel36.setText("බඩු අඩුකිරීම්");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));

        jLabel37.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel37.setText("පැටවුම් කුලි");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel39.setText("%");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 20, -1));

        discount.setEditable(false);
        discount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        discount.setText("0.00");
        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });
        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountKeyPressed(evt);
            }
        });
        jPanel6.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 23));

        discountPercentage.setText("0.00");
        discountPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountPercentageActionPerformed(evt);
            }
        });
        discountPercentage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountPercentageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountPercentageKeyReleased(evt);
            }
        });
        jPanel6.add(discountPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, 23));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel40.setText("VAT");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel41.setText("%");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 20, -1));

        jLabel42.setText("Free Item Total");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 320, 370));

        totalItems.setEditable(false);
        totalItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalItemsActionPerformed(evt);
            }
        });
        totalItems.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalItemsKeyPressed(evt);
            }
        });
        kGradientPanel1.add(totalItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 535, 70, 30));

        jLabel38.setText("Total Item");
        kGradientPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 80, -1));

        btnClose.setBackground(new java.awt.Color(204, 255, 204));
        btnClose.setText("  Close");
        btnClose.setActionCommand("");
        btnClose.setBorder(null);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 110, 30));

        btnNew.setBackground(new java.awt.Color(204, 255, 204));
        btnNew.setText("  New");
        btnNew.setActionCommand("");
        btnNew.setBorder(null);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grnFreeDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeDescriptionActionPerformed

    private void grnFreeDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeDescriptionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeDescriptionKeyPressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
           if(itemQty.getText().length() != 0){
                qty = Double.valueOf(itemQty.getText());
                bPrice = Double.valueOf(itemBuyingPrice.getText());
                sPrice = Double.valueOf(itemSellingPrice.getText());
                totalBPrice = bPrice * qty;
                totalSPrice = sPrice * qty;
                GRNBprice += totalBPrice ;
                GRNSprice += totalSPrice;
                
                TableModel tm = grnTable.getModel();
                if(tm.getRowCount() > 0){
                    tm.setValueAt("", 0, 0);
                    tm.setValueAt("", rowIndex, 0);
                } else{               
                    rowIndex = 0;
                }
                
                DefaultTableModel model = (DefaultTableModel) grnTable.getModel();
                Vector vec = new Vector();
                vec.add(">");
                vec.add(Code);
                vec.add(description);
                vec.add(bPrice);
                vec.add(sPrice);
                vec.add(stockQty);
                vec.add(qty);
                vec.add(totalBPrice);
                vec.add(totalSPrice);
                vec.add(qty+stockQty);


                buyingPrice.setText(String.valueOf(GRNBprice));
                sellingPrice.setText(String.valueOf(GRNSprice));
                totalBuyingPrice.setText(String.valueOf(GRNBprice));
                totalSellingPrice.setText(String.valueOf(GRNSprice));
                model.insertRow(0, vec);
                grnTable.setModel(model);
                totalItems.setText(Integer.toString(++items));

                itemCode.setText("");
                itemDescription.setText("");
                itemBuyingPrice.setText("");
                itemSellingPrice.setText("");
                itemStockQty.setText("");
                itemQty.setText("");
                checkTotal();        
           }else{
                JOptionPane.showMessageDialog(null, "Please enter the item quantity" + grn.getCode(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

           }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    public void saveitems(){
       
    }
    
    public void saveRecords(){
        try{
            manageGrn= new ManageGoodReceiveNote(grn);
            grn.GRNrecords(Integer.valueOf(totalItems.getText()), storeCode.getText().toString(), Integer.valueOf(billNo.getText()), payType.getSelectedItem().toString(), Double.valueOf(discountPercentage.getText()), Double.valueOf(vatPercentage.getText()), Double.valueOf(buyingPrice.getText()),  Double.valueOf(discount.getText()), Double.valueOf(vat.getText()), Double.valueOf(itemDecreasePrice.getText()), Double.valueOf(loadingCharge.getText()), Double.valueOf(freeIssuse.getText()), Double.valueOf(totalBuyingPrice.getText()), Double.valueOf(sellingPrice.getText()), Double.valueOf(grmFreeTotalPrice.getText()), Double.valueOf(totalSellingPrice.getText()), Integer.valueOf(supplierCode.getText()), Double.valueOf(grnFreeTotalQty.getText()));
            int r = manageGrn.saveGRNRecord();
            if(r==1){
                DefaultTableModel dtm = (DefaultTableModel)grnTable.getModel();
                int RowCount = grnTable.getRowCount();
            
                System.out.println("grn items " +RowCount);
                
                int r1 =0;
                for(int i=0; i < RowCount; i++){
                    System.out.println("grn item table" + dtm.getValueAt(i, 0).toString());
                    System.out.println("grn item table" + dtm.getValueAt(i, 1).toString());
                    System.out.println("grn item table" + dtm.getValueAt(i, 2).toString());
                    
                    grn.GRNitems(Integer.valueOf(dtm.getValueAt(i, 1).toString()), Double.valueOf(dtm.getValueAt(i, 5).toString()), Double.valueOf(dtm.getValueAt(i, 6).toString()), Double.valueOf(dtm.getValueAt(i, 3).toString()), Double.valueOf(dtm.getValueAt(i, 4).toString()), Double.valueOf(dtm.getValueAt(i, 8).toString()), Double.valueOf(dtm.getValueAt(i, 7).toString()), Double.valueOf(dtm.getValueAt(i, 9).toString()));
                    int re1 =manageGrn.saveGRNItems();
                    if(re1==1){
                        ++r1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in inserting GRN Item No " + grn.getCode(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                if (r1 != RowCount) {
                    JOptionPane.showMessageDialog(null, "Error in inserting Records to grn", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }else if(jTable2.getRowCount() > 0){
                    DefaultTableModel dtm2= (DefaultTableModel)jTable2.getModel();
                    int RowCount1= jTable2.getRowCount();
            
                    System.out.println("free items rows" + RowCount1);
                    int r2 =0;
                    for(int j=0; j< RowCount1; j++){
                        System.out.println(dtm2.getValueAt(j, 0).toString());
                        System.out.println(dtm2.getValueAt(j, 1).toString());
                        System.out.println(dtm2.getValueAt(j, 2).toString());
                        System.out.println(dtm2.getValueAt(j, 3).toString());
                        System.out.println(dtm2.getValueAt(j, 4).toString());
                            
                        grn.GRNfreeItems(Integer.valueOf(dtm2.getValueAt(j, 1).toString()), Double.valueOf(dtm2.getValueAt(j, 3).toString()), Double.valueOf(dtm2.getValueAt(j, 4).toString()), Double.valueOf(dtm2.getValueAt(j, 5).toString()));
                        int re2 = manageGrn.saveGRNfreeItems();
                        
                        if(re2 ==1){
                            ++r2;
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving GRN free items records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                    if (r2 != RowCount1){
                        JOptionPane.showMessageDialog(null, "Error in saving GRN free records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "GRN Records have been saved succesfully" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                        clearAll();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "GRN Records have been saved succesfully" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                    clearAll();
                }
                            
            }else{
                JOptionPane.showMessageDialog(null, "Error in saving GRN records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }
             
        }catch(Exception e){
            System.out.println(" line 1002 " + e.getMessage());
        }
    }
    
    public void clearAll(){
        generateID();
        itemCode.setText("");
        itemDescription.setText("");
        itemBuyingPrice.setText("");
        itemSellingPrice.setText("");
        itemStockQty.setText("");
        itemQty.setText("");
        date.setDateToToday();
        storeCode.setText("1");
        storeName.setText("Colombo");
        supplierCode.setText("");
        supplierName.setText("");
        billNo.setText("");
        payType.setSelectedIndex(0);  
        jCheckBox1.setSelected(false);
        DefaultTableModel newt = (DefaultTableModel)grnTable.getModel();
        newt.setRowCount(0);
        DefaultTableModel newft = (DefaultTableModel)jTable2.getModel();
        newft.setRowCount(0);
        DefaultTableModel newut = (DefaultTableModel)jTable4.getModel();
        newut.setRowCount(0);
        buyingPrice.setText("0.00");
        grmFreeTotalPrice.setText("0.00");
        grnFreeTotalQty.setText("0.00");
        sellingPrice.setText("0.00");
        discount.setText("0.00");
        discountPercentage.setText("0.00");
        vat.setText("0.00");
        vatPercentage.setText("0.00");
        itemDecreasePrice.setText("0.00");
        loadingCharge.setText("0.00");
        freeIssuse.setText("0.00");
        totalBuyingPrice.setText("0.00");
        totalSellingPrice.setText("0.00");
        freeItems = 0;
        GRNBprice=0.00;
        GRNSprice=0.00;
        items =0;
        freeItemPrice=0.00;
        totalItems.setText("");
        rowIndex=-2;
        rowIndex2=-2;
        loadUnsavedGRN();
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            System.out.println("no is " + F16BNo.getText().toString());
                
            if(F16BNo.getText().length() != 13){
                JOptionPane.showMessageDialog(rootPane, "Invalid GRN ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((storeCode.getText().length() == 0 ) && (storeName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((supplierCode.getText().length() == 0 ) && (supplierName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the supplier details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(billNo.getText().length() ==0){
                JOptionPane.showMessageDialog(rootPane, "Please enter the Bill No","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                
            }else if(payType.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(rootPane, "Please select the payment type","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
            }else if(grnTable.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your GRN","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                int r =0;
                
                ManageGoodReceiveNote manage= new ManageGoodReceiveNote();
                r = manage.displayGRNno(F16BNo.getText().toString());
                
                if(r == 1){
                    System.out.println("r=1 runs");
                    int r1 =manage.updateUnsavedGRN(F16BNo.getText().toString());
                    
                    if(r1==1){
                        int r2 = manage.deleteGRNRecords(F16BNo.getText().toString());
                        
                        if(r2==1){
                            int r3 = manage.deleteGRNItems(F16BNo.getText().toString());
                            
                            if(r3==1){
                                int r4 = manage.deleteGRNfreeItems(F16BNo.getText().toString());
                                
                                if(r4==1){
                                    grn.grn(F16BNo.getText(), java.sql.Date.valueOf(date.getDate()), "save");
                                    manageGrn= new ManageGoodReceiveNote(grn);
                                    saveRecords();
                                    
//                                  JOptionPane.showMessageDialog(null, "GRN saved Permenantly", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error in saving GRN Permenantly ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Error in saving GRN Permenantly ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving GRN Records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving GRN Permenantly ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }else{
                    System.out.println("r=0 runs");
                    grn.grn(F16BNo.getText(), java.sql.Date.valueOf(date.getDate()), "save");
                    manageGrn= new ManageGoodReceiveNote(grn);
                    int rs = manageGrn.saveGRN();
                    if(rs == 1){
                        saveRecords();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving GRN", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    }   
                }                
            }
            
       
        }catch(Exception e){
            System.out.println("line 1095: " +e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void billNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billNoActionPerformed

    private void billNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_billNoKeyPressed

    private void F16BNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F16BNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F16BNoActionPerformed

    private void F16BNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F16BNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F16BNoKeyPressed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void storeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeCodeActionPerformed

    private void storeCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storeCodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeCodeKeyPressed

    private void storeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeNameActionPerformed

    private void storeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_storeNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeNameKeyPressed

    private void grnFreeItemQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeItemQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeItemQTYActionPerformed
    int rowIndex2 =-2;
    private void grnFreeItemQTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeItemQTYKeyPressed
        try{
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                
                double qty= Double.valueOf(grnFreeItemQTY.getText());
                double price= Double.valueOf(grnFreeItemPrice.getText());
                double total = qty * price;
                freeItemPrice +=total;
                
                TableModel tm = jTable2.getModel();
                if(tm.getRowCount() > 0){
                    tm.setValueAt("", 0, 0);
                    tm.setValueAt("", rowIndex2, 0);
                }else{
                    rowIndex2 =0;
                }
                
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
     
                Vector vec = new Vector();
                vec.add(">");
                vec.add(grnFreeItemCode.getText());
                vec.add(grnFreeDescription.getText());
                vec.add(String.valueOf(price));
                vec.add(String.valueOf(qty));
                vec.add(String.valueOf(total));
                
                model.insertRow(0, vec);
                jTable2.setModel(model);
                
                grmFreeTotalPrice.setText(String.valueOf(++freeItems));
                grnFreeTotalQty.setText(String.valueOf(freeItemPrice));
                freeIssuse.setText(String.valueOf(freeItemPrice));
                
                
                grnFreeItemCode.setText("");
                grnFreeDescription.setText("");
                grnFreeItemPrice.setText("");
                grnFreeItemQTY.setText("");
                
            }
         
            
                
            
        }catch(Exception e){
           System.out.println("line 1032: " +e.getMessage());
        }
    }//GEN-LAST:event_grnFreeItemQTYKeyPressed

    private void txtdno25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno25ActionPerformed

    private void txtdno25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno25KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno25KeyPressed

    private void sellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingPriceActionPerformed

    private void sellingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingPriceKeyPressed

    private void grnFreeTotalQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeTotalQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeTotalQtyActionPerformed

    private void grnFreeTotalQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeTotalQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeTotalQtyKeyPressed

    private void grnFreeItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeItemPriceActionPerformed

    private void grnFreeItemPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeItemPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeItemPriceKeyPressed

    private void grmFreeTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grmFreeTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grmFreeTotalPriceActionPerformed

    private void grmFreeTotalPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grmFreeTotalPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grmFreeTotalPriceKeyPressed

    private void grnFreeItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeItemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeItemCodeActionPerformed

    private void grnFreeItemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeItemCodeKeyPressed
        try{
            if (evt.getKeyCode() == KeyEvent.VK_F1) {
         
            grnFreeItemCode.setText("");
            grnFreeDescription.setText("");
            grnFreeItemPrice.setText("");
            grnFreeItemQTY.setText("");
                
            itemSearch.setVisible(true);            
            Code = Integer.valueOf(itemSearch.No);
            
            ManageItem items = new ManageItem();
            ResultSet result = items.selectItemdata(Code);
            
            while(result.next()){
                grnFreeItemCode.setText(String.valueOf(Code));
                grnFreeDescription.setText(result.getString("itemName"));
                grnFreeItemPrice.setText(String.valueOf(result.getInt("costPrice")));
            }
            }
        }catch(Exception e){
           System.out.println("line 1102: " +e.getMessage());
        }
    }//GEN-LAST:event_grnFreeItemCodeKeyPressed

    private void totalSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSellingPriceActionPerformed

    private void totalSellingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalSellingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSellingPriceKeyPressed

    private void buyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyingPriceActionPerformed

    private void buyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyingPriceKeyPressed

    private void vatPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatPercentageActionPerformed

    private void vatPercentageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatPercentageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatPercentageKeyPressed

    private void vatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatActionPerformed

    private void vatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_vatKeyPressed

    private void itemDecreasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDecreasePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDecreasePriceActionPerformed

    private void itemDecreasePriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemDecreasePriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDecreasePriceKeyPressed

    private void loadingChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadingChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadingChargeActionPerformed

    private void loadingChargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loadingChargeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadingChargeKeyPressed

    private void freeIssuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeIssuseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_freeIssuseActionPerformed

    private void freeIssuseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_freeIssuseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_freeIssuseKeyPressed

    private void totalBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBuyingPriceActionPerformed

    private void totalBuyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalBuyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBuyingPriceKeyPressed

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountActionPerformed

    private void discountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountKeyPressed

    private void discountPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountPercentageActionPerformed

    private void discountPercentageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountPercentageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountPercentageKeyPressed

    private void totalItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalItemsActionPerformed

    private void totalItemsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalItemsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalItemsKeyPressed

    private void supplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameActionPerformed

    private void supplierNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameKeyPressed

    private void itemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCodeActionPerformed
   
    ItemList itemSearch = new ItemList(null, true);
   
    private void itemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyPressed
        try{
            if (evt.getKeyCode() == KeyEvent.VK_F1) {
            
            itemCode.setText("");
            itemDescription.setText("");
            itemBuyingPrice.setText("");
            itemSellingPrice.setText("");
            itemStockQty.setText("");
            itemQty.setText("");
            itemTotalPrice.setText("");

                
            itemSearch.setVisible(true);
            itemCode.setText(itemSearch.No);
            
            Code = Integer.valueOf(itemSearch.No);
            
            ManageItem items = new ManageItem();
            ResultSet result = items.selectItemdata(Code);
            
            while(result.next()){
                itemDescription.setText(result.getString("itemName"));
                description = result.getString("itemName");
                itemBuyingPrice.setText(String.valueOf(result.getDouble("costPrice")));
                itemSellingPrice.setText(String.valueOf(result.getDouble("sellingPrice")));
                itemStockQty.setText(String.valueOf(result.getDouble("stockQty")));
                stockQty = Double.valueOf(result.getDouble("stockQty"));
            }
        }

        }catch(Exception e)
        {
           System.out.println("line 1242: " +e.getMessage());
        }
    }//GEN-LAST:event_itemCodeKeyPressed

    private void itemDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDescriptionActionPerformed

    private void itemDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemDescriptionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDescriptionKeyPressed

    private void itemTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTotalPriceActionPerformed

    private void itemTotalPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTotalPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTotalPriceKeyPressed

    private void itemBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuyingPriceActionPerformed

    private void itemBuyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemBuyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuyingPriceKeyPressed

    private void itemSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSellingPriceActionPerformed

    private void itemSellingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemSellingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSellingPriceKeyPressed

    private void itemStockQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStockQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemStockQtyActionPerformed

    private void itemStockQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemStockQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemStockQtyKeyPressed

    private void itemQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQtyActionPerformed

    private void itemQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQtyKeyPressed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnTemporySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemporySaveActionPerformed
        try{
             if(F16BNo.getText().length() != 13){
                JOptionPane.showMessageDialog(rootPane, "Invalid GRN ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((storeCode.getText().length() == 0 ) || (storeName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((supplierCode.getText().length() == 0 ) || (supplierName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the supplier details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(billNo.getText().length() ==0){
                JOptionPane.showMessageDialog(rootPane, "Please enter the Bill No","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                
            }else if(payType.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(rootPane, "Please select the payment type","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
            }else if(grnTable.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your GRN","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                
                int r =0;
                
                ManageGoodReceiveNote manage= new ManageGoodReceiveNote();
                r = manage.displayGRNno(F16BNo.getText().toString());
                
                if(r == 1){
                    System.out.println("r=1 runs");
                    int r2 = manage.deleteGRNRecords(F16BNo.getText().toString());
                        
                    if(r2==1){
                        int r3 = manage.deleteGRNItems(F16BNo.getText().toString());
                            
                        if(r3==1){
                            int r4 = manage.deleteGRNfreeItems(F16BNo.getText().toString());
                                
                            if(r4==1){
                                grn.grn(F16BNo.getText(), java.sql.Date.valueOf(date.getDate()), "save");
                                manageGrn= new ManageGoodReceiveNote(grn);
                                saveRecords();
                                    
//                              JOptionPane.showMessageDialog(null, "GRN saved Permenantly", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Error in saving GRN Permenantly ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving GRN Permenantly ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving GRN Records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    }
                    
                }else{
                    grn.grn(F16BNo.getText(), java.sql.Date.valueOf(date.getDate()), "notSaved");
                    manageGrn= new ManageGoodReceiveNote(grn);
                    int re = manageGrn.saveGRN();
                    if(re == 1){
                        saveRecords();
                    }
                }
            }
       
        }catch(Exception e){
            System.out.println("line 945: " +e.getMessage());
        }        
        
    }//GEN-LAST:event_btnTemporySaveActionPerformed

    private void supplierCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierCodeActionPerformed

    supplierSearch search = new supplierSearch(null,true);
    private void supplierCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierCodeKeyPressed
        try{
            if (evt.getKeyCode() == KeyEvent.VK_F1) {
         
            search.setVisible(true);
            supplierCode.setText(search.code);
            supplierName.setText(search.name);
            }

        }catch(Exception e)
        {
           System.out.println("line 1322: " +e.getMessage());
        }
    }//GEN-LAST:event_supplierCodeKeyPressed
    
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearAll();
    }//GEN-LAST:event_btnNewActionPerformed
    
    private void itemQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemQtyKeyTyped
//        int row = 
//        String rowIndex =  jTable4.getValueAt(jTable4.getSelectedRow(), jTable4.getSelectedColumn()).toString();
//        System.out.println("selected is " +  rowIndex);
    }//GEN-LAST:event_itemQtyKeyTyped

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MousePressed
        try{
            rowIndex=0;
            rowIndex2=0;
            int row = jTable4.getSelectedRow();
            String rowIndex =  jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString();
            System.out.println("selected row is "+row + " index is " +  rowIndex);
            
            ManageGoodReceiveNote mg = new ManageGoodReceiveNote();
            ResultSet result1 = mg.displayGRN(rowIndex);
            ResultSet result2 = mg.displayGRNRecord(rowIndex);
            ResultSet result3 = mg.displayGRNRecordItems(rowIndex);            
            ResultSet result4 = mg.displayGRNFreeItems(rowIndex);
        
            while(result1.next()){
                F16BNo.setText(result1.getString("F16No"));
                date.setDate(result1.getDate("date").toLocalDate());
            }
            
            while(result2.next()){
                storeCode.setText(result2.getString("stcode"));
               
                ManageStore store = new ManageStore();
                ResultSet r1 = store.getStoreName(result2.getString("stcode"));
                while(r1.next()){
                    storeName.setText(r1.getString("location"));
                }
                
                supplierCode.setText(result2.getString("spcode"));
                ManageSupplies sup = new ManageSupplies();
                ResultSet r2 = sup.getSupplierName(Integer.valueOf(result2.getString("spcode")));
                while(r2.next()){
                    supplierName.setText(r2.getString("Sname"));
                }
                
                billNo.setText(result2.getString("billNo"));
                payType.setSelectedItem(result2.getString("PaymentType"));
                totalItems.setText(String.valueOf(result2.getDouble("totalItems")));
                buyingPrice.setText(String.valueOf(result2.getDouble("totalBuyingPrice")));
                sellingPrice.setText(String.valueOf(result2.getDouble("totalsellingprice")));
                discount.setText(String.valueOf(result2.getDouble("Bdiscount")));
                discountPercentage.setText(String.valueOf(result2.getDouble("BdiscountPercentage")));
                vat.setText(String.valueOf(result2.getDouble("Bvat")));
                vatPercentage.setText(String.valueOf(result2.getDouble("BdiscountPercentage")));
                itemDecreasePrice.setText(String.valueOf(result2.getDouble("itemdecrease")));
                loadingCharge.setText(String.valueOf(result2.getDouble("loadRent")));
                freeIssuse.setText(String.valueOf(result2.getDouble("freelssue")));
                grnFreeTotalQty.setText(String.valueOf(result2.getDouble("freelssue")));
                grmFreeTotalPrice.setText(String.valueOf(result2.getDouble("freeIssueQty")));
                totalBuyingPrice.setText(String.valueOf(result2.getDouble("SubtotalAmount")));
                totalSellingPrice.setText(String.valueOf(result2.getDouble("SubTotalSellingPrice")));
                GRNBprice = result2.getDouble("totalBuyingPrice");
                GRNSprice=result2.getDouble("totalsellingprice");
                freeItemPrice= result2.getDouble("freelssue");
                freeItems = result2.getInt("freeIssueQty");
            }
            
            DefaultTableModel model = (DefaultTableModel) grnTable.getModel();
            model.setRowCount(0);
            while(result3.next()){
                Vector vec = null;
            
                vec = new Vector();
                vec.add("");
                vec.add(result3.getInt("code"));
                
                ManageItem item = new ManageItem();
                ResultSet r1 =  item.getItemName(result3.getInt("code"));
                while(r1.next()){
                    vec.add(r1.getString("itemName"));
                }
                vec.add(result3.getDouble("BuyingPrice"));
                vec.add(result3.getDouble("SellingPrice"));
                vec.add(result3.getDouble("stockQty"));
                vec.add(result3.getDouble("qty"));
                vec.add(result3.getDouble("TotalBuyingPrice"));
                vec.add(result3.getDouble("TotalSellingPrice"));
                vec.add(result3.getDouble("TotalQty"));
                
                model.addRow(vec);
            }                  
            grnTable.setModel(model);
            
            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
            model2.setNumRows(0);
            
            while(result4.next()){
                Vector vec1 = null;
                vec1 = new Vector();
                vec1.add("");
                vec1.add(result4.getInt("code"));
                
                ManageItem item = new ManageItem();
                ResultSet r1 =  item.getItemName(result4.getInt("code"));
                while(r1.next()){
                    vec1.add(r1.getString("itemName"));
                }
                vec1.add(result4.getDouble("Price"));
                vec1.add(result4.getDouble("Qty"));
                vec1.add(result4.getDouble("totalprice"));
                
                model2.addRow(vec1);
            }
                  
            jTable2.setModel(model2);

            DefaultTableModel unTable2 = (DefaultTableModel) jTable4.getModel();
            unTable2.setRowCount(0);
            
            loadUnsavedGRN();
            
            DefaultTableModel unTable = (DefaultTableModel) jTable4.getModel();
            unTable.removeRow(row);
        }catch(Exception e){
            System.out.println("line 1434 "  + e.getMessage());
        }
    }//GEN-LAST:event_jTable4MousePressed

    private void discountPercentageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountPercentageKeyReleased
        
        try{
            double dis = Double.valueOf(discountPercentage.getText().toString());
            double price = Double.valueOf(buyingPrice.getText().toString());
            double disPrice = (price * dis) / 100;
            discount.setText(String.valueOf(disPrice));
            checkTotal();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_discountPercentageKeyReleased

    public void checkTotal(){
        try{
            double dis = Double.valueOf(discount.getText());
            double vata = Double.valueOf(vat.getText());
            double dec = Double.valueOf(itemDecreasePrice.getText());
            double load = Double.valueOf(loadingCharge.getText());
            double buy = Double.valueOf(buyingPrice.getText());
            
            double total = buy + vata + load + dec - dis;
            totalBuyingPrice.setText(String.valueOf(total));
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    private void vatPercentageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vatPercentageKeyReleased

        try{
            double vata = Double.valueOf(vatPercentage.getText().toString());
            double price = Double.valueOf(buyingPrice.getText().toString());
            double vatPrice = (price * vata) / 100;
            vat.setText(String.valueOf(vatPrice));
            checkTotal();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_vatPercentageKeyReleased

    private void itemDecreasePriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemDecreasePriceKeyReleased
        
        try{
            checkTotal();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_itemDecreasePriceKeyReleased

    private void loadingChargeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loadingChargeKeyReleased
        
        try{
            checkTotal();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_loadingChargeKeyReleased
    int rowIndex= -2;
    private void grnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnTableMouseClicked
         try{
            TableModel tm = grnTable.getModel();
             
            if((rowIndex != -2) && (grnTable.getSelectedRow() != rowIndex)){
                tm.setValueAt("", 0, 0);
                tm.setValueAt("", rowIndex, 0);
                rowIndex =  grnTable.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
                
            }else if(grnTable.getSelectedRow() == rowIndex){
                rowIndex =  grnTable.getSelectedRow();
                tm.setValueAt("*", rowIndex, 0);
                
            }else{
                tm.setValueAt("", 0, 0);
                rowIndex =  grnTable.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_grnTableMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            TableModel tm = jTable2.getModel();
             
            if((rowIndex2 != -2) && (jTable2.getSelectedRow() != rowIndex2)){
                tm.setValueAt("", rowIndex2, 0);
                rowIndex2 =  jTable2.getSelectedRow();
                tm.setValueAt(">", rowIndex2, 0);
                
            }else if(jTable2.getSelectedRow() == rowIndex2){
                rowIndex2 =  jTable2.getSelectedRow();
                tm.setValueAt("*", rowIndex2, 0);
            }else{
                tm.setValueAt("", 0, 0);
                rowIndex2 =  jTable2.getSelectedRow();
                tm.setValueAt(">", rowIndex2, 0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(GoodReceiveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoodReceiveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoodReceiveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoodReceiveNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GoodReceiveNote dialog = new GoodReceiveNote(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField F16BNo;
    public javax.swing.JTextField billNo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTemporySave;
    public javax.swing.JTextField buyingPrice;
    private com.github.lgooddatepicker.components.DatePicker date;
    public javax.swing.JTextField discount;
    public javax.swing.JTextField discountPercentage;
    private javax.swing.JLabel dsfsd;
    public javax.swing.JTextField freeIssuse;
    public javax.swing.JTextField grmFreeTotalPrice;
    public javax.swing.JTextField grnFreeDescription;
    public javax.swing.JTextField grnFreeItemCode;
    public javax.swing.JTextField grnFreeItemPrice;
    public javax.swing.JTextField grnFreeItemQTY;
    public javax.swing.JTextField grnFreeTotalQty;
    private javax.swing.JTable grnTable;
    public javax.swing.JTextField itemBuyingPrice;
    public javax.swing.JTextField itemCode;
    public javax.swing.JTextField itemDecreasePrice;
    public javax.swing.JTextField itemDescription;
    public javax.swing.JTextField itemQty;
    public javax.swing.JTextField itemSellingPrice;
    public javax.swing.JTextField itemStockQty;
    public javax.swing.JTextField itemTotalPrice;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField loadingCharge;
    private javax.swing.JComboBox<String> payType;
    public javax.swing.JTextField sellingPrice;
    public javax.swing.JTextField storeCode;
    public javax.swing.JTextField storeName;
    public javax.swing.JTextField supplierCode;
    public javax.swing.JTextField supplierName;
    public javax.swing.JTextField totalBuyingPrice;
    public javax.swing.JTextField totalItems;
    public javax.swing.JTextField totalSellingPrice;
    public javax.swing.JTextField txtdno25;
    public javax.swing.JTextField vat;
    public javax.swing.JTextField vatPercentage;
    // End of variables declaration//GEN-END:variables
}
