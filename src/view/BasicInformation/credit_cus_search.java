
package view.BasicInformation;

import controller.ManageCreditCustomer;
import controller.ManageCreditInformation;
import java.awt.Window;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class credit_cus_search extends javax.swing.JDialog {

    public credit_cus_search(java.awt.Frame parent, boolean modal) {
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search Credit customer");
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
                "NO", "Customer", "Id number", "Credit Type"
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

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

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
            ManageCreditCustomer mc1 = new ManageCreditCustomer();
            result = mc1.viewcreditcustomer();

            DefaultTableModel model = (DefaultTableModel) tblcreditcus.getModel();

            while(result.next())
            {
              Vector vec = new Vector();
              vec.add(result.getInt("CusNo"));
              vec.add(result.getString("name"));
              vec.add(result.getString("NIC"));
              vec.add(result.getString("ccode"));

              model.addRow(vec);


            }
            tblcreditcus.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(getVisibleContent(),"Error", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    String name ="";
    int id = 0;
    String nic="";
    int cType = 0;
    String cName="";
    
    private void tblcreditcusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcreditcusMouseClicked
        
        try{
            DefaultTableModel DtM = (DefaultTableModel)tblcreditcus.getModel();
            int selectedrowindex = tblcreditcus.getSelectedRow();
            id =  Integer.valueOf(DtM.getValueAt(selectedrowindex , 0).toString());
            name =  (DtM.getValueAt(selectedrowindex , 1).toString());
            nic =  (DtM.getValueAt(selectedrowindex , 2).toString());
            cType =  Integer.valueOf(DtM.getValueAt(selectedrowindex , 3).toString());
            ManageCreditInformation type = new ManageCreditInformation();
            cName = type.loadCreditTypeName(cType);
        this.dispose(); 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(getVisibleContent(),"Error", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblcreditcusMouseClicked

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
            java.util.logging.Logger.getLogger(credit_cus_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(credit_cus_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(credit_cus_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(credit_cus_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                credit_cus_search dialog = new credit_cus_search(new javax.swing.JFrame(), true);
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
