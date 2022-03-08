
package model;

import java.sql.Date;

public class GRN {
    //grn 
    private String F16BNo;
    private Date date;
    private String status;
    private String F23No;
    
    public void grn(String no, Date date, String status, String F23No){
        this.F16BNo = no;
        this.date = date;
        this.status = status;
        this.F23No = F23No;
    }
    
    public String getNo(){
        return F16BNo;
    }    
    public Date getDate(){
        return date;
    }    
    public String getStatus(){
        return status;
    }    
    public String getF23No(){
        return F23No;
    }
    
    //grn records
    private String stcode;
    private int billNo;
    private String PaymentType;
    private double totalBprice;
    private double Bdiscount;
    private double Bvat;
    private double disPer;
    private double vatPer;
    private double itemdecrease;
    private double loadRent;
    private double freeIssue;
    private double subTotal;
    private double totalSprice;
    private double freeitemsQty;
    private double sellingFreeIssue;
    private double subTotalSellingPrice;
    private int spcode;
    private int noOfItems;
    
    
    public void GRNrecords(int items, String stcode, int billno, String paymenttype,double disPer, double vatPer, double tbprice,double dis, double bvat,double decrease, double loadrent, double freeissue, double subtotal, double totalsprice, double sfissue, double subtotalprice, int spcode, double fqty){
        this.noOfItems = items;
        this.stcode = stcode;
        this.billNo = billno;
        this.PaymentType = paymenttype;
        this.totalBprice = tbprice;
        this.disPer = disPer;
        this.vatPer = vatPer;
        this.Bdiscount = dis;
        this.Bvat = bvat;
        this.itemdecrease = decrease;
        this.loadRent = loadrent;
        this.freeIssue = freeissue;
        this.subTotal = subtotal;
        this.totalSprice = totalsprice;
        this.sellingFreeIssue = sfissue;
        this.subTotalSellingPrice = subtotalprice;
        this.spcode = spcode;
        this.freeitemsQty = fqty;
    }
    
    public String getStcode(){
        return stcode;
    }
    public int getBillNo(){
        return billNo;
    }
    public String getPayment(){
        return PaymentType;
    }
    public double getTotalBprice(){
        return totalBprice;
    }
    public double getBdiscount(){
        return Bdiscount;
    }
    public double getBvat(){
        return Bvat;
    }
    public double getLoadRent(){
        return loadRent;
    }
    public double getFreeIssue(){
        return freeIssue;
    }
    public double getSubTotal(){
        return subTotal;
    }
    public double getTotalSprice(){
        return totalSprice;
    }
    public double getSellingFreeIssue(){
        return sellingFreeIssue;
    }
    public double getsubTotalSellingPrice(){
        return subTotalSellingPrice;
    }
    public int getSpcode(){
        return spcode;
    }
    public double getNoOfItems(){
        return noOfItems;
    }
    public double getDPer(){
        return disPer;
    }
    public double getVPer(){
        return vatPer;
    }
    public double getDecrease(){
        return itemdecrease;
    }
    
    //grn item details
    private int code;
    private double stockQty;
    private double qty;
    private double bPrice;
    private double sPrice;
    private double TSprice;
    private double TBprice;
    private double totalQty;
    
    public void GRNitems(int code, double sqty, double qty, double bprice, double sprice, double tsprice, double tbprice, double tqty){
        this.code = code;
        this.stockQty = sqty;
        this.qty = qty;
        this.bPrice = bprice;
        this.sPrice = sprice;
        this.TSprice = tsprice;
        this.TBprice = tbprice;
        this.totalQty = tqty;
    }
    
    public int getCode(){
        return code;
    }
    public double getStockQty(){
        return stockQty;
    }
    public double getQty(){
        return qty;
    }
    public double getBPrice(){
        return bPrice;
    }
    public double getSPrice(){
        return sPrice;
    }
    public double getTSprice(){
        return TSprice;
    }
    public double getTBprice(){
        return TBprice;
    }
    public double getTotalQty(){
        return totalQty;
    }
    
    
    //grn free items
    private int fcode;
    private double price;
    private double freeQty;
    private double freeTotalPrice;
    
    public void GRNfreeItems(int code,double price, double freeqty, double total){
        System.out.println("GRNfreeItem function");
        this.fcode = code;
        this.price = price;
        this.freeQty = freeqty;
        this.freeTotalPrice = total;
    }
    
    public int getFcode(){
        return fcode;
    }
    public double getPrice(){
        return price;
    }
    public double getFreeQty(){
        return freeQty;
    }
    public double getFreeTotalPrice(){
        return freeTotalPrice;
    }
}
