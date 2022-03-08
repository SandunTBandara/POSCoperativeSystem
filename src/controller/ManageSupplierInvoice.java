
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.DB;
import model.suplierInvoice;

public class ManageSupplierInvoice {
    suplierInvoice invoice = new suplierInvoice();
            
    public ManageSupplierInvoice(){
        
    }
    
    public ManageSupplierInvoice(suplierInvoice invoice){
        this.invoice = invoice;
    }
    
    public ResultSet displayAll() {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM supplierinvoice";
            result = stmt.executeQuery(sql);
                
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
    }
    
    public int saveInvoice(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO supplierinvoice(siNo,date,F23No) VALUES (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, invoice.getNo());
            stmt.setDate(2, invoice.getDate());
            stmt.setString(3, invoice.getF23no());
   
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int saveInvoiceRecords(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO supplierinvoicerecords(stcode,totalBuyingPrice, Bdiscount, totalItems, Bvat, itemdecrease, loadRent, freelssue, totalAmount, spcode, siNo, disPer, vatPer,freeIssuePrice) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, invoice.getStcode());
            stmt.setDouble(2, invoice.getTotalBprice());
            stmt.setDouble(3, invoice.getBdiscount());
            stmt.setDouble(4, invoice.getNoOfItems());
            stmt.setDouble(5, invoice.getBvat());
            stmt.setDouble(6, invoice.getDecrease());
            stmt.setDouble(7, invoice.getLoadRent());
            System.out.println("free qty" + invoice.getFreeIssueQty() + "   free price " + invoice.getFreeIssuePrice());
            stmt.setDouble(8, invoice.getFreeIssueQty());
            stmt.setDouble(9, invoice.getSubTotal());
            stmt.setInt(10, invoice.getSpcode());
            stmt.setString(11, invoice.getNo());
            stmt.setDouble(12, invoice.getDPer());
            stmt.setDouble(13, invoice.getVPer());
            stmt.setDouble(14, invoice.getFreeIssuePrice());
   
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println("line 84 " +e.getMessage());
        }
        return result;
    }
    
    public int saveInvoiceItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO supplierinvoiceitems (code, siNo, stockQty, qty, BuyingPrice, TotalBuyingPrice, TotalQty) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, invoice.getCode());
            stmt.setString(2, invoice.getNo());
            stmt.setDouble(3, invoice.getStockQty());
            stmt.setDouble(4, invoice.getQty());
            stmt.setDouble(5, invoice.getBPrice());
            stmt.setDouble(6, invoice.getTBprice());
            stmt.setDouble(7, invoice.getTotalQty());
   
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int saveInvoiceFreeItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO supplierinvoicefreeitems (code, siNo, Price, Qty, totalprice) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, invoice.getFcode());
            stmt.setString(2, invoice.getNo());
            stmt.setDouble(3, invoice.getPrice());
            stmt.setDouble(4, invoice.getFreeQty());
            stmt.setDouble(5, invoice.getFreeTotalPrice());
   
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
