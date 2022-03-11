
package view.BasicInformation;

import controller.ManageGoodReceiveNote;
import controller.ManageLoyalityCard;
import controller.ManageLoyalityCustomer;
import controller.ManageValidation;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.LoyalityCardCustomer;

public class LoyalityMemberInformation extends javax.swing.JDialog {

    LoyalityCardCustomer mem = new LoyalityCardCustomer();
    ManageLoyalityCustomer manange = new ManageLoyalityCustomer(mem);
    
    public LoyalityMemberInformation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadCardType();
        generateID();
    }
    
    ManageLoyalityCard card = new ManageLoyalityCard();
     public void loadCardType(){
        try{
            
            ResultSet rs = card.getloyalityCord();
            cardId.addItem("-select-");
            while(rs.next()){
                cardId.addItem(rs.getString("ICname"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

     public void generateID(){
        try {
            String grn="";
            ResultSet rs = manange.getAll();
            while(rs.next()){
                grn = rs.getString("memberId").toString();
            } 

            if(grn == ""){
                grn = "0000000001";
            }else{
                int no = Integer.valueOf(grn);
                int nno = ++no;
            
                if(String.valueOf(nno).length() == 1){
                    grn = "000000000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 2){
                    grn = "00000000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 3){
                    grn = "0000000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 4){
                    grn = "000000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 5){
                    grn = "00000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 6){
                    grn = "0000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 7){
                    grn = "000" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 8){
                    grn = "00" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 9){
                    grn = "0" + String.valueOf(nno);
                }else if(String.valueOf(nno).length() == 10){
                    grn = String.valueOf(nno);
                }
            }            
            
            System.out.println(grn);
            id.setText(grn);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        barcode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cardId = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        points = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btndpsave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Loyality Member Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 20));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, 40));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Bar Code");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 20));

        jLabel3.setText("Member ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 20));

        id.setEditable(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 270, 25));

        barcode.setEditable(false);
        barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barcodeKeyPressed(evt);
            }
        });
        jPanel2.add(barcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 270, 25));

        jLabel7.setText("Member  Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 20));

        name.setEditable(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 270, 25));

        jLabel8.setText("Card Type");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 120, 20));

        jPanel2.add(cardId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 270, -1));

        jLabel9.setText("Total Points");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, 20));

        points.setEditable(false);
        points.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pointsKeyPressed(evt);
            }
        });
        jPanel2.add(points, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 270, 25));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 210));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("  Close");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("  New");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, 30));

        btndpsave.setBackground(new java.awt.Color(204, 255, 204));
        btndpsave.setText("  Save");
        btndpsave.setActionCommand("");
        btndpsave.setBorder(null);
        btndpsave.setEnabled(false);
        btndpsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndpsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btndpsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 550, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        keyPress(evt);
    }//GEN-LAST:event_idKeyPressed
    
    public void keyPress(java.awt.event.KeyEvent evt){
        try {
            if (evt.getKeyCode() == KeyEvent.VK_F1) {
                LoyalityMemberSearch cts = new LoyalityMemberSearch(null,true);
                cts.setVisible(true);

                id.setText(cts.id);
                name.setText(cts.name);
                barcode.setText(cts.barcode);
                ResultSet rs = card.getCardNameByID(cts.type);
                while(rs.next()){
                    System.out.println("hi" + rs.getString("ICname"));
                    cardId.setSelectedItem(rs.getString("ICname"));
                }
                points.setText(String.valueOf(cts.points));
            }else if (evt.getKeyCode() == KeyEvent.VK_F2) {

                name.setText("");
                id.setText("");
                barcode.setText("");
                cardId.setSelectedIndex(0);
                points.setText("");
                name.setEditable(false);
                id.setEditable(false);
                barcode.setEditable(false);
                cardId.setEditable(false);
                points.setEditable(false);
                btndpsave.setEnabled(false);
                btndpsave.setText("Save");
                generateID();
            }else if (evt.getKeyCode() == KeyEvent.VK_F3) {

                name.setEditable(true);
                barcode.setEditable(true);
                cardId.setEditable(true);
                points.setEditable(true);
                btndpsave.setText("Update");
                btndpsave.setEnabled(true);
            }else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                name.setEditable(true);
                barcode.setEditable(true);
                cardId.setEditable(true);
                points.setEditable(true);
                btndpsave.setText("Save");
                btndpsave.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoyalityMemberInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void barcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeKeyPressed
        if(!(evt.getKeyCode() == KeyEvent.VK_F2) && !(evt.getKeyCode() == KeyEvent.VK_F3) && !(evt.getKeyCode() == KeyEvent.VK_F1) && !(evt.getKeyCode() == KeyEvent.VK_ENTER)){
           ManageValidation.validateNumber(barcode, 13);
       }else{
           keyPress(evt);
       }
    }//GEN-LAST:event_barcodeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndpsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpsaveActionPerformed
        try{
            if(id.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "customer code cannot be empty!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(name.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "Enter customer name!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(cardId.getSelectedIndex()== 0){
                JOptionPane.showMessageDialog(rootPane, "Please select the loyality card type!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(barcode.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "please enter the barcode no.!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(points.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "total Points cannot be empty!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                ResultSet rs = card.getCardNameByID(cardId.getSelectedItem().toString());
                String typeid="";
                while(rs.next()){
                    typeid = rs.getString("Lcode");
                }
                
                
                if(btndpsave.getText().equals("Save")){
                    mem.setLoyalityCardCustomer(barcode.getText(), id.getText(), name.getText(), typeid, Double.valueOf(points.getText()));
                    manange.saveLoyalityMember();

                    name.setText("");
                    id.setText("");
                    barcode.setText("");
                    cardId.setSelectedIndex(0);
                    points.setText("");
                    name.setEditable(false);
                    id.setEditable(false);
                    barcode.setEditable(false);
                    cardId.setEditable(false);
                    points.setEditable(false);
                    btndpsave.setEnabled(false);
                    btndpsave.setText("Save");
                    generateID();
                }if(btndpsave.getText().equals("Update")){
                    mem.setLoyalityCardCustomer(barcode.getText(), id.getText(), name.getText(), typeid, Double.valueOf(points.getText()));
                    manange.updateMember();

                    name.setText("");
                    id.setText("");
                    barcode.setText("");
                    cardId.setSelectedIndex(0);
                    points.setText("");
                    name.setEditable(false);
                    id.setEditable(false);
                    barcode.setEditable(false);
                    cardId.setEditable(false);
                    points.setEditable(false);
                    btndpsave.setEnabled(false);
                    btndpsave.setText("Save");
                    generateID();
                }
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btndpsaveActionPerformed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        if(!(evt.getKeyCode() == KeyEvent.VK_F2) && !(evt.getKeyCode() == KeyEvent.VK_F3) && !(evt.getKeyCode() == KeyEvent.VK_F1) && !(evt.getKeyCode() == KeyEvent.VK_ENTER)){
           ManageValidation.validatorText2(name);
       }else{
           keyPress(evt);
       }
    }//GEN-LAST:event_nameKeyPressed

    private void pointsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pointsKeyPressed
        if(!(evt.getKeyCode() == KeyEvent.VK_F2) && !(evt.getKeyCode() == KeyEvent.VK_F3) && !(evt.getKeyCode() == KeyEvent.VK_F1) && !(evt.getKeyCode() == KeyEvent.VK_ENTER)){
           ManageValidation.validateNumber(points, 7);
       }else{
           keyPress(evt);
       }
    }//GEN-LAST:event_pointsKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        name.setText("");
            id.setText("");
            barcode.setText("");
            cardId.setSelectedIndex(0);
            points.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoyalityMemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoyalityMemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoyalityMemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoyalityMemberInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoyalityMemberInformation dialog = new LoyalityMemberInformation(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField barcode;
    private javax.swing.JButton btndpsave;
    private javax.swing.JComboBox<String> cardId;
    public javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField name;
    public javax.swing.JTextField points;
    // End of variables declaration//GEN-END:variables
}
