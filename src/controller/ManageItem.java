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
         String sql = "select * from item where department = "+Integer.parseInt(dno)+" and category = '"+cno+"' ";
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
         String sql = "update items set BinType = "+bcode+"  where code="+Integer.parseInt(code)+" ";
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
    
    
    
    
    
}
