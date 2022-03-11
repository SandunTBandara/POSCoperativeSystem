/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BasicInformation;

import controller.ManageDepartment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class LocationSearch extends javax.swing.JDialog {

    public LocationSearch(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loaddepartment();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Search Department");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 30));

        txtdepartmentsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdepartmentsearchKeyPressed(evt);
            }
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
                "Department No", "Desciption"
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

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 430, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public String name = "";
     public String id = "";
     
    private void department1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_department1MouseClicked
       DefaultTableModel DtM = (DefaultTableModel)department1.getModel();
       int selectedrowindex = department1.getSelectedRow();
       id =  (DtM.getValueAt(selectedrowindex , 0).toString());
       name =  (DtM.getValueAt(selectedrowindex , 1).toString());
       
       this.dispose();
       
       
       
    }//GEN-LAST:event_department1MouseClicked

    private void txtdepartmentsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartmentsearchKeyReleased

    }//GEN-LAST:event_txtdepartmentsearchKeyReleased
    
    
    private void loaddepartment()
    {
       try{
       ManageDepartment cap = new ManageDepartment();
       ResultSet result = cap.loaddepartment();
       
         DefaultTableModel model = (DefaultTableModel) department1.getModel();

            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("dno"));
                vec.add(result.getString("Description"));
              
                model.addRow(vec);
            }

            department1.setModel(model);
       
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage());
       
       }
    
    
    
    
    }
    private void txtdepartmentsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdepartmentsearchKeyPressed
                       try {
            ManageDepartment dep = new ManageDepartment();
            ResultSet result = dep.loaddepartmentsearch(txtdepartmentsearch.getText());

            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"Department No", "Desciption"});

            while (result.next()) {
                Vector vec = new Vector();
                vec.add(result.getString("dno"));
                vec.add(result.getString("Description"));
                model.addRow(vec);
            }

            department1.setModel(model);
        }

        catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_txtdepartmentsearchKeyPressed

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
            java.util.logging.Logger.getLogger(LocationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocationSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LocationSearch dialog = new LocationSearch(new javax.swing.JFrame(), true);
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
