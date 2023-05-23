package SimpleGUI;

public class PlayerReport {
  
    private String username;
    private int score = 0;
    private int highestScore = 0;

    //Constructor - stores user name and scores
    public PlayerReport(){
        this.username = "";
        this.score = 0;
    }
    
    public PlayerReport(String un, int sc) {
        this.username = un;
        this.score = sc;
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
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }
}