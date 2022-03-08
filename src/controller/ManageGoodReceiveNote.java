
package controller;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DB;
import model.GRN;

public class ManageGoodReceiveNote {
    GRN grn = new GRN();
    
    public ManageGoodReceiveNote(){
        
    }
    
    public ManageGoodReceiveNote(GRN grn){
        this.grn = grn;
    }
    
    public int saveGRN(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO goodreceivenote(F16No,date,status, F23No) VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, grn.getNo());
            stmt.setDate(2, grn.getDate());
            stmt.setString(3, grn.getStatus());
            stmt.setString(4, grn.getF23No());
    
            result = stmt.executeUpdate();

             
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int saveGRNRecord(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO goodreceivenoterecords (stcode, billNo, PaymentType, totalBuyingPrice, Bdiscount, totalItems, Bvat, BdiscountPercentage,BvatPercentage, itemdecrease, loadRent, freelssue, SubtotalAmount, totalsellingprice, freeIssueQty, SellingFreeIssue, SubTotalSellingPrice, spcode, F16No) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            System.out.println(grn.getStcode() + " " + grn.getBillNo() + " " + grn.getPayment()+ " " +grn.getTotalBprice()+ " " + grn.getNo()+ " "  );
            stmt.setString(1, grn.getStcode());
            stmt.setInt(2, grn.getBillNo());
            stmt.setString(3, grn.getPayment());
            stmt.setDouble(4, grn.getTotalBprice());
            stmt.setDouble(5, grn.getBdiscount());
            stmt.setDouble(6, grn.getNoOfItems());
            stmt.setDouble(7, grn.getBvat());
            stmt.setDouble(8, grn.getDPer());
            stmt.setDouble(9, grn.getVPer());
            stmt.setDouble(10, grn.getDecrease());
            stmt.setDouble(11, grn.getLoadRent());
            stmt.setDouble(12, grn.getFreeIssue());
            stmt.setDouble(13, grn.getSubTotal());
            stmt.setDouble(14, grn.getTotalSprice());
            stmt.setDouble(15, grn.getSellingFreeIssue());
            stmt.setDouble(16, grn.getFreeTotalPrice());
            stmt.setDouble(17, grn.getsubTotalSellingPrice());
            stmt.setInt(18, grn.getSpcode());
            stmt.setString(19, grn.getNo());
    
            result = stmt.executeUpdate();
            System.out.println("result is " +result);


            if (result ==0) {
                JOptionPane.showMessageDialog(null, "Error in saving GRN records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            } 
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("save grn records" +e.getMessage());
        }
        return result;
    }
    
    public int saveGRNItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO goodreceivenoteitems (code, F16BNo, stockQty, qty, BuyingPrice, SellingPrice, TotalSellingPrice, TotalBuyingPrice, TotalQty) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, grn.getCode());
            stmt.setString(2,grn.getNo());
            stmt.setDouble(3, grn.getStockQty());
            stmt.setDouble(4, grn.getQty());
            stmt.setDouble(5, grn.getBPrice());
            stmt.setDouble(6, grn.getSPrice());
            stmt.setDouble(7, grn.getTSprice());
            stmt.setDouble(8, grn.getTBprice());
            stmt.setDouble(9, grn.getTotalQty());
    
