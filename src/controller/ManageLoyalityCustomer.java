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
    
    public ResultSet getloyalitycustomer(String bcode)
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
    
    
}
