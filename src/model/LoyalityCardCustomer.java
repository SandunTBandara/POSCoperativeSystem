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
public class LoyalityCardCustomer {
    private String memberID;
    private String Name;
    private String barcode;
    private String cardType;
    String LCode;
    double totpoint;
    
    public LoyalityCardCustomer(String barcode,String memberID,String Name,String cardType,String LCode,double totpoint)
    {
       this.barcode = barcode;
       this.memberID = memberID;
       this.Name = Name;
       this.cardType = cardType;
       this.LCode = LCode;
       this.totpoint = totpoint;
       
    }
    
    public String getbarcode()
    {
      return barcode;
    }
    public String getName()
    {
      return Name;
    }
    public String getmemId()
    {
      return memberID;
    }
    public String getcardType()
    {
      return cardType;
    }
    public String getLcode()
    {
      return LCode;
    }
    public double gettotpoint()
    {
      return totpoint;
    }
    
}
