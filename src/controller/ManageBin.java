/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.BinType;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageBin {
    BinType Bin;

    public ManageBin(BinType Bin) {
        this.Bin = Bin;
    }
    
    public ManageBin()
    {
       
    }

    
    public String loadCountBin()
    { 
        String no = "";
        try{
        Connection con = DB.createConnection();
        String sql ="Select count(Bcode) as count from bintype";
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
    
    public ResultSet ViewbinLocariontable(String Cname)
    {
       ResultSet result = null;
       try{
             Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM bintype WHERE name  LiKE '" + Cname + "%' or  Bcode LiKE '" + Cname + "%'   ";
            result = stmt.executeQuery(sql);
           
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       return result;
    }
    
    public void savebinLocation() {
        try {
            Connection con = DB.createConnection();
            String sql = "INSERT INTO bintype(Bcode,name) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, Bin.getID());
            stmt.setString(2, Bin.getName());

            int result = stmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(getVisibleContent(), "Bin Inventory Location been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
   
   
   }
    
   public ResultSet getnamebyid(String type)
   { ResultSet result = null;
     try{
         Connection con = DB.createConnection();
         String sql = "select name from bintype where Bcode = "+Integer.parseInt(type)+" ";
         Statement stmt = con.createStatement();
          result = stmt.executeQuery(sql);
         
         
     }  
     catch(Exception e)
     {
       System.out.println(e.getMessage());
       
     
     }
     return result;
   }
   
      public int getidbytype(String type)
   { int Id = 0;
     try{
         Connection con = DB.createConnection();
         String sql = "select Bcode from bintype where name = '"+type+"' ";
         Statement stmt = con.createStatement();
          ResultSet result = stmt.executeQuery(sql);
          while(result.next())
          {
              Id = result.getInt("Bcode");
          }
                 
     }  
     catch(Exception e)
     {
       System.out.println(e.getMessage());
       
     
     }
     return Id;
   }
      
      //pass bin name in to item 
      public String getbinnamebyID(int bno) throws java.lang.Exception
      {  String name = "";
          Connection con = DB.createConnection();
          Statement stmt = con.createStatement();
          String sql = "select * from bintype where Bcode = "+bno+" ";
          ResultSet rs = stmt.executeQuery(sql);
          while(rs.next())
          {
               name = rs.getString("name");
          }
          
          return name;
          
      
      
      
      }
   
   
   
   
    Window getVisibleContent() {
        Window result = null;
        for (Window w : Window.getWindows()) {
            if (w.isVisible()) {
                result = w;
            }
        }
        return result;
    }
    
     
}
