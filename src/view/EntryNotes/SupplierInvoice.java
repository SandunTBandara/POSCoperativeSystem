/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.EntryNotes;

import controller.ManageGoodReceiveNote;
import controller.ManageItem;
import controller.ManagePurchaseOrder;
import controller.ManageSupplierInvoice;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.GRN;
import model.suplierInvoice;
import view.BasicInformation.ItemList;

public class SupplierInvoice extends javax.swing.JDialog {

    String description = "";
    int items = 0,Code, freeItems=0;
    
    double bPrice, sPrice, totalBPrice, totalSPrice, qty, stockQty, GRNBprice=0.00, GRNSprice=0.00,freeItemPrice=0.00;
    suplierInvoice invoice = new suplierInvoice();
    ManageSupplierInvoice manage = new ManageSupplierInvoice(invoice);
    
    public SupplierInvoice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        generateID();
        loadF23No();
        
        table.getTableHeader().setFont(new Font("Nirmala UI", Font.PLAIN, 12));
        date.setDateToToday();        
        
    }

      public void generateID(){
        try {
            String grn="";
            ResultSet rs = manage.displayAll();
            while(rs.next()){
                grn = rs.getString("siNo").toString();
            } 

            if(grn == ""){
                grn = "SIN22KT000001";
            }else{
                int no = Integer.valueOf(grn.substring(8));
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    grn = "SIN22KT00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    grn = "SIN22KT0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    grn = "SIN22KT000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    grn = "SIN22KT00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    grn = "SIN22KT0" + String.valueOf(nno);
                }else{
                    grn = "SIN22KT" + String.valueOf(nno);
                }
            }            
            
            System.out.println(grn);
            siNo.setText(grn);
        } catch (Exception ex) {
            System.out.println("line 55" + ex.getMessage());
        }
    }
   
    public void loadF23No(){
        try{
            ManagePurchaseOrder display = new ManagePurchaseOrder();
            ResultSet result = display.displayAll();
            
            F23No.addItem("-select-");
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            while(result.next()){
                F23No.addItem(result.getString("F23No").toString());
            }
            
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
        table = new javax.swing.JTable();
        itemCode = new javax.swing.JTextField();
        itemDescription = new javax.swing.JTextField();
        itemBuyingPrice = new javax.swing.JTextField();
        itemStockQty = new javax.swing.JTextField();
        itemTotalPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        itemQty = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        siNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        storeCode = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        storeName = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        dsfsd = new javax.swing.JLabel();
        supplierName = new javax.swing.JTextField();
        supplierCode = new javax.swing.JTextField();
        date = new com.github.lgooddatepicker.components.DatePicker();
        F23No = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        grnFreeDescription = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        grnFreeItemQTY = new javax.swing.JTextField();
        txtdno25 = new javax.swing.JTextField();
        grnFreeTotalQty = new javax.swing.JTextField();
        grnFreeItemPrice = new javax.swing.JTextField();
        grmFreeTotalPrice = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        grnFreeItemCode = new javax.swing.JTextField();
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("භාණ්ඩ ඇනවුම් සනාථ කිරීමේ  සටහන");
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 430, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1120, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "අනු අංකය", "විස්තරය", "ගැනුම්  මිල", "පවතින තොගය ", "ප්‍රමාණය ", "ගැණුම් එකතුව", "මුළු ප්‍රමාණය "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setDoubleBuffered(true);
        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(80);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(120);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(6).setPreferredWidth(100);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 730, 280));

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
        jPanel2.add(itemBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 90, 25));

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
        jPanel2.add(itemStockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 25));

        itemTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTotalPriceActionPerformed(evt);
            }
        });
        itemTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemTotalPriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemTotalPriceKeyTyped(evt);
            }
        });
        jPanel2.add(itemTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 110, 25));

        btnAdd.setText("Add");
        btnAdd.setActionCommand("");
        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setBorder(null);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 70, 25));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemQtyKeyTyped(evt);
            }
        });
        jPanel2.add(itemQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, 25));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 770, 350));

        btnSave.setText("  Save");
        btnSave.setActionCommand("");
        btnSave.setBackground(new java.awt.Color(204, 255, 204));
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 90, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1120, 20));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel17.setText("F23 අංකය");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 80, 20));

        siNo.setEditable(false);
        siNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siNoActionPerformed(evt);
            }
        });
        siNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                siNoKeyPressed(evt);
            }
        });
        jPanel4.add(siNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, 25));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel7.setText("ස්ථානය");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 90, 20));

        jCheckBox1.setText("If Bags");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 90, 20));

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
        jPanel4.add(storeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 50, 25));

        jLabel25.setText("සැපයැම්කරු");
        jLabel25.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 20));

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
        jPanel4.add(storeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 120, 25));

        jLabel28.setText("Invoice No");
        jLabel28.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        dsfsd.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        dsfsd.setText("දිනය");
        jPanel4.add(dsfsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 40));

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
        jPanel4.add(supplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, 25));

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
        jPanel4.add(supplierCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 50, 25));

        date.setFocusable(false);
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 200, 30));

        jPanel4.add(F23No, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 150, 25));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 770, 90));

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
        jPanel6.add(grmFreeTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 80, 25));

        jLabel31.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel31.setText("මුළු එකතුව");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        jLabel32.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel32.setText("ගැණුම්");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 70, 30));

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
        jPanel6.add(buyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 23));

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
        jPanel6.add(vatPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 40, 20));

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
        jPanel6.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, 23));

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
        jPanel6.add(itemDecreasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 80, 23));

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
        jPanel6.add(loadingCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 23));

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
        jPanel6.add(freeIssuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 80, 23));

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
        jPanel6.add(totalBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 80, 23));

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
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 20, -1));

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
        jPanel6.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 80, 23));

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
        jPanel6.add(discountPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 40, 23));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel40.setText("VAT");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel41.setText("%");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 20, -1));

        jLabel42.setText("Free Item Total");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 320, 370));

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
        kGradientPanel1.add(totalItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 70, 30));

        jLabel38.setText("Total Items");
        kGradientPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 90, -1));

        btnClose.setText("  Close");
        btnClose.setActionCommand("");
        btnClose.setBackground(new java.awt.Color(204, 255, 204));
        btnClose.setBorder(null);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 90, 30));

        btnNew.setText("  New");
        btnNew.setActionCommand("");
        btnNew.setBackground(new java.awt.Color(204, 255, 204));
        btnNew.setBorder(null);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try{
            TableModel tm = table.getModel();

            if((rowIndex != -2) && (table.getSelectedRow() != rowIndex)){
                tm.setValueAt("", 0, 0);
                tm.setValueAt("", rowIndex, 0);
                rowIndex =  table.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);

            }else if(table.getSelectedRow() == rowIndex){
                rowIndex =  table.getSelectedRow();
                tm.setValueAt("*", rowIndex, 0);

            }else{
                tm.setValueAt("", 0, 0);
                rowIndex =  table.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tableMouseClicked

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
                itemStockQty.setText("");
                itemTotalPrice.setText("");
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
                    itemStockQty.setText(String.valueOf(result.getDouble("stockQty")));
                    stockQty = Double.valueOf(result.getDouble("stockQty"));
                    itemQty.setText("0.00");
                                itemTotalPrice.setText(String.valueOf("0.00"));

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

    private void itemBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuyingPriceActionPerformed

    private void itemBuyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemBuyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuyingPriceKeyPressed

    private void itemStockQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStockQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemStockQtyActionPerformed

    private void itemStockQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemStockQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemStockQtyKeyPressed

    private void itemTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTotalPriceActionPerformed

    private void itemTotalPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTotalPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTotalPriceKeyPressed

    private void itemTotalPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTotalPriceKeyTyped
        //        int row =
        //        String rowIndex =  jTable4.getValueAt(jTable4.getSelectedRow(), jTable4.getSelectedColumn()).toString();
        //        System.out.println("selected is " +  rowIndex);
    }//GEN-LAST:event_itemTotalPriceKeyTyped
    
    int rowIndex =-2;
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            if(itemQty.getText().length() != 0 || !(itemQty.getText().toString().equals("0.00")) ){
                qty = Double.valueOf(itemQty.getText());
                bPrice = Double.valueOf(itemBuyingPrice.getText());
                totalBPrice = bPrice * qty;
                GRNBprice += totalBPrice ;

                TableModel tm = table.getModel();
                if(tm.getRowCount() > 0){
                    tm.setValueAt("", 0, 0);
                    tm.setValueAt("", rowIndex, 0);
                } else{
                    rowIndex = 0;
                }

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Vector vec = new Vector();
                vec.add(">");
                vec.add(Code);
                vec.add(description);
                vec.add(bPrice);
                vec.add(stockQty);
                vec.add(qty);
                vec.add(totalBPrice);
                vec.add(qty+stockQty);

                buyingPrice.setText(String.valueOf(GRNBprice));
                totalBuyingPrice.setText(String.valueOf(GRNBprice));
                model.insertRow(0, vec);
                table.setModel(model);
                totalItems.setText(Integer.toString(++items));

                itemCode.setText("");
                itemDescription.setText("");
                itemBuyingPrice.setText("");
                itemStockQty.setText("");
                itemTotalPrice.setText("");
                checkTotal();
            }else{
                JOptionPane.showMessageDialog(null, "Please enter the item quantity" + invoice.getCode(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    
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
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            System.out.println("no is " + siNo.getText().toString());

            if(siNo.getText().length() != 13){
                JOptionPane.showMessageDialog(rootPane, "Invalid Supplier Invoice ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((storeCode.getText().length() == 0 ) && (storeName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((supplierCode.getText().length() == 0 ) && (supplierName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the supplier details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(F23No.getSelectedIndex() ==0){
                JOptionPane.showMessageDialog(rootPane, "Please Selecet the relevant F23No","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your GRN","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                int r =0;
                
                invoice.supplierInvoice(siNo.getText(), java.sql.Date.valueOf(date.getDate()), F23No.getSelectedItem().toString());
                r = manage.saveInvoice();

                if(r == 1){
                    System.out.println("r=1 runs");
                    invoice.supplierInvoiceRecords(Double.valueOf(totalItems.getText()), storeCode.getText(), Double.valueOf(discountPercentage.getText()), Double.valueOf(vatPercentage.getText()), Double.valueOf(buyingPrice.getText()), Double.valueOf(discount.getText()), Double.valueOf(vat.getText()), Double.valueOf(itemDecreasePrice.getText()), Double.valueOf(loadingCharge.getText()), Double.valueOf(grmFreeTotalPrice.getText()), Double.valueOf(totalBuyingPrice.getText()), Integer.valueOf(supplierCode.getText()), Double.valueOf(freeIssuse.getText()));
                    int r1 =manage.saveInvoiceRecords();

                    if(r1==1){
                        
                        DefaultTableModel dtm = (DefaultTableModel)table.getModel();
                        int RowCount = table.getRowCount();

                        System.out.println("grn items " +RowCount);

                        int c =0;
                        for(int i=0; i < RowCount; i++){

                            invoice.supplierInvoiceItems(Integer.valueOf(dtm.getValueAt(i, 1).toString()), Double.valueOf(dtm.getValueAt(i, 4).toString()), Double.valueOf(dtm.getValueAt(i, 5).toString()), Double.valueOf(dtm.getValueAt(i, 3).toString()), Double.valueOf(dtm.getValueAt(i,6).toString()), Double.valueOf(dtm.getValueAt(i, 7).toString()));
                            int re1 = manage.saveInvoiceItems();
                            if(re1==1){
                                ++c;
                            }else{
                                JOptionPane.showMessageDialog(null, "Error in inserting Supplier invoice items No " + invoice.getCode(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                        if (c == RowCount) {

                            DefaultTableModel dtm2 = (DefaultTableModel)jTable2.getModel();
                            int RowCount2 = jTable2.getRowCount();

                            System.out.println("grn items " +RowCount2);

                            int c2 =0;
                            for(int i=0; i < RowCount2; i++){

                                invoice.supplierInvoiceFreeItems(Integer.valueOf(dtm2.getValueAt(i, 1).toString()), Double.valueOf(dtm2.getValueAt(i, 3).toString()), Double.valueOf(dtm2.getValueAt(i, 4).toString()), Double.valueOf(dtm2.getValueAt(i, 5).toString()));
                                int re2 = manage.saveInvoiceFreeItems();
                                if(re2==1){
                                    ++c2;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error in inserting Supplier invoice items No " + invoice.getCode(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            if (c2 == RowCount2) {
                                clearAll();
                                JOptionPane.showMessageDialog(null, " Supplier invoice saved Permenantly", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Error in saving Supplier invoice free items", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving Supplier invoice items ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                            JOptionPane.showMessageDialog(null, "Error in saving  Supplier invoice Records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Error in saving  Supplier invoice", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }
            

        }catch(Exception e){
            System.out.println("line 1095: " +e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void siNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siNoActionPerformed

    private void siNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_siNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_siNoKeyPressed

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

    private void supplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameActionPerformed

    supplierSearch search = new supplierSearch(null,true);
    private void supplierNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierNameKeyPressed
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
    }//GEN-LAST:event_supplierNameKeyPressed

    private void supplierCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierCodeActionPerformed

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

    private void grnFreeDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeDescriptionActionPerformed

    private void grnFreeDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeDescriptionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeDescriptionKeyPressed

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

    private void grnFreeItemQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnFreeItemQTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnFreeItemQTYActionPerformed

    int rowIndex2=-2;
    private void grnFreeItemQTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnFreeItemQTYKeyPressed
        try{
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                if(Double.valueOf(grnFreeItemQTY.getText()) > Double.valueOf(freeitemStQty)){
                    JOptionPane.showMessageDialog(null, "No enough item quantity available in stock", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }else{
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

    double freeitemStQty=0;
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
                    freeitemStQty = Double.valueOf(result.getDouble("StockQty"));
                }
            }
        }catch(Exception e){
            System.out.println("line 1102: " +e.getMessage());
        }
    }//GEN-LAST:event_grnFreeItemCodeKeyPressed

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

    private void itemDecreasePriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemDecreasePriceKeyReleased

        try{
            checkTotal();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_itemDecreasePriceKeyReleased

    private void loadingChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadingChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadingChargeActionPerformed

    private void loadingChargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loadingChargeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadingChargeKeyPressed

    private void loadingChargeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loadingChargeKeyReleased

        try{
            checkTotal();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_loadingChargeKeyReleased

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

    private void totalItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalItemsActionPerformed

    private void totalItemsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalItemsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalItemsKeyPressed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearAll();
    }//GEN-LAST:event_btnNewActionPerformed

     public void clearAll(){
        generateID();
        itemCode.setText("");
        itemDescription.setText("");
        itemBuyingPrice.setText("");
        itemStockQty.setText("");
        itemQty.setText("");
        F23No.setSelectedIndex(0);
        date.setDateToToday();
        storeCode.setText("1");
        storeName.setText("Colombo");
        supplierCode.setText("");
        supplierName.setText("");
        jCheckBox1.setSelected(false);
        DefaultTableModel newt = (DefaultTableModel)table.getModel();
        newt.setRowCount(0);
        DefaultTableModel newft = (DefaultTableModel)jTable2.getModel();
        newft.setRowCount(0);
        buyingPrice.setText("0.00");
        grmFreeTotalPrice.setText("0.00");
        grnFreeTotalQty.setText("0.00");
        discount.setText("0.00");
        discountPercentage.setText("0.00");
        vat.setText("0.00");
        vatPercentage.setText("0.00");
        itemDecreasePrice.setText("0.00");
        loadingCharge.setText("0.00");
        freeIssuse.setText("0.00");
        totalBuyingPrice.setText("0.00");
        freeItems = 0;
        GRNBprice=0.00;
        GRNSprice=0.00;
        items =0;
        freeItemPrice=0.00;
        totalItems.setText("");
        rowIndex=-2;
        rowIndex2=-2;
    }
    
    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void itemQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQtyActionPerformed

    private void itemQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQtyKeyPressed

    private void itemQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemQtyKeyTyped
        
    }//GEN-LAST:event_itemQtyKeyTyped

    private void itemQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemQtyKeyReleased
        try{
            if(itemQty.getText().length() != 0){
                if(Double.valueOf(itemQty.getText()) > Double.valueOf(itemStockQty.getText())){
                    JOptionPane.showMessageDialog(null, "No enough item aqantity available stock", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }else{
                    double total = Double.valueOf(itemBuyingPrice.getText()) * Double.valueOf(itemQty.getText());
                    itemTotalPrice.setText(String.valueOf(total));
                }
            }else{
                itemTotalPrice.setText(String.valueOf("0.00"));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_itemQtyKeyReleased

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
            java.util.logging.Logger.getLogger(SupplierInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SupplierInvoice dialog = new SupplierInvoice(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> F23No;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
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
    public javax.swing.JTextField itemBuyingPrice;
    public javax.swing.JTextField itemCode;
    public javax.swing.JTextField itemDecreasePrice;
    public javax.swing.JTextField itemDescription;
    public javax.swing.JTextField itemQty;
    public javax.swing.JTextField itemStockQty;
    public javax.swing.JTextField itemTotalPrice;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField loadingCharge;
    public javax.swing.JTextField siNo;
    public javax.swing.JTextField storeCode;
    public javax.swing.JTextField storeName;
    public javax.swing.JTextField supplierCode;
    public javax.swing.JTextField supplierName;
    private javax.swing.JTable table;
    public javax.swing.JTextField totalBuyingPrice;
    public javax.swing.JTextField totalItems;
    public javax.swing.JTextField txtdno25;
    public javax.swing.JTextField vat;
    public javax.swing.JTextField vatPercentage;
    // End of variables declaration//GEN-END:variables
}
