/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FrontEnd;

/**
 *
 * @author Sanu
 */
public class Payment extends javax.swing.JInternalFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsubtot = new javax.swing.JTextField();
        txtdiscount = new javax.swing.JTextField();
        txtnettotal = new javax.swing.JTextField();
        txtpaycash = new javax.swing.JTextField();
        txtcashamount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtbalancef = new javax.swing.JTextField();
        btngenbill = new javax.swing.JButton();
        btnloyalcus = new javax.swing.JButton();
        btncreditcus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sub Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 162, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Discount");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Net Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 123, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Pay Cash");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Credit Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 35));

        txtsubtot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtsubtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 209, -1));

        txtdiscount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 209, -1));

        txtnettotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtnettotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 209, -1));

        txtpaycash.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtpaycash, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 209, -1));

        txtcashamount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtcashamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 209, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Balance");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        txtbalancef.setBackground(new java.awt.Color(0, 0, 0));
        txtbalancef.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtbalancef.setForeground(new java.awt.Color(204, 0, 0));
        txtbalancef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalancefActionPerformed(evt);
            }
        });
        jPanel1.add(txtbalancef, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 246, 63));

        btngenbill.setBackground(new java.awt.Color(0, 0, 0));
        btngenbill.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btngenbill.setForeground(new java.awt.Color(204, 0, 51));
        btngenbill.setText("Generate Bill");
        btngenbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenbillActionPerformed(evt);
            }
        });
        jPanel1.add(btngenbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 567, 360, 80));

        btnloyalcus.setBackground(new java.awt.Color(204, 255, 255));
        btnloyalcus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnloyalcus.setText("Loyality Customer");
        btnloyalcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloyalcusActionPerformed(evt);
            }
        });
        jPanel1.add(btnloyalcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 270, 60));

        btncreditcus.setBackground(new java.awt.Color(204, 255, 255));
        btncreditcus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncreditcus.setText("Credit Customers");
        jPanel1.add(btncreditcus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 270, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Payment Portal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbalancefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalancefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalancefActionPerformed

    private void btngenbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngenbillActionPerformed

    private void btnloyalcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloyalcusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloyalcusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreditcus;
    private javax.swing.JButton btngenbill;
    private javax.swing.JButton btnloyalcus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbalancef;
    private javax.swing.JTextField txtcashamount;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JTextField txtnettotal;
    private javax.swing.JTextField txtpaycash;
    private javax.swing.JTextField txtsubtot;
    // End of variables declaration//GEN-END:variables
}
