package SimpleRPG;

import java.util.ArrayList;
import java.util.List;

// Location class representing a location in the game world.
public class Location {
    
    String name;
    List<Enemy> enemies; // List of enemies at this location.

    // Constructor initializes the location with a name and an empty list of enemies.
    public Location(String name) {
        this.name = name;
        this.enemies = new ArrayList<>();
    }
    
    // Method to add an enemy to the location.
    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }
}


