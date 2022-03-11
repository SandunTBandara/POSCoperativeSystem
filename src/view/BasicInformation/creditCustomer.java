
package view.BasicInformation;

import Model.CreditCustomer;
import controller.ManageCategory;
import controller.ManageCreditCustomer;
import controller.ManageCreditInformation;
import controller.ManageItem;
import controller.ManageValidation;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DB;

public class creditCustomer extends javax.swing.JDialog {

    CreditCustomer cus = new CreditCustomer();
    ManageCreditCustomer manage = new ManageCreditCustomer(cus);
    
    public creditCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadType();
        generateID();
    }

    public void generateID(){
        try {
            int no= 0;
            ManageCreditCustomer manage = new ManageCreditCustomer();
            ResultSet rs = manage.viewcreditcustomer();
            while(rs.next()){
                no = rs.getInt("CusNo");
            } 

            if(no == 0){
                no = 1;
            }else if(no<1000){
                ++no;
            }            
            
            System.out.println(no);
            cusCode.setText(String.valueOf(no));
        } catch (Exception ex) {
            System.out.println("line 55" + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        credit = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cusCode = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        limit = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nonPaid = new javax.swing.JRadioButton();
        paid = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Customer Code:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Credit Type:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Credit Limit:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Customer ID:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Customer Tell:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Address:");

        cusCode.setEditable(false);
        cusCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cusCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cusCodeKeyPressed(evt);
            }
        });

        name.setEditable(false);
        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        type.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeKeyPressed(evt);
            }
        });

        limit.setEditable(false);
        limit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        limit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                limitKeyPressed(evt);
            }
        });

        nic.setEditable(false);
        nic.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nicKeyPressed(evt);
            }
        });

        tel.setEditable(false);
        tel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telKeyPressed(evt);
            }
        });

        addr.setEditable(false);
        addr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addrKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(cusCode, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addr, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(tel)
                                    .addComponent(nic)
                                    .addComponent(limit, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cusCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(limit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        credit.add(nonPaid);
        nonPaid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nonPaid.setSelected(true);
        nonPaid.setText("Non paid-uplist");
        jPanel2.add(nonPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, -1));

        credit.add(paid);
        paid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        paid.setText("Paid up list");
        jPanel2.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Bill No", "Date", "Bill Amt", "Credit Amt", "Paid Amt", "Bal Amt"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 106, 450, 177));

        jButton4.setText("View Customer History");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 67, -1, -1));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 87, 500, 309));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("                               Credit Customer Information ");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 760, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("New");
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 100, 30));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 100, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Close");
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 100, 30));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("F3 Edit");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 60, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("F1 Help");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("F2 New");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 20));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 930, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
            ManageCreditInformation info = new ManageCreditInformation();
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try{
            if(cusCode.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "customer code cannot be empty!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(name.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "Enter customer name!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(type.getSelectedIndex()== 0){
                JOptionPane.showMessageDialog(rootPane, "Please select the credit type!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(limit.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "please enter a credit limit!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(nic.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "Please enter the customer id!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(tel.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "Please enter a contact no!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(addr.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "Please enter customer address!","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                int typeId = info.loadCreditID(type.getSelectedItem().toString());
                System.out.println(typeId);

                
                if(btnsave.getText().equals("Save")){
                    CreditCustomer cus2 = new CreditCustomer();
                    cus2.setCreditCustomer(Integer.valueOf(cusCode.getText().toString()), name.getText(), typeId, Double.valueOf(limit.getText().toString()), nic.getText().toString(), Integer.valueOf(tel.getText().toString()), addr.getText());
                    ManageCreditCustomer manage2 = new ManageCreditCustomer(cus2);
                    int result = manage2.saveCustomer();

                    if(result == 1) {
                        JOptionPane.showMessageDialog(null, "Credit customer has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                        clearAll();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving Credit customer", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if(btnsave.getText().equals("Update")){
                    CreditCustomer cus2 = new CreditCustomer();
                    cus2.setCreditCustomer(Integer.valueOf(cusCode.getText().toString()), name.getText(), typeId, Double.valueOf(limit.getText().toString()), nic.getText().toString(), Integer.valueOf(tel.getText().toString()), addr.getText());
                    ManageCreditCustomer manage2 = new ManageCreditCustomer(cus2);
                    manage2.updateCredit(); 
                    clearAll();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("line 320" + e.getMessage());
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    public void loadType(){
        try{
            ResultSet rs = info.loadCreditCustomerType();
            type.addItem("-select-");
            while(rs.next()){
                type.addItem(rs.getString("TypeName"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    private void cusCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusCodeKeyPressed
        keyPress(evt);
    }//GEN-LAST:event_cusCodeKeyPressed

    public void keyPress(java.awt.event.KeyEvent evt){
        try{
            if (evt.getKeyCode() == KeyEvent.VK_F1) {
                credit_cus_search search = new credit_cus_search(null, true);
                search.setVisible(true);
                cusCode.setText(String.valueOf(search.id));
                name.setText(search.name);
                type.setSelectedItem(search.cName);
                nic.setText(search.nic);
                
                ResultSet result = manage.getcustomer(Integer.valueOf(cusCode.getText().toString()));

                while (result.next()){
                    limit.setText(result.getString("creditLimit"));
                    tel.setText(result.getString("telno"));
                    addr.setText(result.getString("address"));
                }

            }else if (evt.getKeyCode() == KeyEvent.VK_F2) {
                clearAll();
            }else if (evt.getKeyCode() == KeyEvent.VK_F3) {
                cusCode.setEditable(true);
                name.setEditable(true);
                type.setEditable(true);
                nic.setEditable(true);
                limit.setEditable(true);
                tel.setEditable(true);
                addr.setEditable(true);
                btnsave.setText("Update");
                btnsave.setEnabled(true);
            }else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                cusCode.setEditable(true);
                name.setEditable(true);
                type.setEditable(true);
                nic.setEditable(true);
                limit.setEditable(true);
                tel.setEditable(true);
                addr.setEditable(true);
                btnsave.setText("Save");
                btnsave.setEnabled(true);
            }
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            if(nonPaid.isSelected()){
                ResultSet rs = manage.loadNonPaidCreditInformation(Integer.valueOf(cusCode.getText().toString()));
                
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                
                while(rs.next()){
                    Vector vec =new Vector();
                    vec.add(4,rs.getDouble("totalPayAmount"));
                    vec.add(5,rs.getDouble("BalanceAmount"));
                    int code = rs.getInt("creditCode");
                    System.out.println("rs complete");
                    ResultSet rs2 = manage.loadGetCreditInformation(Integer.valueOf(cusCode.getText().toString()), code);
                    
                    while(rs2.next()){
                        vec.add(0,rs2.getString("invoiceNo"));
                        vec.add(3,rs2.getInt("creditAmount"));
                        ManageItem item = new ManageItem();
                    System.out.println("r2 complete");
                        ResultSet rs3 = item.getInvoiceByCode(rs2.getString("invoiceNo"));
                        
                        while(rs3.next()){
                            vec.add(1,rs2.getInt("Date"));
                            vec.add(2,rs2.getInt("subTotal"));
                    System.out.println("r3 complete");
                        }
                    }
                    model.addRow(vec);
                }
                jTable1.setModel(model);
            
            }else if(paid.isSelected()){
                
            }
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
       if(!(evt.getKeyCode() == KeyEvent.VK_F2) && !(evt.getKeyCode() == KeyEvent.VK_F3) && !(evt.getKeyCode() == KeyEvent.VK_F1) && !(evt.getKeyCode() == KeyEvent.VK_ENTER)){
           ManageValidation.validatorText2(name);
       }else{
           keyPress(evt);
       }
    }//GEN-LAST:event_nameKeyPressed

    private void limitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limitKeyPressed
       if(!(evt.getKeyCode() == KeyEvent.VK_F2) && !(evt.getKeyCode() == KeyEvent.VK_F3) && !(evt.getKeyCode() == KeyEvent.VK_F1) && !(evt.getKeyCode() == KeyEvent.VK_ENTER)){
           ManageValidation.validateNumber(limit, 7);
       }else{
           keyPress(evt);
       }
    }//GEN-LAST:event_limitKeyPressed

    private void nicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyPressed
        keyPress(evt);
    }//GEN-LAST:event_nicKeyPressed

    private void telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyPressed
        if(!(evt.getKeyCode() == KeyEvent.VK_F2) && !(evt.getKeyCode() == KeyEvent.VK_F3) && !(evt.getKeyCode() == KeyEvent.VK_F1) && !(evt.getKeyCode() == KeyEvent.VK_ENTER)){
           ManageValidation.validateNumber(tel, 10);
       }else{
           keyPress(evt);
       }
    }//GEN-LAST:event_telKeyPressed

    private void addrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addrKeyPressed
        keyPress(evt);
    }//GEN-LAST:event_addrKeyPressed

    private void typeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeKeyPressed
        keyPress(evt);
    }//GEN-LAST:event_typeKeyPressed

    public void clearAll(){
        cusCode.setText("");
        cusCode.setEditable(false);
        name.setText("");
        name.setEditable(false);
        type.setSelectedIndex(0);
        type.setEditable(false);
        nic.setText("");
        nic.setEditable(false);
        limit.setText("");
        limit.setEditable(false);
        tel.setText("");
        tel.setEditable(false);
        addr.setText("");
        addr.setEditable(false);
        btnsave.setText("Save");
        btnsave.setEnabled(false);
        generateID();
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                creditCustomer dialog = new creditCustomer(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField addr;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup credit;
    private javax.swing.JTextField cusCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField limit;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nic;
    private javax.swing.JRadioButton nonPaid;
    private javax.swing.JRadioButton paid;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
