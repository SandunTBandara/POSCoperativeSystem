
package view.EntryNotes;

import controller.ManageGoodReceiveNote;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SearchGRN extends javax.swing.JDialog {

    ManageGoodReceiveNote manage = new ManageGoodReceiveNote();
    
    public SearchGRN(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadGRN();
    }
    
    public void loadGRN()
    {
       try{
       ResultSet result = manage.displaySavedGRN();
       
         DefaultTableModel model = (DefaultTableModel) grn.getModel();

            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("F16No"));
                vec.add(result.getString("date"));
              
                model.addRow(vec);
            }

            grn.setModel(model);
       
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage());
       
       }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        grnNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grn = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        searchDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Search by Date : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 130, 20));

        grnNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grnNoKeyReleased(evt);
            }
        });
        jPanel1.add(grnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 25));

        grn.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        grn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN No", "Date"
            }
        ));
        grn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grn);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 390, 180));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Search by name : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        searchDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchDateKeyReleased(evt);
            }
        });
        jPanel1.add(searchDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 25));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grnNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnNoKeyReleased
        try {
            ResultSet result = manage.searchGRN(String.valueOf(grnNo.getText()));

            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"GRN No", "Date"});

            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("F16No"));
                vec.add(result.getString("date"));
                model.addRow(vec);
            }

            grn.setModel(model);
        }catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_grnNoKeyReleased

    String code ;
    String dates ;
    private void grnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnMouseClicked
        DefaultTableModel DtM = (DefaultTableModel)grn.getModel();
        int selectedrowindex = grn.getSelectedRow();
        code =  (DtM.getValueAt(selectedrowindex , 0).toString());
        dates = (DtM.getValueAt(selectedrowindex , 1).toString());

        this.dispose();
    }//GEN-LAST:event_grnMouseClicked

    private void searchDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchDateKeyReleased
        try {
            ResultSet result = manage.searchGRNByDate(Date.valueOf(searchDate.getText()));

            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"GRN No", "Date"});

            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("F16No"));
                vec.add(result.getString("date"));
                model.addRow(vec);
            }

            grn.setModel(model);
        }catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_searchDateKeyReleased

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
            java.util.logging.Logger.getLogger(SearchGRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchGRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchGRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchGRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchGRN dialog = new SearchGRN(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable grn;
    private javax.swing.JTextField grnNo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField searchDate;
    // End of variables declaration//GEN-END:variables
}
