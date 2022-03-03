
package Model;

public class Departments {
  
    private int Id;
    private String Description;
      
    public Departments(){
        
    }
    
    public Departments(int id,String des){
        this.Description = des;
        this.Id = id;
    }
     
    public int getID() {
        return Id;
    }
      
    public String getDescription() {
        return Description;
    }

}


