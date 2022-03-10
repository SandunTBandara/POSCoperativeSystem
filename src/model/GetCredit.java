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
public class GetCredit {
    private int cusNo;
    private int creditcode;
    private double BalanceAmount;
    private double creditAmount;
    private String invoiceno;
    
    public GetCredit(int cusNo,int creditcode,double BalanceAmount,double creditAmount,String invoiceno)
    {
      this.cusNo = cusNo;
      this.creditcode = creditcode;
      this.BalanceAmount = BalanceAmount;
      this.creditAmount = creditAmount;
      this.invoiceno = invoiceno;
      
    }
    public int getcusno()
    {
      return cusNo;
    }
    public int getccode()
    {
      return creditcode;
    }
    public double getbamount()
    {
     return BalanceAmount;
    }
    public double getcreditamount()
    {
       return creditAmount;
    }
    public String getinvoiceno()
    {
      return invoiceno;
    }
    
}
