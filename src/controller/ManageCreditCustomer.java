/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.CreditCustomer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageCreditCustomer {
    CreditCustomer creditcustomer1;
    public ManageCreditCustomer()
    {
    
    }
    public ManageCreditCustomer(CreditCustomer credditcustomer1)
    {
     this.creditcustomer1 = creditcustomer1;
    }
    
    public ResultSet viewcreditcustomer() throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from creditcustomerinformation";
        result = stmt.executeQuery(sql);
       
        return result;
     
       
    }
        public ResultSet viewcreditcustomerbycus(int cno) throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from creditcustomerinformation where 	CusNo = '"+cno+"' ";
        result = stmt.executeQuery(sql);
       
        return result;
     
       
    }
        
     public int UpdateItemStock(int code, double limit)
    {  
        int check = 0;
        try{
            
            Connection con = DB.createConnection();
            String sql = "update creditcustomerinformation set creditLimit = '"+limit+"'  where CusNo='"+code+"' ";
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
    
    public ResultSet getcustomer(int id) throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from creditcustomerinformation where CusNo = "+id;
        result = stmt.executeQuery(sql);
       
        return result;
    }
    
    public ResultSet loadPaidCreditInformation(int id) throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from paycreditinformation where BalanceAmount= 0 and creditCode = (select creditCode from getcreditformation where CusNo = "+id+");";
       result = stmt.executeQuery(sql);
       
        return result;
    }
    
    public ResultSet loadNonPaidCreditInformation(int id) throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from paycreditinformation where BalanceAmount != 0 and creditCode = (select creditCode from getcreditformation where CusNo = "+id+");";
       result = stmt.executeQuery(sql);
       
        return result;
    }
    
    public ResultSet loadGetCreditInformation(int id, int code) throws Exception
    {
       ResultSet result = null;  
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from getcreditformation where CusNo = "+id+" and creditCode = "+code;
        result = stmt.executeQuery(sql);
       
        return result;
    }
    
    public int saveCustomer()
    {   
        int result=0; 
        try{
             Connection con = DB.createConnection();
             String sql = "INSERT INTO creditcustomerinformation (CusNo,name,creditLimit, NIC, telno, address, ccode) VALUES (?,?,?,?,?,?,?)";
             PreparedStatement stmt = con.prepareStatement(sql); 

            stmt.setInt(1, creditcustomer1.getCusNo());
            stmt.setString(2, creditcustomer1.getName());
            stmt.setDouble(3, creditcustomer1.getCreditLimit());
            stmt.setString(4, creditcustomer1.getNic());
            stmt.setInt(5, creditcustomer1.getTel());
            stmt.setString(6, creditcustomer1.getAddress());
            stmt.setInt(7, creditcustomer1.getCTypeId());

            result = stmt.executeUpdate();
            
        }
        catch(Exception e)
        {
          System.out.println("line 78" + e.getMessage());
        }
        return result;
    }

    
    public void updateCredit()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE creditcustomerinformation SET name = ?, creditLimit=?, NIC=?, telno=?, address=?, ccode=?   WHERE CusNo = "+ creditcustomer1.getCusNo() + ";";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, creditcustomer1.getName());
             stmt.setDouble(2, creditcustomer1.getCreditLimit());
             stmt.setString(3, creditcustomer1.getNic());
             stmt.setInt(4, creditcustomer1.getTel());
             stmt.setString(5, creditcustomer1.getAddress());
             stmt.setInt(6, creditcustomer1.getCTypeId());

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
