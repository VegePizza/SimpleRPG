/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleDatabase;

import static SimpleGUI.ChooseHero.Hero;
import static SimpleGUI.IntroductionFrame.player;

/**
 *
 * @author jessi
 */
public class PlayerScoresMain {
    
    public static String[] scoresText;
    
    public static void main() {
        PlayerScores scores = new PlayerScores();
        scores.createScoreTable(player.getUsername(), Hero.HeroScore);
        scoresText = scores.printResults(scores.getPlayersAndScores());
        scores.closeConnection();
    }
    
}
