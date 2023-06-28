
package asimulatorsystem1;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
           
            c =DriverManager.getConnection("jdbc:mysql:///bms","root","vpatil77");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  