package SimpleRPG;

// Weapon class representing a weapon object.
public class Weapon {
    String name;
    int attackBoost; // The amount of attack power that the weapon adds when equipped.

    // Constructor initializes the weapon with a name and attack boost.
    public Weapon(String name, int attackBoost) {
        this.name = name;
        this.attackBoost = attackBoost;
    }
}