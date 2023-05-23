package SimpleOptions;

import SimpleCharacters.Hero;

public class TreasureHunt {
    private Hero Hero;
    private int treasureOption;
    private String treasure;
    private int treasureHunger;

    //treasure method to increase money according to user input
    public TreasureHunt(Hero Hero, int treasureOption){
        this.Hero = Hero;
        this.treasureOption = treasureOption;
        
        //user input decide which option seleceted
        switch (this.treasureOption) {
            //certain options locked behind strength stat
            case 1:
                this.treasure = "Gold Mine in Rotorua";
                Hero.money += 10;
                Hero.hunger += 3;
                this.treasureHunger = 3;
                break;
            case 2:
                if(Hero.getStrength() < 10){
                    this.treasure = ("Not enough Strength " + Hero.heroName + " needs more training!");
                    this.treasureOption = 0;
                    break;
                }
                this.treasure = "Mountain Peak in Queenstown";
                Hero.money += 20;
                Hero.hunger += 2;
                this.treasureHunger = 2;
                break;
            case 3:
                if(Hero.getStrength() < 20){
                    this.treasure = ("Not enough Strength " + Hero.heroName + " needs more training!");
                    this.treasureOption = 0;
                    break;
                }
                this.treasure = "Auckland CBD";
                Hero.money += 30;
                Hero.hunger += 1;
                this.treasureHunger = 1;
                break;
            default:
                this.treasureOption = 0;
                this.treasureHunger = 0;
                break;
        }
    }

    //Getters and Setters
    public int getPerformHunger() {
        return treasureHunger;
    }
    public void setPerformHunger(int treasureHunger) {
        this.treasureHunger = treasureHunger;
    }
    public Hero getHero() {
        return Hero;
    }
    public void setHero(Hero Hero) {
        this.Hero = Hero;
    }
    public int getPerformOption() {
        return treasureOption;
    }
    public void setPerformOption(int treasureOption) {
        this.treasureOption = treasureOption;
    }   
    public String getPerform() {
        return treasure;
    }
    public void setFood(String treasure) {
        this.treasure = treasure;
    }
   
    //output stats effected by treasure method
    public String treasureHero(){
        String treasureText = ("You and " + Hero.heroName + " Perform: " + treasure
                    + "\nMoney increased by: " + treasureOption*10 + "\nMoney: " + Hero.money
                    + "\nHunger increased by: " + this.treasureHunger + "\nHunger: " + Hero.hunger);
        return treasureText;
    }
     
}
