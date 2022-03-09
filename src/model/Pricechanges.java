
package model;

//Pricechange

import java.sql.Date;

public class Pricechanges {
    
    private String F17No;
    private Date Date;
    private double Profit;
    private double Lost;
    
    public void Pricechange(String F17No,Date Date,double Profit, double lost)
    { this.F17No = F17No;
      this.Date = Date;
      this.Profit = Profit;
      this.Lost = lost;
    }
    
    public String getF17No()
    {  
        return F17No;
    }
    public Date getDate()
    { 
        return Date;
    }
    public double getProfit()
    { 
        return Profit;
    }
    public double getLost()
    { 
        return Lost;
    }
    
//    pricechangeitems
    private int Code;
    private double stockQty;
    private double Qty;
    private double TotalPrice;
    private double IncreasedPrice;
    private double DecreasedPrice;
    private double IncreasedDifferent;
    private double decreasedDifferent;
    private double iLost;
    private double iProfit;
    
   public void  pricechangeitems(int Code,double stockQty,double Qty,double TotalPrice,double IncreasedPrice,double DecreasedPrice,double IncreasedDifferent, double decreasedDifferent,double Lost, double profit)
   {  this.Code = Code;
      this.stockQty = stockQty;
      this.Qty = Qty;
      this.TotalPrice = TotalPrice;
      this.IncreasedPrice = IncreasedPrice;
      this.DecreasedPrice = DecreasedPrice ;
      this.IncreasedDifferent = IncreasedDifferent;
      this.decreasedDifferent = decreasedDifferent;
      this.iLost = Lost;
      this.iProfit = profit;
   }
   
   public int getCode()
   { return Code;
   }
   public double getStockQty()
   {  return stockQty;
   }
   public double getQty()
   {  return Qty;
   }
    public double getTotalPrice()
   { return TotalPrice;
   }
   public double getIncreasedPrice()
   {return IncreasedPrice;
   }
   public double getDecreasedPrice ()
   { return DecreasedPrice ;
   }
   public double getIncreasedDifferent()
   { return IncreasedDifferent;
   }
   public double getdecreasedDifferent()
   { return this.decreasedDifferent;
   }
   public double getILost()
   {  return iLost;
   }
    public double getIProfit()
   {  return iProfit;
   }
    
}
