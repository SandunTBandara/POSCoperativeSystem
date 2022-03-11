
package view.BasicInformation;

import controller.ManageCreditCustomer;
import controller.ManageLoyalityCard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class LoyalityCardSearch extends javax.swing.JDialog {

    public LoyalityCardSearch(java.awt.Frame parent, boolean modal) {
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
        txtdepartmentsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        department1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search Loyality");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 30));

        txtdepartmentsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdepartmentsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtdepartmentsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, 30));

        department1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        department1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Card No", "Type Name"
            }
        ));
        department1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                department1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(department1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 390, 180));

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

     public void loadcreditcustomer()
    {
        try{
            ResultSet result = null;
            ManageLoyalityCard mc1 = new ManageLoyalityCard();
            result = mc1.getloyalityCord();

            DefaultTableModel model = (DefaultTableModel) department1.getModel();

            while(result.next())
            {
                Vector vec = new Vector();
                vec.add(result.getString("Lcode"));
                vec.add(result.getString("ICname"));

                model.addRow(vec);

            }
            department1.setModel(model);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtdepartmentsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartmentsearchKeyReleased
//        try {
//            ManageLoyalityCard dep = new ManageLoyalityCard();
//            ResultSet result = dep.Viewcategorytable(txtdepartmentsearch.getText(),dpno);
//
//            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"Category No", "Name"});
//
//            while (result.next()) {
//                Vector vec = new Vector();
//                vec.add(result.getString("cno"));
//                vec.add(result.getString("category"));
//                model.addRow(vec);
//            }
//
//            department1.setModel(model);
//        }
//
//        catch (SQLException e) {
//            System.out.println("Error" + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage());
//        }
    }//GEN-LAST:event_txtdepartmentsearchKeyReleased
    
    String id="";
    String name ="";
    private void department1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_department1MouseClicked
        DefaultTableModel DtM = (DefaultTableModel)department1.getModel();
        int selectedrowindex = department1.getSelectedRow();
        id =  (DtM.getValueAt(selectedrowindex , 0).toString());
        name =  (DtM.getValueAt(selectedrowindex , 1).toString());

        this.dispose();
    }//GEN-LAST:event_department1MouseClicked

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
            java.util.logging.Logger.getLogger(LoyalityCardSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoyalityCardSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoyalityCardSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoyalityCardSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoyalityCardSearch dialog = new LoyalityCardSearch(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable department1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtdepartmentsearch;
    // End of variables declaration//GEN-END:variables
}
