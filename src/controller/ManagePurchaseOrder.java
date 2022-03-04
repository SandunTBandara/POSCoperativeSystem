
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DB;
import model.GRN;
import model.PurchaseOrders;


public class ManagePurchaseOrder {
    PurchaseOrders order = new PurchaseOrders();
    
    public ManagePurchaseOrder(){
        
    }
    
    public ManagePurchaseOrder(PurchaseOrders order){
        this.order = order;
    }
    
     public int saveOrder(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchaseorder(F23No,date) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, order.getF23No());
            stmt.setDate(2, order.getdate());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
     
    public int saveOrderRecords(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchaseorderrecords(strcode,F23No,TotalAmount, scode) VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, order.getstrcode());
            stmt.setString(2, order.getF23No());
            stmt.setDouble(3, order.getTotalAmount());
            stmt.setInt(4, order.getscode());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int saveOrderItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchaseorderitems(code, qty, BuyingPrice, TotalPrice, F23No) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, order.getcode());
            stmt.setDouble(2, order.getqty());
            stmt.setDouble(3, order.getBuyingPrice());
            stmt.setDouble(4, order.getTotalprice());
            stmt.setString(5, order.getF23No());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public ResultSet displayAll(){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM purchaseorder";
            result = stmt.executeQuery(sql);
                
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
    }
}
