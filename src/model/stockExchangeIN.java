
package model;

import java.sql.Date;

public class stockExchangeIN {
    private String F18No;
    private Date date;
    private String toPlace;
    private String fromPlace;
    private Double TotalBuyingPrice;
    private Double TotalSellingPrice;
    private int billNo;
    
    public void setStockExchange(String no, Date date, String to, String from, double bprice, double sprice,int bill){
            this.F18No = no;
            this.date = date;
            this.toPlace = to;
            this.fromPlace = from;
            this.TotalBuyingPrice = bprice;
            this.TotalSellingPrice = sprice;
            this.billNo = bill;
            
            
    }
    
    public String getF18No(){
        return this.F18No;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public String getTo(){
        return this.toPlace;
    }
    
    public String getFrom(){
        return this.fromPlace;
    }
    
    public Double getTBPrice(){
        return this.TotalBuyingPrice;
    }
    
    public Double getTSPrice(){
        return this.TotalSellingPrice;
    }
    
    public int getBillNo(){
        return this.billNo;
    }
    
    private double bPrice;
    private double sPrice;
    private double qty;
    private double itemTBprice;
    private double itemTSprice;
    private int code;
    
    public void setItems( double bPrice,double sPrice,double qty, double itemTBprice,double itemTSprice, int code){
        this.bPrice = bPrice;
        this.sPrice = sPrice;
        this.qty = qty;
        this.itemTBprice = itemTBprice;
        this.itemTSprice = itemTSprice;
        this.code = code;
        
    }
    
    public Double getBPrice(){
        return this.bPrice;
    }
    
    public Double getSPrice(){
        return this.sPrice;
    }
    
    public Double getQty(){
        return this.qty;
    }
    
    public Double getItemsTSPrice(){
        return this.itemTSprice;
    }
    
    public Double getItemTBPrice(){
        return this.itemTBprice;
    }
    
    public int getCode(){
        return this.code;
    }
    
    
}
