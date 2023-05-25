package SimpleMVC;

public class GameController {
    private Game model;
    private GameView view;

    public GameController(Game model, GameView view) {
        this.model = model;
        this.view = view;
    }

    public void addPlayer(String name) {
        Player player = new Player(name);
        model.addPlayer(player);
    }

    public void incrementScore(String playerName) {
        Player player = model.getPlayer(playerName);
        if (player != null) {
            player.incrementScore();
            view.printPlayerScore(player);
        }
    }

    public void declareWinner(String playerName) {
        Player player = model.getPlayer(playerName);
        if (player != null) {
            view.printWinner(player);
        }
    }
}

