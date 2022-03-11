
package view.BasicInformation;

import controller.ManageBin;
import controller.ManageCreditInformation;
import controller.ManageGoodReceiveNote;
import controller.ManageLoyalityCard;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.LoyalityCard;

public class LoyalityCards extends javax.swing.JDialog {
    public LoyalityCards(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        generateID();
    }
    
    public void generateID(){
        try {
            String grn="";
            ManageLoyalityCard manage= new ManageLoyalityCard();
            ResultSet rs = manage.getloyalityCord();
            while(rs.next()){
                grn = rs.getString("Lcode").toString();
            } 

            if(grn == ""){
                grn = "LC000001";
            }else{
                int no = Integer.valueOf(grn.substring(2));
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    grn = "LC00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    grn = "LC0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    grn = "LC000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    grn = "LC00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    grn = "LC0" + String.valueOf(nno);
                }else{
                    grn = "LC" + String.valueOf(nno);
                }
            }            
            
            System.out.println(grn);
            txtccode.setText(grn);
        } catch (Exception ex) {
            System.out.println("line 55" + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtccode = new javax.swing.JTextField();
        txtctype = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Loyality Card Information");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 40));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Loyality Card type Code");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Loyality Card type ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        txtccode.setEditable(false);
        txtccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtccodeActionPerformed(evt);
            }
        });
        txtccode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtccodeKeyPressed(evt);
            }
        });
        jPanel2.add(txtccode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 220, 30));

        txtctype.setEditable(false);
        txtctype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtctypeKeyPressed(evt);
            }
        });
        jPanel2.add(txtctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 220, 30));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 150));

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 90, 30));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 90, 30));

        btnclose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 100, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 490, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtccodeActionPerformed

    }//GEN-LAST:event_txtccodeActionPerformed

    private void txtccodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtccodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            LoyalityCardSearch cts = new LoyalityCardSearch(null,true);
            cts.setVisible(true);

            txtccode.setText(cts.id);
            txtctype.setText(cts.name);
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_F2) {

            txtccode.setText("");
            txtctype.setText("");
            btnsave.setText("Save");
            txtccode.setEditable(false);
            txtctype.setEditable(false);
            btnsave.setEnabled(false);
            generateID();
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnsave.setText("Save");
            txtccode.setEditable(true);
            txtctype.setEditable(true);
            btnsave.setEnabled(true);
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            btnsave.setText("Update");
            btnsave.setEnabled(true);
            txtctype.setEditable(true);
        }
    }//GEN-LAST:event_txtccodeKeyPressed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtccode.setText("");
        txtctype.setText("");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try{
            
            if(btnsave.getText().equals("Save")){
                if(txtccode.getText().length() == 0){
                    JOptionPane.showMessageDialog(rootPane, "code cannot be empty!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
                }else if(txtctype.getText().length() == 0){
                    JOptionPane.showMessageDialog(rootPane, "Loyality card type cannot be empty!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
                }else{
                    LoyalityCard cards = new LoyalityCard();
                    cards.setLoyalityCard(txtccode.getText().toString(), txtctype.getText().toString());
                    ManageLoyalityCard manage = new ManageLoyalityCard(cards);
                    manage.saveLoyalityCard();
                    txtccode.setText("");
                    txtctype.setText("");
                    btnsave.setText("Save");
                    txtccode.setEditable(false);
                    txtctype.setEditable(false);
                    btnsave.setEnabled(false);
                    generateID();
                }
            }else if(btnsave.getText().equals("Update")){
                LoyalityCard cards = new LoyalityCard();
                    cards.setLoyalityCard(txtccode.getText().toString(), txtctype.getText().toString());
                    ManageLoyalityCard manage = new ManageLoyalityCard(cards);
                    manage.updateLoyal();
                    txtccode.setText("");
                    txtctype.setText("");
                    btnsave.setText("Save");
                    txtccode.setEditable(false);
                    txtctype.setEditable(false);
                    btnsave.setEnabled(false);
                    generateID();
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void txtctypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtctypeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            LoyalityCardSearch cts = new LoyalityCardSearch(null,true);
            cts.setVisible(true);

            txtccode.setText(cts.id);
            txtctype.setText(cts.name);
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_F2) {

            txtccode.setText("");
            txtctype.setText("");
            txtccode.setEditable(false);
            txtctype.setEditable(false);
            btnsave.setEnabled(false);
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnsave.setText("Save");
            txtccode.setEditable(true);
            txtctype.setEditable(true);
            btnsave.setEnabled(true);
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            btnsave.setText("Update");
            btnsave.setEnabled(true);
            txtctype.setEditable(true);
        }
    }//GEN-LAST:event_txtctypeKeyPressed

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
            java.util.logging.Logger.getLogger(LoyalityCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoyalityCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoyalityCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoyalityCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoyalityCards dialog = new LoyalityCards(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtccode;
    private javax.swing.JTextField txtctype;
    // End of variables declaration//GEN-END:variables
}
