
package Model;

public class CreditInformation {
    private int cid;
    private String type;
      
    public CreditInformation(){
        
    }
    
    public CreditInformation(int id,String type){
        this.type = type;
        this.cid = id;
    }
     
    public int getID() {
        return cid;
    }
      
    public String getType() {
        return type;
    }
}
