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
    
    public paycreditinformation(String shiftno,int ccode,double bamount,String date)
    {
       this.shiftno = shiftno;
       this.ccode = ccode;
       this.bamount = bamount;
       this.payamount = payamount;
       this.date = date;
    
    }
    
    public String getshiftno()
    {
       return shiftno;
    }
    public int getccode()
    {
     return ccode;
    }
    public double getbamount()
    {
      return bamount;
    }
    public String getdate()
    {
     return date;
    }
    
    
    
}
