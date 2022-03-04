/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author USER
 */
//purchaseorder
public class PurchaseOrders {
    public String F23No ;
    public Date date ;
    
    
    public void order(String F23No,Date date){
        this.F23No=F23No;
        this.date= date;
    }
    
    public String getF23No(){
    return F23No;
    }
    
    public Date getdate()
    { return date;
    
    }

//    purchaseorderitems
    public int code;
    public Double qty;
    public Double 	BuyingPrice;
    public Double TotalPrice;
    
    public void setpurchaseorderitems(int code,Double qty,Double BuyingPrice,Double TotalPrice){
    
        this.code= code;
        this.qty=qty;
        this.BuyingPrice= BuyingPrice;
        this.TotalPrice= TotalPrice;
    
    }
    public int getcode()
    { 
        return code;
    }
    
    public Double getqty()
    {
        return qty;
    }
    public Double getBuyingPrice()
    { 
        return BuyingPrice;
    }
    public Double getTotalprice()
    {
        return TotalPrice;
    }
//    purchaseorderrecords
    
    public String strcode;
    public Double TotalAmount;
    public int scode;
    
    public void setPurchaseOrderRecords( String strcode,Double TotalAmount,int scode)
    { this.strcode=strcode;
      this.TotalAmount= TotalAmount;
      this.scode= scode;
    }
    
    public String getstrcode()
    {
        return strcode;    
    }
   

    public Double getTotalAmount()
    { 
        return TotalAmount;
    }
     
    public int getscode()
    {
        return scode;
    }
     

     
}


