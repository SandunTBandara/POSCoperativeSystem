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
    
    
}
