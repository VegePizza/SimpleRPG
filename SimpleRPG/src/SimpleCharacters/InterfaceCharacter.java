package SimpleCharacters;

public interface InterfaceCharacter {

    // Method to perform an attack action
    void attack();

    // Method to perform a defend action
    void defend();

    // Method to get the character class
    String getCharacterClass();

    // Getter method for health
    int getHealth();

    // Getter method for energy
    int getEnergy();

    // Getter method for strength
    int getStrength();

    // Getter method for intelligence
    int getIntelligence();

    // Getter method for money
    int getMoney();
}
