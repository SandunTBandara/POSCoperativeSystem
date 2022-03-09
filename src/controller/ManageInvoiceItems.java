/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.DB;
import model.InvoiceItems;

/**
 *
 * @author Sanu
 */
public class ManageInvoiceItems {
    
    InvoiceItems InvoiceItems1;
    
    public ManageInvoiceItems()
    {
    
    }
    public ManageInvoiceItems(InvoiceItems InvoiceItems)
    {
      this.InvoiceItems1 = InvoiceItems;
    }
    
    public void saveInvoiceItems()
    {
        try{
      Connection con = DB.createConnection();
      String sql = "Insert into invoiceitems (Code,invoiceNo,Qty,Price,Discount,TotalPrice) values (?,?,?,?,?,?)";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setInt(1, InvoiceItems1.getcode());
      stmt.setString(2, InvoiceItems1.getIno());
      stmt.setDouble(3, InvoiceItems1.getqty());
      stmt.setDouble(4, InvoiceItems1.getprice());
      stmt.setDouble(5, InvoiceItems1.getdiscount());
      stmt.setDouble(6, InvoiceItems1.gettotprice());
      int result = stmt.executeUpdate();
      
      if(result > 0)
      {
        System.out.println("Success fully added invoice data");
      }
      
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
}
