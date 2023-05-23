package SimpleGUI;

import SimpleDatabase.PlayerScores;

public class PlayerReport {
  
    private String username;
    private int score = 0;
    private int highestScore = 0;

    // Instantiate PlayerScores
    private PlayerScores scores = new PlayerScores();

    //Constructor - stores user name and scores
    public PlayerReport(){
        this.username = "";
        this.score = 0;
        this.highestScore = scores.getHighestScore();
    }
    
    public PlayerReport(String un, int sc) {
        this.username = un;
        this.score = sc;
        this.highestScore = scores.getHighestScore();
    }
    
    //creates a gui to display players scores
    public static void main(PlayerReport player) {
        new WindowFrame("Players Scores", player);
    }
    
    //Getters and Setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
        scores.updatePlayerScore(username, this.score);
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
        scores.updatePlayerScore(this.username, score);
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }
}
