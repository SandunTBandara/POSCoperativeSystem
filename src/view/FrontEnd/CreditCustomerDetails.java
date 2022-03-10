/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FrontEnd;

import controller.ManageCahsierLogin;
import controller.ManageCreditCustomer;
import controller.ManageCustomerInvoice;
import controller.ManageValidation;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import controller.ManagePayCreditInformation;
import controller.ManagegetCredit;
import model.GetCredit;
import model.paycreditinformation;

/**
 *
 * @author Sanu
 */
public class CreditCustomerDetails extends javax.swing.JDialog {

    /**
     * Creates new form CreditCustomerDetails
     */
    public CreditCustomerDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setInvoiceNumber();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_CreditCode = new javax.swing.JTextField();
        btn_addtotalpoint = new javax.swing.JButton();
        lbl_BalanceAmount = new javax.swing.JLabel();
        lbl_creditamounnt = new javax.swing.JLabel();
        lbl_totalpoint = new javax.swing.JLabel();
        lbl_InvoiceNo = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_barcodeadd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_cusno = new javax.swing.JTextField();
        lbl_cusnoerror = new javax.swing.JLabel();
        lblccode_error = new javax.swing.JLabel();
        lbl_cus_error = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Credit Code");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 159, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Invoice No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Balance Amount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Credit Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 200, 40));

