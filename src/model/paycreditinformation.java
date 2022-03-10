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
public class paycreditinformation {
    private String shiftno;
    private int ccode;
    private double bamount;
    private double payamount;
    private String date;
    private double total_payamount;
    public paycreditinformation(String shiftno,int ccode,double bamount,double payamount,String date,double total_payamount)
    {
       this.shiftno = shiftno;
       this.ccode = ccode;
       this.bamount = bamount;
       this.payamount = payamount;
       this.date = date;
       this.total_payamount = total_payamount;
    
    }
    
    public String getshiftno()
    {
       return shiftno;
    }
    public int getccode()
    {
     return ccode;
    }
    public double getpaymount()
    {
      return payamount;
    }
    public String getdate()
    {
     return date;
    }
    public double gettotpayamount()
    {
      return total_payamount;
    }
    public double getbalance()
    {
      return bamount;
    }
    
    
    
}
