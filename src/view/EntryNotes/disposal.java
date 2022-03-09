
package view.EntryNotes;

import com.mysql.cj.protocol.Resultset;
import controller.ManageDisposalItems;
import controller.ManageItem;
import controller.ManageStore;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.DisposalItems;
import view.BasicInformation.ItemList;

public class disposal extends javax.swing.JDialog {
    
    int Code,nav;
  
    double qty,qty1,bprice,bprice1,sprice,totalbprice,totallbprice, totalbprice2,totallsprice,
            totalsprice,byprice,slprice,qty2;
    String Description = "";
    double Total = 0, total1= 0,total=0,t1=0,t2= 0, totallll=0,tota=0;
    
   DisposalItems DItem = new DisposalItems();
   ManageDisposalItems managedisposal = new  ManageDisposalItems(DItem);
  

    public disposal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        generateID();
        getStores();
        date.setDateToToday();
        
        distable.getTableHeader().setFont(new Font ("Nirmala UI",Font.PLAIN,12));
    }
    
    

    public void generateID() {
       try {
           ResultSet rs = null;
           String DItem ="";
           rs =  managedisposal.displayitemsall();
           
           while(rs.next()){
               DItem = rs.getString("F17No");
           }
           if (DItem =="")
           {    DItem = "DMA22KT000001";}
           else{
               int no = Integer.valueOf(DItem.substring(8));
               int nno = ++no;
               if(String.valueOf(nno).length() == 1){
                   DItem = "DMA22KT00000" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 2){
                   DItem = "DMA22KT0000" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 3){
                   DItem  = "DMA22KT000" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 4){
                   DItem = "DMA22KT00" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 5){
                   DItem = "DMA22KT0" + String.valueOf(nno);
               }else{
                   DItem = "DMA22KT" + String.valueOf(nno);
               }
               
           }
           System.out.println(DItem);
           F17No.setText(DItem);
       } catch (Exception ex) {
              System.out.println("line 55" + ex.getMessage());
       }
    
          
                 
    }
     
    
    public void getStores(){
         try{
             storeName.addItem("-select-");
             ManageStore store =new ManageStore();
             ResultSet rs = store.getStores();

             while(rs.next()){
                 storeName.addItem(rs.getString("location"));
             }
         }catch (Exception ex) {
             System.out.println("line 48" + ex.getMessage());
         }
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        distable = new javax.swing.JTable();
        ItemstockQty = new javax.swing.JTextField();
        BuyingPrice = new javax.swing.JTextField();
        Sellingprice = new javax.swing.JTextField();
        ItemQty = new javax.swing.JTextField();
        Buyingtotalprice = new javax.swing.JTextField();
        Sellingtotalprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subbuytotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        subselltotal = new javax.swing.JTextField();
        ItemDescription = new javax.swing.JTextField();
        itemCode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        F17No = new javax.swing.JTextField();
        date = new com.github.lgooddatepicker.components.DatePicker();
        storeName = new javax.swing.JComboBox<>();
        storeID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("F1");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 19, 29, -1));

        distable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "අනු අංකය ", "විස්තරය ", "පවතින තොගය", "ගැනුම් මිල", "විකුණුම් මිල", "ප්‍රමාණය", "ගැනුම් එකතුව", "විකුණුම් එකතුව "
            }
        ));
        distable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        distable.setFont(new java.awt.Font("Iskoola Pota", 0, 10)); // NOI18N
        distable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                distableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(distable);
        if (distable.getColumnModel().getColumnCount() > 0) {
            distable.getColumnModel().getColumn(0).setResizable(false);
            distable.getColumnModel().getColumn(0).setPreferredWidth(30);
            distable.getColumnModel().getColumn(1).setResizable(false);
            distable.getColumnModel().getColumn(1).setPreferredWidth(85);
            distable.getColumnModel().getColumn(2).setResizable(false);
            distable.getColumnModel().getColumn(2).setPreferredWidth(100);
            distable.getColumnModel().getColumn(3).setResizable(false);
            distable.getColumnModel().getColumn(3).setPreferredWidth(90);
            distable.getColumnModel().getColumn(4).setResizable(false);
            distable.getColumnModel().getColumn(4).setPreferredWidth(90);
            distable.getColumnModel().getColumn(5).setResizable(false);
            distable.getColumnModel().getColumn(5).setPreferredWidth(90);
            distable.getColumnModel().getColumn(6).setResizable(false);
            distable.getColumnModel().getColumn(6).setPreferredWidth(80);
            distable.getColumnModel().getColumn(7).setResizable(false);
            distable.getColumnModel().getColumn(7).setPreferredWidth(90);
            distable.getColumnModel().getColumn(8).setResizable(false);
            distable.getColumnModel().getColumn(8).setPreferredWidth(80);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 59, 740, 184));

        ItemstockQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(ItemstockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 90, 25));

        BuyingPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(BuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 25));

        Sellingprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sellingprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellingpriceActionPerformed(evt);
            }
        });
        jPanel3.add(Sellingprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 90, 25));

        ItemQty.setBackground(new java.awt.Color(0, 204, 51));
        ItemQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ItemQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemQtyKeyReleased(evt);
            }
        });
        jPanel3.add(ItemQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 80, 25));

        Buyingtotalprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Buyingtotalprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuyingtotalpriceKeyReleased(evt);
            }
        });
        jPanel3.add(Buyingtotalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 90, 25));

        Sellingtotalprice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(Sellingtotalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 90, 25));

        jLabel6.setText(" පාඩුව ");
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        lost.setText("0.00");
        lost.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostActionPerformed(evt);
            }
        });
        jPanel3.add(lost, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 70, -1));

        jLabel7.setText("ගැණුම් ");
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 47, 20));

        subbuytotal.setText("00.0");
        subbuytotal.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        subbuytotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbuytotalActionPerformed(evt);
            }
        });
        jPanel3.add(subbuytotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 70, -1));

        jLabel8.setText("විකුණුම්");
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, 20));

        subselltotal.setText("0.00");
        subselltotal.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel3.add(subselltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 70, 25));

        ItemDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ItemDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDescriptionActionPerformed(evt);
            }
        });
        jPanel3.add(ItemDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 103, 25));

        itemCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemCodeKeyPressed(evt);
            }
        });
        jPanel3.add(itemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 25));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 770, 300));

        jButton1.setText("New");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 501, -1, -1));

        btnsave.setText("Save");
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 501, -1, -1));

        jButton3.setText("Print");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 501, -1, -1));

        jButton4.setText("Close");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 501, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("අපනය අස්කිරීමේ සටහන F-17");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 330, 30));

        kGradientPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 910, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("F17 No");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 25));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel11.setText("දිනය ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 51, 25));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel12.setText("ස්ථානය ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 25));

        F17No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F17NoActionPerformed(evt);
            }
        });
        jPanel1.add(F17No, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 25));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 25));

        storeName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                storeNameItemStateChanged(evt);
            }
        });
        jPanel1.add(storeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 140, 25));
        jPanel1.add(storeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 10, 50, 25));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 770, 50));

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 110, 25));

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 100, 25));

        jButton6.setText("Print");
        kGradientPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 100, 25));

        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 90, 25));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subbuytotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbuytotalActionPerformed
       
    }//GEN-LAST:event_subbuytotalActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
