

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BasicInformation;

import Model.Supplier;
import controller.ManageDepartment;
import controller.ManageItem;
import controller.ManageSupplies;
import controller.ManageValidation;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Suppliers extends javax.swing.JDialog {


    public Suppliers(java.awt.Frame parent, boolean modal) {
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
                txt_scode.setText(String.valueOf(no));
            } catch (Exception ex) {
                System.out.println("line 55" + ex.getMessage());
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        txt_delieverdaycount = new javax.swing.JTextField();
        txt_supaddress = new javax.swing.JTextField();
        txt_cnumber = new javax.swing.JTextField();
        txt_sname = new javax.swing.JTextField();
        txt_scode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Supplier Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Supplier Code");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Supplier Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Delivery Day Count");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Supplier Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Contact Number");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        cname.setEditable(false);
        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnameKeyPressed(evt);
            }
        });
        jPanel2.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 220, 25));

        txt_delieverdaycount.setEditable(false);
        txt_delieverdaycount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_delieverdaycountActionPerformed(evt);
            }
        });
        txt_delieverdaycount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_delieverdaycountKeyPressed(evt);
            }
        });
        jPanel2.add(txt_delieverdaycount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 80, 25));

        txt_supaddress.setEditable(false);
        jPanel2.add(txt_supaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 220, 25));

        txt_cnumber.setEditable(false);
        txt_cnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cnumberKeyPressed(evt);
            }
        });
        jPanel2.add(txt_cnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 25));

        txt_sname.setEditable(false);
        txt_sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_snameActionPerformed(evt);
            }
        });
        txt_sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_snameKeyPressed(evt);
            }
        });
        jPanel2.add(txt_sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 280, 25));

        txt_scode.setEditable(false);
        txt_scode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_scodeKeyPressed(evt);
            }
        });
        jPanel2.add(txt_scode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 120, 25));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 510, 300));

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 70, 30));

        btn_save.setText("Save");
        btn_save.setEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 80, 30));

        btn_cancel.setText("Close");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 70, 30));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("F1 Help");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("F2 New");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("F3 Exit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addGap(0, 360, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 580, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_snameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_snameActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        try{
            if(txt_scode.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the supplier code" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txt_sname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the supplier name" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(cname.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the contact name of the supplier" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txt_delieverdaycount.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the delivery day count" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txt_supaddress.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter the supplier addressr" ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else if(txt_cnumber.getText().length() ==0){
                JOptionPane.showMessageDialog(null, "Please enter supplier contact no." ,"SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }else{
                if(btn_save.getText().equals("Save")){
                    Supplier Supplier1 = new Supplier(Integer.parseInt(txt_scode.getText()),txt_sname.getText(),cname.getText(),Integer.parseInt(txt_delieverdaycount.getText()),txt_supaddress.getText(),Integer.parseInt(txt_cnumber.getText()));
                    ManageSupplies dmp = new ManageSupplies(Supplier1);
                    dmp.savesupplier();
                    txt_scode.setText("");
                    txt_sname.setText("");
                    cname.setText("");
                    txt_delieverdaycount.setText("");
                    txt_supaddress.setText("");
                    txt_cnumber.setText("");
                    txt_scode.setEditable(false);
                    txt_sname.setEditable(false);
                    cname.setEditable(false);
                    txt_delieverdaycount.setEditable(false);
                    txt_supaddress.setEditable(false);
                    txt_cnumber.setEditable(false);
                    btn_save.setEnabled(false);
                    btn_save.setText("Save");
                    generateID();
                }else if(btn_save.getText().equals("Update")){
                    Supplier Supplier1 = new Supplier(Integer.parseInt(txt_scode.getText()),txt_sname.getText(),cname.getText(),Integer.parseInt(txt_delieverdaycount.getText()),txt_supaddress.getText(),Integer.parseInt(txt_cnumber.getText()));
                    ManageSupplies dmp = new ManageSupplies(Supplier1);
                    dmp.updateSupplier();
                    txt_scode.setText("");
                    txt_sname.setText("");
                    cname.setText("");
                    txt_delieverdaycount.setText("");
                    txt_supaddress.setText("");
                    txt_cnumber.setText("");
                    txt_scode.setEditable(false);
                    txt_sname.setEditable(false);
                    cname.setEditable(false);
                    txt_delieverdaycount.setEditable(false);
                    txt_supaddress.setEditable(false);
                    txt_cnumber.setEditable(false);
                    btn_save.setEnabled(false);
                    btn_save.setText("Save");
                    generateID();
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
         this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_delieverdaycountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_delieverdaycountActionPerformed
       
    }//GEN-LAST:event_txt_delieverdaycountActionPerformed

    private void txt_scodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_scodeKeyPressed
        
        try{
            if(evt.getKeyCode() == KeyEvent.VK_F1){
                SupplierSearch search = new SupplierSearch(null, true);
                search.setVisible(true);
                txt_scode.setText(String.valueOf(search.stid));
                txt_sname.setText(search.stname);
                
                ManageSupplies manage = new ManageSupplies();
                ResultSet rs  = manage.getSupplier(search.stid);
                
                while(rs.next()){
                    cname.setText(rs.getString("ContactName"));
                    txt_delieverdaycount.setText(String.valueOf(rs.getInt("delivery_day_count")));
                    txt_supaddress.setText(rs.getString("address"));
                    txt_cnumber.setText(String.valueOf(rs.getInt("contact_no")));
                }
                
            }else if(evt.getKeyCode() == KeyEvent.VK_F2){
                txt_scode.setText("");
                txt_sname.setText("");
                cname.setText("");
                txt_delieverdaycount.setText("");
                txt_supaddress.setText("");
                txt_cnumber.setText("");
                txt_scode.setEditable(false);
                txt_sname.setEditable(false);
                cname.setEditable(false);
                txt_delieverdaycount.setEditable(false);
                txt_supaddress.setEditable(false);
                txt_cnumber.setEditable(false);
                btn_save.setEnabled(false);
                btn_save.setText("Save");
                    generateID();
            }else if(evt.getKeyCode() == KeyEvent.VK_F3){
                txt_scode.setEditable(true);
                txt_sname.setEditable(true);
                cname.setEditable(true);
                txt_delieverdaycount.setEditable(true);
                txt_supaddress.setEditable(true);
                txt_cnumber.setEditable(true);
                btn_save.setEnabled(true);
                btn_save.setText("Update");
            }else if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                txt_scode.setEditable(true);
                txt_sname.setEditable(true);
                cname.setEditable(true);
                txt_delieverdaycount.setEditable(true);
                txt_supaddress.setEditable(true);
                txt_cnumber.setEditable(true);
                btn_save.setEnabled(true);
                btn_save.setText("Save");
            }
            
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_txt_scodeKeyPressed

    private void txt_snameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_snameKeyPressed
        ManageValidation.validatorText2(txt_sname);
    }//GEN-LAST:event_txt_snameKeyPressed

    private void txt_delieverdaycountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_delieverdaycountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_delieverdaycountKeyPressed

    private void cnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyPressed
        ManageValidation.validatorText2(cname);
    }//GEN-LAST:event_cnameKeyPressed

    private void txt_cnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cnumberKeyPressed
        ManageValidation.validateNumber(txt_cnumber, 10);
    }//GEN-LAST:event_txt_cnumberKeyPressed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Suppliers dialog = new Suppliers(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField cname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txt_cnumber;
    private javax.swing.JTextField txt_delieverdaycount;
    private javax.swing.JTextField txt_scode;
    private javax.swing.JTextField txt_sname;
    private javax.swing.JTextField txt_supaddress;
    // End of variables declaration//GEN-END:variables
}
