package SimpleDatabase;

import static SimpleGUI.ChooseHero.Hero;
import static SimpleGUI.IntroductionFrame.player;

public class PlayerScoresMain {
    
    public static String[] scoresText;
    
    public static void main() {
        PlayerScores scores = new PlayerScores();
        scores.createScoreTable(player.getUsername(), Hero.HeroScore);
        scoresText = scores.printResults(scores.getPlayersAndScores());
        scores.closeConnection();
    }
    
}
