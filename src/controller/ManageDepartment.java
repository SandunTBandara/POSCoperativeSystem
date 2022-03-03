/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Departments;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;


/**
 *
 * @author Sanu
 */
public class ManageDepartment {
    
    Departments departments;
    
    public  ManageDepartment(){
           
    }
   public  ManageDepartment(Departments departments){
           this.departments = departments;
    }
   
    public String getNo() {
        String no = "";
        try {
            Connection con = DB.createConnection();
            String q = "Select count(dno) as count from department;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q);

            while (rs.next()) {
                no = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return no;
    }
    
    
    
   public String getName() {
//int DId = departments.getID();

      Departments dj = new Departments();
     int ID =  dj.getID();

        String name = "";
        try {
            Connection con = DB.createConnection();
            String sql = "select description  from department where dno = 2; ";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                name = rs.getString("description");
            }

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

        return name;
    }
   
   //pass item name to Iteminformation view 
   public String GetNamewithId(String x)
   {
        String name = "";
        
        try{
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String sql = "select description from department where dno = "+x+"";
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next())
        {
               name = rs.getString("description");
        }
        
        
        
        
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
   
     return name;
   }
   
   public ResultSet loaddepartment()
   { ResultSet result = null;
       try{
    Connection con = DB.createConnection();
    String sql= "Select * from department";
    Statement stmt = con.createStatement();
    result = stmt.executeQuery(sql);
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage());
       }
       
       return result;
   
   
   }
   public ResultSet loaddepartmentsearch(String departmentname)
   {
       ResultSet result = null;
       try{
             Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM department WHERE Description LiKE '" + departmentname + "%' or  dno LiKE '" + departmentname + "%'   ";
            result = stmt.executeQuery(sql);
           
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       return result;
       }
   
  
   public void savedepartment()
   {                try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO department(dno,Description) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, departments.getID() );
            stmt.setString(2, departments.getDescription());
    
            int result = stmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(getVisibleContent(), "Department has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            } 
   }
   catch(Exception e)
   {
     System.out.println(e.getMessage());
   }
   
   
   
   }
   
       
            Window getVisibleContent() {
        Window result = null;
        for (Window w : Window.getWindows()) {
            if (w.isVisible()) {
                result = w;
            }
        }
        return result;
    }

}
