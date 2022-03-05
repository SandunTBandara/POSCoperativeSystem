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
public class CashierLogin {
    private static String shiftID;
    private static String uname;
    private int counter;
    private String signingdate;
    private String signingtime;
    private double floatingammount;
    private String signoutdate;
    private String signouttime;
    
    public CashierLogin(String shiftID,String uname,int counter,String siginingdate,String signintime,double floatingamount,String signoutdate,String Signouttime)
    {
       this.shiftID = shiftID;
       this.uname = uname;
       this.counter = counter;
       this.signingdate = siginingdate;
       this.signingtime = signintime;
       this.floatingammount = floatingamount;
       this.signoutdate = signoutdate;
       this.signouttime = Signouttime;
    }
    
    public String getID()
    {
      return shiftID;
    }
    
    public String getUname()
    {
      return uname;
    }
    
    public int getcounter()
    {
      return counter;
    }
    public String getsigindate()
    {
    return signingdate;
    }
    public String getsignintime()
    {
      return signingtime;
    }
    public double getfamount()
    {
      return floatingammount;
    }
    public String signoutdate()
    {
      return signoutdate;
    }
    public String getsignouttime()
    {
     return signouttime;
    }
    
    
    
    
}
