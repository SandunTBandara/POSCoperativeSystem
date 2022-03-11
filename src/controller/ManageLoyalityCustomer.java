/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;
import model.LoyalityCardCustomer;

/**
 *
 * @author Sanu
 */
public class ManageLoyalityCustomer {
    
    LoyalityCardCustomer lcm;
    
    public ManageLoyalityCustomer()
    {
    
    }
    public ManageLoyalityCustomer(LoyalityCardCustomer lcus)
    {
      this.lcm = lcus;
    }
    
    public ResultSet getAll()
    {
        ResultSet result = null;
        try{
            
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String Sql = "Select * from loyalitycardcustomer";
        result = stmt.executeQuery(Sql);
        
        }
        catch(Exception e)
        {
          System.out.println("getloyalerror1" +e.getMessage());
        }
        
        return result;
    }
    
    public ResultSet getloyalitycustomer(String bcode)
    {
        ResultSet result = null;
        try{
            
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String Sql = "Select * from loyalitycardcustomer where barcode = '"+bcode+"'";
        result = stmt.executeQuery(Sql);
        
        }
        catch(Exception e)
        {
          System.out.println("getloyalerror1" +e.getMessage());
        }
        
        return result;
    }
    
    public void updateloyalitycustomer(String uno, double points)
    {
        try{
        Connection con = DB.createConnection();
        String sql = "Update loyalitycardcustomer set totalpoints = '"+points+"' where memberId = '"+uno+"' ";
        PreparedStatement stmt = con.prepareStatement(sql);
        int result = stmt.executeUpdate();
        
        if(result<0 )
        {
           JOptionPane.showMessageDialog(null, "Points not Added", "Super MArket POS System", JOptionPane.ERROR_MESSAGE);
        }
        
        }
        catch(Exception e)
        {
          System.out.println("error update" +e.getMessage());
        }
    
    }
    
     public void saveLoyalityMember()
    {    
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO loyalitycardcustomer (memberId, Name, totalpoints, barcode, Lcode) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
//            System.out.println(card.getCode() + "   "+ card.getName());
            stmt.setString(1, lcm.getmemId());
            stmt.setString(2, lcm.getName());
            stmt.setDouble(3, lcm.gettotpoint());
            stmt.setString(4, lcm.getbarcode());
            stmt.setString(5, lcm.getLcode());
    
            int result = stmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Loyality Member has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }    
   }
     
     public void updateMember()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE loyalitycardcustomer SET Name = ?, totalpoints=?, barcode=?, Lcode=? WHERE memberId = '"+ lcm.getmemId() + "';";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, lcm.getName());
             stmt.setDouble(2, lcm.gettotpoint());
             stmt.setString(3, lcm.getbarcode());
             stmt.setString(4, lcm.getLcode());

             int result = stmt.executeUpdate();

             if (result > 0) {
                 JOptionPane.showMessageDialog(null, "Credit Customer has been updated succesfully ", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
             } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
    
}
