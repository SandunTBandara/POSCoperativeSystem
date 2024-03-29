/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BasicInformation;

import Model.Items;
import controller.ManageBin;
import controller.ManageCategory;
import controller.ManageDepartment;
import controller.ManageItem;
import controller.ManageSupplies;
import controller.ManageValidation;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ItemInformation extends javax.swing.JDialog {

    public ItemInformation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        generateID();
    }

    public void generateID(){
        try {
            int no= 0;
            ManageItem manage = new ManageItem();
            ResultSet rs = manage.loadItem();
            while(rs.next()){
                no = rs.getInt("code");
            } 

            if(no == 0){
                no = 1;
            }else if(no<10000){
                ++no;
            }            
            
            System.out.println(no);
            txtitno.setText(String.valueOf(no));
        } catch (Exception ex) {
            System.out.println("line 55" + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtitno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsinhalaname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMargin = new javax.swing.JTextField();
        txtdname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdeoartmentid = new javax.swing.JTextField();
        txtbarcode = new javax.swing.JTextField();
        txtcname = new javax.swing.JTextField();
        txtCategoryId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSname = new javax.swing.JTextField();
        txtsupplierno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtbinlocatioonname = new javax.swing.JTextField();
        txtvinlocation = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtcostprice = new javax.swing.JTextField();
        txtreorderqty = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtmaxqty = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtrecorderlevel = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtsellingprice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        weight = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btndpsave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableItemInformation = new javax.swing.JTable();
        txtitname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdesno = new javax.swing.JTextField();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Item Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 270, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Item Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        txtitno.setEditable(false);
        txtitno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitnoActionPerformed(evt);
            }
        });
        txtitno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitnoKeyPressed(evt);
            }
        });
        jPanel2.add(txtitno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 25));

        jLabel8.setText("Item Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 20));

        txtitemname.setEditable(false);
        txtitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemnameActionPerformed(evt);
            }
        });
        txtitemname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitemnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtitemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 340, 25));

        jLabel9.setText("sinhala name ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        txtsinhalaname.setEditable(false);
        txtsinhalaname.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtsinhalaname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsinhalanameActionPerformed(evt);
            }
        });
        txtsinhalaname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsinhalanameKeyPressed(evt);
            }
        });
        jPanel2.add(txtsinhalaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 340, 30));

        jLabel11.setText("Weight");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 60, 30));

        jLabel12.setText("Margin");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, 30));

        txtMargin.setEditable(false);
        txtMargin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarginActionPerformed(evt);
            }
        });
        txtMargin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarginKeyPressed(evt);
            }
        });
        jPanel2.add(txtMargin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 90, 25));

        txtdname.setEditable(false);
        txtdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnameActionPerformed(evt);
            }
        });
        txtdname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 210, 25));

        jLabel10.setText("Bar Code");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jLabel13.setText("Department");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 40));

        txtdeoartmentid.setEditable(false);
        txtdeoartmentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeoartmentidActionPerformed(evt);
            }
        });
        txtdeoartmentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdeoartmentidKeyPressed(evt);
            }
        });
        jPanel2.add(txtdeoartmentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 50, 25));

        txtbarcode.setEditable(false);
        txtbarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarcodeActionPerformed(evt);
            }
        });
        txtbarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbarcodeKeyPressed(evt);
            }
        });
        jPanel2.add(txtbarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, 25));

        txtcname.setEditable(false);
        txtcname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnameActionPerformed(evt);
            }
        });
        txtcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 210, 25));

        txtCategoryId.setEditable(false);
        txtCategoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoryIdActionPerformed(evt);
            }
        });
        txtCategoryId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoryIdKeyPressed(evt);
            }
        });
        jPanel2.add(txtCategoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 50, 25));

        jLabel14.setText("Category");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 90, 30));

        txtSname.setEditable(false);
        txtSname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSnameActionPerformed(evt);
            }
        });
        txtSname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, 25));

        txtsupplierno.setEditable(false);
        txtsupplierno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuppliernoActionPerformed(evt);
            }
        });
        txtsupplierno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsuppliernoKeyPressed(evt);
            }
        });
        jPanel2.add(txtsupplierno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 50, 25));

        jLabel15.setText("Supplier");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 30));

        txtbinlocatioonname.setEditable(false);
        txtbinlocatioonname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbinlocatioonnameActionPerformed(evt);
            }
        });
        txtbinlocatioonname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbinlocatioonnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtbinlocatioonname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 210, 25));

        txtvinlocation.setEditable(false);
        txtvinlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvinlocationActionPerformed(evt);
            }
        });
        txtvinlocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvinlocationKeyPressed(evt);
            }
        });
        jPanel2.add(txtvinlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 50, 25));

        jLabel16.setText("Bin Location");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, 30));

        jLabel18.setText("Cost Price");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 20));

        txtcostprice.setEditable(false);
        txtcostprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostpriceActionPerformed(evt);
            }
        });
        txtcostprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcostpriceKeyPressed(evt);
            }
        });
        jPanel2.add(txtcostprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, 25));

        txtreorderqty.setEditable(false);
        txtreorderqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreorderqtyActionPerformed(evt);
            }
        });
        txtreorderqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtreorderqtyKeyPressed(evt);
            }
        });
        jPanel2.add(txtreorderqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 100, 25));

        jLabel20.setText("Reorder Qty");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, 30));

        txtmaxqty.setEditable(false);
        txtmaxqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxqtyActionPerformed(evt);
            }
        });
        txtmaxqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmaxqtyKeyPressed(evt);
            }
        });
        jPanel2.add(txtmaxqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 100, 25));

        jLabel21.setText("Max Quantity");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 120, 20));

        txtrecorderlevel.setEditable(false);
        txtrecorderlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecorderlevelActionPerformed(evt);
            }
        });
        txtrecorderlevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtrecorderlevelKeyPressed(evt);
            }
        });
        jPanel2.add(txtrecorderlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 25));

        jLabel22.setText("Selling Price");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 20));

        txtsellingprice.setEditable(false);
        txtsellingprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsellingpriceActionPerformed(evt);
            }
        });
        txtsellingprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsellingpriceKeyPressed(evt);
            }
        });
        jPanel2.add(txtsellingprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 25));

        jLabel2.setText("%");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 20, 30));

        jLabel19.setText("Reorder Level");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 120, -1));

        weight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Yes", "No" }));
        jPanel2.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 106, 90, 20));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 790, 350));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("  Close");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("  New");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 110, 30));

        btndpsave.setBackground(new java.awt.Color(204, 255, 204));
        btndpsave.setText("  Save");
        btndpsave.setActionCommand("");
        btndpsave.setBorder(null);
        btndpsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndpsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btndpsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 110, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 830, 20));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableItemInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Location", "Total Stock", "NonSell Stock"
            }
        ));
        jScrollPane1.setViewportView(tableItemInformation);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 90));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 790, 110));

        txtitname.setEditable(false);
        txtitname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitnameActionPerformed(evt);
            }
        });
        txtitname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitnameKeyPressed(evt);
            }
        });
        kGradientPanel1.add(txtitname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 250, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        txtdesno.setEditable(false);
        txtdesno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesnoActionPerformed(evt);
            }
        });
        txtdesno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdesnoKeyPressed(evt);
            }
        });
        kGradientPanel1.add(txtdesno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtitnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitnoActionPerformed
    private void txtitnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitnoKeyPressed
        try {
        ItemList it = new ItemList(null,true);
        if (evt.getKeyCode() == KeyEvent.VK_F1) {

            it.setVisible(true);
            txtitno.setText(it.No);
           // txtdname.setText(bj.name);
           
           
            //pass item code to manage item class
            ManageItem ManageItem1 = new ManageItem();
            ResultSet result = ManageItem1.selectItemdata(Integer.parseInt(it.No));

                      //put values into text field
                      while(result.next())
                      {
                          txtitemname.setText(result.getString("itemName"));
                          txtsinhalaname.setText(result.getString("sinhalaName"));
                          txtbarcode.setText(result.getString("barcode"));
                          txtMargin.setText(result.getString("margin"));
                          txtdeoartmentid.setText(result.getString("dno"));
                          txtsupplierno.setText(result.getString("scode"));
                          weight.setSelectedItem(result.getString("weight"));
                          txtCategoryId.setText(result.getString("category"));
                          txtvinlocation.setText(result.getString("Bcode"));
                          txtcostprice.setText(result.getString("costPrice"));
                          txtsellingprice.setText(result.getString("sellingPrice"));
                          txtreorderqty.setText(result.getString("reorderLevel"));
                          txtmaxqty.setText(result.getString("maxQty"));
                          txtrecorderlevel.setText(result.getString("reorderQty"));
                          
                          //pass department no and get department name
                          ManageDepartment Managedepartment1 = new ManageDepartment();
                          String dname = Managedepartment1.GetNamewithId(result.getString("dno"));
                          
                          txtdname.setText(dname);
                          //pass supplier no and get supplier name
                          ManageSupplies managesupplies1 = new ManageSupplies();
                          String sname = managesupplies1.getsuppliernamebyid(result.getString("scode"));
                          
                          txtSname.setText(sname);
                    
                          //pass category id and get category name
                          ManageCategory category1 = new ManageCategory();
                          String cname =category1.getCategorynamebyID(result.getString("category"));
                          
                          txtcname.setText(cname);
                          
                          //pass bin id and get bin name
                          ManageBin managebin1 = new ManageBin();
                          String binname = managebin1.getbinnamebyID(result.getInt("Bcode"));
                          txtbinlocatioonname.setText(binname);
                          
                          //add data on stores and items into table
                          DefaultTableModel model1 = (DefaultTableModel) tableItemInformation.getModel();
                           
                          ManageItem ManageItem2 = new ManageItem();
                          ResultSet result1 = ManageItem2.selectItemcodetotable(Integer.parseInt(it.No));
                          while(result1.next())
                          { Vector vec1 = new Vector();
                                 vec1.insertElementAt(result1.getString("stcode"), 0);
                            vec1.insertElementAt(result1.getString("location"), 1);
                           vec1.insertElementAt(result1.getString("stockQty"), 2);
                            vec1.insertElementAt(result1.getInt("Nonsell"), 3);
                             
                             model1.insertRow(0, vec1);
                          
                          }
                          tableItemInformation.setModel(model1);
                          
                          //
                           txtdesno.setText(it.No);
                           txtitname.setText(result.getString("itemName"));                      
                             
                          
                      }    
                  
           
           
           
           

        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            clearAll();
        }else if (evt.getKeyCode() == KeyEvent.VK_F3) {
            txtitno.setEditable(true);
            txtitemname.setEditable(true);
            txtsinhalaname.setEditable(true);
            txtbarcode.setEditable(true);
            txtMargin.setEditable(true);
            txtdeoartmentid.setEditable(true);
            txtsupplierno.setEditable(true);
            weight.setEditable(true);
            txtCategoryId.setEditable(true);
            txtvinlocation.setEditable(true);
            txtcostprice.setEditable(true);
            txtsellingprice.setEditable(true);
            txtreorderqty.setEditable(true);
            txtdname.setEditable(true);
            txtSname.setEditable(true);
            txtcname.setEditable(true);
            txtmaxqty.setEditable(true);
            txtrecorderlevel.setEditable(true);
            btndpsave.setEnabled(true);
            btndpsave.setText("Update");
        }   else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtitno.setEditable(true);
            txtitemname.setEditable(true);
            txtsinhalaname.setEditable(true);
            txtbarcode.setEditable(true);
            txtMargin.setEditable(true);
            txtdeoartmentid.setEditable(true);
            txtsupplierno.setEditable(true);
            weight.setEditable(true);
            txtCategoryId.setEditable(true);
            txtvinlocation.setEditable(true);
            txtcostprice.setEditable(true);
            txtsellingprice.setEditable(true);
            txtreorderqty.setEditable(true);
            txtdname.setEditable(true);
            txtSname.setEditable(true);
            txtcname.setEditable(true);
            txtmaxqty.setEditable(true);
            txtrecorderlevel.setEditable(true);
            btndpsave.setEnabled(true);
            btndpsave.setText("Save");
        }            
        
        
                  } catch (SQLException e) {
                      System.out.println(e.getMessage());
                  } catch (Exception e) {
                    System.out.println(e.getMessage());
                  }
    }//GEN-LAST:event_txtitnoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void clearAll(){
        txtitno.setEditable(false);
            txtitemname.setEditable(false);
            txtsinhalaname.setEditable(false);
            txtbarcode.setEditable(false);
            txtMargin.setEditable(false);
            txtdeoartmentid.setEditable(false);
            txtsupplierno.setEditable(false);
            weight.setEditable(false);
            txtCategoryId.setEditable(false);
            txtvinlocation.setEditable(false);
            txtcostprice.setEditable(false);
            txtsellingprice.setEditable(false);
            txtreorderqty.setEditable(false);
            txtdname.setEditable(false);
            txtSname.setEditable(false);
            txtcname.setEditable(false);
            txtmaxqty.setEditable(false);
            txtrecorderlevel.setEditable(false);
            btndpsave.setEnabled(false);
            btndpsave.setText("Save");txtitno.setEditable(false);
            txtitemname.setText("");
            txtsinhalaname.setText("");
            txtbarcode.setText("");
            txtMargin.setText("");
            txtdeoartmentid.setText("");
            txtsupplierno.setText("");
            weight.setSelectedIndex(0);
            txtCategoryId.setText("");
            txtvinlocation.setText("");
            txtcostprice.setText("");
            txtsellingprice.setText("");
            txtreorderqty.setText("");
            txtdesno.setText("");
            txtitname.setText("");
            txtdname.setText("");
            txtSname.setText("");
            txtcname.setText("");
            txtmaxqty.setText("");
            txtrecorderlevel.setText("");
            btndpsave.setEnabled(false);
            btndpsave.setText("Save");
            generateID();
    }
    private void btndpsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpsaveActionPerformed
        try{
            if(txtitno.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item code" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtitemname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item name" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtsinhalaname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item sinhala name" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtbarcode.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item barcode" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(weight.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null, "Please select the weight" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtMargin.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item margin value" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtdeoartmentid.getText().length() ==0 && txtdname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the department details" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtCategoryId.getText().length() ==0 && txtcname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the Category details" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtsupplierno.getText().length() ==0 && txtSname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the supplier details" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtvinlocation.getText().length() ==0 && txtbinlocatioonname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the bin details" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtcostprice.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the cost price" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtrecorderlevel.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item reorder level values" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtreorderqty.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item reorder quantity" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtsellingprice.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item selling price" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txtmaxqty.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the item max quantity" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else{
            
                if(btndpsave.getText() == "Save"){
                    System.out.println(weight.getSelectedItem().toString());
                    Items item = new Items();
                    item.setItems(Integer.valueOf(txtitno.getText()),txtitemname.getText(),txtsinhalaname.getText(),
                                            Integer.valueOf(txtbarcode.getText()),
                                            String.valueOf(weight.getSelectedItem().toString()),
                                            Double.valueOf(txtMargin.getText()),
                                            Integer.valueOf(txtdeoartmentid.getText()),
                                            txtCategoryId.getText(),
                                            Integer.valueOf(txtsupplierno.getText()),
                                            Integer.valueOf(txtvinlocation.getText()),
                                            Double.valueOf(txtcostprice.getText()),
                                            Double.valueOf(txtrecorderlevel.getText()),
                                            Double.valueOf(txtreorderqty.getText()),
                                            Double.valueOf(txtsellingprice.getText()),
                                            Double.valueOf(txtmaxqty.getText()));
                    ManageItem manage = new ManageItem(item);
                    int r = manage.saveItem();
                    if(r==1){
                        JOptionPane.showMessageDialog(null, "Item saved saved succesfully" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                        clearAll();
                    }
                }else if(btndpsave.getText() == "Update"){
                    System.out.println(weight.getSelectedItem().toString());
                    Items item = new Items();
                    item.setItems(Integer.valueOf(txtitno.getText()),txtitemname.getText(),txtsinhalaname.getText(),
                                            Integer.valueOf(txtbarcode.getText()),
                                            String.valueOf(weight.getSelectedItem().toString()),
                                            Double.valueOf(txtMargin.getText()),
                                            Integer.valueOf(txtdeoartmentid.getText()),
                                            txtCategoryId.getText(),
                                            Integer.valueOf(txtsupplierno.getText()),
                                            Integer.valueOf(txtvinlocation.getText()),
                                            Double.valueOf(txtcostprice.getText()),
                                            Double.valueOf(txtrecorderlevel.getText()),
                                            Double.valueOf(txtreorderqty.getText()),
                                            Double.valueOf(txtsellingprice.getText()),
                                            Double.valueOf(txtmaxqty.getText()));
                    ManageItem manage = new ManageItem(item);
                    manage.updateItem();
                    clearAll();
                }
            }
        }catch(Exception e){
            System.out.println("Line 730" +e.getMessage());
        }
    }//GEN-LAST:event_btndpsaveActionPerformed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void txtitnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitnameActionPerformed

    private void txtitnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitnameKeyPressed

    private void txtdesnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesnoActionPerformed

    private void txtdesnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesnoKeyPressed

    private void txtitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemnameActionPerformed

    private void txtitemnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitemnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemnameKeyPressed

    private void txtsinhalanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsinhalanameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsinhalanameActionPerformed

    private void txtsinhalanameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsinhalanameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsinhalanameKeyPressed

    private void txtMarginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarginActionPerformed

    private void txtMarginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarginKeyPressed

    private void txtdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnameActionPerformed

    private void txtdnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnameKeyPressed

    private void txtdeoartmentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeoartmentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeoartmentidActionPerformed

    private void txtdeoartmentidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeoartmentidKeyPressed
        LocationSearch bj = new LocationSearch(null,true);
        bj.setVisible(true);
        txtdeoartmentid.setText(bj.id);
        txtdname.setText(bj.name);
    }//GEN-LAST:event_txtdeoartmentidKeyPressed

    private void txtbarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarcodeActionPerformed

    private void txtbarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbarcodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarcodeKeyPressed

    private void txtcnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnameActionPerformed

    private void txtcnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnameKeyPressed

    private void txtCategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoryIdActionPerformed

    private void txtCategoryIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoryIdKeyPressed
        CategorySearch bj = new CategorySearch(null,true);

            bj.setVisible(true);
            txtCategoryId.setText(bj.id);
            txtcname.setText(bj.name);
    }//GEN-LAST:event_txtCategoryIdKeyPressed

    private void txtSnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnameActionPerformed

    private void txtSnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSnameKeyPressed

    private void txtsuppliernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuppliernoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuppliernoActionPerformed

    private void txtsuppliernoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsuppliernoKeyPressed
        SupplierSearch search = new SupplierSearch(null, true);
        search.setVisible(true);
        txtsupplierno.setText(String.valueOf(search.stid));
        txtSname.setText(search.stname);
    }//GEN-LAST:event_txtsuppliernoKeyPressed

    private void txtbinlocatioonnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbinlocatioonnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbinlocatioonnameActionPerformed

    private void txtbinlocatioonnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbinlocatioonnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbinlocatioonnameKeyPressed

    private void txtvinlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvinlocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvinlocationActionPerformed

    private void txtvinlocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvinlocationKeyPressed
        BinLocationSearch bj = new BinLocationSearch(null,true);
        bj.setVisible(true);
        txtvinlocation.setText(bj.id);
        txtbinlocatioonname.setText(bj.name);
    }//GEN-LAST:event_txtvinlocationKeyPressed

    private void txtcostpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostpriceActionPerformed

    private void txtcostpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostpriceKeyPressed
        ManageValidation.validateNumber(txtcostprice, 7);
    }//GEN-LAST:event_txtcostpriceKeyPressed

    private void txtreorderqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreorderqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreorderqtyActionPerformed

    private void txtreorderqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtreorderqtyKeyPressed
        ManageValidation.validateNumber(txtcostprice, 7);
    }//GEN-LAST:event_txtreorderqtyKeyPressed

    private void txtmaxqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxqtyActionPerformed

    private void txtmaxqtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaxqtyKeyPressed
        ManageValidation.validateNumber(txtcostprice, 7);
    }//GEN-LAST:event_txtmaxqtyKeyPressed

    private void txtrecorderlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecorderlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrecorderlevelActionPerformed

    private void txtrecorderlevelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrecorderlevelKeyPressed
        ManageValidation.validateNumber(txtcostprice, 7);
    }//GEN-LAST:event_txtrecorderlevelKeyPressed

    private void txtsellingpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsellingpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsellingpriceActionPerformed

    private void txtsellingpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsellingpriceKeyPressed
        ManageValidation.validateNumber(txtcostprice, 7);
    }//GEN-LAST:event_txtsellingpriceKeyPressed

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
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ItemInformation dialog = new ItemInformation(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btndpsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tableItemInformation;
    public javax.swing.JTextField txtCategoryId;
    public javax.swing.JTextField txtMargin;
    public javax.swing.JTextField txtSname;
    public javax.swing.JTextField txtbarcode;
    public javax.swing.JTextField txtbinlocatioonname;
    public javax.swing.JTextField txtcname;
    public javax.swing.JTextField txtcostprice;
    public javax.swing.JTextField txtdeoartmentid;
    public javax.swing.JTextField txtdesno;
    public javax.swing.JTextField txtdname;
    public javax.swing.JTextField txtitemname;
    public javax.swing.JTextField txtitname;
    public javax.swing.JTextField txtitno;
    public javax.swing.JTextField txtmaxqty;
    public javax.swing.JTextField txtrecorderlevel;
    public javax.swing.JTextField txtreorderqty;
    public javax.swing.JTextField txtsellingprice;
    public javax.swing.JTextField txtsinhalaname;
    public javax.swing.JTextField txtsupplierno;
    public javax.swing.JTextField txtvinlocation;
    private javax.swing.JComboBox<String> weight;
    // End of variables declaration//GEN-END:variables
}
