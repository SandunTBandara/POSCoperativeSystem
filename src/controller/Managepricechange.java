/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DB;
import model.Pricechanges;

/**
 *
 * @author USER
 */
public class Managepricechange {
    Pricechanges price = new Pricechanges();
       
    public Managepricechange(){
       
    }
    
    public Managepricechange( Pricechanges price){       
        this.price = price;
    }
       
    public ResultSet displayitemsall() throws Exception 
    {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement st = con.createStatement();
            String sql= "select* from  pricechange ";
            result = st.executeQuery(sql);
        }catch(SQLException e){
            System.out.println("insert error" + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
    }
    
    public int savePriceChange(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO pricechange(F17No,Date, Profit, Lost) VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, price.getF17No());
            stmt.setDate(2, price.getDate());
            stmt.setDouble(3, price.getProfit());
            stmt.setDouble(4, price.getLost());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int savePriceChangeItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO pricechangeitems(Code, F17No,stockQty,Qty,TotalPrice,IncreasedPrice, DecreasedPrice, IncreasedDifferent, decreasedDifferent, Lost, Profit) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, price.getCode());
            stmt.setString(2, price.getF17No());
            stmt.setDouble(3, price.getStockQty());
            stmt.setDouble(4, price.getQty());
            stmt.setDouble(5, price.getTotalPrice());
            stmt.setDouble(6, price.getIncreasedPrice());
            stmt.setDouble(7, price.getDecreasedPrice());
            stmt.setDouble(8, price.getIncreasedDifferent());
            stmt.setDouble(9, price.getdecreasedDifferent());
            stmt.setDouble(10, price.getILost());
            stmt.setDouble(11, price.getIProfit());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
        

}
