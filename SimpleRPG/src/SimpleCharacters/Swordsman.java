package SimpleCharacters;

public class Swordsman extends Hero{
    private String gender;
    private String name;

    //initialise specific stats from default values
    public Swordsman(String name, String gender) {
        this.name = name;
        this.gender = gender;
        super.hunger = 2;
        super.health = 10;
        super.strength = 8;
        super.energy = 5;
        super.intelligence = 3;
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
    public String getgender(){
        return ("gender: " + gender);
    }
    public void setgender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String getCharacterClass() {
        return "Wizard";
    }
}
