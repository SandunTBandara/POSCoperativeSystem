
package view.BasicInformation;

import controller.ManageCreditCustomer;
import controller.ManageLoyalityCustomer;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LoyalityMemberSearch extends javax.swing.JDialog {

    public LoyalityMemberSearch(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadcreditcustomer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBinLocationsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcreditcus = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search Loyality Member");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, 30));

        txtBinLocationsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBinLocationsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtBinLocationsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 310, 30));

        tblcreditcus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblcreditcus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Name", "Total Points", "Barcode no", "Card Type"
            }
        ));
        tblcreditcus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcreditcusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcreditcus);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 600, 300));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBinLocationsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBinLocationsearchKeyReleased
        try {

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_txtBinLocationsearchKeyReleased

     public void loadcreditcustomer()
    {
        try{
            ResultSet result = null;
            ManageLoyalityCustomer mc1 = new ManageLoyalityCustomer();
            result = mc1.getAll();

            DefaultTableModel model = (DefaultTableModel) tblcreditcus.getModel();

            while(result.next())
            {
              Vector vec = new Vector();
              vec.add(result.getString("memberId"));
              vec.add(result.getString("Name"));
              vec.add(result.getDouble("totalpoints"));
              vec.add(result.getString("barcode"));
              vec.add(result.getString("Lcode"));

              model.addRow(vec);


            }
            tblcreditcus.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    String id="";
    String name="";
    double points=0;
    String barcode="";
    String type="";
    private void tblcreditcusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcreditcusMouseClicked

        try{
            DefaultTableModel DtM = (DefaultTableModel)tblcreditcus.getModel();
            int selectedrowindex = tblcreditcus.getSelectedRow();
            
            id =  DtM.getValueAt(selectedrowindex , 0).toString();
            name =  (DtM.getValueAt(selectedrowindex , 1).toString());
            points =  Double.valueOf(DtM.getValueAt(selectedrowindex , 2).toString());
            barcode =  (DtM.getValueAt(selectedrowindex , 3).toString());
            type =  (DtM.getValueAt(selectedrowindex , 4).toString());
            
            this.dispose();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblcreditcusMouseClicked

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
            java.util.logging.Logger.getLogger(LoyalityMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoyalityMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoyalityMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoyalityMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoyalityMemberSearch dialog = new LoyalityMemberSearch(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblcreditcus;
    private javax.swing.JTextField txtBinLocationsearch;
    // End of variables declaration//GEN-END:variables
}
