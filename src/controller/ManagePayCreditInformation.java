/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.DB;
import model.paycreditinformation;

/**
 *
 * @author Sanu
 */
public class ManagePayCreditInformation {
    paycreditinformation paycreditinformation;
    public ManagePayCreditInformation()
    {
    
    }
    public ManagePayCreditInformation(paycreditinformation paycreditinformation1)
    {
      this.paycreditinformation = paycreditinformation1;
    }


    
       public int savepaycreditcustomer()
   {               
       int check = 0;
       try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO paycreditinformation(shiftNo,creditCode,BalanceAmount,date) VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, paycreditinformation.getshiftno() );
            stmt.setInt(2, paycreditinformation.getccode());
            stmt.setDouble(3, paycreditinformation.getbamount());
            stmt.setString(4, paycreditinformation.getdate());
    
            int result = stmt.executeUpdate();
            
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
}
