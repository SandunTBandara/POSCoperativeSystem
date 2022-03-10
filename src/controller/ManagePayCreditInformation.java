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
            String sql = "INSERT INTO paycreditinformation(shiftNo,creditCode,BalanceAmount,PayAmount,date,totalPayAmount) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, paycreditinformation.getshiftno() );
            stmt.setInt(2, paycreditinformation.getccode());
            stmt.setDouble(3, paycreditinformation.getbalance());
            stmt.setDouble(4, paycreditinformation.getpaymount());
            stmt.setString(5, paycreditinformation.getdate());
            stmt.setDouble(6, paycreditinformation.gettotpayamount());
            
    
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
       
        public ResultSet viewpaycreditcustomer(int creditCode) throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from paycreditinformation where creditCode = '"+creditCode+"'";
        result = stmt.executeQuery(sql);
       
        return result;
     
       
    }
}
