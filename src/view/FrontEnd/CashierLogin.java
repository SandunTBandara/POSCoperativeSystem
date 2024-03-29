/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FrontEnd;

import controller.ManageFrontLogin;
import controller.ManageValidation;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.frontlogin;

/**
 *
 * @author Sanu
 */
public class CashierLogin extends javax.swing.JFrame {

    /**
     * Creates new form CashierLogin
     */
    public CashierLogin() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lbl_nameerror = new javax.swing.JLabel();
        lbl_pwerror = new javax.swing.JLabel();
        btnreg = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(0, 0, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 51));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Front End Login");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 425, 52));

        kGradientPanel2.setkEndColor(new java.awt.Color(102, 0, 102));
        kGradientPanel2.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User Name");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setText("Password");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 243, 50));
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 243, 50));

        lbl_nameerror.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lbl_nameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 130, 20));

        lbl_pwerror.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(lbl_pwerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 130, 20));

        kGradientPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 50, 540, 270));

        btnreg.setText("Login");
        btnreg.setBackground(new java.awt.Color(255, 51, 255));
        btnreg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 130, 50));

        btncancel.setText("Cancel");
        btncancel.setBackground(new java.awt.Color(255, 51, 255));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btncancel.setForeground(new java.awt.Color(51, 51, 51));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 120, 50));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
    
        try{
            ManageValidation.validatorText(txtUsername, lbl_nameerror);
            ManageValidation.validatorText(txtUsername, lbl_pwerror);
            
            
        if(ManageValidation.validatorText(txtUsername, lbl_nameerror)
                &&ManageValidation.validatorText(txtUsername, lbl_pwerror))
        {
        frontlogin login = new frontlogin(txtUsername.getText(),txtpass.getText());
         ManageFrontLogin mlogin = new ManageFrontLogin(login);
         ResultSet rs = mlogin.loadlogin();
         if(rs.next())
         {
             UserSignin signon1 = new UserSignin(null,true);
             this.dispose();
             signon1.setLocationRelativeTo(this);
             signon1.setVisible(true);
             
             
         }
         else{
                JOptionPane.showMessageDialog(null, "User Name and Password not matched");
                txtUsername.setText("");
                txtpass.setText("");
         }
        }
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
         
        /* try {
           
        
           Login logins = new Login(txtUsername.getText(), txtpass.getText());
            Managelogin login = new Managelogin(logins);
            ResultSet result = login.loadlogin();
            if (result.next()) {
                Dashboard1 db = new Dashboard1();
                db.setLocationRelativeTo(this);
                db.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User Name and Password not matched");
                txtUsername.setText("");
                txtpass.setText("");
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
            */
    }//GEN-LAST:event_btnregActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lbl_nameerror;
    private javax.swing.JLabel lbl_pwerror;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
