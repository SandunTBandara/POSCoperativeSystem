
package model;

public class User {
    private String ucode;
    private String type;
    
    public void setUser(String code, String type){
        this.ucode = code;
        this.type = type;
    }
    
    public String getCode(){
        return ucode;
    }
    
    public String getType(){
        return type;
    }
    
    private int cus;
    private int credit;
    private int dep;
    private int sup;
    private int store;
    private int cat;
    private int item;
    private int binLoc;
    private int itemAlert;
    private int loyMember;
    private int loyCard;
    private int grn;
    private int order;
    private int orderReturn;
    private int exchange;
    private int supInvoice;
    private int disposal;
    private int price;
    private int cashier;
    private int reports;
    
    public void setPrivilages(int cus, int credit,int dep,int sup, int store, int cat, int item, int bin, int itemalert, int loymem, int loycard, int grn, int order, int orderReturn, int exchange, int supInvoice, int disposal, int price, int cashier, int reports){
        
        System.out.println(cus + " " + credit + " " + dep + " " + sup + " " + store + " " + cat + " " + item + " " + bin +" " + itemalert + " " + loymem + " "  + loycard + " " + grn + " " + order + " " + orderReturn + " " + exchange + " " + supInvoice+ " " + disposal + " " + price + " " + price + " " + cashier + " " + reports);
        this.cus=cus;
        this.credit = credit;
        this.dep= dep;
        this.sup = sup;
        this.store = store;
        this.cat = cat;
        this.item = item;
        this.binLoc = bin;
        this.itemAlert = itemalert;
        this.loyMember = loymem;
        this.loyCard = loycard;
        this.grn = grn;
        this.order = order;
        this.orderReturn = orderReturn;
        this.exchange = exchange;
        this.supInvoice = supInvoice;
        this.disposal = disposal;
        this.price = price;
        this.cashier = cashier;
        this.reports = reports;
    }
    
    public int getCus(){
        return this.cus;
    }
    
    public int getCredit(){
        return this.credit;
    }
    
    public int getSup(){
        return this.sup;
    }
    
    public int getStore(){
        return this.store;
    }
    
    public int getCat(){
        return this.cat;
    }
    
    public int getItem(){
        return this.item;
    }
    public int getDep(){
        return this.dep;
    }
    
    public int getBinLoc(){
        return this.binLoc;
    }
    
    public int getItemAlert(){
        return this.itemAlert;
    }
    
    public int getLoyMem(){
        return this.loyMember;
    }
    
    public int getLoyCard(){
        return this.loyCard;
    }
    
    public int getGrn(){
        return this.grn;
    }
    
    public int getOrder(){
        return this.order;
    }
    
    public int getOrderReturn(){
        return this.orderReturn;
    }
    
    public int getExchage(){
        return this.exchange;
    }
    
    public int getSupInvoice(){
        return this.supInvoice;
    }
    
    public int getDisposal(){
        return this.disposal;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public int getCashier(){
        return this.cashier;
    }
    
    public int getRepors(){
        return this.reports;
    }
    
    
    
}
