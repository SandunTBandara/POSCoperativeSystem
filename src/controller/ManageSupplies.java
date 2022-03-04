/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Supplier;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageSupplies {

    Supplier Supplies;

    public ManageSupplies() {

    }

    public ManageSupplies(Supplier Supplies) {
        this.Supplies = Supplies;
    }

    public String loadCount() {
        String no = "";
        try {
            Connection con = DB.createConnection();

            String sql = "Select count(scode) from supplier;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                no = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return no;

    }

    public void savesupplier() {
        try {

            Connection con = DB.createConnection();

            String sql = "INSERT INTO supplier(scode, sname ,ContactName ,delivery_day_count ,address ,contact_no) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, Supplies.getSCode());

            stmt.setString(2, Supplies.getSname());

            stmt.setString(3, Supplies.getCname());

            stmt.setInt(4, Supplies.getDay());

            stmt.setString(5, Supplies.getSaddress());

            stmt.setInt(6, Supplies.getContactNo());

            int result = stmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(getVisibleContent(), "Supplier has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error is " + e.getMessage());
        }

    }
    
    public ResultSet ViewSupliertable(String sname) {
        ResultSet result = null;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM supplier  WHERE (scode   LiKE '" + sname + "%' or  Sname LiKE '" + sname + "%') ";
            result = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
     public ResultSet getSupplierName(int code){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select Sname from supplier where scode = " + code + ";";
            result = stmt.executeQuery(sql);
    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
        
    }
    
    public String getsuppliernamebyid(String sname)
    {
        String name= "";
        try{
      Connection con = DB.createConnection();
      Statement stmt = con.createStatement();
      String sql = "select Sname from supplier where scode = "+sname+"";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next())
      {
         name = rs.getString("Sname");
      }
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
      
      return name;
    
    
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
