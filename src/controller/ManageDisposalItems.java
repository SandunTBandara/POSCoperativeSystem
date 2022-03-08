/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.cj.protocol.Resultset;
import model.DisposalItems;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.time.Clock.system;
import model.DB;

/**
 *
 * @author USER
 */
public class ManageDisposalItems {
    DisposalItems DItem = new DisposalItems();
 


    public ManageDisposalItems() {

    }

    public ManageDisposalItems (DisposalItems DItem)
    {
        this.DItem = DItem;
    }

     public ResultSet displayitemsall() throws Exception 
     {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement st = con.createStatement();
            String sql= "select* from  disposalltems ";
            result = st.executeQuery(sql);
             } 
        catch(SQLException e){
            System.out.println("insert error" + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
     } 

    public int savedisposal(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO disposalltems(F17No,Date, TotalBuyingPrice, TotalSellingPrice, totalLost) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, DItem.getF17No());
            stmt.setDate(2, DItem.getDate());
            stmt.setDouble(3, DItem.getTotalBuyingPrice());
            stmt.setDouble(4, DItem.getTotalSellingPrice());
            stmt.setDouble(5, DItem.getTotalLost());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int savedisposalRecords(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO disposalltemsrecords(F17No,Qty, Canceledqty, buyingPrice, SellingPrice, TotalBuyingPrice, TotalSellingPrice, Code) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, DItem.getF17No());
            stmt.setDouble(2, DItem.getQty());
            stmt.setDouble(3, DItem.getCanceledqty());
            stmt.setDouble(4, DItem.getbuyingPrice());
            stmt.setDouble(5, DItem.getSellingPrice());
            stmt.setDouble(6, DItem.getTBPrice());
            stmt.setDouble(7, DItem.getTSPrice());
            stmt.setInt(8, DItem.getCode());
    
            result = stmt.executeUpdate();
            System.out.println("hsdhfjdkhafkl");
             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}