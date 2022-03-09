/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sanu
 */
public class InvoiceItems {
    private int code;
    private String invoiceno;
    private double qty;
    private double price;
    private double discount;
    private double totprice;
    
    public InvoiceItems(int code,String invoiceno,double qty,double price,double discount,double totprice )
    {
      this.code = code;
      this.invoiceno = invoiceno;
      this.qty = qty;
      this.price = price;
      this.discount = discount;
      this.totprice = totprice;
    }
    public int getcode()
    {
      return code;
    }
    public String getIno()
    {
      return invoiceno;
    }
    public double getqty()
    {
        return qty;
                }
    public double getprice()
    {
      return price;
    }
    public double getdiscount()
    {
      return discount;
    }
    public double gettotprice()
    {
      return totprice;
    }
    
}
