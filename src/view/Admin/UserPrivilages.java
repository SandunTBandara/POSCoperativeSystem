
package view.Admin;

import controller.ManageUser;
import java.sql.ResultSet;
import java.util.Vector;
import javafx.scene.control.CheckBox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;

public class UserPrivilages extends javax.swing.JDialog {
    
    User user = new User();
    ManageUser manage = new ManageUser(user);
    
    public UserPrivilages(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadUser();
    }

    public void loadUser(){
        try{
            ResultSet rs = manage.selectUsers();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();            

            while(rs.next()){
                Vector vec = new Vector();
                vec.add(rs.getString("userID"));
                vec.add(rs.getInt("bi_cus") == 1 ? true: false);
                vec.add(rs.getInt("bi_credit") == 1 ? true: false);
                vec.add(rs.getInt("bi_dep") == 1 ? true: false);
                vec.add(rs.getInt("bi_sup") == 1 ? true: false);
                vec.add(rs.getInt("bi_store") == 1 ? true: false);
                vec.add(rs.getInt("bi_cat") == 1 ? true: false);
                vec.add(rs.getInt("bi_item") == 1 ? true: false);
                vec.add(rs.getInt("bi_binLoc") == 1 ? true: false);
                vec.add(rs.getInt("bi_itemAlert") == 1 ? true: false);
                vec.add(rs.getInt("bi_loyMember") == 1 ? true: false);
                vec.add(rs.getInt("bi_loyCard") == 1 ? true: false);
                vec.add(rs.getInt("bi_grn") == 1 ? true: false);
                vec.add(rs.getInt("en_order") == 1 ? true: false);
                vec.add(rs.getInt("en_orderReturn") == 1 ? true: false);
                vec.add(rs.getInt("en_exchange") == 1 ? true: false);
                vec.add(rs.getInt("en_supInvoice") == 1 ? true: false);
                vec.add(rs.getInt("en_disposal") == 1 ? true: false);
                vec.add(rs.getInt("en_price") == 1 ? true: false);
                vec.add(rs.getInt("en_cashier") == 1 ? true: false);
                vec.add(rs.getInt("en_reports") == 1 ? true: false);
                model.addRow(vec);
            }

            table.setModel(model);
            
        }catch(Exception e)
        {
           System.out.println("line 1242: " +e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Customer", "Credit", "Departmetn", "Supllier", "Store", "Cateogry", "Item", "Bin Location", "Item Alert", "Loyality Member", "Loyality Card", "GRN", "Purchase Order", "Purchase Return", "Exchange", "Supllier Invoice", "Disposal Item", "Item Price Change", "Cashier", "Reports"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(8).setResizable(false);
            table.getColumnModel().getColumn(9).setResizable(false);
            table.getColumnModel().getColumn(10).setResizable(false);
            table.getColumnModel().getColumn(11).setResizable(false);
            table.getColumnModel().getColumn(12).setResizable(false);
            table.getColumnModel().getColumn(13).setResizable(false);
            table.getColumnModel().getColumn(14).setResizable(false);
            table.getColumnModel().getColumn(15).setResizable(false);
            table.getColumnModel().getColumn(16).setResizable(false);
            table.getColumnModel().getColumn(17).setResizable(false);
            table.getColumnModel().getColumn(18).setResizable(false);
            table.getColumnModel().getColumn(19).setResizable(false);
            table.getColumnModel().getColumn(20).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 660, 320));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 700, 360));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Privilage Manager");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 330, 30));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, 30));

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 120, 25));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadUserPrivilages(){
        try{ 
            
        }catch(Exception e)        {
           System.out.println("line 170: " +e.getMessage());
        }
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
//        DefaultTableModel DtM = (DefaultTableModel)table.getModel();
//        int selectedrowindex = table.getSelectedRow();
//        code =  (DtM.getValueAt(selectedrowindex , 0).toString());
//        name =  (DtM.getValueAt(selectedrowindex , 1).toString());

//        this.dispose();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();            
            int rows = table.getRowCount();
            int col = table.getColumnCount();
            int c=0;
            System.out.println(rows + " " + col);
            for(int i=0; i<rows; i++){
                                System.out.println(String.valueOf(dtm.getValueAt(i, 0).toString()));
                for(int j=0; j<col; j++){
                    System.out.println(Boolean.valueOf(dtm.getValueAt(i, j).toString())? 1: 0);
                }
                
                int col1 = Boolean.valueOf(dtm.getValueAt(i, 1).toString())? 1: 0;
                int col2 = Boolean.valueOf(dtm.getValueAt(i, 2).toString())? 1: 0;
                int col3 = Boolean.valueOf(dtm.getValueAt(i, 3).toString())? 1: 0;
                int col4 = Boolean.valueOf(dtm.getValueAt(i, 4).toString())? 1: 0;
                int col5 = Boolean.valueOf(dtm.getValueAt(i, 5).toString())? 1: 0;
                int col6 = Boolean.valueOf(dtm.getValueAt(i, 6).toString())? 1: 0;
                int col7 = Boolean.valueOf(dtm.getValueAt(i, 7).toString())? 1: 0;
                int col8 = Boolean.valueOf(dtm.getValueAt(i, 8).toString())? 1: 0;
                int col9 = Boolean.valueOf(dtm.getValueAt(i, 9).toString())? 1: 0;
                int col10 = Boolean.valueOf(dtm.getValueAt(i, 10).toString())? 1: 0;
                int col11 = Boolean.valueOf(dtm.getValueAt(i, 11).toString())? 1: 0;
                int col12 = Boolean.valueOf(dtm.getValueAt(i, 12).toString())? 1: 0;
                int col13 = Boolean.valueOf(dtm.getValueAt(i, 13).toString())? 1: 0;
                int col14 = Boolean.valueOf(dtm.getValueAt(i, 14).toString())? 1: 0;
                int col15 = Boolean.valueOf(dtm.getValueAt(i, 15).toString())? 1: 0;
                int col16 = Boolean.valueOf(dtm.getValueAt(i, 16).toString())? 1: 0;
                int col17 = Boolean.valueOf(dtm.getValueAt(i, 17).toString())? 1: 0;
                int col18 = Boolean.valueOf(dtm.getValueAt(i, 18).toString())? 1: 0;
                int col19 = Boolean.valueOf(dtm.getValueAt(i, 19).toString())? 1: 0;             
                int col20 = Boolean.valueOf(dtm.getValueAt(i, 20).toString())? 1: 0;
                    
                user.setPrivilages(col1, col2, col3, col4, col5, col6, col7, col8,col9, col10, col11, col12,col13, col14, col15, col16, col17, col18, col19, col20 );
//                user.setPrivilages( Boolean.valueOf(dtm.getValueAt(i, 1).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 2).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 3).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 4).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 5).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 6).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 7).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 8).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 9).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 10).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 11).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 12).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 13).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 14).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 15).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 16).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 17).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 18).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 19).toString())? 1: 0,Boolean.valueOf(dtm.getValueAt(i, 20).toString())? 1: 0);
                int r = manage.updateUserPrivilage(dtm.getValueAt(i, 0).toString());
                if(r==1){
                    ++c;
                }else{
                    break;
                }
            }
            
            if(c==rows){
                JOptionPane.showMessageDialog(null, "User Privilages has been updated succesfully ", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel) table.getModel();            
                model.setRowCount(0);
                loadUser();
            }else{
                JOptionPane.showMessageDialog(null, "Error in updating user privilages", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(Exception e)
        {
           System.out.println("line 1242: " +e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserPrivilages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPrivilages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPrivilages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPrivilages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserPrivilages dialog = new UserPrivilages(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
