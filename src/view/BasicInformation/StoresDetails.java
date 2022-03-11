/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BasicInformation;

import Model.Stores;
import controller.ManageBin;
import controller.ManageStore;
import controller.ManageValidation;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StoresDetails extends javax.swing.JDialog {

    public StoresDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtstname = new javax.swing.JTextField();
        txtstcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Stores Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 40));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 440, 40));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Stores Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Stores Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 30));

        txtstname.setEditable(false);
        txtstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstnameActionPerformed(evt);
            }
        });
        txtstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtstnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 210, 30));

        txtstcode.setEditable(false);
        txtstcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstcodeActionPerformed(evt);
            }
        });
        txtstcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtstcodeKeyPressed(evt);
            }
        });
        jPanel2.add(txtstcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 210, 30));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 420, 110));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("  Close");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("  New");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 110, 30));

        btnsave.setBackground(new java.awt.Color(204, 255, 204));
        btnsave.setText("Save");
        btnsave.setActionCommand("");
        btnsave.setBorder(null);
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 110, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 440, 20));
        kGradientPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstnameActionPerformed

    private void txtstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            SearchStore st = new SearchStore(null,true);
            st.setVisible(true);           
            txtstcode.setText(st.stid);
            txtstname.setText(st.stname);
        }else if (evt.getKeyCode() == KeyEvent.VK_F2) {
           
            txtstcode.setText("");
            txtstname.setText("");
            txtstcode.setEditable(false);
            txtstname.setEditable(false);
            btnsave.setEnabled(false);

        }else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnsave.setText("Save");
            btnsave.setEnabled(true);
            txtstcode.setEditable(true);
            txtstname.setEditable(true);

        }else if (evt.getKeyCode() == KeyEvent.VK_F3) {
            btnsave.setText("Update");
            btnsave.setEnabled(true);
            txtstname.setEditable(true);
        }else{
            ManageValidation.validatorText2(txtstname);
        }
    }//GEN-LAST:event_txtstnameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            if(btnsave.getText().equals("Save")){
                Stores st = new Stores(txtstcode.getText(),txtstname.getText());
                ManageStore savedata = new ManageStore(st);
                savedata.savestores();
                txtstcode.setText("");
                txtstname.setText("");
                txtstcode.setEditable(false);
                txtstname.setEditable(false);
                btnsave.setEnabled(false);
            }else if(btnsave.getText().equals("Update")){
                Stores st = new Stores(txtstcode.getText(),txtstname.getText());
                ManageStore savedata = new ManageStore(st);
                savedata.updateStore();
                txtstcode.setText("");
                txtstname.setText("");
                txtstcode.setEditable(false);
                txtstname.setEditable(false);
                btnsave.setEnabled(false);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getVisibleContent(),"Department not saved", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void txtstcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstcodeActionPerformed
    private void txtstcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstcodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            SearchStore st = new SearchStore(null,true);
            st.setVisible(true);           
            txtstcode.setText(st.stid);
            txtstname.setText(st.stname);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
           
            txtstcode.setText("");
            txtstname.setText("");
            txtstcode.setEditable(false);
            txtstname.setEditable(false);
            btnsave.setEnabled(false);

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnsave.setText("Save");
            btnsave.setEnabled(true);
            txtstcode.setEditable(true);
            txtstname.setEditable(true);

        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            btnsave.setText("Update");
            btnsave.setEnabled(true);
            txtstname.setEditable(true);
        }
    }//GEN-LAST:event_txtstcodeKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            txtstcode.setText("");
            txtstname.setText("");
            txtstcode.setEditable(false);
            txtstname.setEditable(false);
            btnsave.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed
                 Window getVisibleContent() {
        Window result = null;
        for (Window w : Window.getWindows()) {
            if (w.isVisible()) {
                result = w;
            }
        }
        return result;
    }
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
            java.util.logging.Logger.getLogger(StoresDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoresDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoresDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoresDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StoresDetails dialog = new StoresDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField txtstcode;
    public javax.swing.JTextField txtstname;
    // End of variables declaration//GEN-END:variables
}
