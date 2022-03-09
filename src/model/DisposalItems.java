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
//disposalltems
public class DisposalItems {
    private String F17No;
    private Date Date;
    private double TotalBuyingPrice;
    private double TotalSellingPrice;
    private double totalLost;
    
    public void DisposalItems (String F17No,Date date,double  TotalBuyingPrice,double TotalSellingPrice,double totalLost)
    {
        this.F17No=F17No;
        this.Date= date;
        this.TotalBuyingPrice = TotalBuyingPrice;
        this.TotalSellingPrice = TotalSellingPrice;
        this.totalLost = totalLost;
    }
    
    public String getF17No()
    {return F17No;
    }
    public Date getDate()
    {return Date;
    }
    public double getTotalBuyingPrice()
    {return TotalBuyingPrice;
    }
    public double getTotalSellingPrice()
    {return TotalSellingPrice;
    }
    public double  getTotalLost()
    {return  totalLost;
    }
    
//    disposalltemsrecords
    public double Qty;
    public double Canceledqty;
    public double buyingPrice;
    public double SellingPrice;    
    public double tBPrice;
    public double tSPrice;
    public int Code ;
    
    public void disposalltemsrecords(double Qty, double Canceledqty,double buyingPrice,double SellingPrice, double tbprice, double tsprice, int Code) 
    {
        this.Qty= Qty;
        this.Canceledqty= Canceledqty;
        this.buyingPrice =  buyingPrice;
        this.SellingPrice =SellingPrice;
        this.tBPrice = tbprice;
        this.tSPrice = tsprice;
        this.Code = Code;
     
    } 
    public double getQty()
    {return Qty;
    }
    public double getCanceledqty()
    {return Canceledqty;
    }
    public double  getbuyingPrice()
    {return  buyingPrice;
    }
    public double getSellingPrice()
    {return SellingPrice;
    }
    public double  getTBPrice()
    {return  tBPrice;
    }
    public double getTSPrice()
    {return tSPrice;
    }
    public int getCode()
    {return Code;
    }
   
}
