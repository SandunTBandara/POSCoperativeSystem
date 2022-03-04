
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
}
