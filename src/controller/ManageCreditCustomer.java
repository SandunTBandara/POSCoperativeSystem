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
    
    
}
