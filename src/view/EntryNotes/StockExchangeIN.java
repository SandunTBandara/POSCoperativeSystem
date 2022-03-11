
package view.EntryNotes;

import controller.ManageGoodReceiveNote;
import controller.ManageItem;
import controller.ManageStockExchangeIN;
import controller.ManageStore;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.stockExchangeIN;
import view.BasicInformation.ItemList;

public class StockExchangeIN extends javax.swing.JDialog {

    stockExchangeIN exchange = new stockExchangeIN();
    ManageStockExchangeIN manage = new ManageStockExchangeIN();
    
    double bprice =0, sprice=0, bTotal =0, sTotal =0, iqty=0, subBprice=0, subSprice=0;
    
    public StockExchangeIN(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        table.getTableHeader().setFont(new Font("Nirmala UI", Font.PLAIN, 12));
        generateID();
        date.setDateToToday();  
        getStores(toName);  
        getStores(fromName);
    }
    
     public void getStores(javax.swing.JComboBox name){
        try{
            name.addItem("-select-");
            ManageStore store =new ManageStore();
            ResultSet rs = store.getStores();
            
            while(rs.next()){
                name.addItem(rs.getString("location"));
            }
        }catch (Exception ex) {
            System.out.println("line 48" + ex.getMessage());
        }
    }
     
