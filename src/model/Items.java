
package Model;

public class Items {
    private int icode;
    private String name;
    private String sinhala_name;
    private int barcode;
    private String weight;
    private double margin;
    private int department;
    private String category;
    private int supplier;
    private int binType;
    private double costPrice;
    private double reorderLevel;
    private double reorderQuantity;
    private double sellingPrice;
    private double maxQuantity;
      
    public Items(){
        
    }
    
    public void setItems(int ino,String name, String sname, int barcode, String we, double margin, int dep, String cat, int supplier, int bin, double cprice, double reLevel, double reQty, double sprice, double mqty){
        this.icode = ino;
        this.name = name;
        this.sinhala_name = sname;
        this.barcode = barcode;
        this.weight = we;
        this.margin = margin;
        this.department = dep;
        this.category = cat;
        this.supplier = supplier;
        this.binType = bin;
        this.costPrice = cprice;
        this.reorderLevel = reLevel;
        this.reorderQuantity = reQty;
        this.sellingPrice = sprice;
        this.maxQuantity = mqty;
        
    }
     
    public int getItemCode() {
        return icode;
    }
      
    public String getName() {
        return name;
    }
    
    public String getSname() {
        return sinhala_name;
    }
    
    public int getBarcode() {
        return barcode;
    }
    
    public String getWeight() {
        return weight;
    }
    
    public double getMargin() {
        return margin;
    }
    
    public int getDepartment() {
        return department;
    }
    
    public String getCategory() {
        return category;
    }
    
    public int getSupplier(){
        return supplier;
    }
    
    public int getBinType(){
        return binType;
    }
    
    public double getCostType(){
        return costPrice;
    }
    
    public double getReorderLevel() {
        return reorderLevel;
    }
    
    public double getReorderQty() {
        return reorderQuantity;
    }
    
    public double getSellingPrice() {
        return sellingPrice;
    }
    
    public double getMaxQty() {
        return maxQuantity;
    }
      
    public Items(){
        
    }
    
    public Items(int ino,String name, String sname, int barcode, int weight, int margin, int dep, String cat, int supplier, int bin, float cprice, int reLevel, int reQty, float sprice, int mqty){
        this.icode = ino;
        this.name = name;
        this.sinhala_name = sname;
        this.barcode = barcode;
        this.weight = weight;
        this.margin = margin;
        this.department = dep;
        this.category = cat;
        this.supplier = supplier;
        this.binType = bin;
        this.costPrice = cprice;
        this.reorderLevel = reLevel;
        this.reorderQuantity = reQty;
        this.sellingPrice = sprice;
        this.maxQuantity = mqty;
        
    }
     
    public int getItemCode() {
        return icode;
    }
      
    public String getName() {
        return name;
    }
    
    public String getSname() {
        return sinhala_name;
    }
    
    public int getBarcode() {
        return barcode;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public int getMargin() {
        return margin;
    }
    
    public int getDepartment() {
        return department;
    }
    
    public String getCategory() {
        return category;
    }
    
    public int getSupplier(){
        return supplier;
    }
    
    public int getBinType(){
        return binType;
    }
    
    public float getCostType(){
        return costPrice;
    }
    
    public int getReorderLevel() {
        return reorderLevel;
    }
    
    public int getReorderQty() {
        return reorderQuantity;
    }
    
    public float getSellingPrice() {
        return sellingPrice;
    }
    
    public float getMaxQty() {
        return maxQuantity;
    }
}
