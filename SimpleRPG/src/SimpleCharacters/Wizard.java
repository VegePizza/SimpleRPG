package SimpleCharacters;

public class Wizard extends Hero{
    private String nationality;
    private String name;

    //initialise Wizard specific stats from default values
    public Wizard(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        super.hunger = 3;
        super.health = 5;
        super.obedience = 7;
        super.hygiene = 7;
        super.intelligence = 4;
        super.animalName = name;
        super.nationality = nationality;
        super.money = 30;
    }
    
    //getters and setters
    public String getName() {
        return ("Name: " + name);
    }
    public void setName(String name) {
        this.name = name;
    }   
    public String getNationality() {
        return ("Nationality: " + nationality);
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
        
}

