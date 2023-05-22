package SimpleOptions;

import SimpleCharacters.Hero;

public class Adventure extends Hero{
    //initialise variables
    private Hero Hero;
    private int playOption;
    private String activity;
    private int playHunger;
    private int playHygiene;

    //play method to decrease hygiene but increase happiness and hunger
    public Adventure(Hero Hero, int playOption){
        this.Hero = Hero;
        this.playOption = playOption;
        
        switch (playOption) {
            case 1:
                //lowest option
                this.activity = "Basic Fun";
                Hero.happiness += 3;
                Hero.hygiene -= 1;
                Hero.hunger += 3;
                this.playHunger = 3;
                this.playHygiene = 2;
                break;
            case 2:
                //middle option
                this.activity = "Intermediate Fun";
                Hero.happiness += 6;
                Hero.hygiene -= 1;
                Hero.hunger += 2;
                this.playHunger = 2;
                this.playHygiene = 2;
                break;
            case 3:
                //highest option
                this.activity = "Luxury Fun";
                Hero.happiness += 9;
                Hero.hygiene -= 1;
                Hero.hunger += 1;
                this.playHunger = 1;
                this.playHygiene = 1;
                break;
            default:
                this.playHunger = 0;
                this.playOption = 0;
                this.playHygiene = 0;
                break;
        }
    }

    //Getters and Setters
    public int getPlayHunger() {
        return playHunger;
    }
    public void setPlayHunger(int playHunger) {
        this.playHunger = playHunger;
    }
    public Hero getHero() {
        return Hero;
    }
    public void setHero(Hero Hero) {
        this.Hero = Hero;
    }
    public int getPlayOption() {
        return playOption;
    }
    public void setPlayOption(int playOption) {
        this.playOption = playOption;
    }    
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
   
    //output to user the effects of Play
    public String playHero(){
        String playText = ("Hero has been given " + activity
                       + "\nHero Happiness is increased by " + playOption*3 + "\nHappiness: " + Hero.happiness
                       + "\nHero Hunger is increased by " + this.playHunger + "\nHunger: " + Hero.hunger
                       + "\nHero Hygiene is decreased by " + this.playHygiene + "\nHygiene: " + Hero.hygiene);
        return playText;
    }
     
}
