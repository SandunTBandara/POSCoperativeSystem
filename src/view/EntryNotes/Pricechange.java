
package view.EntryNotes;

import controller.ManageItem;
import controller.ManageStore;
import controller.Managepricechange;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Pricechanges;
import view.BasicInformation.ItemList;

public class Pricechange extends javax.swing.JDialog {
    
    int Code;
    String Description="";
    double totalProfitAmt=0, totalLostAmt=0;
    
    Pricechanges price = new Pricechanges();
    Managepricechange manage = new Managepricechange(price);

       
    
    public Pricechange(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        generateID();
        getStores();
        date.setDateToToday();
        pricetable.getTableHeader().setFont(new Font ("Nirmala UI",Font.PLAIN,12));
    }
    
    
    public void generateID(){
         try{
          ResultSet rs = null;
           String price1 ="";
           rs =  manage.displayitemsall();
           
           while(rs.next()){
               price1 = rs.getString("F17No");
           }
           if (price1 =="")
           {    price1 = "PRC22KT000001";}
           else{
               int no = Integer.valueOf(price1.substring(8));
               int nno = ++no;
               if(String.valueOf(nno).length() == 1){
                   price1 = "PRC22KT00000" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 2){
                   price1 = "PRC22KT0000" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 3){
                   price1  = "PRC22KT000" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 4){
                   price1 = "PRC22KT00" + String.valueOf(nno);
               }else if(String.valueOf(nno).length() == 5){
                   price1 = "PRC22KT0" + String.valueOf(nno);
               }else{
                   price1 = "PRC22KT" + String.valueOf(nno);
               }
               
           }
           System.out.println(price1);
           F17No.setText(price1);
     
          }catch(Exception e)
         {
         
           System.out.println("line 55" + e.getMessage());
         
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        F17No = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        date = new com.github.lgooddatepicker.components.DatePicker();
        storeName = new javax.swing.JComboBox<>();
        storeId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        itemcode = new javax.swing.JTextField();
        ItemDescription = new javax.swing.JTextField();
        ItemstockQty = new javax.swing.JTextField();
        ItemQty = new javax.swing.JTextField();
        Sellingprice = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        lowproductprice = new javax.swing.JTextField();
        highproductprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pricetable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buyingPrice = new javax.swing.JTextField();
        totalLost = new javax.swing.JTextField();
        totalProfit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("F17 No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));
        jPanel1.add(F17No, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, 25));

        jLabel2.setText("දිනය ");
        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 51, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        storeName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                storeNameItemStateChanged(evt);
            }
        });
        jPanel1.add(storeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 140, 25));
        jPanel1.add(storeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 50, 25));

        jLabel9.setText("ස්ථානය ");
        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 870, 50));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("F1");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 25));

        itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemcodeKeyPressed(evt);
            }
        });
        jPanel2.add(itemcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 25));
        jPanel2.add(ItemDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 25));
        jPanel2.add(ItemstockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 100, 25));

        ItemQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemQtyKeyReleased(evt);
            }
        });
        jPanel2.add(ItemQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 25));

        Sellingprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellingpriceActionPerformed(evt);
            }
        });
        jPanel2.add(Sellingprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 90, 25));

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });
        jPanel2.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 90, 25));

        lowproductprice.setBackground(new java.awt.Color(0, 204, 0));
        lowproductprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lowproductpriceKeyReleased(evt);
            }
        });
        jPanel2.add(lowproductprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 110, 25));

        highproductprice.setBackground(new java.awt.Color(0, 204, 0));
        highproductprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                highproductpriceKeyReleased(evt);
            }
        });
        jPanel2.add(highproductprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 100, 25));

        pricetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ", " අනු අංකය", "විස්තරය", "පවතින තොගය ", "ප්‍රමාණය ", "විකුණුම් මිල ", "වටිනාකම ", "අඩු භාණ්ඩයේ මිල ", "වැඩි භාණ්ඩයේ මිල ", "අඩු වූ වෙනස ", "වැඩි වූ වෙනස l", "පාඩුව ", " ලාභය "
            }
        ));
        pricetable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        pricetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pricetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pricetable);
        if (pricetable.getColumnModel().getColumnCount() > 0) {
            pricetable.getColumnModel().getColumn(0).setResizable(false);
            pricetable.getColumnModel().getColumn(0).setPreferredWidth(30);
            pricetable.getColumnModel().getColumn(1).setResizable(false);
            pricetable.getColumnModel().getColumn(1).setPreferredWidth(85);
            pricetable.getColumnModel().getColumn(2).setResizable(false);
            pricetable.getColumnModel().getColumn(2).setPreferredWidth(80);
            pricetable.getColumnModel().getColumn(3).setResizable(false);
            pricetable.getColumnModel().getColumn(3).setPreferredWidth(100);
            pricetable.getColumnModel().getColumn(4).setResizable(false);
            pricetable.getColumnModel().getColumn(4).setPreferredWidth(75);
            pricetable.getColumnModel().getColumn(5).setResizable(false);
            pricetable.getColumnModel().getColumn(5).setPreferredWidth(90);
            pricetable.getColumnModel().getColumn(6).setResizable(false);
            pricetable.getColumnModel().getColumn(6).setPreferredWidth(85);
            pricetable.getColumnModel().getColumn(7).setResizable(false);
            pricetable.getColumnModel().getColumn(7).setPreferredWidth(110);
            pricetable.getColumnModel().getColumn(8).setResizable(false);
            pricetable.getColumnModel().getColumn(8).setPreferredWidth(115);
            pricetable.getColumnModel().getColumn(9).setResizable(false);
            pricetable.getColumnModel().getColumn(9).setPreferredWidth(80);
            pricetable.getColumnModel().getColumn(10).setResizable(false);
            pricetable.getColumnModel().getColumn(10).setPreferredWidth(85);
            pricetable.getColumnModel().getColumn(11).setResizable(false);
            pricetable.getColumnModel().getColumn(11).setPreferredWidth(80);
            pricetable.getColumnModel().getColumn(12).setResizable(false);
            pricetable.getColumnModel().getColumn(12).setPreferredWidth(80);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 850, 180));

        jLabel6.setText("පාඩුව ");
        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 50, 20));

        jLabel7.setText("ලාභය ");
        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, 20));
        jPanel2.add(buyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 16, 100, 20));
        jPanel2.add(totalLost, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 70, -1));
        jPanel2.add(totalProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 80, -1));

        jLabel4.setText("Item cost");
        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 80, -1));

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 870, 270));

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 110, 25));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 100, 25));

        jButton3.setText("Print");
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 100, 25));

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 90, 25));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 19)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("මිල වෙනස් කිරීමේ සටහන");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 30));

        kGradientPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 910, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
        ItemList Item1 = new ItemList(null,true);
    private void itemcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyPressed
          
        try{
        
        
        if (evt.getKeyCode()== KeyEvent.VK_F1)            
         {    
             itemcode.setText("");
             ItemDescription.setText("");
             ItemstockQty.setText("");
             ItemQty.setText("");
             Sellingprice.setText("");
             value.setText("");
             lowproductprice.setText("");
             highproductprice.setText("");
             
            Item1.setVisible(true);
            itemcode.setText(Item1.No);
            
            Code = Integer.valueOf(Item1.No);
            ManageItem I1 = new ManageItem();
            ResultSet result = I1.selectItemdata(Code);
            
            while(result.next())
            {   
                ItemDescription.setText(result.getString("itemName"));
                Description = result.getString("itemName");
                ItemstockQty.setText(String.valueOf(result.getDouble("stockQty")));
                ItemQty.setText(String.valueOf(result.getDouble("stockQty")));
                buyingPrice.setText(String.valueOf(result.getDouble("costPrice")));
                Sellingprice.setText(String.valueOf(result.getDouble("sellingPrice")));
                double values = Double.valueOf(ItemstockQty.getText()) * Double.valueOf(Sellingprice.getText());
                value.setText(String.valueOf(values));   
                lowproductprice.setText("0.00");
                highproductprice.setText("0.00");
            }
            
         }
        }
        catch(Exception e){
            
            System.out.print("line is 12426" + e.getMessage());
            
        }
    }//GEN-LAST:event_itemcodeKeyPressed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    private void SellingpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellingpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellingpriceActionPerformed

    private void storeNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_storeNameItemStateChanged
        try{
            ManageStore store = new ManageStore();
            if (storeName.getSelectedIndex() !=0 ) {
                ResultSet rs = store.getStoreID(storeName.getSelectedItem().toString());
                System.out.println(storeName.getSelectedItem().toString());
                while(rs.next()){
                    storeId.setText(rs.getString("stcode"));
                }
            }

        }catch(Exception e)
        {
           System.out.println("line 1322: " +e.getMessage());
        }
    }//GEN-LAST:event_storeNameItemStateChanged

    private void ItemQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemQtyKeyReleased
        try{
            if(ItemQty.getText().length() != 0){
                if(Double.valueOf(ItemQty.getText()) > Double.valueOf(ItemstockQty.getText())){
                    JOptionPane.showMessageDialog(null, "No enough item quantity available stock", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                }                
            }else{
                ItemQty.setText(ItemstockQty.getText());
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ItemQtyKeyReleased

    private void lowproductpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lowproductpriceKeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){

                if(Double.valueOf(lowproductprice.getText())> 0 && (highproductprice.getText().toString().length() == 0 || highproductprice.getText().equals("0.00"))){
                    if(Double.valueOf(lowproductprice.getText()) < Double.valueOf(Sellingprice.getText())){
                        lost();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Decrease item price cannot be greater tha the selling price","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                    }
                }else if(Double.valueOf(highproductprice.getText())> 0 && (lowproductprice.getText().toString().length() == 0 || lowproductprice.getText().equals("0.00"))){
                    if(Double.valueOf(highproductprice.getText()) > Double.valueOf(Sellingprice.getText())){
                        profit();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Increase item price cannot be greater tha the selling price","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                    }
                }else if(Double.valueOf(highproductprice.getText())> 0 && Double.valueOf(lowproductprice.getText())>0){
                    JOptionPane.showMessageDialog(rootPane, "Cannot enter both Item price increase and decrease","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Please enter the increase or decrease price of the item","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_lowproductpriceKeyReleased

    private void highproductpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_highproductpriceKeyReleased
        try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                if(ItemQty.getText().toString().length() != 0){
                    if(Double.valueOf(lowproductprice.getText())> 0 && (highproductprice.getText().toString().length() == 0 || Double.valueOf(highproductprice.getText()) == 0)){
                        if(Double.valueOf(lowproductprice.getText()) < Double.valueOf(Sellingprice.getText())){
                            lost();
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Decrease item price cannot be greater tha the selling price","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                        }
                    }else if(Double.valueOf(highproductprice.getText())> 0 && (lowproductprice.getText().toString().length() == 0 || Double.valueOf(lowproductprice.getText()) == 0)){
                        if(Double.valueOf(highproductprice.getText()) > Double.valueOf(Sellingprice.getText())){
                            profit();
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Increase item price cannot be greater tha the selling price","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                        }
                    }else if(Double.valueOf(highproductprice.getText())> 0 && Double.valueOf(lowproductprice.getText())>0){
                        JOptionPane.showMessageDialog(rootPane, "Cannot enter both Item price increase and decrease","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Please enter the increase or decrease price of the item","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);                                
                    }
                }                
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_highproductpriceKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
           if(F17No.getText().length() ==0){
               JOptionPane.showMessageDialog(rootPane, "Invalid Price change ID! Please Check again","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(date.getDate().equals(null)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the date","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if((storeId.getText().length() == 0 ) && (storeName.getSelectedIndex() == 0)){
                JOptionPane.showMessageDialog(rootPane, "Please enter the store details","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else if(pricetable.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane, "There are no items to save in your GRN","SuperMarket Management" , JOptionPane.ERROR_MESSAGE);
            }else{
                price.Pricechange(F17No.getText().toString(),java.sql.Date.valueOf(date.getDate()), Double.valueOf(totalProfit.getText()), Double.valueOf(totalLost.getText())); 
                int i = manage.savePriceChange();

                if(i==1){
                    
                        DefaultTableModel dtm= (DefaultTableModel)pricetable.getModel();
                        int RowCount1= pricetable.getRowCount();
                        
                            System.out.println(RowCount1);
                        
                        int r2 =0;
                        for(int j=0; j< RowCount1; j++){
                            System.out.println(dtm.getValueAt(j, 0).toString());
                            System.out.println(dtm.getValueAt(j, 1).toString());
                            System.out.println(dtm.getValueAt(j, 2).toString());
                            System.out.println(dtm.getValueAt(j, 3).toString());
                            System.out.println(dtm.getValueAt(j, 4).toString());

                            price.pricechangeitems(Integer.valueOf(dtm.getValueAt(j,1).toString()), Double.valueOf(dtm.getValueAt(j,3).toString()), Double.valueOf(dtm.getValueAt(j,4).toString()), Double.valueOf(dtm.getValueAt(j,6).toString()), Double.valueOf(dtm.getValueAt(j,8).toString()), Double.valueOf(dtm.getValueAt(j,7).toString()), Double.valueOf(dtm.getValueAt(j,10).toString()), Double.valueOf(dtm.getValueAt(j,9).toString()), Double.valueOf(dtm.getValueAt(j,11).toString()), Double.valueOf(dtm.getValueAt(j,12).toString()));
                            int k = manage.savePriceChangeItems();
                            if(k ==1){
                                r2++;
                            }
                        }
                        if(r2 == RowCount1){
                            clearAll();
                            JOptionPane.showMessageDialog(null, "Price changes saved succesfully" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Error in saving Price change items  ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
                        } 
                        
                }else{
                    JOptionPane.showMessageDialog(null, "Error in saving Price changerecords" ,"SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                }
            }
       }catch(Exception e){
            System.out.println(e.getMessage());
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pricetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pricetableMouseClicked
        try{
            TableModel tm = pricetable.getModel();
             
            if((rowIndex != -2) && (pricetable.getSelectedRow() != rowIndex)){
                tm.setValueAt("", 0, 0);
                tm.setValueAt("", rowIndex, 0);
                rowIndex =  pricetable.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
                
            }else if(pricetable.getSelectedRow() == rowIndex){
                rowIndex =  pricetable.getSelectedRow();
                tm.setValueAt("*", rowIndex, 0);
                
            }else{
                tm.setValueAt("", 0, 0);
                rowIndex =  pricetable.getSelectedRow();
                tm.setValueAt(">", rowIndex, 0);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_pricetableMouseClicked

    public void clearAll(){
        try{
            generateID();
            date.setDateToToday();
            storeName.setSelectedIndex(0);
            storeId.setText("");
            itemcode.setText("");
            ItemDescription.setText("");
            ItemstockQty.setText("");
            ItemQty.setText("");
            buyingPrice.setText("");
            Sellingprice.setText("");
            value.setText("");
            lowproductprice.setText("");
            highproductprice.setText("");
            totalLost.setText("0.00");
            totalProfit.setText("0.00");
            totalProfitAmt =0;
            totalLostAmt =0;   
            DefaultTableModel newt = (DefaultTableModel)pricetable.getModel();
            newt.setRowCount(0);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void lost(){
        try{
            double itemLost = Double.valueOf(lowproductprice.getText());
            double selPrice = Double.valueOf(Sellingprice.getText());
            double qty = Double.valueOf(ItemQty.getText());
            
            double ilost = selPrice - itemLost;
            double Lost = ilost * qty;           
            totalLostAmt = totalLostAmt + Lost;
            addItemToTable(ilost, Lost, 0.00, 0.00);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void profit(){
        try{
            double itemProfit = Double.valueOf(highproductprice.getText());
            double selPrice = Double.valueOf(Sellingprice.getText());
            double qty = Double.valueOf(ItemQty.getText());
            
            double iprofit = itemProfit - selPrice;
            double Profit = iprofit * qty;           
            totalProfitAmt = totalProfitAmt + Profit;
            addItemToTable( 0.00, 0.00, iprofit, Profit);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }System.out.println("i am profit price");

    }
    
    int rowIndex=-2;
    public void addItemToTable(double iLost, double lost,double iProfit, double profit){
        try{
                TableModel tm = pricetable.getModel();
                
                if(tm.getRowCount() > 0){
                    tm.setValueAt("", 0, 0);
                    tm.setValueAt("", rowIndex, 0);
                } else{               
                    rowIndex = 0;
                }
                
                DefaultTableModel model = (DefaultTableModel) pricetable.getModel();                
                Vector vec = new Vector();
                vec.add(">");
                vec.add(Code);
                vec.add(ItemDescription.getText());
                vec.add(ItemstockQty.getText());
                vec.add(ItemQty.getText());
                vec.add(Sellingprice.getText());
                vec.add(value.getText());
                vec.add(lowproductprice.getText());
                vec.add(highproductprice.getText());
                vec.add(iLost);
                vec.add(iProfit);
                vec.add(lost);
                vec.add(profit);

                totalLost.setText(String.valueOf(totalLostAmt));
                totalProfit.setText(String.valueOf(totalProfitAmt));
                model.insertRow(0, vec);
                pricetable.setModel(model);
                
                itemcode.setText("");
                ItemDescription.setText("");
                ItemstockQty.setText("");
                ItemQty.setText("");
                buyingPrice.setText("");
                Sellingprice.setText("");
                value.setText("");
                lowproductprice.setText("");
                highproductprice.setText("");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pricechange dialog = new Pricechange(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField F17No;
    private javax.swing.JTextField ItemDescription;
    private javax.swing.JTextField ItemQty;
    private javax.swing.JTextField ItemstockQty;
    private javax.swing.JTextField Sellingprice;
    private javax.swing.JTextField buyingPrice;
    private com.github.lgooddatepicker.components.DatePicker date;
    private javax.swing.JTextField highproductprice;
    private javax.swing.JTextField itemcode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lowproductprice;
    private javax.swing.JTable pricetable;
    private javax.swing.JTextField storeId;
    private javax.swing.JComboBox<String> storeName;
    private javax.swing.JTextField totalLost;
    private javax.swing.JTextField totalProfit;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
