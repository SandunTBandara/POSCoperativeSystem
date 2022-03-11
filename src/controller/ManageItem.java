/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Items;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageItem {
    
    Items Item;
    
    public void ManageItem()
    {
    
    }
    
    public void ManageItem(Items Item)
    {
       this.Item = Item;
    }
    
    public String loadItemCount() 
    {
        String no = "";
        try{
             Connection con = DB.createConnection();
             String sql = "Select count(code) as count from item";
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             
             while(rs.next())
             {
                no = rs.getString(1);
             }
      
        }
        catch(SQLException e)
        {
          System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
        
        return no;
    
    }
    
    
    public ResultSet loadItem()
    {  ResultSet result=null;
       try{
         Connection con = DB.createConnection();
         String sql = "select * from item";
         Statement stmt = con.createStatement();
         result = stmt.executeQuery(sql);
          
        
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage());
       }
       
       return result;
    
    }
    
      public ResultSet loadItembyCategoryandDepartment(String dno, String cno)
    {  ResultSet result=null;
       try{
         Connection con = DB.createConnection();
         String sql = "select * from item where dno = "+Integer.parseInt(dno)+" and category = '"+cno+"' ";
         Statement stmt = con.createStatement();
         result = stmt.executeQuery(sql);
          
        
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage());
       }
       
       return result;
    
    }
      
      public int UpdateItem(int bcode, String code)
      {   int check = 0;
          try{
         Connection con = DB.createConnection();
         String sql = "update item set BinType = "+bcode+"  where code="+Integer.parseInt(code)+" ";
         Statement stmt = con.createStatement();
         int result = stmt.executeUpdate(sql);
         
         if(result>0)
         {
            check = 1;
         }
         else
         {
            check =0;
         }
          }
          catch(Exception e)
          {
            System.out.println(e.getMessage());
          }
         return check;
      
      }
      
      public ResultSet selectItemdata(int x)
      {
          ResultSet result = null;
          try{
          Connection con = DB.createConnection();
          String sql = "select * from item where code = "+x+" ";
          Statement stmt = con.createStatement();
         result = stmt.executeQuery(sql);
          
          
          
      
          }
          catch(Exception e)
          {
             System.out.println(e.getMessage());
          }
          
          return result;
      }
    
      
      public ResultSet selectItemcodetotable(int itno) throws Exception
      {
        ResultSet result = null;
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String sql = "select item.Nonsell, item.stockQty, store.location,  store.stcode  from item inner join store  on   item.scode = store.stcode where (item.code =  "+itno+" and store.stcode = '1') ";
        result = stmt.executeQuery(sql);
        
        return result;
        
      
      }
    
     
      public ResultSet getItemName(int code){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select itemName from item where code = " + code + ";";
            result = stmt.executeQuery(sql);
    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
        
    }
    
    
    public ResultSet getItemStock(int code)
    {  
        ResultSet result = null;
        try{

            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select stockQty, maxQty from item where code = " + code + ";";
                        System.out.println(sql);
            System.out.println(code);
            result = stmt.executeQuery(sql);
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return result;
      
       
    }
    
    public int UpdateItemStock(int code, double qty)
    {  
        int check = 0;
        try{
            
            Connection con = DB.createConnection();
            String sql = "update item set stockQty = "+qty+"  where code="+ code+"; ";
            System.out.println(sql);

            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(sql);

            if(result==1)
            {
                check = 1;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return check;
      
    }
    
    
    public ResultSet getInvoiceByCode(String code){
        ResultSet result=null;
        try{
            
            Connection con = DB.createConnection();
            String sql = "select * from customerinvoice where invoiceNo = '" + code + "';";
            Statement stmt = con.createStatement();
            result = stmt.executeQuery(sql);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int saveItem(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO item(code, itemName, sinhalaName, barcode, margin, weight, costPrice, sellingPrice, reorderLevel, reorderQty, maxQty, category, dno, Bcode, scode) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Item.getItemCode());
            stmt.setString(2, Item.getName());
            stmt.setString(3, Item.getSname());
            stmt.setInt(4, Item.getBarcode());
            stmt.setDouble(5, Item.getMargin());
            stmt.setString(6, Item.getWeight());
            stmt.setDouble(7, Item.getCostType());
            stmt.setDouble(8, Item.getSellingPrice());
            stmt.setDouble(9, Item.getReorderLevel());
            stmt.setDouble(10, Item.getReorderQty());
            stmt.setDouble(11, Item.getMaxQty());
            stmt.setString(12, Item.getCategory());
            stmt.setInt(13, Item.getDepartment());
            stmt.setInt(14, Item.getBinType());
            stmt.setInt(15, Item.getSupplier());
    
            result = stmt.executeUpdate();
        }catch(Exception e){
            System.out.println("line 265" +e.getMessage());
        }
        return result;
    }
    
    public void updateItem()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE item SET itemName = ?, sinhalaName=?, barcode=?,margin = ?, weight=?, costPrice=?, sellingPrice =?, reorderLevel = ?, reorderQty =?, maxQty =?, category = ?, dno =?, Bcode =?, scode = ?   WHERE code = "+ Item.getItemCode() + ";";
             PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, Item.getName());
            stmt.setString(2, Item.getSname());
            stmt.setInt(3, Item.getBarcode());
            stmt.setDouble(4, Item.getMargin());
            stmt.setString(5, Item.getWeight());
            stmt.setDouble(6, Item.getCostType());
            stmt.setDouble(7, Item.getSellingPrice());
            stmt.setDouble(8, Item.getReorderLevel());
            stmt.setDouble(9, Item.getReorderQty());
            stmt.setDouble(10, Item.getMaxQty());
            stmt.setString(11, Item.getCategory());
            stmt.setInt(12, Item.getDepartment());
            stmt.setInt(13, Item.getBinType());
            stmt.setInt(14, Item.getSupplier());

             int result = stmt.executeUpdate();

             if (result > 0) {
                 JOptionPane.showMessageDialog(null, "Item has been updated succesfully ", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
             } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
    
}
