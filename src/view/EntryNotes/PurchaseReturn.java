
package view.EntryNotes;

import controller.ManageGoodReceiveNote;
import controller.ManageItem;
import controller.ManagePurchaseReturn;
import controller.ManageStore;
import controller.ManageSupplies;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.PurchaseReturns;

public class PurchaseReturn extends javax.swing.JDialog {

    PurchaseReturns purchase = new PurchaseReturns();
    ManagePurchaseReturn manage = new ManagePurchaseReturn(purchase);
    
    double cancelBprice =0, cancelSprice=0, cancelDiscount=0, cancelDPercentage=0, cancelv=0, cancelVPercentage=0, cancelDecrease=0, cancelload=0,cancelTotalBprice=0, cancelTotalSprice=0, cancelFreePrice =0, cancelFreeTPrice=0;

    public PurchaseReturn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        table.getTableHeader().setFont(new Font("Nirmala UI", Font.PLAIN, 12));
        date.setDateToToday();
//        table.setBackground(Color.red);
        generateID();
    }
    
    public void generateID(){
        try {
            String grn="";
            ResultSet rs = manage.displayAll();
            while(rs.next()){
                grn = rs.getString("F19No").toString();
            } 

            if(grn == ""){
                grn = "SRN22KT000001";
            }else{
                int no = Integer.valueOf(grn.substring(8));
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    grn = "SRN22KT00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    grn = "SRN22KT0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    grn = "SRN22KT000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    grn = "SRN22KT00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    grn = "SRN22KT0" + String.valueOf(nno);
                }else{
                    grn = "SRN22KT" + String.valueOf(nno);
                }
            }            
            
            System.out.println(grn);
            F19no.setText(grn);
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
        sellingPrice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
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
        cancelsellingPrice = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        canceltotalSellingPrice = new javax.swing.JTextField();
        cancelBuyingPrice = new javax.swing.JTextField();
        cancelvatPercentage = new javax.swing.JTextField();
        cancelvat = new javax.swing.JTextField();
        cancelitemDecreasePrice = new javax.swing.JTextField();
        cancelloadingCharge = new javax.swing.JTextField();
        cancelfreeIssuse = new javax.swing.JTextField();
        canceltotalBuyingPrice = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        canceldiscount = new javax.swing.JTextField();
        canceldiscountPercentage = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        F19no = new javax.swing.JTextField();
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
        jLabel29 = new javax.swing.JLabel();
        F16BNo = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnGetGrn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        grnFreeTotalQty = new javax.swing.JTextField();
        grmFreeTotalPrice = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
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
        jLabel1.setText("භාණ්ඩ ආපසු යැවීමෙ  සටහන");
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 330, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1130, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(sellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, 23));

        jLabel23.setText("විකුණුම්");
        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 70, 30));

        jLabel31.setText("මුළු එකතුව");
        jLabel31.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jLabel32.setText("ගැණුම්");
        jLabel32.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 30));

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
        jPanel2.add(totalSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 80, 23));

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
        jPanel2.add(buyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 80, 23));

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
        jPanel2.add(vatPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 40, 20));

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
        jPanel2.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 80, 23));

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
        jPanel2.add(itemDecreasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 23));

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
        jPanel2.add(loadingCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, 23));

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
        jPanel2.add(freeIssuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 80, 23));

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
        jPanel2.add(totalBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, 23));

        jLabel33.setText("එකතුව");
        jLabel33.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        jLabel34.setText("වට්ටම්");
        jLabel34.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));

        jLabel35.setText("Free Issue");
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel36.setText("බඩු අඩුකිරීම්");
        jLabel36.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jLabel37.setText("පැටවුම් කුලි");
        jLabel37.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        jLabel39.setText("%");
        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 20, -1));

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
        jPanel2.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 80, 23));

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
        jPanel2.add(discountPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 40, 23));

        jLabel40.setText("VAT");
        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        jLabel41.setText("%");
        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 20, -1));

        cancelsellingPrice.setEditable(false);
        cancelsellingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cancelsellingPrice.setText("0.00");
        cancelsellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelsellingPriceActionPerformed(evt);
            }
        });
        cancelsellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelsellingPriceKeyPressed(evt);
            }
        });
        jPanel2.add(cancelsellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 80, 23));

        jLabel24.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel24.setText("විකුණුම්");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 70, 30));

        jLabel43.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel43.setText(" අවලංගු මුළු එකතුව");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 160, -1));

        jLabel44.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel44.setText("ගැණුම්");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, 30));

        canceltotalSellingPrice.setEditable(false);
        canceltotalSellingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        canceltotalSellingPrice.setText("0.00");
        canceltotalSellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceltotalSellingPriceActionPerformed(evt);
            }
        });
        canceltotalSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                canceltotalSellingPriceKeyPressed(evt);
            }
        });
        jPanel2.add(canceltotalSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 80, 23));

        cancelBuyingPrice.setEditable(false);
        cancelBuyingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cancelBuyingPrice.setText("0.00");
        cancelBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBuyingPriceActionPerformed(evt);
            }
        });
        cancelBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelBuyingPriceKeyPressed(evt);
            }
        });
        jPanel2.add(cancelBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 80, 23));

        cancelvatPercentage.setText("0.00");
        cancelvatPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelvatPercentageActionPerformed(evt);
            }
        });
        cancelvatPercentage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelvatPercentageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cancelvatPercentageKeyReleased(evt);
            }
        });
        jPanel2.add(cancelvatPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 50, 20));

        cancelvat.setEditable(false);
        cancelvat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cancelvat.setText("0.00");
        cancelvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelvatActionPerformed(evt);
            }
        });
        cancelvat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelvatKeyPressed(evt);
            }
        });
        jPanel2.add(cancelvat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 80, 23));

        cancelitemDecreasePrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cancelitemDecreasePrice.setText("0.00");
        cancelitemDecreasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelitemDecreasePriceActionPerformed(evt);
            }
        });
        cancelitemDecreasePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelitemDecreasePriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cancelitemDecreasePriceKeyReleased(evt);
            }
        });
        jPanel2.add(cancelitemDecreasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 80, 23));

        cancelloadingCharge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cancelloadingCharge.setText("0.00");
        cancelloadingCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelloadingChargeActionPerformed(evt);
            }
        });
        cancelloadingCharge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelloadingChargeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cancelloadingChargeKeyReleased(evt);
            }
        });
        jPanel2.add(cancelloadingCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 80, 23));

        cancelfreeIssuse.setEditable(false);
        cancelfreeIssuse.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cancelfreeIssuse.setText("0.00");
        cancelfreeIssuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelfreeIssuseActionPerformed(evt);
            }
        });
        cancelfreeIssuse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelfreeIssuseKeyPressed(evt);
            }
        });
        jPanel2.add(cancelfreeIssuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 80, 23));

        canceltotalBuyingPrice.setEditable(false);
        canceltotalBuyingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        canceltotalBuyingPrice.setText("0.00");
        canceltotalBuyingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceltotalBuyingPriceActionPerformed(evt);
            }
        });
        canceltotalBuyingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                canceltotalBuyingPriceKeyPressed(evt);
            }
        });
        jPanel2.add(canceltotalBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 80, 23));

        jLabel45.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel45.setText(" අවලංගු එකතුව");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 130, 20));

        jLabel46.setText(" අවලංගු වට්ටම්");
        jLabel46.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabel46KeyReleased(evt);
            }
        });
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 130, -1));

        jLabel47.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel47.setText(" අවලංගු Free Issue");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 130, -1));

        jLabel48.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel48.setText(" අවලංගු බඩු අඩුකිරීම්");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 160, -1));

        jLabel49.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel49.setText(" අවලංගු පැටවුම් කුලි");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 160, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel50.setText("%");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 20, -1));

        canceldiscount.setEditable(false);
        canceldiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        canceldiscount.setText("0.00");
        canceldiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceldiscountActionPerformed(evt);
            }
        });
        canceldiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                canceldiscountKeyPressed(evt);
            }
        });
        jPanel2.add(canceldiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 80, 23));

        canceldiscountPercentage.setText("0.00");
        canceldiscountPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceldiscountPercentageActionPerformed(evt);
            }
        });
        canceldiscountPercentage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                canceldiscountPercentageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                canceldiscountPercentageKeyReleased(evt);
            }
        });
        jPanel2.add(canceldiscountPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 50, 23));

        jLabel51.setText(" අවලංගු VAT");
        jLabel51.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, -1));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel52.setText("%");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 20, -1));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 780, 200));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "අනු අංකය", "විස්තරය", "ගැනුම්  මිල", "විකුණුම්  මිල", "පවතින තොගය ", "ප්‍රමාණය ", " අවලංගු ප්‍රමාණය ", "ගැණුම් එකතුව", "විකුණුම් එකතුව", "මුළු ප්‍රමාණය "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false, false
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(30);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(80);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(130);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(80);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(85);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(6).setPreferredWidth(70);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(7).setPreferredWidth(100);
            table.getColumnModel().getColumn(8).setResizable(false);
            table.getColumnModel().getColumn(8).setPreferredWidth(100);
            table.getColumnModel().getColumn(9).setResizable(false);
            table.getColumnModel().getColumn(9).setPreferredWidth(100);
            table.getColumnModel().getColumn(10).setResizable(false);
            table.getColumnModel().getColumn(10).setPreferredWidth(80);
        }

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 760, 220));

        kGradientPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 780, 240));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 1110, 20));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        F19no.setEditable(false);
        F19no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F19noActionPerformed(evt);
            }
        });
        F19no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F19noKeyPressed(evt);
            }
        });
        jPanel4.add(F19no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 25));

        jLabel7.setText("ස්ථානය");
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 60, 20));

        jCheckBox1.setText("අලෙවි නොවන භාණ්    ඩ ");
        jCheckBox1.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 200, 30));

        storeCode.setEditable(false);
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
        jPanel4.add(storeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 50, 25));

        jLabel25.setText("සැපයැම්කරු");
        jLabel25.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 100, 20));

        jLabel26.setText("ගෙවීම්");
        jLabel26.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 70, 20));

        storeName.setEditable(false);
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
        jPanel4.add(storeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 120, 25));

        payType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Cheque", "PettyCash", "ApprovedBuy", "Stores" }));
        jPanel4.add(payType, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 100, 25));

        jLabel28.setText("F19 අංකය");
        jLabel28.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        dsfsd.setText("දිනය");
        dsfsd.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jPanel4.add(dsfsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 50, 30));

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
        jPanel4.add(supplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 130, 25));

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
        jPanel4.add(supplierCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 60, 25));

        date.setFocusable(false);
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 200, 30));

        jLabel29.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabel29.setText("F16B අංකය");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 20));

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
        jPanel4.add(F16BNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 140, 25));

        jCheckBox2.setText("If Bags");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 100, 30));

        btnGetGrn.setText("Get GRN");
        btnGetGrn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGetGrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetGrnActionPerformed(evt);
            }
        });
        jPanel4.add(btnGetGrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 25));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1110, 90));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Cancel GRN Free Items");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Code", "Description", "Price", "Qty", "cancelQty", "Total price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(90);
        }

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 300, 170));

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
        jPanel6.add(grnFreeTotalQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 80, 25));

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
        jPanel6.add(grmFreeTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 80, 25));

        jLabel42.setText("Free Item Total");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));

        btnClose.setText("  Close");
        btnClose.setActionCommand("");
        btnClose.setBackground(new java.awt.Color(204, 255, 204));
        btnClose.setBorder(null);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel6.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 100, 30));

        btnSave.setText("  Save");
        btnSave.setActionCommand("");
        btnSave.setBackground(new java.awt.Color(204, 255, 204));
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel6.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 100, 30));

        btnNew.setText("  New");
        btnNew.setActionCommand("");
        btnNew.setBackground(new java.awt.Color(204, 255, 204));
        btnNew.setBorder(null);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel6.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 100, 30));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 320, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            System.out.println("no is " + F19no.getText().toString());

            if(F19no.getText().length() != 13){
                JOptionPane.showMessageDialog(rootPane, "Invalid Purchase Return ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }if(F16BNo.getText().length() != 13){
                JOptionPane.showMessageDialog(rootPane, "Invalid GRN ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((storeCode.getText().length() == 0 ) && (storeName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((supplierCode.getText().length() == 0 ) && (supplierName.getText().length() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the supplier details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(payType.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(rootPane, "Please select the payment type","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your Purchase Return","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                int r =0;

                purchase.PurchaseReturn(F19no.getText().toString(), java.sql.Date.valueOf(date.getDate()));
                r = manage.savePurchaseReturn();
                if(r == 1){
                    System.out.println("r=1 runs");
                    purchase.purchasereturnrecords(F16BNo.getText().toString(), storeCode.getText(), Integer.valueOf(supplierCode.getText()), payType.getSelectedItem().toString(), Double.valueOf(cancelBuyingPrice.getText()), Double.valueOf(canceldiscount.getText()), Double.valueOf(cancelvat.getText()), Double.valueOf(cancelitemDecreasePrice.getText()), Double.valueOf(cancelloadingCharge.getText()), Double.valueOf(cancelfreeIssuse.getText()), Double.valueOf(canceltotalBuyingPrice.getText()));
                    int r1 = manage.savePurchaseReturnRecords();
                    if(r1==1){
                        
                        DefaultTableModel dtm = (DefaultTableModel)table.getModel();
                        int RowCount = table.getRowCount();
                        int c=0;
                        
                        for(int index =0 ; index< RowCount; index++){
                            purchase.PurchasereturnItems(Integer.valueOf(dtm.getValueAt(index, 1).toString()), Double.valueOf(dtm.getValueAt(index, 6).toString()), Double.valueOf(dtm.getValueAt(index, 7).toString()));
                            int r2 = manage.savePurchaseReturnItems();
                            if(r2==1){
                                
                                double sQty=0, mQty=0;
                                ManageItem item  = new ManageItem();
                                ResultSet re = item.getItemStock(Integer.valueOf(dtm.getValueAt(index, 1).toString()));

                                while(re.next()){   
                                    sQty = re.getDouble("stockQty");
                                    mQty = re.getDouble("maxQty");
                                }

                                sQty = sQty - Double.valueOf(dtm.getValueAt(index, 6).toString());
                                int t = item.UpdateItemStock(Integer.valueOf(dtm.getValueAt(index, 1).toString()), sQty);

                                if(t==1){
                                    ++c;
                                }else{
                                    JOptionPane.showMessageDialog(null, "Error in updating disposal item no " + dtm.getValueAt(index, 1).toString(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                                }    
                            }
                        }

                        if(c == RowCount){

                            DefaultTableModel dtm2 = (DefaultTableModel)jTable2.getModel();
                            int RowCount2 = jTable2.getRowCount();
                            int c2=0;
                            for(int index2 =0 ; index2< RowCount2; index2++){
                                System.out.println("row count" + RowCount2);
                                purchase.setPurchaseReturnFree(Integer.valueOf(dtm2.getValueAt(index2, 1).toString()), Double.valueOf(dtm2.getValueAt(index2, 5).toString()));
                                System.out.println("r=1 runs");
                                int r3 = manage.savePurchaseReturnFreeItems();
                                if(r3==1){
                                    
                                    double sQty=0, mQty=0;
                                    ManageItem item  = new ManageItem();
                                    ResultSet re = item.getItemStock(Integer.valueOf(dtm.getValueAt(index2, 1).toString()));

                                    while(re.next()){   
                                        sQty = re.getDouble("stockQty");
                                        mQty = re.getDouble("maxQty");
                                    }

                                    sQty = sQty - Double.valueOf(dtm.getValueAt(index2, 6).toString());
                                    int t = item.UpdateItemStock(Integer.valueOf(dtm.getValueAt(index2, 1).toString()), sQty);

                                    if(t==1){
                                        ++c;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Error in updating disposal item no " + dtm.getValueAt(index2, 1).toString(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                                    }   
                                }
                            }
                            
                            if(c2== RowCount2){
                                clearAll();
                                JOptionPane.showMessageDialog(null, "Purchase Return saved Permenantly", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null, "Error in saving Purchase Return free items", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving Purchase Return items ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving Purchase Return records", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Error in saving Purchase Return ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e){
            System.out.println("line 1095: " +e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void F19noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F19noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F19noActionPerformed

    private void F19noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F19noKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_F19noKeyPressed

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

    private void supplierNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameKeyPressed

    private void supplierCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierCodeActionPerformed

    private void supplierCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierCodeKeyPressed
//        try{
//            if (evt.getKeyCode() == KeyEvent.VK_F1) {
//
//                search.setVisible(true);
//                supplierCode.setText(search.code);
//                supplierName.setText(search.name);
//            }
//
//        }catch(Exception e)
//        {
//            System.out.println("line 1322: " +e.getMessage());
//        }
    }//GEN-LAST:event_supplierCodeKeyPressed

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

    private void grmFreeTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grmFreeTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grmFreeTotalPriceActionPerformed

    private void grmFreeTotalPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grmFreeTotalPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_grmFreeTotalPriceKeyPressed

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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearAll();
    }//GEN-LAST:event_btnNewActionPerformed

    
    public void clearAll(){
        generateID();
        F16BNo.setText("");
        date.setDateToToday();
        storeCode.setText("");
        storeName.setText("");
        supplierCode.setText("");
        supplierName.setText("");
        payType.setSelectedIndex(0);  
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        DefaultTableModel newt = (DefaultTableModel)table.getModel();
        newt.setRowCount(0);
        DefaultTableModel newft = (DefaultTableModel)jTable2.getModel();
        newft.setRowCount(0);
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
        
        cancelBuyingPrice.setText("0.00");
        cancelsellingPrice.setText("0.00");
        canceldiscount.setText("0.00");
        canceldiscountPercentage.setText("0.00");
        cancelvat.setText("0.00");
        cancelvatPercentage.setText("0.00");
        cancelitemDecreasePrice.setText("0.00");
        cancelloadingCharge.setText("0.00");
        cancelfreeIssuse.setText("0.00");
        canceltotalBuyingPrice.setText("0.00");
        canceltotalSellingPrice.setText("0.00");
        
        rowIndex=-2;
        rowIndex2=-2;
    }
    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void F16BNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F16BNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F16BNoActionPerformed

    private void F16BNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F16BNoKeyPressed
        try{
            if(evt.getKeyCode() == KeyEvent.VK_F1){
                SearchGRN grn = new SearchGRN(null, true);
                grn.setVisible(true);
                F16BNo.setText(grn.code);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_F16BNoKeyPressed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
    }//GEN-LAST:event_tableMouseClicked

    private void cancelsellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelsellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelsellingPriceActionPerformed

    private void cancelsellingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelsellingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelsellingPriceKeyPressed

    private void canceltotalSellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceltotalSellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceltotalSellingPriceActionPerformed

    private void canceltotalSellingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canceltotalSellingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceltotalSellingPriceKeyPressed

    private void cancelBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBuyingPriceActionPerformed

    private void cancelBuyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelBuyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBuyingPriceKeyPressed

    private void cancelvatPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelvatPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelvatPercentageActionPerformed

    private void cancelvatPercentageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelvatPercentageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelvatPercentageKeyPressed

    private void cancelvatPercentageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelvatPercentageKeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                double vata = Double.valueOf(cancelvatPercentage.getText().toString());
            
                if(vata < Double.valueOf(vatPercentage.getText().toString())){
                    double price = Double.valueOf(buyingPrice.getText().toString());
                    double vatPrice = (price * vata) / 100;
                    cancelvat.setText(String.valueOf(vatPrice));
                    checkTotal();
                }else{
                    JOptionPane.showMessageDialog(null, "Invald Vat amount ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cancelvatPercentageKeyReleased

    private void cancelvatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelvatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelvatActionPerformed

    private void cancelvatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelvatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelvatKeyPressed

    private void cancelitemDecreasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelitemDecreasePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelitemDecreasePriceActionPerformed

    private void cancelitemDecreasePriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelitemDecreasePriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelitemDecreasePriceKeyPressed

    private void cancelitemDecreasePriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelitemDecreasePriceKeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                if(Double.valueOf(cancelitemDecreasePrice.getText().toString()) < Double.valueOf(itemDecreasePrice.getText().toString())){
                    checkTotal();
                }else{
                    JOptionPane.showMessageDialog(null, "Invald Item decrease amount ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cancelitemDecreasePriceKeyReleased

    private void cancelloadingChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelloadingChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelloadingChargeActionPerformed

    private void cancelloadingChargeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelloadingChargeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelloadingChargeKeyPressed

    private void cancelloadingChargeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelloadingChargeKeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                if(Double.valueOf(cancelloadingCharge.getText().toString()) < Double.valueOf(loadingCharge.getText().toString())){
                    checkTotal();
                }else{
                    JOptionPane.showMessageDialog(null, "Invald Loading Charge amount ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cancelloadingChargeKeyReleased

    private void cancelfreeIssuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelfreeIssuseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelfreeIssuseActionPerformed

    private void cancelfreeIssuseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelfreeIssuseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelfreeIssuseKeyPressed

    private void canceltotalBuyingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceltotalBuyingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceltotalBuyingPriceActionPerformed

    private void canceltotalBuyingPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canceltotalBuyingPriceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceltotalBuyingPriceKeyPressed

    private void canceldiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceldiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceldiscountActionPerformed

    private void canceldiscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canceldiscountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceldiscountKeyPressed

    private void canceldiscountPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceldiscountPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceldiscountPercentageActionPerformed

    private void canceldiscountPercentageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canceldiscountPercentageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_canceldiscountPercentageKeyPressed

    private void canceldiscountPercentageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_canceldiscountPercentageKeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                double dis = Double.valueOf(canceldiscountPercentage.getText().toString());
                if(dis< Double.valueOf(discountPercentage.getText().toString())){
                    double price = Double.valueOf(buyingPrice.getText().toString());
                    double disPrice = (price * dis) / 100;
                    canceldiscount.setText(String.valueOf(disPrice));
                    checkTotal();
                }else{
                    JOptionPane.showMessageDialog(null, "Invald discount amount ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                } 
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_canceldiscountPercentageKeyReleased
    
    int rowIndex =-2, rowIndex2 =-2;
    private void btnGetGrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetGrnActionPerformed

        try{
            cancelBprice =0;
            cancelSprice=0;
            cancelDiscount=0;
            cancelDPercentage=0;
            cancelv=0;
            cancelVPercentage=0;
            cancelDecrease=0;
            cancelload=0;
            cancelTotalBprice=0;
            cancelTotalSprice=0;
            cancelBuyingPrice.setText("0.00");
            cancelsellingPrice.setText("0.00");

            rowIndex=0;
            rowIndex2=0;
            String rowIndex = F16BNo.getText().toString();
            System.out.println("selected index is " +  rowIndex);
            
            ManageGoodReceiveNote mg = new ManageGoodReceiveNote();
//            ResultSet result1 = mg.displayGRN(rowIndex);
            ResultSet result2 = mg.displayGRNRecord(rowIndex);
            ResultSet result3 = mg.displayGRNRecordItems(rowIndex);            
            ResultSet result4 = mg.displayGRNFreeItems(rowIndex);
        
//            while(result1.next()){
//                F16BNo.setText(result1.getString("F16No"));
//                date.setDate(result1.getDate("date").toLocalDate());
//            }
            
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
                
//                billNo.setText(result2.getString("billNo"));
                payType.setSelectedItem(result2.getString("PaymentType"));
//                totalItems.setText(String.valueOf(result2.getDouble("totalItems")));
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
//                GRNBprice = result2.getDouble("totalBuyingPrice");
//                GRNSprice=result2.getDouble("totalsellingprice");
//                freeItemPrice= result2.getDouble("freelssue");
//                freeItems = result2.getInt("freeIssueQty");
            }
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
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
                vec.add("0.00");
                vec.add(result3.getDouble("TotalBuyingPrice"));
                vec.add(result3.getDouble("TotalSellingPrice"));
                vec.add(result3.getDouble("TotalQty"));
                
                model.addRow(vec);
            }                  
            table.setModel(model);
            
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
                vec1.add("0.00");
                vec1.add(result4.getDouble("totalprice"));
                
                model2.addRow(vec1);
            }
                  
            jTable2.setModel(model2);
//
//            DefaultTableModel unTable2 = (DefaultTableModel) jTable4.getModel();
//            unTable2.setRowCount(0);
            
//            loadUnsavedGRN();
//            
//            DefaultTableModel unTable = (DefaultTableModel) jTable4.getModel();
//            unTable.removeRow(row);
        }catch(Exception e){
            System.out.println("line 1434 "  + e.getMessage());
        }
    }//GEN-LAST:event_btnGetGrnActionPerformed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
         try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                DefaultTableModel dtm = (DefaultTableModel)table.getModel();
                int RowCount = table.getRowCount();
                cancelTotalBprice=0.00;
                cancelTotalSprice=0.00;
                
                for(int RowIndex=0; RowIndex<RowCount ; RowIndex++){
                   
                    if(Double.valueOf(dtm.getValueAt(RowIndex, 7).toString()) < Double.valueOf(dtm.getValueAt(RowIndex, 6).toString())){
                        
                        double cancelQty = Double.valueOf(dtm.getValueAt(RowIndex, 7).toString());
                        double bPrice = Double.valueOf(dtm.getValueAt(RowIndex, 3).toString());
                        double sPrice = Double.valueOf(dtm.getValueAt(RowIndex, 4).toString());

                        System.out.println(cancelQty + "    " + bPrice + "  " + sPrice);

                        cancelBprice = cancelQty * bPrice;
                        cancelSprice = cancelQty *sPrice;

                        cancelTotalBprice += cancelBprice;
                        cancelTotalSprice += cancelSprice;

                        System.out.println(cancelTotalBprice + "    " + cancelTotalSprice);

                       


                    }else{
                        JOptionPane.showMessageDialog(null, "There isn't Enough Items ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        dtm.setValueAt("0.00" , RowCount, 3);
                    }
                    cancelBuyingPrice.setText(String.valueOf(cancelTotalBprice));
                    cancelsellingPrice.setText(String.valueOf(cancelTotalSprice));
                    checkTotal();
                }
                
            }           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_tableKeyReleased

    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
                int RowCount = jTable2.getRowCount();
                cancelFreeTPrice=0;

                for(int RowIndex=0; RowIndex<RowCount ; RowIndex++){
                   
                    if(Double.valueOf(dtm.getValueAt(RowIndex, 5).toString()) < Double.valueOf(dtm.getValueAt(RowIndex, 6).toString())){
                    
                        System.out.println("row conunt " + RowIndex);
                        double cancelQty = Double.valueOf(dtm.getValueAt(RowIndex, 5).toString());
                        double freePrice = Double.valueOf(dtm.getValueAt(RowIndex, 3).toString());
                        cancelFreePrice = cancelQty * freePrice;
                        cancelFreeTPrice +=  cancelFreePrice;
                        cancelfreeIssuse.setText(String.valueOf(cancelFreeTPrice));

                    }else{
                        JOptionPane.showMessageDialog(null, "There isn't Enough Items ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        dtm.setValueAt("0.00" , RowCount, 3);
                    }
                }
                
            }           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jTable2KeyReleased

    private void jLabel46KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel46KeyReleased
       
    }//GEN-LAST:event_jLabel46KeyReleased

    
    public void checkTotal(){
        try{
            double dis = Double.valueOf(canceldiscount.getText());
            double vata = Double.valueOf(cancelvat.getText());
            double dec = Double.valueOf(cancelitemDecreasePrice.getText());
            double load = Double.valueOf(cancelloadingCharge.getText());
            double buy = Double.valueOf(cancelBuyingPrice.getText());
            
            double total = buy - vata - load - dec + dis;
            canceltotalBuyingPrice.setText(String.valueOf(total));
            
            canceltotalSellingPrice.setText(cancelsellingPrice.getText());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(PurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseReturn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PurchaseReturn dialog = new PurchaseReturn(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField F19no;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGetGrn;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    public javax.swing.JTextField buyingPrice;
    public javax.swing.JTextField cancelBuyingPrice;
    public javax.swing.JTextField canceldiscount;
    public javax.swing.JTextField canceldiscountPercentage;
    public javax.swing.JTextField cancelfreeIssuse;
    public javax.swing.JTextField cancelitemDecreasePrice;
    public javax.swing.JTextField cancelloadingCharge;
    public javax.swing.JTextField cancelsellingPrice;
    public javax.swing.JTextField canceltotalBuyingPrice;
    public javax.swing.JTextField canceltotalSellingPrice;
    public javax.swing.JTextField cancelvat;
    public javax.swing.JTextField cancelvatPercentage;
    private com.github.lgooddatepicker.components.DatePicker date;
    public javax.swing.JTextField discount;
    public javax.swing.JTextField discountPercentage;
    private javax.swing.JLabel dsfsd;
    public javax.swing.JTextField freeIssuse;
    public javax.swing.JTextField grmFreeTotalPrice;
    public javax.swing.JTextField grnFreeTotalQty;
    public javax.swing.JTextField itemDecreasePrice;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField loadingCharge;
    private javax.swing.JComboBox<String> payType;
    public javax.swing.JTextField sellingPrice;
    public javax.swing.JTextField storeCode;
    public javax.swing.JTextField storeName;
    public javax.swing.JTextField supplierCode;
    public javax.swing.JTextField supplierName;
    private javax.swing.JTable table;
    public javax.swing.JTextField totalBuyingPrice;
    public javax.swing.JTextField totalSellingPrice;
    public javax.swing.JTextField vat;
    public javax.swing.JTextField vatPercentage;
    // End of variables declaration//GEN-END:variables
}