//        try{
//              if(F17No.getText().length() == 0)
//              {
//                   JOptionPane.showMessageDialog(rootPane, "Invalid Disposal ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
//                   }else if(date.getDate().equals(null)){
//                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
//                   }else if((storeID.getText().length() == 0 ) && (stores.getSelectedIndex() == 0)){
//                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
//                   }else if(distable.getRowCount()==0){
//                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your disposal table","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
//              
//                   }
//        
//        }catch(Exception e)
//        {
//        
//          System.out.println(e.getMessage());
//        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void F17NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F17NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F17NoActionPerformed
    ItemList Item1 = new ItemList(null,true);
    private void itemCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemCodeKeyPressed
       
        try{
            if (evt.getKeyCode()== KeyEvent.VK_F1)
            {   
                itemCode.setText("");
                ItemDescription.setText("");
                ItemstockQty.setText("");
                Sellingprice.setText("");
                BuyingPrice.setText("");

                ItemQty.setText("");
                Buyingtotalprice.setText("");
                Sellingtotalprice.setText("");

               Item1.setVisible(true);
               itemCode.setText(Item1.No);

               Code = Integer.valueOf(Item1.No);
               ManageItem I1 = new ManageItem();
               ResultSet result = I1.selectItemdata(Code);

                while(result.next())
                {
                    ItemDescription.setText(result.getString("itemName"));
                    Description = result.getString("itemName");
                    ItemstockQty.setText(String.valueOf(result.getDouble("stockQty")));
                    BuyingPrice.setText(String.valueOf(result.getDouble("costPrice")));
                    Sellingprice.setText(String.valueOf(result.getDouble("sellingPrice"))); 
                }
            }
        }
        catch(Exception e){
            
            System.out.print("line is 12426" + e.getMessage());
            
        }
    }//GEN-LAST:event_itemCodeKeyPressed

    private void ItemDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemDescriptionActionPerformed
