package SimpleDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby:VirtualHeroGame_Ebd; create=true"; 
    
    Connection conn;
    
    //method to establish connection
    public DBManager(){
        establishConnection();
    }

    //main method 
    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        System.out.println(dbManager.getConnection());
    }
    
    //gets connection 
    public Connection getConnection(){
        return this.conn;
    }
    
    //establishes connection
    private void establishConnection() {
        if(this.conn == null) {
            try{
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + " is Connected!");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    //close connection
    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
