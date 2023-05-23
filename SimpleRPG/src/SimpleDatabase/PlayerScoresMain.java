package SimpleDatabase;

import static SimpleGUI.ChooseHero.Hero;
import static SimpleGUI.FirstMainFrame.player;

public class PlayerScoresMain {
    
    public static String[] scoresText;
    
    public static void main() {
        PlayerScores scores = new PlayerScores();
        scores.createScoreTable(player.getUsername(), Hero.HeroScore);
        
        // Update and delete player's score
        scores.updatePlayerScore("John", 90);
        scores.deletePlayerScore("John");

        // Get the highest score
        int highestScore = scores.getHighestScore();

        // Reset all scores
        scores.resetAllScores();

        scoresText = scores.printResults(scores.getPlayersAndScores());
        scores.closeConnection();
    }
}
