/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DB;
import model.frontlogin;

/**
 *
 * @author Sanu
 */
public class ManageFrontLogin {
    
    frontlogin flogin;
    
    public ManageFrontLogin()
    {
    }
    public ManageFrontLogin(frontlogin login)
    {
     this.flogin = login;
    
    }
    
    public ResultSet loadlogin()
    {
        ResultSet result = null;
        try{
      Connection con = DB.createConnection();
      
      String sql = "select * from users where userID = '"+flogin.getuserId()+"' and Password = '"+flogin.getpassword()+"' ";
      PreparedStatement pst = con.prepareStatement(sql);
      result = pst.executeQuery(sql);
      
    
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage()); 
        }
        
        return result;
    }
    
}
