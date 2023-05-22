package SimpleCharacters;

public class Swordsman extends Hero{
    private String nationality;
    private String name;

    //initialise specific stats from default values
    public Swordsman(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
        super.hunger = 2;
        super.health = 10;
        super.obedience = 8;
        super.hygiene = 5;
        super.intelligence = 3;
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
    public String getNationality(){
        return ("Nationality: " + nationality);
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