        txt_CreditCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CreditCodeKeyReleased(evt);
            }
        });
        jPanel1.add(txt_CreditCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 223, 37));

        btn_addtotalpoint.setBackground(new java.awt.Color(0, 0, 0));
        btn_addtotalpoint.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_addtotalpoint.setForeground(new java.awt.Color(204, 204, 255));
        btn_addtotalpoint.setText("Add Credit");
        btn_addtotalpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addtotalpointActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addtotalpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 180, 50));

        lbl_BalanceAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(lbl_BalanceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 220, 40));

        lbl_creditamounnt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(lbl_creditamounnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 220, 40));

        lbl_totalpoint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(lbl_totalpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 220, 40));

        lbl_InvoiceNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(lbl_InvoiceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 220, 40));

        btn_cancel.setBackground(new java.awt.Color(0, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(204, 204, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 190, 50));

        btn_barcodeadd.setBackground(new java.awt.Color(0, 0, 0));
        btn_barcodeadd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_barcodeadd.setForeground(new java.awt.Color(204, 204, 255));
        btn_barcodeadd.setText("Add");
        btn_barcodeadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barcodeaddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_barcodeadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Customer N0");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, 40));

        txt_cusno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cusnoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_cusno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 220, 40));

        lbl_cusnoerror.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_cusnoerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, -1));

        lblccode_error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblccode_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 110, -1));

        lbl_cus_error.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbl_cus_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 110, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 790, 550));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Credit Customer Details");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 780, 90));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setInvoiceNumber()
    {
        String InvoiceID  = "";
        try{
//                     Invoice Invoice1 = new Invoice();
//                    InvoiceID = Invoice1.getIvoiceID();
ResultSet result1 = null;
          ManageCustomerInvoice ManageCustomerInvoice1 = new ManageCustomerInvoice();
          result1 = ManageCustomerInvoice1.GetInvoiceNo();
                   while(result1.next())
                   {
                     InvoiceID = result1.getString("invoiceNo");
                   }
                   
                   lbl_InvoiceNo.setText(InvoiceID);
                   
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
    double paycredit = 0;
    double balance ;
    public void setbalanceamount()
    {
        try{
            
                   
                          ResultSet result = null;
                  double maxamount = 0 ;
                  
                  
                   ManageCreditCustomer ManageCreditCustomer1 = new ManageCreditCustomer();
                   result = ManageCreditCustomer1.viewcreditcustomerbycus(Integer.parseInt(txt_cusno.getText()));
                   while(result.next())
                   {
                     maxamount = result.getDouble("creditLimit");
                   }
                   
                   
                  
                   
                   PaymentPortal PaymentPortal1 = new  PaymentPortal(null,true);
                   balance = PaymentPortal1.getbalance();
                   System.out.println(PaymentPortal1.getbalance());
                  
                   if(maxamount>=balance)
                   {
                       lbl_BalanceAmount.setText(Double.toString(maxamount));
                        paycredit = maxamount - balance;
                      
                      lbl_creditamounnt.setText(Double.toString(balance));
                      
                   }
                   else
                   {
                     JOptionPane.showMessageDialog(null, "Your Credit Balance IS not Enough", "Super Market Pos System", JOptionPane.ERROR_MESSAGE);
                     this.dispose();
                   }
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    private void btn_addtotalpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addtotalpointActionPerformed
      int result = 0;
      int rst = 0;
        ManageValidation.validatorText(txt_cusno, lbl_cusnoerror);
        ManageValidation.validatorText(txt_CreditCode, lblccode_error);
        if(ManageValidation.validatorText(txt_cusno, lbl_cusnoerror)
                &&ManageValidation.validatorText(txt_CreditCode, lblccode_error))
                {
                    //update new credit limit
                   ManageCreditCustomer m1 = new  ManageCreditCustomer();
                   result = m1.UpdateItemStock(Integer.parseInt(txt_cusno.getText()), paycredit);
                   
//                   paycreditinformation paycreditinformation1 = new paycreditinformation(lbl_InvoiceNo.getText(),Integer.parseInt(txt_CreditCode.getText()),balance,lbl_creditAmount.getText().toString());
//                   ManagePayCreditInformation ManagePayCreditInformation1 = new ManagePayCreditInformation(paycreditinformation1);
//                  rst =  ManagePayCreditInformation1.savepaycreditcustomer();

                   int result2;
                   GetCredit g1 = new GetCredit(Integer.parseInt(txt_cusno.getText()),Integer.parseInt(txt_CreditCode.getText().toString()),Double.parseDouble(lbl_BalanceAmount.getText()),Double.parseDouble(lbl_creditamounnt.getText()),lbl_InvoiceNo.getText());
                   ManagegetCredit ManagegetCredit1 = new ManagegetCredit(g1);
                   result2 = ManagegetCredit1.saveGetCredit();
                   if(result2>0)
                   {
                     JOptionPane.showMessageDialog(null, "Credit amount succesfully added","Super Market POS System",JOptionPane.INFORMATION_MESSAGE);
                   }
                   
                }
        if(result>0 && rst>0)
        {
           JOptionPane.showMessageDialog(null, "succesfully");
        }
        

    }//GEN-LAST:event_btn_addtotalpointActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_barcodeaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barcodeaddActionPerformed
        ManageValidation.validatorText(txt_cusno, lbl_cusnoerror);
        if(ManageValidation.validatorText(txt_cusno, lbl_cusnoerror))
        {
        setbalanceamount();}
//       String date = "";
//       Invoice i1 = new Invoice();
//       date = i1.getdate();
//       lbl_creditAmount.setText(date);
//        ResultSet result = null;
//        try{
//            ManageLoyalityCustomer mlc1 = new ManageLoyalityCustomer();
//            result = mlc1.getloyalitycustomer(txt_memberID.getText().toString());
//            while(result.next())
//            {
//                lbl_memberID.setText(result.getString("memberId").toString());
//                lbl_memberName.setText(result.getString("Name").toString());
//                lbl_LCardType.setText(result.getString("cardtype").toString());
//                lbl_LCode.setText(result.getString("Lcode").toString());
//                lbl_totalpoint.setText(Double.toString(result.getDouble("totalpoints")));
//
//            }
//            mID = lbl_memberID.getText().toString();
//            totpoint = Double.parseDouble( lbl_totalpoint.getText());
//
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Error Loading Loyality Card Details", "Super Market Pos System",JOptionPane.ERROR_MESSAGE);
//
//        }
    }//GEN-LAST:event_btn_barcodeaddActionPerformed

    private void txt_cusnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cusnoActionPerformed
        ManageValidation.validateNumber(txt_cusno, 5);
    }//GEN-LAST:event_txt_cusnoActionPerformed

    private void txt_CreditCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CreditCodeKeyReleased
        ManageValidation.validateNumber(txt_CreditCode, 5);
    }//GEN-LAST:event_txt_CreditCodeKeyReleased

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
            java.util.logging.Logger.getLogger(CreditCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditCustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreditCustomerDetails dialog = new CreditCustomerDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_addtotalpoint;
    private javax.swing.JButton btn_barcodeadd;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbl_BalanceAmount;
    private javax.swing.JLabel lbl_InvoiceNo;
    private javax.swing.JLabel lbl_creditamounnt;
    private javax.swing.JLabel lbl_cus_error;
    private javax.swing.JLabel lbl_cusnoerror;
    private javax.swing.JLabel lbl_totalpoint;
    private javax.swing.JLabel lblccode_error;
    private javax.swing.JTextField txt_CreditCode;
    private javax.swing.JTextField txt_cusno;
    // End of variables declaration//GEN-END:variables
}
