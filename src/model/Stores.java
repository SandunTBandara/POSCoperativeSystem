
package Model;

public class Stores {
    private String stcode;
    private String location;
      
    public Stores(){
        
    }
    
    public Stores(String id,String loc){
        this.stcode = id;
        this.location = loc;
    }
     
    public String getID() {
        return stcode;
    }
      
    public String getLocation() {
        return location;
    }
}