int rowIndex2 =-2;
           
    private void ItemQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemQtyKeyReleased
           
                addItemsToTable(evt);
    }//GEN-LAST:event_ItemQtyKeyReleased

    private void BuyingtotalpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuyingtotalpriceKeyReleased
                 
           
               
    }//GEN-LAST:event_BuyingtotalpriceKeyReleased

    private void storeNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_storeNameItemStateChanged
        try{
            ManageStore store = new ManageStore();
            if (storeName.getSelectedIndex() !=0 ) {
                ResultSet rs = store.getStoreID(storeName.getSelectedItem().toString());
                System.out.println(storeName.getSelectedItem().toString());
                while(rs.next()){
                    storeID.setText(rs.getString("stcode"));
                }
            }

        }catch(Exception e)
        {
           System.out.println("line 1322: " +e.getMessage());
        }
    }//GEN-LAST:event_storeNameItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void clearAll(){
        try{
            generateID();
            date.setDateToToday();
            storeName.setSelectedIndex(0);
            storeID.setText("");
            itemCode.setText("");
            ItemDescription.setText("");
            ItemstockQty.setText("");
            Sellingprice.setText("");
            BuyingPrice.setText("");
            subbuytotal.setText("");
            subselltotal.setText("");
            lost.setText("");

            ItemQty.setText("");
            Buyingtotalprice.setText("");
            Sellingtotalprice.setText("");     
            DefaultTableModel dtm = (DefaultTableModel) distable.getModel();
            dtm.setRowCount(0);
        }catch(Exception e)
        {
           System.out.println("line 1322: " +e.getMessage());
        }
        
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            if(F17No.getText().length() ==0){
                JOptionPane.showMessageDialog(rootPane, "Invalid Price change ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((storeID.getText().length() == 0 ) && (storeName.getSelectedIndex() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(distable.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your GRN","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                DItem.DisposalItems(F17No.getText(), java.sql.Date.valueOf(date.getDate()), Double.valueOf(subbuytotal.getText()), Double.valueOf(subselltotal.getText()), Double.valueOf(lost.getText()));
                int i = managedisposal.savedisposal();

                if(i==1){

                    DefaultTableModel dtm= (DefaultTableModel)distable.getModel();
                    int RowCount1= distable.getRowCount();

                    System.out.println(" row count " + RowCount1);

                    int r2 =0;
                    for(int j=0; j< RowCount1; j++){

                        DItem.disposalltemsrecords(Double.valueOf(dtm.getValueAt(j,3).toString()), Double.valueOf(dtm.getValueAt(j,6).toString()), Double.valueOf(dtm.getValueAt(j,4).toString()), Double.valueOf(dtm.getValueAt(j,5).toString()), Double.valueOf(dtm.getValueAt(j,7).toString()), Double.valueOf(dtm.getValueAt(j,8).toString()), Integer.valueOf(dtm.getValueAt(j,1).toString()));
                        
                        int k = managedisposal.savedisposalRecords();
                        
                        if(k ==1){          
                            double sQty=0, mQty=0;
                            ManageItem item  = new ManageItem();
                            ResultSet re = item.getItemStock(Integer.valueOf(dtm.getValueAt(j, 1).toString()));

                            while(re.next()){   
                                sQty = re.getDouble("stockQty");
                                mQty = re.getDouble("maxQty");
                            }
                            
                            sQty = sQty - Double.valueOf(dtm.getValueAt(j, 6).toString());
                            int t = item.UpdateItemStock(Integer.valueOf(dtm.getValueAt(j, 1).toString()), sQty);
                            
                        if(t==1){
                                ++r2;
                            }else{
                                JOptionPane.showMessageDialog(null, "Error in updating disposal item no " + dtm.getValueAt(j, 1).toString(), "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                            }    
                        }
                    }
                    if(r2 == RowCount1){
                        clearAll();
                        JOptionPane.showMessageDialog(null, "Disposal Items saved succesfully" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in saving Disposal Items records" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);

                    }
                        
                    

                }else{
                    JOptionPane.showMessageDialog(null, "Error in saving Disposal Items" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SellingpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellingpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellingpriceActionPerformed

    private void distableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distableMouseClicked
         try{
            TableModel tm = distable.getModel();
             
            if((rowIndex != -2) && (distable.getSelectedRow() != rowIndex)){
                tm.setValueAt("", 0, 0);
                tm.setValueAt("", rowIndex, 0);
                rowIndex =  distable.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
                
            }else if(distable.getSelectedRow() == rowIndex){
                rowIndex =  distable.getSelectedRow();
                tm.setValueAt("*", rowIndex, 0);
                
            }else{
                tm.setValueAt("", 0, 0);
                rowIndex =  distable.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_distableMouseClicked

    private void lostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lostActionPerformed

    int rowIndex =-2;
    public void addItemsToTable(java.awt.event.KeyEvent evt){
        
        try{
            if (evt.getKeyCode() != KeyEvent.VK_ENTER) {

                qty= Double.valueOf(ItemQty.getText());
                bprice = Double.valueOf(BuyingPrice.getText());
                sprice = Double.valueOf(Sellingprice.getText());
                totalbprice =  bprice* qty;
                totalsprice = sprice * qty;

                Buyingtotalprice.setText(String.valueOf(totalbprice));
                total = Double.valueOf(subbuytotal.getText()) +  totalbprice;
                Sellingtotalprice.setText(String.valueOf( totalsprice));
                totallll = Double.valueOf(subselltotal.getText()) +  totalsprice;

            }else{
                if(ItemQty.getText().toString().length() ==0){
                   JOptionPane.showMessageDialog(null, "Please enter the item quantity" , "SuperMarket Management", JOptionPane.ERROR_MESSAGE);                    
                }else if(Double.valueOf(ItemQty.getText()) > Double.valueOf(ItemstockQty.getText())){
                    JOptionPane.showMessageDialog(null, "No enough item aqantity available stock", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }else{
                    TableModel tm = distable.getModel();

                    if(tm.getRowCount() > 0){
                        tm.setValueAt("", 0, 0);
                        tm.setValueAt("", rowIndex, 0);
                    } else{               
                        rowIndex = 0;
                    }

                    DefaultTableModel model = (DefaultTableModel) distable.getModel();                
                    Vector vec = new Vector();
                    vec.add(">");
                    vec.add(Code);
                    vec.add(ItemDescription.getText());
                    vec.add(ItemstockQty.getText());
                    vec.add(BuyingPrice.getText());
                    vec.add(Sellingprice.getText());
                    vec.add(ItemQty.getText());
                    vec.add(totalbprice);
                    vec.add(totalsprice);

                    
                    subbuytotal.setText(String.valueOf(total));
                    subselltotal.setText(String.valueOf(totallll));
                    lost.setText(String.valueOf(total));
                    model.insertRow(0, vec);
                    distable.setModel(model);

                    itemCode.setText("");
                    ItemDescription.setText("");
                    ItemstockQty.setText("");
                    ItemQty.setText("");
                    BuyingPrice.setText("");
                    Sellingprice.setText("");
                    Buyingtotalprice.setText("");
                    Buyingtotalprice.setText("");
                }
            }
        
        
        
        }
        catch(Exception e){
               System.out.println("line 1242: " +e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(disposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(disposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(disposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(disposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                disposal dialog = new disposal(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField BuyingPrice;
    private javax.swing.JTextField Buyingtotalprice;
    private javax.swing.JTextField F17No;
    private javax.swing.JTextField ItemDescription;
    private javax.swing.JTextField ItemQty;
    private javax.swing.JTextField ItemstockQty;
    private javax.swing.JTextField Sellingprice;
    private javax.swing.JTextField Sellingtotalprice;
    private javax.swing.JButton btnsave;
    private com.github.lgooddatepicker.components.DatePicker date;
    private javax.swing.JTable distable;
    private javax.swing.JTextField itemCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lost;
    private javax.swing.JTextField storeID;
    private javax.swing.JComboBox<String> storeName;
    private javax.swing.JTextField subbuytotal;
    private javax.swing.JTextField subselltotal;
    // End of variables declaration//GEN-END:variables
}
