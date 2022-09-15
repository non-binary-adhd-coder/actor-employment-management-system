/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UserBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;
/**
 *
 * @author hidayah
 */
public class LoginDao {
    public String authenticateUser (UserBean loginBean) {

         String userName = loginBean.getUserName(); //Assign user entered values to temporary variables.
         String password = loginBean.getPassword();
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         String userNameDB = "";
         String passwordDB = "";
    
    try{
             con = DBConnection.createConnection(); //Fetch database connection object
             statement = con.createStatement(); 
             resultSet = statement.executeQuery("select username, password from customers"); //the table name is users and userName,password are columns. Fetching all the records and storing in a resultSet.
 
             while(resultSet.next()) // Until next row is present otherwise it return false
             {
              userNameDB = resultSet.getString("username"); //fetch the values present in database
              passwordDB = resultSet.getString("password");
 
               if(userName.equals(userNameDB) && password.equals(passwordDB))
               {
                  return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
               }
             }
    }catch (SQLException e) {
        e.printStackTrace();
    }
    return "Invalid user credentials";
}    
}
