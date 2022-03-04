/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Stores;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageStore {
    Stores Store;
    
    public ManageStore()
    {
    
    }
    public  ManageStore(Stores Store)
    {
       this.Store = Store;
    }
    
    public ResultSet viewstorelocationtable()
    {
      ResultSet result = null;
      
      try{
           Connection con = DB.createConnection();
           Statement stmt = con.createStatement();
           String sql = "select * from store";
           result  = stmt.executeQuery(sql);
           
           
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
      return result;
    
    }
    
    public void savestores() throws Exception
    {
      Connection con = DB.createConnection();
      String sql = "insert into store(stcode,location) values (?,?)";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setString(1, Store.getID());
      stmt.setString(2, Store.getLocation());
      
      int result = stmt.executeUpdate();
      
          if (result > 0) {
                JOptionPane.showMessageDialog(getVisibleContent(), "Department has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            } 
          else
          {
              JOptionPane.showMessageDialog(getVisibleContent(), "Department has not saved", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
          }
    
    
    }
    
    public ResultSet getStoreID(String loc){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select stcode from store where location = '" + loc + "';";
            result = stmt.executeQuery(sql);
    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;        
    }
    
    public ResultSet getStoreName(String code){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select location from store where stcode = '" + code + "';";
            result = stmt.executeQuery(sql);
    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;        
    }
    
    public ResultSet getStores(){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from store where stcode;";
            result = stmt.executeQuery(sql);    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;        
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
