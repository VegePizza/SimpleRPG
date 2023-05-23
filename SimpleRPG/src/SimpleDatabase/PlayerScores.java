package SimpleDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;

public class PlayerScores {
    
    DBManager dbManager;
    Connection conn;
    Statement statement;
    public static int highestScore;
    
    //makes the connection
    public PlayerScores() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
    }
    
    //creates a score table and adds values when called. Checks if there is existing table if not a table will be created
    public void createScoreTable(String name, int score){
        try{
            this.statement = conn.createStatement();
            if(this.checkExistedTable("SCORES") == false){
                this.statement.addBatch("CREATE TABLE SCORES (PLAYER VARCHAR(20), SCORE INT)");
        
            }
            this.statement.addBatch("INSERT INTO SCORES VALUES (" + "'" + name + "'," + score + ")");
            this.statement.executeBatch();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updatePlayerScore(String name, int newScore) {
    String query = "UPDATE SCORES SET SCORE = ? WHERE PLAYER = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, newScore);
        stmt.setString(2, name);
        stmt.executeUpdate();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}

    public void deletePlayerScore(String name) {
    String query = "DELETE FROM SCORES WHERE PLAYER = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, name);
        stmt.executeUpdate();
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}
    
    public int getPlayerScore(String name) {
    String query = "SELECT SCORE FROM SCORES WHERE PLAYER = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt("SCORE");
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return -1; // return -1 if the player was not found
}

    public String getPlayerWithHighestScore() {
    String query = "SELECT PLAYER FROM SCORES ORDER BY SCORE DESC LIMIT 1";
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        if (rs.next()) {
            return rs.getString("PLAYER");
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return null; // return null if there are no players
}

    public int getNumberOfPlayers() {
    String query = "SELECT COUNT(*) AS player_count FROM SCORES";
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        if (rs.next()) {
            return rs.getInt("player_count");
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return 0; // return 0 if there are no players or an error occurred
}

    
    //close connection 
    public void closeConnection() {
        this.dbManager.closeConnection();
    }
   
    //checks if theres existing table already
    public boolean checkExistedTable(String name){
        try{
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);
            
            while(rs.next()){
                String table_name = rs.getString("TABLE_NAME");
                if(table_name.equalsIgnoreCase(name)){
                    System.out.println("Table exists");
                    return true;
                }
            }
            rs.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("new Table created");
        return false;
    }
    
    //get players and scores data from the database table
    public ResultSet getPlayersAndScores() {
        ResultSet rs = null;
        try{
            rs = this.statement.executeQuery("SELECT * "
                    + "FROM SCORES ");
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    //return array of strings of database table players and scores data. up to 10 latest scores is returned.
    public String[] printResults(ResultSet rs) {
    int i = 0;
    highestScore = 0; 
    String[] playersResultText = new String[10];
    try {   
        while(rs.next()){
            playersResultText[i] = rs.getString("PLAYER") + " " + rs.getInt("SCORE");
            if(i == 9){
                i = 0;
            }
            if(highestScore < rs.getInt("SCORE")){
                highestScore = rs.getInt("SCORE");
            }
            i++;
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    return playersResultText;
}
}


