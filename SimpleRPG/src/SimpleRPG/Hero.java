package SimpleRPG;

// Hero is an abstract class that serves as a blueprint for specific hero types 
// (e.g., Swordsman, Wizard, Archer).
public abstract class Hero {
    
    // These variables store the hero's characteristics.
    String name;
    String type;
    int health;
    int strength;
    int agility;
    int wisdom;
    int level;
    int attack;
    int score;
    Inventory inventory;
    
    // Constructor for a Hero object.
    public Hero(String name, String type, int health, int strength, 
                int agility, int wisdom, int level, int attack) {
        
        // Assign the values of these variables.
        this.name = name;
        this.type = type;
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.wisdom = wisdom;
        this.level = level;
        this.attack = attack;
        inventory = new Inventory(); // Initialize the hero's inventory.
    }
    
    // The attack() method is an abstract method that has been overridden in subclasses
    public void attack() {
        System.out.println(this.name + " attacks with strength " + this.strength);
    }
    
    // Method to calculate the hero's score.
    public void HeroScore() {
        score = level + health + attack;
    }
}


