
package model;

import java.sql.Date;

public class suplierInvoice {
    
    private String siNo;
    private Date date;
    private String F23No;
    
    public void supplierInvoice(String no, Date date, String fno){
        this.siNo = no;
        this.date = date;
        this.F23No = fno;
    }
    
    public String getNo(){
        return siNo;
    }    
    public Date getDate(){
        return date;
    }    
    public String getF23no(){
        return F23No;
    }    
    
    private String stcode;
    private double totalBprice;
    private double Bdiscount;
    private double noOfItems;
    private double Bvat;
    private double itemdecrease;
    private double loadRent;
    private double freeIssue;
    private double subTotal;
    private int spcode;
    private double disPer;
    private double vatPer;
    private double freeitemsPrice;
    
    
    public void supplierInvoiceRecords(double items, String stcode,double disPer, double vatPer, double tbprice,double dis, double bvat,double decrease, double loadrent, double freeissue, double subtotal, int spcode, double fprice){
        this.noOfItems = items;
        this.stcode = stcode;
        this.totalBprice = tbprice;
        this.disPer = disPer;
        this.vatPer = vatPer;
        this.Bdiscount = dis;
        this.Bvat = bvat;
        this.itemdecrease = decrease;
        this.loadRent = loadrent;
        this.freeIssue = freeissue;
        this.subTotal = subtotal;
        this.spcode = spcode;
        this.freeitemsPrice = fprice;
    }
    
    public String getStcode(){
        return stcode;
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
    public double getFreeIssueQty(){
        return freeIssue;
    }
    public double getSubTotal(){
        return subTotal;
    }
    public double getFreeIssuePrice(){
        return freeitemsPrice;
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

    private int code;
    private double stockQty;
    private double qty;
    private double bPrice;
    private double TBprice;
    private double totalQty;
    
    public void supplierInvoiceItems(int code, double sqty, double qty, double bprice, double tbprice, double tqty){
        this.code = code;
        this.stockQty = sqty;
        this.qty = qty;
        this.bPrice = bprice;
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
    public double getTBprice(){
        return TBprice;
    }
    public double getTotalQty(){
        return totalQty;
    }
    
    private int fcode;
    private double price;
    private double freeQty;
    private double freeTotalPrice;
    
    public void supplierInvoiceFreeItems(int code,double price, double freeqty, double total){
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
