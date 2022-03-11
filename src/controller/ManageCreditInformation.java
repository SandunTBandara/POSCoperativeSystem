/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.CreditInformation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageCreditInformation {
    
    CreditInformation cinfo1;
    
    public ManageCreditInformation()
    {
    
    }
    public ManageCreditInformation(CreditInformation cinfo1)
    {
      this.cinfo1 = cinfo1;
    }
    
    public void savecreditinfo() 
    {
        
        try {
            Connection con = DB.createConnection();
            String sql = "INSERT INTO creditinformation (ccode,TypeName)  values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cinfo1.getID());
            stmt.setString(2, cinfo1.getType());
            
            int result = stmt.executeUpdate();
            
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Credit Customer Information has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Credit Customer Information has not saved", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Credit Customer Information has not saved", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Credit Customer Information has not saved", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    public ResultSet loadCreditCustomerType()throws Exception
    {
        ResultSet result = null;
          Connection con = DB.createConnection();
          Statement stmt = con.createStatement();
          String sql = "select * from creditinformation";
          result = stmt.executeQuery(sql);
          
          return result;
    }
    
    
    public String loadCreditTypeName(int id)throws Exception
    {
        String name = "";
        ResultSet result = null;
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String sql = "select TypeName from credittype where ccode = " + id;
        result = stmt.executeQuery(sql);
        while(result.next()){
            name = result.getString("TypeName");
        } 
        return name;
    }
    
    public int loadCreditID(String name)throws Exception
    {
        int id = 0;
        ResultSet result = null;
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String sql = "select ccode from credittype where  TypeName='" + name + "'";
        result = stmt.executeQuery(sql);
        while(result.next()){
            id = result.getInt("ccode");
        } 
        return id;
    }
    
    public void updateCredit()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE credittype SET TypeName = ? WHERE ccode = "+ cinfo1.getID() + ";";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, cinfo1.getType());

             int result = stmt.executeUpdate();

             if (result > 0) {
                 JOptionPane.showMessageDialog(null, "User has been updated succesfully ", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
             } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
}
