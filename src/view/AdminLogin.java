
package view;

import controller.ManageFrontLogin;
import controller.ManageUser;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.frontlogin;
import view.EntryNotes.GoodReceiveNote;

public class AdminLogin extends javax.swing.JFrame {

    
    public AdminLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnreg = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8_user_30px.png"))); // NOI18N
        jLabel1.setText("User Name");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 159, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8_forgot_password_30px.png"))); // NOI18N
        jLabel2.setText("Password");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 271, 180, -1));
        kGradientPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 159, 243, 38));
        kGradientPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 267, 243, 45));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("BackEnd Login");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 44, 355, 72));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 23, 620, 370));

        btnreg.setBackground(new java.awt.Color(102, 255, 255));
        btnreg.setForeground(new java.awt.Color(51, 51, 51));
        btnreg.setText("Login");
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 419, 118, 40));

        btncancel.setBackground(new java.awt.Color(102, 255, 255));
        btncancel.setForeground(new java.awt.Color(51, 51, 51));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 419, 111, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 670, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        try {

            
            frontlogin login = new frontlogin(txtUsername.getText(), txtpass.getText().toString());
            ManageFrontLogin manage = new ManageFrontLogin(login);
            
            ResultSet result = manage.loadlogin();
            if (result.next()) {
                
                ManageUser user = new ManageUser();
                ResultSet rs = user.getUsersPrivilage("backEnd", frontlogin.uid);

                while(rs.next()){
                    String type = rs.getString("Type");
                    int status = rs.getInt("backEnd");

                    if(status == 1){
                        Dashboard1 db = new Dashboard1();
                        db.setLocationRelativeTo(this);
                        db.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "User Name and Password not matched");
                txtUsername.setText("");
                txtpass.setText("");
            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        
    }//GEN-LAST:event_btnregActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
