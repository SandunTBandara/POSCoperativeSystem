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
public class CustomerInvoice {
    private String InvoiceNo;
    private int points;
    private String MemberId;
    private double itemqty;
    private double itemdiscount;
    private double subtotal;
    private String date;
    private String time;
    private int unit;
    private double netTotal;
    private double balance;
    private double creditamount;
    private double paycash;
    private int cusNo;
    private String shiftNo;
    
    public CustomerInvoice(String MemberId,String InvoiceNo,int points,double itemqty,double itemdiscount,double subtotal,String date,String time,int unit,double netTotal,double balance,double creditamount,double paycash,int cusNo,String shiftNo)
    {
        this.InvoiceNo = InvoiceNo;
        this.MemberId = MemberId;
        this.points = points;
        this.itemqty = itemqty;
        this.itemdiscount = itemdiscount;
        this.subtotal = subtotal;
        this.date = date;
        this.time =time;
        this.unit = unit;
        this.netTotal = netTotal;
        this.balance = balance;
        this.creditamount = creditamount;
        this.paycash = paycash;
        this.cusNo = cusNo;
        this.shiftNo = shiftNo;
        
    }


    public String getmemberID() {
        return MemberId;
    }

    public String getInvoiceNo() {
        return InvoiceNo;
    }

    public int getpoints() {
        return points;
    }
    
    public double getitmqty() {
        return itemqty;
    }

    public double getitemdiscount() {
        return itemdiscount;
    }

    public double getsubtotal() {
        return subtotal;
    }

    public String getdate() {
        return date;
    }

    public String gettime() {
        return time;
    }

    public int getunit() {
        return unit;
    }

    public double getnetTotal() {
        return netTotal;
    }

    public double getbalance() {
        return balance;
    }

    public double getcreditamount() {
        return creditamount;
    }

    public double getpaycash() {
        return paycash;
    }
        public int getcusNo() {
        return cusNo;
    }
            public String getshiftNo() {
        return shiftNo;
    }


}
