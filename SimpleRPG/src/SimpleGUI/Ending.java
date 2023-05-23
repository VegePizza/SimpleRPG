package SimpleGUI;

import static SimpleDatabase.PlayerScores.highestScore;
import SimpleDatabase.PlayerScoresMain;
import static SimpleDatabase.PlayerScoresMain.scoresText;
import static SimpleGUI.ChooseHero.Hero;
import static SimpleGUI.FirstMainFrame.player;
import java.util.Arrays;

public class Ending {
    
    //shows happy ending text
    public static void goodGame() {
        PlayerScoresMain.main();
        String goodEnding = ("\nPlayer: " + player.getUsername() + "  Score: " + Hero.getHeroScore() + "\n\nCongralutations! " + Hero.heroName + " is at maximum health!"
                   + "\nWell done, you have completed the game!\n"
                   + "Here is your Hero Report\n" + Hero.printReportCard()
                   + "\n\nHighest Score: " + highestScore + "\n\nList of last 10 Players and Scores:\n" + Arrays.toString(scoresText));
        WindowFrame g = new WindowFrame();
        g.GUIend("You win!!!", goodEnding);
    }
    
    //shows bad ending text
    public static void badGame() {
        PlayerScoresMain.main();
        String badEnding = ("\nPlayer: " + player.getUsername() + "  Score: " + Hero.getHeroScore() 
                   + "\n\nSorry! " + Hero.heroName + " is not happy at all!"
                   + "\nToo bad " + Hero.heroName + " has decided to run away...\n"
                   + "Here is your Hero Report\n" + Hero.printReportCard()
                   + "\n\nHighest Score: " + highestScore + "\n\nList of last 10 Players and Scores:\n" + Arrays.toString(scoresText));
        WindowFrame g = new WindowFrame();
        g.GUIend("You lose...", badEnding); 
    }
    
}
