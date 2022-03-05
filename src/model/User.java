
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
}
