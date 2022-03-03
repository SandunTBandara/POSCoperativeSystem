
package Model;

public class CreditCustomer {
    private int cusno;
    private String name;
    private int creditId;
    private float creditLimit;
    private String NIC;
    private int tel;
    private String address;
      
    public CreditCustomer(){
        
    }
    
    public CreditCustomer(int cusno,String name, int cid, float climit, String nic, int tel, String addr ){
        this.cusno = cusno;
        this.name = name;
        this.creditId = cid;
        this.creditLimit = climit;
        this.NIC = nic;
        this.tel = tel;
        this.address = addr;
    }
     
    public int getCusNo() {
        return cusno;
    }
      
    public String getName() {
        return name;
    }
    
    public int getCTypeId() {
        return creditId;
    }
    
    public float getCreditLimit() {
        return creditLimit;
    }
    
    public String getNic() {
        return NIC;
    }
    
    public int getTel() {
        return tel;
    }
    
    public String getAddress() {
        return address;
    }
}
