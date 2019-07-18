/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author hp
 */
public class Connector {
    private static final String username="root";
    private static final String password="jeevika123";
    private static final String conn_string="jdbc:mysql://localhost:3306/bloodbankmanagementsystem";
    
    static Connection conn=null;
    public void createConnection()
    {
        try
        {
            Class.forName("java.sql.Driver");
        conn=(Connection) DriverManager.getConnection(conn_string,username,password);
            System.out.println("Connection succesful");
    }
        catch(Exception e)
        {
            System.err.println(e);
        }
}
    
}
