
package Model;

public class Supplier {
    private int scode;
    private String sname;
    private String contact_name;
    private String saddress;
    private int deliveryDayCount;
    private int contactNo;

      
    public Supplier(){
        
    }
    
    public Supplier(int sno, String name,String cname,int day,String addr, int contact){
        this.scode = sno;
        this.sname = name;
        this.saddress = addr;
        this.contact_name = cname;
        this.deliveryDayCount = day;
        this.contactNo = contact;
    }
     
    public int getSCode() {
        return scode;
    }
    public String getSname() {
        return sname;
    }
    
    public String getCname() {
        return contact_name;
    }
    
     public String getSaddress() {
        return saddress;
    }
      
    public int getDay() {
        return deliveryDayCount;
    }
    
    public int getContactNo() {
        return contactNo;
    }
}
