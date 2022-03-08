/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Report;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DB;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sanu
 */
public class Daily_Item_Price_Change_View extends javax.swing.JDialog {

    /**
     * Creates new form Daily_Item_Price_Change_View
     */
    public Daily_Item_Price_Change_View(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_generatereport = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        date_picker = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Day");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 137, 44));

        btn_generatereport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_generatereport.setText("Generate Report");
        btn_generatereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generatereportActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generatereport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 194, 56));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 155, 56));
        jPanel1.add(date_picker, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generatereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generatereportActionPerformed
        try {
            String date = "yyyy-MM-dd";
            date = date_picker.getDate().toString();
            Connection con = DB.createConnection();
            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Sanu\\Documents\\NetBeansProjects\\FinalProjectPOSSystem\\src\\view\\Report\\Daily_Price_Change_Report.jrxml");
            String query = "SELECT\n" +
"     pricechangeitems.`DecreasedPrice` AS pricechangeitems_DecreasedPrice,\n" +
"     pricechangeitems.`Lost` AS pricechangeitems_Lost,\n" +
"     pricechangeitems.`Profit` AS pricechangeitems_Profit,\n" +
"     item.`code` AS item_code,\n" +
"     item.`costPrice` AS item_costPrice,\n" +
"     item.`sellingPrice` AS item_sellingPrice,\n" +
"     item.`itemName` AS item_itemName,\n" +
"     pricechangeitems.`F17No` AS pricechangeitems_F17No,\n" +
"     pricechangeitems.`Qty` AS pricechangeitems_Qty,\n" +
"     pricechangeitems.`IncreasedPrice` AS pricechangeitems_IncreasedPrice\n" +
"FROM\n" +
"     `item` item INNER JOIN `pricechangeitems` pricechangeitems ON item.`code` = pricechangeitems.`Code` ,   `pricechange` pricechange,\n" +
"\n" +
"     `pricechange` pricechange_A where pricechange.`Date` = '"+date+"' ";
            System.out.println(date);
            
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);
            
             jdesign.setQuery(updateQuery);
             
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport,   null,con);
            
            JasperViewer.viewReport(jprint,false);
            
        }      
        catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_generatereportActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Daily_Item_Price_Change_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daily_Item_Price_Change_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daily_Item_Price_Change_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daily_Item_Price_Change_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Daily_Item_Price_Change_View dialog = new Daily_Item_Price_Change_View(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_generatereport;
    private com.github.lgooddatepicker.components.DatePicker date_picker;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