     public void generateID(){
        try {
            String grn="";
            ResultSet rs = manage.displayAll();
            while(rs.next()){
                grn = rs.getString("F18No").toString();
            } 

            if(grn == ""){
                grn = "DOI22KT000001";
            }else{
                int no = Integer.valueOf(grn.substring(8));
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    grn = "DOI22KT00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    grn = "DOI22KT0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    grn = "DOI22KT000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    grn = "DOI22KT00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    grn = "DOI22KT0" + String.valueOf(nno);
                }else{
                    grn = "DOI22KT" + String.valueOf(nno);
                }
            }            
            
            System.out.println(grn);
            F18no.setText(grn);
        } catch (Exception ex) {
            System.out.println("line 55" + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        itemCode = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        totalSprice = new javax.swing.JTextField();
        stockQty = new javax.swing.JTextField();
        buyingPrice = new javax.swing.JTextField();
        sellingPrice = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        subTotalSprice = new javax.swing.JTextField();
        subTotalBprice = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        totalBprice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        F18no = new javax.swing.JTextField();
        toNo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        billNo = new javax.swing.JTextField();
        toName = new javax.swing.JComboBox<>();
        fromName = new javax.swing.JComboBox<>();
        fromNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new com.github.lgooddatepicker.components.DatePicker();
        btndpsave1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btndpsave2 = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "අනු අංකය ", "විස්තර ", "පවතින තොගය ", "ගැනුම්  මිල ", "විකුණුම් මිල ", "ප්‍රමාණය ", "ගැනුම් එකතුව ", "විකුණුම්  එකතුව "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            table.getColumnModel().getColumn(1).setPreferredWidth(75);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(98);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(80);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(90);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(6).setPreferredWidth(75);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(7).setPreferredWidth(100);
            table.getColumnModel().getColumn(8).setResizable(false);
            table.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 700, 260));

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
        jPanel2.add(itemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 25));

        description.setEditable(false);
        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descriptionKeyPressed(evt);
            }
        });
        jPanel2.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 25));

        totalSprice.setEditable(false);
        totalSprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalSpriceActionPerformed(evt);
            }
        });
        totalSprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalSpriceKeyPressed(evt);
            }
        });
        jPanel2.add(totalSprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 70, 25));

        stockQty.setEditable(false);
        stockQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockQtyActionPerformed(evt);
            }
        });
        stockQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockQtyKeyPressed(evt);
            }
        });
        jPanel2.add(stockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 25));

        buyingPrice.setBackground(new java.awt.Color(0, 204, 0));
        buyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyingPriceActionPerformed(evt);
            }
        });
        buyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buyingPriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buyingPriceKeyReleased(evt);
            }
        });
        jPanel2.add(buyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 25));

        sellingPrice.setBackground(new java.awt.Color(0, 204, 0));
        sellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingPriceActionPerformed(evt);
            }
        });
        sellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellingPriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellingPriceKeyReleased(evt);
            }
        });
        jPanel2.add(sellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, 25));

        qty.setBackground(new java.awt.Color(255, 255, 0));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
        });
        jPanel2.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 80, 25));

        subTotalSprice.setEditable(false);
        subTotalSprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subTotalSprice.setText("0.00");
        subTotalSprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotalSpriceActionPerformed(evt);
            }
        });
        subTotalSprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subTotalSpriceKeyPressed(evt);
            }
        });
        jPanel2.add(subTotalSprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 80, 30));

        subTotalBprice.setEditable(false);
        subTotalBprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subTotalBprice.setText("0.00");
        subTotalBprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotalBpriceActionPerformed(evt);
            }
        });
        subTotalBprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subTotalBpriceKeyPressed(evt);
            }
        });
        jPanel2.add(subTotalBprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 80, 30));

        jLabel33.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel33.setText("ගැණුම්");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 70, 30));

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel23.setText("විකුණුම්");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 70, 30));

        totalBprice.setEditable(false);
        totalBprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBpriceActionPerformed(evt);
            }
        });
        totalBprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalBpriceKeyPressed(evt);
            }
        });
        jPanel2.add(totalBprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 80, 25));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 720, 350));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("මෙම ස්ථානයට ලැබීම");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 180, 30));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ගබාඩා අතර භාණ්ඩ මාරැ කිරීම - F 18 B ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, 30));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("F3 Edit");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("F1 Help");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 20));

        jLabel6.setText("F2 New");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 20));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 740, 20));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F18no.setEditable(false);
        F18no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F18noActionPerformed(evt);
            }
        });
        F18no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F18noKeyPressed(evt);
            }
        });
        jPanel4.add(F18no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 25));

        toNo.setEditable(false);
        toNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toNoActionPerformed(evt);
            }
        });
        toNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toNoKeyPressed(evt);
            }
        });
        jPanel4.add(toNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 60, 25));

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel28.setText("F18B අංකය");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel30.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel30.setText("දිනය");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 70, 40));

        jLabel32.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel32.setText("අංකය");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));

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
        jPanel4.add(billNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, 25));

        toName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toNameItemStateChanged(evt);
            }
        });
        jPanel4.add(toName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 150, 25));

        fromName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromNameItemStateChanged(evt);
            }
        });
        jPanel4.add(fromName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 150, 25));

        fromNo.setEditable(false);
        fromNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromNoActionPerformed(evt);
            }
        });
        fromNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromNoKeyPressed(evt);
            }
        });
        jPanel4.add(fromNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 60, 25));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel7.setText("ස්ථානයේ සිට");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 100, 20));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel8.setText("ස්ථානයට");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 210, 30));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 720, 100));

        btndpsave1.setBackground(new java.awt.Color(204, 255, 204));
        btndpsave1.setText("  Print");
        btndpsave1.setActionCommand("");
        btndpsave1.setBorder(null);
        btndpsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndpsave1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btndpsave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 80, 30));

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setText("  Close");
        jButton7.setActionCommand("");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 80, 30));

        jButton8.setText("  New");
        jButton8.setActionCommand("");
        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 80, 30));

        btndpsave2.setText("  Save");
        btndpsave2.setActionCommand("");
        btndpsave2.setBackground(new java.awt.Color(204, 255, 204));
        btndpsave2.setBorder(null);
        btndpsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndpsave2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btndpsave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    
    public void clearAll(){
        generateID();
        date.setDateToToday();
        toName.setSelectedIndex(0);
        toNo.setText("");
        fromName.setSelectedIndex(0);
        fromNo.setText("");
        billNo.setText("");
        itemCode.setText("");
        description.setText("");
        stockQty.setText("");
        buyingPrice.setText("");
        sellingPrice.setText("");
        qty.setText("");
        totalBprice.setText("");
        totalSprice.setText("");
        subTotalBprice.setText("0.00");
        subTotalSprice.setText("0.00");
        DefaultTableModel newt = (DefaultTableModel)table.getModel();
        newt.setRowCount(0);
        bTotal = 0;
        sTotal = 0;
        subBprice =0;
        subSprice =0;
    }
    
    private void btndpsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpsave2ActionPerformed
        try{
            if(F18no.getText().length() ==0){
               JOptionPane.showMessageDialog(rootPane, "Invalid Order Exchange ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((toNo.getText().length() == 0 ) && (toName.getSelectedIndex() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((fromNo.getText().length() == 0 ) && (fromName.getSelectedIndex() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details to send items","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(billNo.getText().length()==0){
                JOptionPane.showMessageDialog(rootPane, "Please enter the bill no","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your GRN","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                exchange.setStockExchange(F18no.getText().toString(),java.sql.Date.valueOf(date.getDate()), toNo.getText().toString(), fromNo.getText().toString(), Double.valueOf(subTotalBprice.getText()), Double.valueOf(subTotalSprice.getText()), Integer.valueOf(billNo.getText())); 
                 manage = new ManageStockExchangeIN(exchange);
                int i = manage.saveExchange();

                if(i==1){
                    
                        DefaultTableModel dtm= (DefaultTableModel)table.getModel();
                        int RowCount1= table.getRowCount();
                            System.out.println(RowCount1);

                        int r2 =0;
                        for(int n=0; n< RowCount1; n++){

                            exchange.setItems(Double.valueOf(dtm.getValueAt(n,4).toString()), Double.valueOf(dtm.getValueAt(n,5).toString()), Double.valueOf(dtm.getValueAt(n,6).toString()), Double.valueOf(dtm.getValueAt(n,7).toString()),Double.valueOf(dtm.getValueAt(n,8).toString()),Integer.valueOf(dtm.getValueAt(n,1).toString()));
                            int k = manage.saveExchangeItems();
                            if(k ==1){
                                
                                double sQty=0, mQty=0;
                                ManageItem item  = new ManageItem();
                                ResultSet re = item.getItemStock(Integer.valueOf(dtm.getValueAt(n, 1).toString()));
                                while(re.next()){
                                    sQty = re.getDouble("stockQty");
                                    mQty = re.getDouble("maxQty");
                                }
                                sQty = sQty + Double.valueOf(dtm.getValueAt(n, 6).toString());

                                int t = item.UpdateItemStock(Integer.valueOf(dtm.getValueAt(n, 1).toString()), sQty);
                                if(t==1){
                                    ++r2;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error in updating stock exhange in " + dtm.getValueAt(n, 1).toString(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                                }
                                
                            }
                        }
                        if(r2 == RowCount1){
                            clearAll();
                            JOptionPane.showMessageDialog(null, "Items Exchange details saved succesfully" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving exchange items  ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        } 
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving Exchange records" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                    }
            }
       }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }//GEN-LAST:event_btndpsave2ActionPerformed

    private void subTotalBpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subTotalBpriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalBpriceKeyPressed

    private void subTotalBpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotalBpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalBpriceActionPerformed

    private void subTotalSpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subTotalSpriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalSpriceKeyPressed

    private void subTotalSpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotalSpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalSpriceActionPerformed

    private void qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyPressed
        
    }//GEN-LAST:event_qtyKeyPressed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void sellingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingPriceKeyPressed

    private void sellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingPriceActionPerformed

    private void buyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyingPriceKeyPressed

    private void buyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyingPriceActionPerformed

    private void stockQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockQtyKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockQtyKeyPressed

    private void stockQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockQtyActionPerformed

    private void totalSpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalSpriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSpriceKeyPressed

    private void totalSpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalSpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalSpriceActionPerformed

    private void descriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionKeyPressed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    ItemList itemSearch = new ItemList(null, true);

    private void itemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyPressed
         try{
            if (evt.getKeyCode() == KeyEvent.VK_F1) {
            
            itemCode.setText("");
            description.setText("");
            buyingPrice.setText("");
            sellingPrice.setText("");
            stockQty.setText("");
            qty.setText("");
            totalBprice.setText("");
            totalSprice.setText("");

                
            itemSearch.setVisible(true);
            itemCode.setText(itemSearch.No);
            
            int Code = Integer.valueOf(itemSearch.No);
            
            ManageItem items = new ManageItem();
            ResultSet result = items.selectItemdata(Code);
            
            while(result.next()){
                description.setText(result.getString("itemName"));
//                descriptions = result.getString("itemName");
                buyingPrice.setText(String.valueOf(result.getDouble("costPrice")));
                sellingPrice.setText(String.valueOf(result.getDouble("sellingPrice")));
                stockQty.setText(String.valueOf(result.getDouble("stockQty")));
//                stockQtys = Double.valueOf(result.getDouble("stockQty"));
            }
        }

        }catch(Exception e)
        {
           System.out.println("line 1242: " +e.getMessage());
        }
    }//GEN-LAST:event_itemCodeKeyPressed

    private void itemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCodeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btndpsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpsave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndpsave1ActionPerformed

    private void fromNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromNoKeyPressed

    private void fromNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromNoActionPerformed

    private void billNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_billNoKeyPressed

    private void billNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billNoActionPerformed

    private void toNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_toNoKeyPressed

    private void toNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toNoActionPerformed

    private void F18noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F18noKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F18noKeyPressed

    private void F18noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F18noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F18noActionPerformed

    private void totalBpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBpriceActionPerformed

    private void totalBpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalBpriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBpriceKeyPressed

    private void toNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toNameItemStateChanged
        try{
            ManageStore store = new ManageStore();
            if (toName.getSelectedIndex() !=0 ) {
                ResultSet rs = store.getStoreID(toName.getSelectedItem().toString());
                System.out.println(toName.getSelectedItem().toString());
                while(rs.next()){
                    toNo.setText(rs.getString("stcode"));
                }
            }

        }catch(Exception e)
        {
           System.out.println("line 632: " +e.getMessage());
        }
    }//GEN-LAST:event_toNameItemStateChanged

    private void fromNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fromNameItemStateChanged
        try{
            ManageStore store = new ManageStore();
            if (fromName.getSelectedIndex() !=0 ) {
                ResultSet rs = store.getStoreID(fromName.getSelectedItem().toString());
                System.out.println(fromName.getSelectedItem().toString());
                while(rs.next()){
                    fromNo.setText(rs.getString("stcode"));
                }
            }

        }catch(Exception e)
        {
           System.out.println("line 632: " +e.getMessage());
        }
    }//GEN-LAST:event_fromNameItemStateChanged

    
    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
        addItemsToTable(evt);
    }//GEN-LAST:event_qtyKeyReleased

    public void addItemsToTable(java.awt.event.KeyEvent evt){
        try{
            if (evt.getKeyCode() != KeyEvent.VK_ENTER) 
            {    
                iqty = Double.valueOf(qty.getText());
                bprice = Double.valueOf(buyingPrice.getText());
                sprice = Double.valueOf(sellingPrice.getText());
                bTotal = iqty * bprice;                
                sTotal = iqty * sprice;
                totalBprice.setText(String.valueOf(bTotal));
                totalSprice.setText(String.valueOf(sTotal));
                subBprice = Double.valueOf(subTotalBprice.getText()) + bTotal;
                subSprice = Double.valueOf(subTotalSprice.getText()) + sTotal;
            }else{
                if(qty.getText().length() != 0){
                
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
                    vec.add(itemCode.getText().toString());
                    vec.add(description.getText().toString());
                    vec.add(stockQty.getText().toString());
                    vec.add(buyingPrice.getText().toString());
                    vec.add(sellingPrice.getText().toString());
                    vec.add(qty.getText().toString());
                    vec.add(totalBprice.getText().toString());
                    vec.add(totalSprice.getText().toString());
                    System.out.println(subBprice + " " + subSprice);
                    subTotalBprice.setText(String.valueOf(subBprice));
                    subTotalSprice.setText(String.valueOf(subSprice));
                    
                    model.insertRow(0, vec);
                    table.setModel(model);

                    itemCode.setText("");
                    description.setText("");
                    stockQty.setText("");
                    buyingPrice.setText("");
                    sellingPrice.setText("");
                    qty.setText("");
                    totalBprice.setText("");
                    totalSprice.setText("");
    //                checkTotal();        
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter the item quantity" + exchange.getCode(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }

        }catch(Exception e)
        {
           System.out.println("line 1242: " +e.getMessage());
        }
    }
    private void buyingPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyingPriceKeyReleased
        addItemsToTable(evt);
    }//GEN-LAST:event_buyingPriceKeyReleased

    private void sellingPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceKeyReleased
        addItemsToTable(evt);
    }//GEN-LAST:event_sellingPriceKeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton8ActionPerformed
        int rowIndex= -2;

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
            java.util.logging.Logger.getLogger(StockExchangeIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockExchangeIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockExchangeIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockExchangeIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StockExchangeIN dialog = new StockExchangeIN(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField F18no;
    public javax.swing.JTextField billNo;
    private javax.swing.JButton btndpsave1;
    private javax.swing.JButton btndpsave2;
    public javax.swing.JTextField buyingPrice;
    private com.github.lgooddatepicker.components.DatePicker date;
    public javax.swing.JTextField description;
    private javax.swing.JComboBox<String> fromName;
    public javax.swing.JTextField fromNo;
    public javax.swing.JTextField itemCode;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField qty;
    public javax.swing.JTextField sellingPrice;
    public javax.swing.JTextField stockQty;
    public javax.swing.JTextField subTotalBprice;
    public javax.swing.JTextField subTotalSprice;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> toName;
    public javax.swing.JTextField toNo;
    public javax.swing.JTextField totalBprice;
    public javax.swing.JTextField totalSprice;
    // End of variables declaration//GEN-END:variables
}
