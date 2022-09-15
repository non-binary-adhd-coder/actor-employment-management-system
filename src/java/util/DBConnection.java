/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hidayah 
 * dummy no data yet
 */
public class DBConnection {
    public static Connection createConnection() throws SQLException
    {
        Connection conn = null;
        String url = "jdbc:derby://localhost:1527/AEMS";
        String username ="app";
        String password ="app";
        try
        {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("Printing connection object"+conn);
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
        return conn;
    }
}
