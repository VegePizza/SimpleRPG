package SimpleMVC;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private Map<String, Player> players;

    public Game() {
        this.players = new HashMap<>();
    }

    public void addPlayer(Player player) {
        players.put(player.getName(), player);
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }
}
