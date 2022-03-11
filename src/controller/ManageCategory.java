
package controller;

import Model.Category;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.DB;

public class ManageCategory {
    Category Categories;
    public  ManageCategory()
    {
    
    }
    public ManageCategory(Category Categories)
    {
        this.Categories = Categories;
    }
    
   public ResultSet displaytableview()
    {    ResultSet rs = null;
        try {
            Connection con = DB.createConnection();
            String sql = "Select * from category";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
             
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return rs;
    }
    
    
    
    public ResultSet Viewcategorytable(String Cname, String dpno) {
        ResultSet result = null;
        try {
            Connection con = DB.createConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM category  WHERE (category   LiKE '" + Cname + "%' or  cno LiKE '" + Cname + "%') and dno= "+Integer.parseInt(dpno)+"  ";
            result = stmt.executeQuery(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    
    
    public String getCategorynamebyID(String cno) throws java.lang.Exception
    {
      String cname = "";
      Connection con = DB.createConnection();
      Statement stmt = con.createStatement();
      String sql = "select category from category where cno = "+cno+" ";
      ResultSet rs = stmt.executeQuery(sql);
      
      while(rs.next())
      {
          cname = rs.getString("category");
      }
      
    
    return cname;
    }
    
       public void saveCategory()
       {    
            try{
                Connection con = DB.createConnection();
                String sql = "INSERT INTO category(cno, category, dno) VALUES (?,?,?)";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, Categories.getCno());
                stmt.setString(2, Categories.getCategory());
                stmt.setInt(3, Categories.getDno());

                int result = stmt.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Department has been succesfully Added", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
                } 
            }
            catch(Exception e)
            {
              System.out.println(e.getMessage());
            }   

       }
        
    
   public void updateCat()
    {        
        try{
             Connection con = DB.createConnection();
             String sql = "UPDATE category SET category = ?, dno=? WHERE cno = "+ Categories.getCno()+ ";";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, Categories.getCategory());
             stmt.setInt(2, Categories.getDno());

             int result = stmt.executeUpdate();

             if (result > 0) {
                 JOptionPane.showMessageDialog(null, "User has been updated succesfully ", "SuperMarket Management", JOptionPane.INFORMATION_MESSAGE);
             } 
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
    
}
