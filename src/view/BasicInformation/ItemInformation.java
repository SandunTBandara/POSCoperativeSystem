/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.BasicInformation;

import controller.ManageItem;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHADHANI
 */
public class ItemInformation extends javax.swing.JDialog {

    /**
     * Creates new form ItemInformation
     */
    public ItemInformation(java.awt.Frame parent, boolean modal) {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtitno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsinhalaname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMargin = new javax.swing.JTextField();
        txtdno5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdno6 = new javax.swing.JTextField();
        txtbarcode = new javax.swing.JTextField();
        txtdno9 = new javax.swing.JTextField();
        txtdno10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdno11 = new javax.swing.JTextField();
        txtdno12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdno13 = new javax.swing.JTextField();
        txtdno14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtdno16 = new javax.swing.JTextField();
        txtdno17 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtdno18 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtdno19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtdno20 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbweight = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btndpsave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtdno1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdno2 = new javax.swing.JTextField();

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
        jLabel1.setText("Item Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 270, 30));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Item Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        txtitno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitnoActionPerformed(evt);
            }
        });
        txtitno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitnoKeyPressed(evt);
            }
        });
        jPanel2.add(txtitno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 25));

        jLabel8.setText("Item Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 20));

        txtitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtitemnameActionPerformed(evt);
            }
        });
        txtitemname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtitemnameKeyPressed(evt);
            }
        });
        jPanel2.add(txtitemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 340, 25));

        jLabel9.setText("sinhala name ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 30));

        txtsinhalaname.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtsinhalaname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsinhalanameActionPerformed(evt);
            }
        });
        txtsinhalaname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsinhalanameKeyPressed(evt);
            }
        });
        jPanel2.add(txtsinhalaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 340, 30));

        jLabel11.setText("Weight");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 60, 30));

        jLabel12.setText("Margin");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 70, 30));

        txtMargin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarginActionPerformed(evt);
            }
        });
        txtMargin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarginKeyPressed(evt);
            }
        });
        jPanel2.add(txtMargin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 90, 25));

        txtdno5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno5ActionPerformed(evt);
            }
        });
        txtdno5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno5KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 210, 25));

        jLabel10.setText("Bar Code");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 30));

        jLabel13.setText("Department");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 40));

        txtdno6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno6ActionPerformed(evt);
            }
        });
        txtdno6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno6KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 50, 25));

        txtbarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarcodeActionPerformed(evt);
            }
        });
        txtbarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbarcodeKeyPressed(evt);
            }
        });
        jPanel2.add(txtbarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, 25));

        txtdno9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno9ActionPerformed(evt);
            }
        });
        txtdno9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno9KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 210, 25));

        txtdno10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno10ActionPerformed(evt);
            }
        });
        txtdno10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno10KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 50, 25));

        jLabel14.setText("Category");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 90, 30));

        txtdno11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno11ActionPerformed(evt);
            }
        });
        txtdno11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno11KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, 25));

        txtdno12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno12ActionPerformed(evt);
            }
        });
        txtdno12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno12KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 50, 25));

        jLabel15.setText("Supplier");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 30));

        txtdno13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno13ActionPerformed(evt);
            }
        });
        txtdno13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno13KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 210, 25));

        txtdno14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno14ActionPerformed(evt);
            }
        });
        txtdno14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno14KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 50, 25));

        jLabel16.setText("Bin Location");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, 30));

        jLabel18.setText("Cost Price");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 20));

        txtdno16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno16ActionPerformed(evt);
            }
        });
        txtdno16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno16KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 100, 25));

        txtdno17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno17ActionPerformed(evt);
            }
        });
        txtdno17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno17KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 100, 25));

        jLabel20.setText("Reorder Qty");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 120, 30));

        txtdno18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno18ActionPerformed(evt);
            }
        });
        txtdno18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno18KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 100, 25));

        jLabel21.setText("Max Quantity");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 120, 20));

        txtdno19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno19ActionPerformed(evt);
            }
        });
        txtdno19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno19KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 25));

        jLabel22.setText("Selling Price");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 20));

        txtdno20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno20ActionPerformed(evt);
            }
        });
        txtdno20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno20KeyPressed(evt);
            }
        });
        jPanel2.add(txtdno20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 25));

        jLabel2.setText("%");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 20, 30));

        jLabel19.setText("Reorder Level");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 120, -1));

        cmbweight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " -", "Yes", "No" }));
        jPanel2.add(cmbweight, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 90, -1));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 790, 350));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("  Close");
        jButton1.setActionCommand("");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, 110, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setText("  New");
        jButton2.setActionCommand("");
        jButton2.setBorder(null);
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 110, 30));

        btndpsave.setBackground(new java.awt.Color(204, 255, 204));
        btndpsave.setText("  Save");
        btndpsave.setActionCommand("");
        btndpsave.setBorder(null);
        btndpsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndpsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btndpsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 110, 30));

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

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 830, 20));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Code", "Location", "Total Stock", "NonSell Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 90));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 790, 110));

        txtdno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno1ActionPerformed(evt);
            }
        });
        txtdno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno1KeyPressed(evt);
            }
        });
        kGradientPanel1.add(txtdno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 250, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 20));

        txtdno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdno2ActionPerformed(evt);
            }
        });
        txtdno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdno2KeyPressed(evt);
            }
        });
        kGradientPanel1.add(txtdno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtitnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitnoActionPerformed
      ItemList it = new ItemList(null,true);
    private void txtitnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitnoKeyPressed
              if (evt.getKeyCode() == KeyEvent.VK_F1) {

            it.setVisible(true);
            txtitno.setText(it.No);
           // txtdname.setText(bj.name);
           
           
           //pass item code to manage item class
           ManageItem ManageItem1 = new ManageItem();
           
           
           ResultSet result = ManageItem1.selectItemdata(Integer.parseInt(it.No));
           
                  try {
                      //put values into text field
                      while(result.next())
                      {
                          txtitemname.setText(result.getString("itemName"));
                          txtsinhalaname.setText(result.getString("sinhalaName"));
                          txtbarcode.setText(result.getString("barcode"));
                          
                          System.out.println(result.getString("weight"));
                         //String weight
                          if(result.getString("weight") == "yes")
                          {
                              cmbweight.setSelectedItem(1);
                              
                          }
                          else if(result.getString("weight") == "no")
                          {
                            cmbweight.setSelectedItem(0);
                          }
                          
                      }    
                  
                  } catch (SQLException e) {
                      System.out.println(e.getMessage());
                  }
           
           
           
           

        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
           // txtdno.setText("");
           // txtdname.setText("");

        }                  
    }//GEN-LAST:event_txtitnoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndpsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpsaveActionPerformed

    }//GEN-LAST:event_btndpsaveActionPerformed

    private void kGradientPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kGradientPanel1FocusGained

    }//GEN-LAST:event_kGradientPanel1FocusGained

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed

    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void txtdno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno1ActionPerformed

    private void txtdno1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno1KeyPressed

    private void txtdno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno2ActionPerformed

    private void txtdno2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno2KeyPressed

    private void txtitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtitemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemnameActionPerformed

    private void txtitemnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitemnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemnameKeyPressed

    private void txtsinhalanameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsinhalanameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsinhalanameActionPerformed

    private void txtsinhalanameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsinhalanameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsinhalanameKeyPressed

    private void txtMarginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarginActionPerformed

    private void txtMarginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarginKeyPressed

    private void txtdno5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno5ActionPerformed

    private void txtdno5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno5KeyPressed

    private void txtdno6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno6ActionPerformed

    private void txtdno6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno6KeyPressed

    private void txtbarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarcodeActionPerformed

    private void txtbarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbarcodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarcodeKeyPressed

    private void txtdno9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno9ActionPerformed

    private void txtdno9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno9KeyPressed

    private void txtdno10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno10ActionPerformed

    private void txtdno10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno10KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno10KeyPressed

    private void txtdno11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno11ActionPerformed

    private void txtdno11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno11KeyPressed

    private void txtdno12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno12ActionPerformed

    private void txtdno12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno12KeyPressed

    private void txtdno13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno13ActionPerformed

    private void txtdno13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno13KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno13KeyPressed

    private void txtdno14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno14ActionPerformed

    private void txtdno14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno14KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno14KeyPressed

    private void txtdno16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno16ActionPerformed

    private void txtdno16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno16KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno16KeyPressed

    private void txtdno17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno17ActionPerformed

    private void txtdno17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno17KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno17KeyPressed

    private void txtdno18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno18ActionPerformed

    private void txtdno18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno18KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno18KeyPressed

    private void txtdno19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno19ActionPerformed

    private void txtdno19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno19KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno19KeyPressed

    private void txtdno20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdno20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno20ActionPerformed

    private void txtdno20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdno20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdno20KeyPressed

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
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ItemInformation dialog = new ItemInformation(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbweight;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public javax.swing.JTextField txtMargin;
    public javax.swing.JTextField txtbarcode;
    public javax.swing.JTextField txtdno1;
    public javax.swing.JTextField txtdno10;
    public javax.swing.JTextField txtdno11;
    public javax.swing.JTextField txtdno12;
    public javax.swing.JTextField txtdno13;
    public javax.swing.JTextField txtdno14;
    public javax.swing.JTextField txtdno16;
    public javax.swing.JTextField txtdno17;
    public javax.swing.JTextField txtdno18;
    public javax.swing.JTextField txtdno19;
    public javax.swing.JTextField txtdno2;
    public javax.swing.JTextField txtdno20;
    public javax.swing.JTextField txtdno5;
    public javax.swing.JTextField txtdno6;
    public javax.swing.JTextField txtdno9;
    public javax.swing.JTextField txtitemname;
    public javax.swing.JTextField txtitno;
    public javax.swing.JTextField txtsinhalaname;
    // End of variables declaration//GEN-END:variables
}