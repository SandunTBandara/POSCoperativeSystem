/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageUser;
import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.frontlogin;
import view.Admin.ManageUsers;
import view.Admin.UserPrivilages;

/**
 *
 * @author Sanu
 */
public class Dashboard1 extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard1
     */
    public Dashboard1() {
            
        initComponents();
        
        runLetters();
        Menu Menu1 = new Menu();
              jmenupanel.removeAll();
              jmenupanel.add(Menu1).setVisible(true);
    }

    
        void runLetters(){
        Thread t = new Thread(){
            @Override
            public void run(){
            String names[] = {"C" , "O" , "-" , "O" , "P" , "E" , "R" , "A" , "T" , "I" , "V" , "E " , "  " , "P" , "O" , "S" , "  ","S" , "Y" , "S" , "T" , "E" , "M" ,  };
            while(true){ 
            String title = "";
            for(int i =0; i < names.length ; i++){
            title = title +names[i];
            try{
             jLabel8.setText(title);
             Thread.sleep(300);
            }
            catch(Exception e){
                
            }
            }
            }
            }
            
        };
        t.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_basicinformsation = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jmenupanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 51));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton2.setText("සටහන් ඇතුලත් කිරීම");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, 90));

        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton3.setText("වාර්තා තොරතුරු");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 350, 90));

        jButton4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton4.setText("User Privilages");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 350, 90));

        jButton6.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        jButton6.setText("ඉවත්වීම");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 350, 90));

        btn_basicinformsation.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        btn_basicinformsation.setText("මූලික තොරතුරු");
        btn_basicinformsation.setToolTipText("");
        btn_basicinformsation.setActionCommand("btn1");
        btn_basicinformsation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_basicinformsationActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_basicinformsation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 90));

        jButton5.setFont(new java.awt.Font("Nirmala UI", 1, 22)); // NOI18N
        jButton5.setText("පරිශීලක කළමණාකරණය");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 350, 90));

        jButton7.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jButton7.setText("උදව්");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 350, 90));

        jDesktopPane1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 390, 800));

        kGradientPanel2.setBackground(new java.awt.Color(255, 204, 204));
        kGradientPanel2.setForeground(new java.awt.Color(255, 153, 102));
        kGradientPanel2.setkEndColor(new java.awt.Color(0, 51, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("System Back End ");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 240, 30));

        jDesktopPane1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 390, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 870, 70));

        javax.swing.GroupLayout jmenupanelLayout = new javax.swing.GroupLayout(jmenupanel);
        jmenupanel.setLayout(jmenupanelLayout);
        jmenupanelLayout.setHorizontalGroup(
            jmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1490, Short.MAX_VALUE)
        );
        jmenupanelLayout.setVerticalGroup(
            jmenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jmenupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 1490, 860));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_basicinformsationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_basicinformsationActionPerformed
             
        try {
            
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("basicInfo", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("basicInfo");

                if(status == 1){
                    BasicInfo bi3 = new BasicInfo();
                    jmenupanel.removeAll();
                    jmenupanel.add(bi3).setVisible(true); 
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }
           
              
        } catch (IOException ex) {
            Logger.getLogger(Dashboard1.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
             
              
              
    }//GEN-LAST:event_btn_basicinformsationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("EntryNote", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("EntryNote");

                if(status == 1){                    
                    Entry__Note bi = new Entry__Note();
                    jmenupanel.removeAll();
                    jmenupanel.add(bi).setVisible(true);  
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }
        } catch (FontFormatException ex) {
            Logger.getLogger(Dashboard1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Dashboard1.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("en_reports", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("en_reports");
                
                if(status == 1){                    
                    ReportsForm RF = new ReportsForm();
                    jmenupanel.removeAll();
                    jmenupanel.add(RF).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("Admin", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("Admin");
                
                if(status == 1){                    
                    UserPrivilages RF = new UserPrivilages(null, true);
                    RF.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            ManageUser user = new ManageUser();
            ResultSet rs = user.getUsersPrivilage("Admin", frontlogin.uid);

            while(rs.next()){
                String type = rs.getString("Type");
                int status = rs.getInt("Admin");
                
                if(status == 1){                    
                    ManageUsers RF = new ManageUsers(null, true);
                    RF.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, type +" don't have permission to access this!", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);

                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_basicinformsation;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jmenupanel;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
