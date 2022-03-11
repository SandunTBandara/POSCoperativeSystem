
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;
import model.LoyalityCard;
import model.LoyalityCardCustomer;

public class ManageLoyalityCard {
    LoyalityCard card;
     public ManageLoyalityCard()
    {
    
    }
    public ManageLoyalityCard(LoyalityCard card)
    {
      this.card = card;
    }
    
    public ResultSet getloyalityCord()
    {
        ResultSet result = null;
        try{
            
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String Sql = "Select * from loyalitycardinformation";
        result = stmt.executeQuery(Sql);
        
        }
        catch(Exception e)
        {
          System.out.println("getloyalerror1" +e.getMessage());
        }
        
        return result;
    }
    
    public ResultSet getCardNameByID(String id)
    {
        ResultSet result = null;
        try{
            
        Connection con = DB.createConnection();
        Statement stmt = con.createStatement();
        String Sql = "Select * from loyalitycardinformation where Lcode='"+id+"' or ICname='"+id+"';";
        result = stmt.executeQuery(Sql);
        
        }
        catch(Exception e)
        {
          System.out.println("getloyalerror1" +e.getMessage());
        }
        
        return result;
    }
    public void saveLoyalityCard()
    {    
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO loyalitycardinformation (Lcode,ICname) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println(card.getCode() + "   "+ card.getName());
            stmt.setString(1, card.getCode());
            stmt.setString(2, card.getName());
    
            int result = stmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Department has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
            } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }    
   }
    
    public void updateLoyal()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE loyalitycardinformation SET ICname = ? WHERE Lcode = '"+ card.getCode()+ "';";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, card.getName());

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
