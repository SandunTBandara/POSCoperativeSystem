/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sanu
 */
public class frontlogin {
    public static String uid;
    private static String userId;
    private String password;
    
    public frontlogin()
    {
    
    }
    public frontlogin(String userId, String password)
    {
        this.uid = userId;
         this.userId = userId;
         this.password = password;
      
    
    }
    public String getuserId()
    {
      return userId;
    }
    public String getpassword()
    {
       return password;
    }
}
