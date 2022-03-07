/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FrontEnd;

import controller.ManageCahsierLogin;
import controller.ManageCustomerInvoice;
import controller.ManageItem;
import controller.ManageValidation;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanu
 */
public class Invoice extends javax.swing.JInternalFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        generateInvoiceno();
        timePicker.setTimeToNow();
        datepicker.setDateToToday();
         
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Invoice_No = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_invoice = new javax.swing.JTable();
        txt_item_no = new javax.swing.JTextField();
        txt_Item_name = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_Qty = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_unit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_item_qty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_subtoot = new javax.swing.JTextField();
        datepicker = new com.github.lgooddatepicker.components.DatePicker();
        timePicker = new com.github.lgooddatepicker.components.TimePicker();
        jLabel13 = new javax.swing.JLabel();
        lbl_itemnameerror = new javax.swing.JLabel();
        lbl_priceerror = new javax.swing.JLabel();
        lbl_qtyerror = new javax.swing.JLabel();
        lbl_toterror = new javax.swing.JLabel();
        lbl_itemerror = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Invoice No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 43, 122, 41));

        txt_Invoice_No.setEditable(false);
        txt_Invoice_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Invoice_NoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Invoice_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 46, 199, 38));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 52, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Time");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 52, -1, -1));

        tbl_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Description", "Price", "Quantity", "Total"
            }
        ));
        tbl_invoice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(tbl_invoice);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 221, 1270, 500));

        txt_item_no.setEditable(false);
        txt_item_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_item_noActionPerformed(evt);
            }
        });
        txt_item_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_item_noKeyPressed(evt);
            }
        });
        jPanel1.add(txt_item_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 152, 156, 37));

        txt_Item_name.setEditable(false);
        jPanel1.add(txt_Item_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 152, 461, 37));

        txt_price.setEditable(false);
        txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_priceKeyReleased(evt);
            }
        });
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 152, 156, 37));

        txt_Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_QtyActionPerformed(evt);
            }
        });
        txt_Qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_QtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_QtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_QtyKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 140, 37));

        txt_total.setEditable(false);
        txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_totalKeyReleased(evt);
            }
        });
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 171, 38));

        btn_Add.setText("Add");
        btn_Add.setActionCommand("btn_Add");
        btn_Add.setToolTipText("");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 130, 98, 46));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Item No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 113, 88, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Item Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 123, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 123, -1, -1));

        jLabel8.setText("Total");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Unit");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 750, -1, -1));

        txt_unit.setEditable(false);
        jPanel1.add(txt_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 740, 100, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Item Qty");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 750, -1, -1));

        txt_item_qty.setEditable(false);
        jPanel1.add(txt_item_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 740, 120, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Sub Total");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 750, -1, -1));

        txt_subtoot.setEditable(false);
        txt_subtoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtootActionPerformed(evt);
            }
        });
        jPanel1.add(txt_subtoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 740, 150, 40));
        jPanel1.add(datepicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 230, 40));
        jPanel1.add(timePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 210, 40));

        jLabel13.setText("Quantity");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 120, -1, -1));

        lbl_itemnameerror.setBackground(new java.awt.Color(255, 0, 0));
        lbl_itemnameerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_itemnameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 120, -1));

        lbl_priceerror.setBackground(new java.awt.Color(255, 0, 0));
        lbl_priceerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_priceerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 120, -1));

        lbl_qtyerror.setBackground(new java.awt.Color(255, 0, 0));
        lbl_qtyerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_qtyerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 120, -1));

        lbl_toterror.setBackground(new java.awt.Color(255, 0, 0));
        lbl_toterror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_toterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 190, 120, -1));

        lbl_itemerror.setBackground(new java.awt.Color(255, 0, 0));
        lbl_itemerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_itemerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1510, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static String InvoiceID = "";
    
    public void generateInvoiceno()
    {
       try{
        ResultSet rs = null;
         
        ManageCustomerInvoice mcinvoice = new ManageCustomerInvoice();
        rs = mcinvoice.GetInvoiceNo();
       while(rs.next())
       {
           InvoiceID = rs.getString("invoiceNo").toString();
       }
       System.out.println(InvoiceID);
       
       if(InvoiceID == ""){
                InvoiceID = "I2101DM000001";
            }else{
                int no = Integer.valueOf(InvoiceID.substring(8));
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    InvoiceID = "I2101DM00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    InvoiceID = "I2101DM0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    InvoiceID = "I2101DM000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    InvoiceID = "I2101DM00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    InvoiceID = "I2101DM0" + String.valueOf(nno);
                }else{
                    InvoiceID = "I2101DM" + String.valueOf(nno);
                }
            } 
       txt_Invoice_No.setText(InvoiceID);
       
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
    public String getIvoiceID()
    {
        return InvoiceID;
    }
     ItemListTable itb = new ItemListTable(null, true);
    double totalone_item = 0;
    double price = 0;
    private static double qty ;
     static double discount ;
     static String time;
     static String date;
     static int unit;
   
    //add button press then add data into table
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        try {
            ManageValidation.validatorText(txt_item_no, lbl_itemerror);
            ManageValidation.validatorText(txt_Item_name, lbl_itemnameerror);
            ManageValidation.validatorText(txt_price, lbl_priceerror);
            ManageValidation.validatorText(txt_Qty, lbl_qtyerror);
            ManageValidation.validatorText(txt_total, lbl_toterror);
            
            if(ManageValidation.validatorText(txt_item_no, lbl_itemerror)
                    &&ManageValidation.validatorText(txt_Item_name, lbl_itemnameerror)
                    &&ManageValidation.validatorText(txt_price, lbl_priceerror)
                    &&ManageValidation.validatorText(txt_Qty, lbl_qtyerror)
                    &&ManageValidation.validatorText(txt_total, lbl_toterror))
            {
            DefaultTableModel model = new DefaultTableModel();
            model = (DefaultTableModel) tbl_invoice.getModel();
            model.addRow(new Object[]{
                txt_item_no.getText(),
                txt_Item_name.getText(),
                txt_price.getText(),
                txt_Qty.getText(),
                txt_total.getText(),
                });

            //take table row count and add it into the sum text field
            double sum = 0;
            double qty = 0;
            
            int i = 0;
            for (i = 0; i < tbl_invoice.getRowCount(); i++) {
                sum = sum + Double.parseDouble(tbl_invoice.getValueAt(i, 4).toString());
                qty = qty + Double.parseDouble(tbl_invoice.getValueAt(i, 3).toString());
            }
            


            txt_subtoot.setText(Double.toString(sum));
            txt_unit.setText(Double.toString(tbl_invoice.getRowCount()));
            txt_item_qty.setText(Double.toString(qty));
           // 
            
          
            setsubtot();
            
            txt_item_no.setText("");
            txt_Item_name.setText("");
            txt_price.setText("");
            txt_Qty.setText("");
            txt_total.setText("");
              time = timePicker.getTime().toString();
            date = datepicker.getDate().toString();
            unit = Integer.parseInt(txt_unit.getText());
            
            
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_AddActionPerformed
    public int getunit()
    {
       return unit;
    }
    
    public String gettime()
    {
      return time;
    }
        public String getdate()
    {
      return date;
    }
    public double getdiscount()
     {
      return discount;
     }
    public double getqty()
    {
      return qty;
    }
    static double subtotal = 0;
    public void setsubtot()
    {
        subtotal = Double.parseDouble(txt_subtoot.getText());
        System.out.println(subtotal);
    }
    
    public double getsubtot()
    {
       return subtotal;
    }

    private void txt_Invoice_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Invoice_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Invoice_NoActionPerformed

//f1 key pres then add data from item table to text fields
    private void txt_item_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_item_noKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {

            itb.setVisible(true);
            txt_item_no.setText(itb.itemno);
            txt_Item_name.setText(itb.itemname);
            txt_price.setText(itb.price);

            ManageItem manageitem1 = new ManageItem();
            ResultSet result = manageitem1.selectItemdata(Integer.parseInt(itb.itemno));
            try {
                while (result.next()) {
                    txt_Qty.setText(result.getString("stockQty"));
                }

                double qty1 = Double.parseDouble(txt_Qty.getText());
                totalone_item = (Double.parseDouble(itb.price) * qty1);
                txt_total.setText(Double.toString(totalone_item));

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            //  txtdno.setText("");
            //  txtdname.setText("");

        }
    }//GEN-LAST:event_txt_item_noKeyPressed


    private void txt_item_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_item_noActionPerformed
        
    }//GEN-LAST:event_txt_item_noActionPerformed

    private void txt_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_priceKeyReleased
      
    }//GEN-LAST:event_txt_priceKeyReleased

    private void txt_subtootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subtootActionPerformed

    private void txt_QtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_QtyKeyTyped

    }//GEN-LAST:event_txt_QtyKeyTyped

    //quantity and price multiplication
    private void txt_QtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_QtyKeyReleased
        try{
             ManageValidation.validateNumber(txt_Qty, 5);
            qty = Double.parseDouble(txt_Qty.getText());
            price = Double.parseDouble(txt_price.getText());
            totalone_item =(price * qty);
            txt_total.setText(Double.toString(totalone_item));

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_txt_QtyKeyReleased

    private void txt_QtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_QtyKeyPressed

    }//GEN-LAST:event_txt_QtyKeyPressed

    private void txt_QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_QtyActionPerformed

    private void txt_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalKeyReleased
      
    }//GEN-LAST:event_txt_totalKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private com.github.lgooddatepicker.components.DatePicker datepicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_itemerror;
    private javax.swing.JLabel lbl_itemnameerror;
    private javax.swing.JLabel lbl_priceerror;
    private javax.swing.JLabel lbl_qtyerror;
    private javax.swing.JLabel lbl_toterror;
    private javax.swing.JTable tbl_invoice;
    private com.github.lgooddatepicker.components.TimePicker timePicker;
    private javax.swing.JTextField txt_Invoice_No;
    private javax.swing.JTextField txt_Item_name;
    private javax.swing.JTextField txt_Qty;
    private javax.swing.JTextField txt_item_no;
    private javax.swing.JTextField txt_item_qty;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_subtoot;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_unit;
    // End of variables declaration//GEN-END:variables
}
