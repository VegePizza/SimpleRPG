package SimpleMVC;

public class GameView {
    public void printPlayerScore(Player player) {
        System.out.println(player.getName() + "'s score: " + player.getScore());
    }

    public void printWinner(Player player) {
        System.out.println("The winner is " + player.getName() + " with " + player.getScore() + " points!");
    }
}
