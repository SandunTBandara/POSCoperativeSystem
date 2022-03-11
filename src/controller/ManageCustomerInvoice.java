/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.CustomerInvoice;
import model.DB;

/**
 *
 * @author Sanu
 */
public class ManageCustomerInvoice {
    
    CustomerInvoice CustomerInvoices;
    
    public ManageCustomerInvoice()
    {
    }
    
    public ManageCustomerInvoice(CustomerInvoice CustomerInvoices)
    {
      this.CustomerInvoices = CustomerInvoices;
    }
    
    public ResultSet GetInvoiceNo()
    {
        ResultSet result = null;
        try{
       Connection con = DB.createConnection();
       Statement stmt = con.createStatement();
       String sql = "Select * from customerinvoice";
       result = stmt.executeQuery(sql);
       
        }
        catch(Exception e)
        {
          System.out.println("GetInvoiceno error" +e.getMessage());
        }
        
        return result;
    }
    
    public void saveInvoice()
    {
        try{
      Connection con = DB.createConnection();
      String sql = "Insert into customerinvoice (Memberid,Points,invoiceNo,itemQty,ItemDiscounts,subTotal,Date,Time,Unit,netTotal,Balance,Creditamount,Paycash,cusNo,shiftNo) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setString(1, CustomerInvoices.getmemberID());
      stmt.setDouble(2, CustomerInvoices.getpoints());
      stmt.setString(3, CustomerInvoices.getInvoiceNo());
      stmt.setDouble(4, CustomerInvoices.getitmqty());
      stmt.setDouble(5, CustomerInvoices.getitemdiscount());
      stmt.setDouble(6, CustomerInvoices.getsubtotal());
      stmt.setString(7, CustomerInvoices.getdate());
      stmt.setString(8, CustomerInvoices.gettime());
      stmt.setInt(9, CustomerInvoices.getunit());
      stmt.setDouble(10, CustomerInvoices.getnetTotal());
      stmt.setDouble(11, CustomerInvoices.getbalance());
      stmt.setDouble(12, CustomerInvoices.getcreditamount());
      stmt.setDouble(13, CustomerInvoices.getpaycash());
      stmt.setInt(14, CustomerInvoices.getcusNo());
      stmt.setString(15, CustomerInvoices.getshiftNo());
      
      int result = stmt.executeUpdate();
      
             if (result > 0) {
                 System.out.println("Invoice Saved succesfully");
             } 
             else{
             JOptionPane.showMessageDialog(null, "Invoice not Added", "SuperMarket POS Management", JOptionPane.ERROR_MESSAGE);
             }
  
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
          //JOptionPane.showMessageDialog(null, "not saved","Super Market POS system",JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    
}
