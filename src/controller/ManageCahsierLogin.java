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
import model.CashierLogin;

/**
 *
 * @author Sanu
 */
public class ManageCahsierLogin {
    
    CashierLogin clogin1;
    
    public ManageCahsierLogin()
    {
    
    }
    public ManageCahsierLogin(CashierLogin clogin)
    {
      this.clogin1 = clogin;
    }
    
    public ResultSet getcashierlogin() {
        ResultSet result = null;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from cashierloginin";
            result = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
     int result;
    public int saveCashierlogin()
    {
       
        try{
       Connection con = DB.createConnection();
       String sql = "insert into cashierloginin (shiftNo,Uname,Counter,signinDate,signinTime,FloatAmount) values (?,?,?,?,?,?)";
       PreparedStatement stmt = con.prepareStatement(sql);
       stmt.setString(1, clogin1.getID());
       stmt.setString(2, clogin1.getUname());
       stmt.setInt(3, clogin1.getcounter());
       
       stmt.setString(4, clogin1.getsigindate());
       System.out.println(clogin1.getsigindate());
       stmt.setString(5, clogin1.getsignintime());
       stmt.setDouble(6, clogin1.getfamount());
       //stmt.setString(7, clogin1.signoutdate());
      // stmt.setString(8, clogin1.getsignouttime());
       
       result = stmt.executeUpdate();
       
       if(result <0)
       {
          JOptionPane.showMessageDialog(null, "error", "Super Market POS",JOptionPane.ERROR_MESSAGE);
       }
       
        
        
        }
        catch(Exception e)
        {
           System.out.println("error2" +e.getMessage());
        }
        return result;
       
    
    }
    
    int result1;
     public int updateuserlogin(String date, String time,double famount,String sno)
    {
        try{
        Connection con = DB.createConnection();
        String sql = "Update cashierloginin set SignOutDate = '"+date+"' , SignOutTime = '"+time+"' , FloatAmountOut = '"+famount+"'   where shiftNo = '"+sno+"' ";
        PreparedStatement stmt = con.prepareStatement(sql);
        result1 = stmt.executeUpdate();
        
        if(result1<0 )
        {
           JOptionPane.showMessageDialog(null, "Not Update", "Super MArket POS System", JOptionPane.ERROR_MESSAGE);
        }
        
        }
        catch(Exception e)
        {
          System.out.println("error update" +e.getMessage());
        }
        return result1;
    
    }
    
    
    

    
    
}
