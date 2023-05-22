package SimpleRPG;

// Shield class representing a shield object.
public class Shield {
    String name;
    int healthBoost; // The amount of health that the shield adds when equipped.

    // Constructor initializes the shield with a name and health boost.
    public Shield(String name, int healthBoost) {
        this.name = name;
        this.healthBoost = healthBoost;
    }
}
