package SimpleOptions;

import SimpleCharacters.Hero;

public class Adventure {
    //initialise variables
    private Hero Hero;
    private int playOption;
    private String activity;
    private int playHunger;
    private int playagility;

    //play method to decrease agility but increase health and hunger
    public Adventure(Hero Hero, int playOption){
        this.Hero = Hero;
        this.playOption = playOption;
        
        switch (playOption) {
            case 1:
                //lowest option
                this.activity = "Basic Fun";
                Hero.health += 3;
                Hero.agility -= 1;
                Hero.hunger += 3;
                this.playHunger = 3;
                this.playagility = 2;
                break;
            case 2:
                //middle option
                this.activity = "Intermediate Fun";
                Hero.health += 6;
                Hero.agility -= 1;
                Hero.hunger += 2;
                this.playHunger = 2;
                this.playagility = 2;
                break;
            case 3:
                //highest option
                this.activity = "Luxury Fun";
                Hero.health += 9;
                Hero.agility -= 1;
                Hero.hunger += 1;
                this.playHunger = 1;
                this.playagility = 1;
                break;
            default:
                this.playHunger = 0;
                this.playOption = 0;
                this.playagility = 0;
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
                       + "\nHero Health is increased by " + playOption*3 + "\nHealth: " + Hero.health
                       + "\nHero Hunger is increased by " + this.playHunger + "\nHunger: " + Hero.hunger
                       + "\nHero agility is decreased by " + this.playagility + "\nagility: " + Hero.agility);
        return playText;
    }
     
}
