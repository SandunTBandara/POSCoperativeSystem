
package Model;

public class BinType {
    private int bid;
    private String name;
      
    public BinType(){
        
    }
    
    public BinType(int id,String name){
        this.name = name;
        this.bid = id;
    }
     
    public int getID() {
        return bid;
    }
      
    public String getName() {
        return name;
    }
}
