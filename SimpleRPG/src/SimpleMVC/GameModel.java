package SimpleMVC;

public class GameModel {
    private String name;
    private int score;

    public GameModel(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        this.score += 1;
    }
}

