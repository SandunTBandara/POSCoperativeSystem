/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageCategory {
    Category Categories;
    public  ManageCategory()
    {
    
    }
    public ManageCategory(Category Categories)
    {
        this.Categories = Categories;
    }
    
    public ResultSet displaytableview(String no)
    {    ResultSet rs = null;
        try {
            Connection con = DB.createConnection();
            String sql = "Select * from category where dno = "+Integer.parseInt(no)+" ";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
             
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return rs;
    }
    
    
    public ResultSet Viewcategorytable(String Cname, String dpno) {
        ResultSet result = null;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM category  WHERE (category   LiKE '" + Cname + "%' or  cno LiKE '" + Cname + "%') and dno= "+Integer.parseInt(dpno)+"  ";
            result = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    
    public String getCategorynamebyID(String cno) throws java.lang.Exception
    {
      String cname = "";
      Connection con = DB.createConnection();
      Statement stmt = con.createStatement();
      String sql = "select category from category where cno = "+cno+" ";
      ResultSet rs = stmt.executeQuery(sql);
      
      while(rs.next())
      {
          cname = rs.getString("category");
      }
      
    
    return cname;
    }
    
    
    
}
