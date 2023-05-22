package SimpleCharacters;

public class Wizard extends Hero{
    private String gender;
    private String name;

    //initialise Wizard specific stats from default values
    public Wizard(String name, String gender) {
        this.name = name;
        this.gender = gender;
        super.hunger = 3;
        super.health = 5;
        super.strength = 7;
        super.agility = 7;
        super.intelligence = 4;
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
        
}

