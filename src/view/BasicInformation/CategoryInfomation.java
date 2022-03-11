
package view.BasicInformation;

import Model.Category;
import controller.ManageCategory;
import controller.ManageDepartment;
import controller.ManageValidation;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

public class CategoryInfomation extends javax.swing.JDialog {

    public CategoryInfomation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadDno();
        generateID();
    }
    
    ManageDepartment dep = new ManageDepartment();

    public void loadDno(){
        try{
            ResultSet rs = dep.loaddepartment();
            dno.addItem("-select-");
            while(rs.next()){
                dno.addItem(rs.getString("description"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void generateID(){
        try {
            int no= 0;
            ManageCategory manage = new ManageCategory();
            ResultSet rs = manage.displaytableview();
            while(rs.next()){
                no = rs.getInt("cno");
            } 

            if(no == 0){
                no = 1;
            }else if(no<1000){
                ++no;
            }            
            
            System.out.println(no);
            txtdno.setText(String.valueOf(no));
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
        txtdno = new javax.swing.JTextField();
        txtdname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dno = new javax.swing.JComboBox<>();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Category Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 730, 50));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Category Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Category No");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 30));

        txtdno.setEditable(false);
        txtdno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnoActionPerformed(evt);
            }
        });
        txtdno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdnoKeyPressed(evt);
            }
        });
        jPanel2.add(txtdno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 250, 25));

        txtdname.setEditable(false);
        txtdname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 250, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Department Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 180, 30));

        dno.setEnabled(false);
        jPanel2.add(dno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 250, -1));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 690, 190));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("  Close");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("  New");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 110, 30));

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
        kGradientPanel1.add(btndpsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 110, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 730, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnoActionPerformed

    private void txtdnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            CategorySearch bj = new CategorySearch(null,true);
            bj.setVisible(true);
            
            txtdno.setText(bj.id);
            txtdname.setText(bj.name);
            String name =  dep.getName(bj.dno);
            dno.setSelectedItem(name);

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btndpsave.setText("Save");
            txtdno.setEditable(true);
            txtdname.setEditable(true);
            btndpsave.setEnabled(true);
            dno.setEnabled(true);

        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            txtdno.setText("");
            txtdname.setText("");
            txtdno.setEditable(false);
            txtdname.setEditable(false);
            dno.setSelectedIndex(0);
            dno.setEnabled(false);
            generateID();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            btndpsave.setText("Update");
            btndpsave.setEnabled(true);
            txtdno.setEditable(true);
            txtdname.setEditable(true);
            dno.setEnabled(true);
        }
    }//GEN-LAST:event_txtdnoKeyPressed

    private void txtdnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            CategorySearch bj = new CategorySearch(null,true);

            bj.setVisible(true);
            txtdno.setText(bj.id);
            txtdname.setText(bj.name);
            String name =  dep.getName(bj.dno);
            dno.setSelectedItem(name);

        }else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btndpsave.setText("Save");
            txtdno.setEditable(true);
            txtdname.setEditable(true);
            btndpsave.setEnabled(true);
            dno.setEnabled(true);

        }else if (evt.getKeyCode() == KeyEvent.VK_F2) {
            txtdno.setText("");
            txtdname.setText("");
            txtdno.setEditable(false);
            txtdname.setEditable(false);
            dno.setSelectedIndex(0);
            dno.setEnabled(false);
            generateID();
        }else if (evt.getKeyCode() == KeyEvent.VK_F3) {
            btndpsave.setText("Update");
            txtdname.setEditable(true);
            dno.setEnabled(true);
        }else{
            ManageValidation.validatorText2(txtdname);
        }
    }//GEN-LAST:event_txtdnameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtdno.setText("");
        txtdname.setText("");
        txtdno.setEditable(false);
        txtdname.setEditable(false);
        dno.setEnabled(false);
        btndpsave.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btndpsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpsaveActionPerformed
        try{
            if(btndpsave.getText().equals("Save")){
                int id = dep.getID(dno.getSelectedItem().toString());
                Category cat = new Category( Integer.parseInt(txtdno.getText()), id,txtdname.getText());
                ManageCategory savedata = new ManageCategory(cat);
                savedata.saveCategory();
                txtdno.setText("");
                txtdname.setText("");
                txtdno.setEditable(false);
                txtdname.setEditable(false);
                btndpsave.setEnabled(false);
                dno.setEnabled(false);
                generateID();
            
            }else if(btndpsave.getText().equals("Update")){
                int id = dep.getID(dno.getSelectedItem().toString());
                Category cat = new Category( Integer.parseInt(txtdno.getText()), id,txtdname.getText());
                ManageCategory savedata = new ManageCategory(cat);
                savedata.updateCat();
                txtdno.setText("");
                txtdname.setText("");
                btndpsave.setText("Save");
                txtdno.setEditable(false);
                txtdname.setEditable(false);
                btndpsave.setEnabled(false);
                dno.setEnabled(false);
                generateID();
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btndpsaveActionPerformed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

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
            java.util.logging.Logger.getLogger(CategoryInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryInfomation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CategoryInfomation dialog = new CategoryInfomation(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btndpsave;
    private javax.swing.JComboBox<String> dno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField txtdname;
    public javax.swing.JTextField txtdno;
    // End of variables declaration//GEN-END:variables
}