            result = stmt.executeUpdate();
            System.out.println("result is " +result);

            
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("insert error " + e.getMessage());
        }
        return result;
    }
    
    public int saveGRNfreeItems(){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "INSERT INTO grnfreeitems (Code, F16BNo, Price, Qty, totalPrice) values (?,?,?,?,?);";
            PreparedStatement stmt = con.prepareStatement(sql);
            System.out.println("grn free items in controller");
            
            System.out.println(String.valueOf(grn.getFcode()));
            System.out.println(String.valueOf(grn.getNo()));
            System.out.println(String.valueOf(grn.getPrice()));
            System.out.println(String.valueOf(grn.getFreeQty()));
            System.out.println(String.valueOf(grn.getFreeTotalPrice()));

            stmt.setInt(1, grn.getFcode());
            stmt.setString(2, grn.getNo());
            stmt.setDouble(3, grn.getPrice());
            stmt.setDouble(4, grn.getFreeQty());
            stmt.setDouble(5, grn.getFreeTotalPrice());
            result = stmt.executeUpdate();

            if (result ==0) {
                JOptionPane.showMessageDialog(null, "Error in saving GRN records ", "SuperMarket Management", JOptionPane.ERROR_MESSAGE);
            } 
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int updateUnsavedGRN(String grnNo){
        int result=0;
        try{
            Connection con = DB.createConnection();
            String sql = "UPDATE goodreceivenote SET status = 'save' WHERE F16No = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, grnNo);
    
            result = stmt.executeUpdate();
                        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public ResultSet displayGRNall() {
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM goodreceivenote";
            result = stmt.executeQuery(sql);
                
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println("lin 154" +e.getMessage());
        }
        return result;
    }
    
    public ResultSet displayGRN(String no){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from goodreceivenote where F16No = '" + no + "';";
            result = stmt.executeQuery(sql);
    
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public ResultSet displaySavedGRN(){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from goodreceivenote where status ='save';";
            result = stmt.executeQuery(sql);
    
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public ResultSet displayGRNRecord(String no){
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from goodreceivenoterecords where F16No = '" + no + "';";
            result = stmt.executeQuery(sql);
            
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public ResultSet displayGRNRecordItems(String no){
        System.out.println("hi");
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from goodreceivenoteitems where F16BNo = '" + no + "';";
            result = stmt.executeQuery(sql);
            
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
     public ResultSet displayGRNFreeItems(String no){
        System.out.println("hi");
        ResultSet result = null;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from grnfreeitems where F16BNo = '" + no + "';";
            result = stmt.executeQuery(sql);
            
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public ResultSet displayNonSavedGRN(){
        ResultSet result = null;
        System.out.println("hi");

        
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select goodreceivenote.F16No, goodreceivenote.date, goodreceivenoterecords.SubTotalSellingPrice from goodreceivenote INNER JOIN goodreceivenoterecords on goodreceivenote.F16No = goodreceivenoterecords.F16No where goodreceivenote.status = 'notSaved';";
            result = stmt.executeQuery(sql);
    
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    public int displayGRNno(String no){
        int r=0;
        try{
            System.out.println("hi unsaved no is " +no);
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from goodreceivenote;";
            ResultSet result = stmt.executeQuery(sql);
            
             while(result.next()){
                    System.out.println(result.getString("F16No"));
                    if(result.getString("F16No").toString().equals(no)){
                        r =1;
                        break;
                    }
                }
        }catch(SQLException e){
            System.out.println("select error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return r;
    }
    
    
    public ResultSet searchGRN(String no){
        ResultSet rs = null;
        try{
            System.out.println("hi unsaved no is " +no);
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "select * from goodreceivenote where F16No like '" + no + "%';";
            rs = stmt.executeQuery(sql);
            
        }catch(SQLException e){
            System.out.println("select error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public ResultSet searchGRNByDate(Date date){
        ResultSet rs = null;
        try{
            System.out.println("hi unsaved no is " +date);
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement(); 
            String sql = "select * from goodreceivenote where date like '" + date + "%';";
            rs = stmt.executeQuery(sql);
            
        }catch(SQLException e){
            System.out.println("select error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public int deleteGRNRecords(String no){
        int r=0;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "delete from goodreceivenoterecords where F16No = '" + no +"';";
            r = stmt.executeUpdate(sql);
    
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return r;
    }

    public int deleteGRNItems(String no){
        int r=0;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "delete from goodreceivenoteitems where F16BNo = '" + no +"';";
            r = stmt.executeUpdate(sql);
    
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return r;
    }
    
    public int deleteGRNfreeItems(String no){
        int r=0;
        try{
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "delete from grnfreeitems where F16BNo = '" + no +"';";
            r = stmt.executeUpdate(sql);
    
        }catch(SQLException e){
            System.out.println("insert error " + e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return r;
    }
}


