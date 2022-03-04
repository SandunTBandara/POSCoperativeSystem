
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DB;
import model.PurchaseReturns;

public class ManagePurchaseReturn {
    PurchaseReturns purchase = new PurchaseReturns();

    public ManagePurchaseReturn(){
        
    }
    
    public ManagePurchaseReturn(PurchaseReturns purchase){
        this.purchase = purchase;
    }
    
    public ResultSet displayAll(){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM purchasereturn";
            result = stmt.executeQuery(sql);
                
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
    }
    
    public int savePurchaseReturn(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchasereturn(F19No,date) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, purchase.getF19No());
            stmt.setDate(2, purchase.getDate());
            System.out.println(purchase.getF19No());
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int savePurchaseReturnRecords(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchasereturnrecords(F16Bno, F19No,Stcode, suppilerID, PaymentType, totalCanceledPrice, canceldiscount, canceledvat, canceleditemdecrease, canceledloadRent, canceledfreelssue, subTotalCanceledAmount) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, purchase.getF16Bno());
            stmt.setString(2, purchase.getF19No());
            stmt.setString(3, purchase.getStcode());
            stmt.setInt(4, purchase.getSuppilerID());
            stmt.setString(5, purchase.getPaymentType());
            stmt.setDouble(6, purchase.getTotalCanceledPrice());
            stmt.setDouble(7, purchase.getCanceldiscount());
            stmt.setDouble(8, purchase.getCanceledvat());
            stmt.setDouble(9, purchase.getCanceleditemdecrease());
            stmt.setDouble(10, purchase.getCanceledloadRent());
            stmt.setDouble(11, purchase.getCanceledfreelssue());
            stmt.setDouble(12, purchase.getSubTotalCanceledAmount());

            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int savePurchaseReturnItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchasereturnitems(Code, F19No, Qty, cancelQty) VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, purchase.getCode());
            stmt.setString(2, purchase.getF19No());
            stmt.setDouble(3, purchase.getQty());
            stmt.setDouble(4, purchase.getCancelQty());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int savePurchaseReturnFreeItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO purchasereturngrnfreeitems(Code, F19No, cancelQty) VALUES (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, purchase.getFreeCode());
            stmt.setString(2, purchase.getF19No());
            stmt.setDouble(3, purchase.cancelFreeQty());
            System.out.println(sql);
                        System.out.println(purchase.getFreeCode() + "   " + purchase.getF19No() + "   " + purchase.cancelFreeQty());

            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
     
}
