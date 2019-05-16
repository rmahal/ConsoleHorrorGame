package myapp.webservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String URL = "jdbc:postgresql://isilo.db.elephantsql.com:5432/hsxmymzc";
    public static final String USER = "hsxmymzc";
    public static final String PASS = "dD1xatiTJyifvvEGmMB7GvR-lQ23DcTA";
    

    public Connection getConnection(){
		try {
			 	Connection connection = DriverManager.getConnection(URL,USER,PASS);
				return connection;
      } catch (SQLException ex) {
          throw new RuntimeException("Error connecting to the database", ex);
      }
    }
	
}
