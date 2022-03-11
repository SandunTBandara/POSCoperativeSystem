
package model;

public class LoyalityCard {
    
    private String LCode;
    private String name;
    
    public void setLoyalityCard(String code,String name)
    {
       this.LCode = code;
       this.name = name;
       
    }
    
    public String getCode()
    {
      return LCode;
    }
    public String getName()
    {
      return name;
    }
}
