
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;
import model.User;

public class ManageUser {
    User user = new User();
    
    public ManageUser(){
        
    }
    
    public ManageUser(User user){
        this.user = user;
    }
    
    public ResultSet selectUsers()
    {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            String sql= "Select * from users";
            Statement stmt = con.createStatement();
            result = stmt.executeQuery(sql);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
        return result;  
    }
    
    
    public ResultSet getUsersPrivilage(String pri, String name)
    {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            String sql= "Select "+ pri + ", Type from users where userID ='"+ name+"';";
            Statement stmt = con.createStatement();
            result = stmt.executeQuery(sql);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
        return result;  
    }
    
    public ResultSet loadUserSearch(String name)
    {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            String sql= "Select * from users where userID like '"+ name + "%'";
            Statement stmt = con.createStatement();
            result = stmt.executeQuery(sql);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       
        return result;  
    }
    
    public void saveUser()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "INSERT INTO users (userID,Type) VALUES (?,?)";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, user.getCode());
             stmt.setString(2, user.getType());

             int result = stmt.executeUpdate();

             if (result > 0) {
                 JOptionPane.showMessageDialog(null, "User has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
             } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
    public void updateUser(String id)
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE users SET Type = ? WHERE userID = '"+ id + "';";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, user.getType());

             int result = stmt.executeUpdate();

             if (result > 0) {
                 JOptionPane.showMessageDialog(null, "User has been updated succesfully ", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
             } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
     public int updateUserPrivilage(String id)
    {       
        int result=0;
        try{
            System.out.println("user fcgvhbjnknjbvcfxdzs" +user.getCus() + "    " + user.getCredit() + "     " + user.getBinLoc());
             Connection con = DB.createConnection();
             String sql = "UPDATE users SET bi_cus = ?, bi_credit = ?, bi_dep = ?, bi_sup = ?, bi_store = ?, bi_cat = ?, bi_item = ?,  bi_binLoc = ?, bi_itemAlert = ?, bi_loyMember = ?, bi_loyCard = ?, bi_grn = ?,  en_order = ?, en_orderReturn = ?, en_exchange = ?, en_supInvoice = ?, en_disposal = ?, en_price = ?, en_cashier = ?, en_reports = ?  WHERE userID = '"+ id + "';";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setInt(1, user.getCus());
             stmt.setInt(2, user.getCredit());
             stmt.setInt(3, user.getDep());
             stmt.setInt(4, user.getSup());
             stmt.setInt(5, user.getStore());
             stmt.setInt(6, user.getCat());
             stmt.setInt(7, user.getItem());
             stmt.setInt(8, user.getBinLoc());
             stmt.setInt(9, user.getItemAlert());
             stmt.setInt(10, user.getLoyMem());
             stmt.setInt(11, user.getLoyCard());
             stmt.setInt(12, user.getGrn());
             stmt.setInt(13, user.getOrder());
             stmt.setInt(14, user.getOrderReturn());
             stmt.setInt(15, user.getExchage());
             stmt.setInt(16, user.getSupInvoice());
             stmt.setInt(17, user.getDisposal());
             stmt.setInt(18, user.getPrice());
             stmt.setInt(19, user.getCashier());
             stmt.setInt(20, user.getDisposal());

             result = stmt.executeUpdate();

        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
        return result;
    }
}
