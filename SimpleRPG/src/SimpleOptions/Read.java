package SimpleOptions;

import SimpleCharacters.Hero;

public class Read {
    private Hero Hero;
    private int performOption;
    private String perform;
    private int performHunger;

    //perform method to increase money according to user input
    public Read(Hero Hero, int performOption){
        this.Hero = Hero;
        this.performOption = performOption;
        
        //user input decide which option seleceted
        switch (this.performOption) {
            //certain options locked behind strength stat
            case 1:
                this.perform = "Basic Show";
                Hero.money += 10;
                Hero.hunger += 3;
                this.performHunger = 3;
                break;
            case 2:
                if(Hero.getStrength() < 10){
                    this.perform = ("N/A. " + Hero.heroName + " needs more training!");
                    this.performOption = 0;
                    break;
                }
                this.perform = "Intermediate Show";
                Hero.money += 20;
                Hero.hunger += 2;
                this.performHunger = 2;
                break;
            case 3:
                if(Hero.getStrength() < 20){
                    this.perform = ("N/A. " + Hero.heroName + " needs more training!");
                    this.performOption = 0;
                    break;
                }
                this.perform = "Advanced Show";
                Hero.money += 30;
                Hero.hunger += 1;
                this.performHunger = 1;
                break;
            default:
                this.performOption = 0;
                this.performHunger = 0;
                break;
        }
    }

    //Getters and Setters
    public int getPerformHunger() {
        return performHunger;
    }
    public void setPerformHunger(int performHunger) {
        this.performHunger = performHunger;
    }
    public Hero getHero() {
        return Hero;
    }
    public void setHero(Hero Hero) {
        this.Hero = Hero;
    }
    public int getPerformOption() {
        return performOption;
    }
    public void setPerformOption(int performOption) {
        this.performOption = performOption;
    }   
    public String getPerform() {
        return perform;
    }
    public void setFood(String perform) {
        this.perform = perform;
    }
   
    //output stats effected by perform method
    public String performHero(){
        String performText = ("You and " + Hero.heroName + " Perform: " + perform
                    + "\nMoney increased by: " + performOption*10 + "\nMoney: " + Hero.money
                    + "\nHunger increased by: " + this.performHunger + "\nHunger: " + Hero.hunger);
        return performText;
    }
     
}
