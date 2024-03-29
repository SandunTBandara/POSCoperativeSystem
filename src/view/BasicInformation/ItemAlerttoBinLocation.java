/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BasicInformation;

import controller.ManageBin;
import controller.ManageItem;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanu
 */
public class ItemAlerttoBinLocation extends javax.swing.JDialog {

    /**
     * Creates new form ItemAlerttoBinLocation
     */
    public ItemAlerttoBinLocation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        countrowstbl1();countrowstbl2();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        btnonebyone = new javax.swing.JButton();
        btnallitem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtdepartmentno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdepartmentname = new javax.swing.JTextField();
        txtcategoryname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcategoryno = new javax.swing.JTextField();
        chbitems = new javax.swing.JCheckBox();
        btnviewitem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtrackno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtrackname = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txttotaltbl1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        totaltbl2 = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1170, 900));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(484, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "DESCRIPTION", "BIN LOCATION"
            }
        ));
        jScrollPane1.setViewportView(tbl1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 450));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 206, 470, 490));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(484, 470));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "DESCRIPTION", "BIN LOCATION"
            }
        ));
        jScrollPane3.setViewportView(tbl2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 450));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 202, 470, 490));

        btnonebyone.setText("One by One");
        btnonebyone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnonebyoneActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnonebyone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 130, 70));

        btnallitem.setText("ALL  ");
        btnallitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallitemActionPerformed(evt);
            }
        });
        btnallitem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnallitemKeyPressed(evt);
            }
        });
        kGradientPanel1.add(btnallitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 130, 70));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Get All Items");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 32));

        txtdepartmentno.setEditable(false);
        txtdepartmentno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdepartmentno.setForeground(new java.awt.Color(102, 102, 102));
        txtdepartmentno.setText("F1");
        txtdepartmentno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartmentnoActionPerformed(evt);
            }
        });
        txtdepartmentno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdepartmentnoKeyReleased(evt);
            }
        });
        jPanel2.add(txtdepartmentno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Item Department");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 32));

        txtdepartmentname.setEditable(false);
        txtdepartmentname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txtdepartmentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 234, -1));

        txtcategoryname.setEditable(false);
        txtcategoryname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txtcategoryname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 234, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item Category");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 32));

        txtcategoryno.setEditable(false);
        txtcategoryno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcategoryno.setForeground(new java.awt.Color(102, 102, 102));
        txtcategoryno.setText("F1");
        txtcategoryno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcategorynoKeyPressed(evt);
            }
        });
        jPanel2.add(txtcategoryno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, -1));

        chbitems.setBorder(null);
        jPanel2.add(chbitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 20, -1));

        btnviewitem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnviewitem.setText("View tems");
        btnviewitem.setActionCommand("");
        btnviewitem.setBorder(null);
        btnviewitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewitemActionPerformed(evt);
            }
        });
        jPanel2.add(btnviewitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 230, 30));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 79, 470, 117));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Item Alert To BinLocation");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 310, -1));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1180, 50));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtrackno.setEditable(false);
        txtrackno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtrackno.setForeground(new java.awt.Color(102, 102, 102));
        txtrackno.setText("F1");
        txtrackno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtracknoKeyPressed(evt);
            }
        });
        jPanel5.add(txtrackno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Set Bin Location");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 32));

        txtrackname.setEditable(false);
        txtrackname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtrackname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtracknameKeyPressed(evt);
            }
        });
        jPanel5.add(txtrackname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 234, -1));

        kGradientPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 79, 470, 117));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total Items");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 80, -1));

        txttotaltbl1.setEditable(false);
        txttotaltbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel6.add(txttotaltbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 93, -1));

        kGradientPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 702, 470, 49));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total Items");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 80, -1));

        totaltbl2.setEditable(false);
        totaltbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel7.add(totaltbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, -1));

        btnupdate.setText("Update");
        btnupdate.setActionCommand("");
        btnupdate.setBorder(null);
        btnupdate.setBorderPainted(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel7.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 80, 30));

        btnclose.setText("Close");
        btnclose.setBorder(null);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        jPanel7.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 80, 30));

        btnnew.setText("New");
        btnnew.setBorder(null);
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel7.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 80, 30));

        kGradientPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 700, 470, 49));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1180, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   LocationSearch bj = new LocationSearch(null,true);
    private void txtdepartmentnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartmentnoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            bj.setVisible(true);
            txtdepartmentno.setText(bj.id);
            txtdepartmentname.setText(bj.name);

        }
    }//GEN-LAST:event_txtdepartmentnoKeyReleased
    CategorySearch cs = new CategorySearch(null,true);
    private void txtcategorynoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcategorynoKeyPressed
          if (evt.getKeyCode() == KeyEvent.VK_F1) {
            cs.dpno = txtdepartmentno.getText();
            cs.setVisible(true);
            txtcategoryno.setText(cs.id);
            txtcategoryname.setText(cs.name);

        }
    }//GEN-LAST:event_txtcategorynoKeyPressed
    
    BinLocationSearch bin = new BinLocationSearch(null,true);
    private void txtracknameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtracknameKeyPressed
      
    }//GEN-LAST:event_txtracknameKeyPressed

    private void txtracknoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtracknoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {

            bin.setVisible(true);
            txtrackno.setText(bin.id);
            txtrackname.setText(bin.name);

        }
    }//GEN-LAST:event_txtracknoKeyPressed
    
    public void countrowstbl1()
    {       
            DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
            int rows = model1.getRowCount();
            txttotaltbl1.setText(Integer.toString(rows));
    }
    
        public void countrowstbl2()
    {       
            DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
            int rows = model1.getRowCount();
            totaltbl2.setText(Integer.toString(rows));
    }
    
    private void btnviewitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewitemActionPerformed
      
        try{
            ManageItem item = new ManageItem();
            ManageBin bin = new ManageBin();
            ResultSet result = null;
            ResultSet rs = null;
            if(chbitems.isSelected())
            {
                result = item.loadItem();
            }else{
                result = item.loadItembyCategoryandDepartment(txtdepartmentno.getText(),txtcategoryno.getText());
            }

            DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
            int rows = model1.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {
                model1.removeRow(i);
            }

            DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
            int i =1;
            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("code"));
                vec.add(result.getString("itemName"));
                rs = bin.getnamebyid(result.getString("Bcode"));
                i++;
                
                  while(rs.next())
                  {
                       vec.add(rs.getString("name"));
                  }              
                
                model.addRow(vec);
            }
            tbl1.setModel(model);
            
            
            //set count into text boxes
            countrowstbl1();countrowstbl2();
            
            
            
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnviewitemActionPerformed
      String NO = "";
      String DESCRIPTION = "";
      String ItemAlert = "";
    private void btnonebyoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnonebyoneActionPerformed
        
        if(txtrackname.getText().length()!=0)
        {
        DefaultTableModel DtM = (DefaultTableModel)tbl1.getModel();
       int selectedrowindex = tbl1.getSelectedRow();
       NO =  (DtM.getValueAt(selectedrowindex , 0).toString());
       DESCRIPTION =  (DtM.getValueAt(selectedrowindex , 1).toString());
       ItemAlert = txtrackname.getText();
       
       
       DtM.removeRow(selectedrowindex);
    
        DefaultTableModel model = (DefaultTableModel) tbl2.getModel();       
                Vector vec = new Vector();
                vec.add(NO);
                vec.add(DESCRIPTION);
                vec.add(ItemAlert);
                model.addRow(vec);
                tbl2.setModel(model);
                countrowstbl1();
                countrowstbl2();
        }
        
        else
        {
           JOptionPane.showMessageDialog(null, "Please Set the Bin Location First ", "CO-OP City Supermmarket", JOptionPane.INFORMATION_MESSAGE);
        }
            

        
       
       
    }//GEN-LAST:event_btnonebyoneActionPerformed

    private void btnallitemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnallitemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnallitemKeyPressed

    private void btnallitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallitemActionPerformed
        
        if(txtrackname.getText().length()!=0)
        {
        try {
            ManageItem item = new ManageItem();
            ManageBin bin = new ManageBin();
            ResultSet result = null;

            if (chbitems.isSelected()) {
                result = item.loadItem();
            } else {
                result = item.loadItembyCategoryandDepartment(txtdepartmentno.getText(), txtcategoryno.getText());

            }
        
            
            
                        //clearing prebious model data
            DefaultTableModel model1 = (DefaultTableModel) tbl1.getModel();
            int rows = model1.getRowCount();
            for (int i = rows - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
    
            
            
            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"No", "Desciption","Bin Location"});
            ItemAlert = txtrackname.getText();
            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("code"));
                vec.add(result.getString("itemName"));
                vec.add(ItemAlert);
                model.addRow(vec);
            }

            tbl2.setModel(model);
            
            countrowstbl1();
            countrowstbl2();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
        else
        {
          JOptionPane.showMessageDialog(null, "Please Set the Bin Location First ", "CO-OP City Supermmarket", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnallitemActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        clearAll();    
    }//GEN-LAST:event_btnnewActionPerformed

    public void clearAll(){
        DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
        model.setRowCount(0);
            
        DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
        model1.setRowCount(0);
        
        txtdepartmentno.setText("F1");
        txtdepartmentname.setText("");
        txtcategoryno.setText("F1");
        txtcategoryname.setText("");
        txtrackno.setText("F1");
        txtrackname.setText("");
        
        countrowstbl1();
        countrowstbl2();
    }
    
    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
      this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed
 
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        ManageItem item = new ManageItem();
        ManageBin bin = new ManageBin();
                
       DefaultTableModel DtM = (DefaultTableModel)tbl2.getModel();
       int RowCount = tbl2.getRowCount();
       
       //declare  correct updated items count
       int correctcount = 0;
       
       for(int i = 0; i <= RowCount-1; i++   )
       {
        String iNO =  (DtM.getValueAt(i , 0).toString());
        String bloc =  (DtM.getValueAt(i , 2).toString());
        
        int id = bin.getidbytype(bloc);
         int check = item.UpdateItem( id, iNO );
         
         if(check==1)
         {
             correctcount ++;
         }
         
         
       }
       
       if(correctcount == RowCount)
       {
          JOptionPane.showMessageDialog(null, "Updated Successfully", "SuperMArket", JOptionPane.INFORMATION_MESSAGE);
          clearAll();
       }
       else
       {
          JOptionPane.showMessageDialog(null, "Updated Successfully", "SuperMArket", JOptionPane.INFORMATION_MESSAGE);
       }
       
    

        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtdepartmentnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartmentnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartmentnoActionPerformed

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
            java.util.logging.Logger.getLogger(ItemAlerttoBinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemAlerttoBinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemAlerttoBinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemAlerttoBinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ItemAlerttoBinLocation dialog = new ItemAlerttoBinLocation(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnallitem;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnonebyone;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnviewitem;
    private javax.swing.JCheckBox chbitems;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField totaltbl2;
    private javax.swing.JTextField txtcategoryname;
    private javax.swing.JTextField txtcategoryno;
    private javax.swing.JTextField txtdepartmentname;
    private javax.swing.JTextField txtdepartmentno;
    private javax.swing.JTextField txtrackname;
    private javax.swing.JTextField txtrackno;
    private javax.swing.JTextField txttotaltbl1;
    // End of variables declaration//GEN-END:variables
}
