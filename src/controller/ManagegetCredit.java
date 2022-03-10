/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.DB;
import model.GetCredit;

/**
 *
 * @author Sanu
 */
public class ManagegetCredit {
    GetCredit Gc1;
    
    public ManagegetCredit()
    {
    
    }
    public ManagegetCredit(GetCredit Gc1)
    {
      this.Gc1 = Gc1;
    }
    public int saveGetCredit()
    {
        int check=0;
        try{
     Connection con = DB.createConnection();
     String sql = "insert into getcreditformation (cusNo,creditCode,BalanceAmount,creditAmount,invoiceNo) values(?,?,?,?,?)";
     PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setInt(1, Gc1.getcusno());
     stmt.setInt(2, Gc1.getccode());
     stmt.setDouble(3, Gc1.getbamount());
     stmt.setDouble(4, Gc1.getcreditamount());
     stmt.setString(5, Gc1.getinvoiceno());
     
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
