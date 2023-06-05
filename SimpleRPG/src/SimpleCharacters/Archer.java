package SimpleCharacters;

public class Archer extends Hero {

    // Instance variables
    private String gender;
    private String name;

    // Constructor to initialize specific stats and set name and gender
    public Archer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        
        // Setting default values for inherited stats
        super.hunger = 2;
        super.health = 10;
        super.strength = 8;
        super.energy = 5;
        super.intelligence = 3;
        super.heroName = name;
        super.gender = gender;
        super.money = 30;
    }

    // Overrides the attack method from the Hero class
    @Override
    public void attack() {
        System.out.println(this.heroName + " fires an arrow with " + this.strength + " strength!");
    }

    // Overrides the defend method from the Hero class
    @Override
    public void defend() {
        System.out.println(this.heroName + " defends with his Bow!");
    }

    // Getter method for name
    public String getName() {
        return ("Name: " + name);
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for gender
    public String getgender() {
        return ("gender: " + gender);
    }

    // Setter method for gender
    public void setgender(String gender) {
        this.gender = gender;
    }

    // Overrides the getCharacterClass method from the Hero class
    @Override
    public String getCharacterClass() {
        return "Archer";
    }
}
