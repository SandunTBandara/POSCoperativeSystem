
package Model;

public class Category {
    private int cno;
    private int dno;
    private String category;
      
    public Category(){
        
    }
    
    public Category(int cno, int dno,String cat){
        this.category = cat;
        this.cno = cno;
        this.dno = dno;

    }
     
    public int getCno() {
        return cno;
    }
    public int getDno() {
        return dno;
    }
      
    public String getCategory() {
        return category;
    }
}
