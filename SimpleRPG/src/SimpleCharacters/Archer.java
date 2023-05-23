package SimpleCharacters;

public class Archer extends Hero{
    private String gender;
    private String name;

    //initialise Archer specific stats from default values
    public Archer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        super.hunger = 3;
        super.health = 3;
        super.strength = 7;
        super.energy = 7;
        super.intelligence = 1;
        super.heroName = name;
        super.gender = gender;
        super.money = 30;
    }
    
    //getters and setters
    public String getName() {
        return ("Name: " + name);
    }
    public void setName(String name) {
        this.name = name;
    } 
    public String getgender() {
        return ("gender: " + gender);
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String getCharacterClass() {
        return "Archer";
    }
    
}
