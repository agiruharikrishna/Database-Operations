/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Samuel Juma
 */
public class Db_connect {
    private String driver;
    private String Url; 
    private String user;
    private String password;
    
    Connection conn=null;
    Statement st=null;
    ResultSet result= null;
    
    public Db_connect(){

    }
    
    public  Connection createConnection(String driver,String Url,String user,String password,Component c){
       try{
     Class.forName(driver);
      conn=DriverManager.getConnection(Url,user,password);
      st =conn.createStatement();
      st =conn.createStatement();
      return conn;
      }catch(Exception e){
          JOptionPane.showMessageDialog(c, e,"Database Error",0);
        return null;
  }
      
} 
    public ResultSet selectQuery(String query,Component component,Component c){
        try{
//            createConnection(driver,Url,user,password);
         result=st.executeQuery(query);
        }
        catch(Exception e){
            c.setVisible(false);
        JOptionPane.showMessageDialog(component, e, "Database Error", 0);
        
        }
        
      return result;
    }
    public void insertDeleteUpdateQuery(String query,Component component,Component c){
        try{
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "operation done");
            
        }
        catch(Exception e){
            c.setVisible(false);
        JOptionPane.showMessageDialog(component, e, "Database Error", 0);
        }
    }
    
 
    
  
   
}     
    
    
