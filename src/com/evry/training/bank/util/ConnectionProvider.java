package com.evry.training.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.evry.training.bank.config.Ev_BankConstants;

public class ConnectionProvider {

	private ConnectionProvider(){}
	private static Connection connection=null;
	
	public static Connection getConnection() {
        if (connection == null) {
 
            synchronized(Connection.class) {
 
                if (connection == null) {
                	try {
						Class.forName("com.mysql.jdbc.Driver");
						connection=DriverManager.getConnection(Ev_BankConstants.databaseURL,Ev_BankConstants.userId,Ev_BankConstants.password);  
					} catch (ClassNotFoundException | SQLException e) {
						System.out.println(new DatabaseException("Unable to connect to DB please check connection details "));
					}  
                	
                }
            }
        }
        return connection;
    }
}
