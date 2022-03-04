
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DB;
import model.stockExchangeIN;
import model.stockExchangeOUT;

public class ManageStockExhangeOUT {
    stockExchangeOUT exchange = new stockExchangeOUT();
    
    public ManageStockExhangeOUT(){
        
    }
    
    public ManageStockExhangeOUT(stockExchangeOUT exchange){
        this.exchange = exchange;
    }
    
     public ResultSet displayAll(){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM stockexchangeout";
            result = stmt.executeQuery(sql);
                
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
    }
    
     public int saveExchange(){
//                     System.out.println("Stock save");

        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO stockexchangeout (F18No,Date, Toplace, No, Fromplace, TotalBuyingPrice, TotalSellingPrice) VALUES (?,?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, exchange.getF18No());
            stmt.setDate(2, exchange.getDate());
            stmt.setString(3, exchange.getTo());
            stmt.setInt(4, exchange.getBillNo());
            stmt.setString(5, exchange.getFrom());
            stmt.setDouble(6, exchange.getTBPrice());
            stmt.setDouble(7, exchange.getTSPrice());
            

            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
     
    public int saveExchangeItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO stockexchangeoutrecords(buyingPrice, SellingPrice, Qty, TotalBuyingPrice, TotalSellingPrice, F18No, Code) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDouble(1, exchange.getBPrice());
            stmt.setDouble(2, exchange.getSPrice());
            stmt.setDouble(3, exchange.getQty());
            stmt.setDouble(4, exchange.getItemTBPrice());
            stmt.setDouble(5, exchange.getItemsTSPrice());
            stmt.setString(6, exchange.getF18No());
            stmt.setInt(7, exchange.getCode());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
