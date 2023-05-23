package SimpleOptions;

import SimpleCharacters.Hero;

public class Challenge {
    private Hero Hero;
    private int cleaningOption;
    private String clean;
    private int cleanHealth;

    //Clean method affects agility stats depending on user input
    public Challenge(Hero Hero, int cleaningOption){
        this.Hero = Hero;
        this.cleaningOption = cleaningOption;
        
        //allow clean method only if Hero.money is high enough
        switch(cleaningOption){
            case 1:
                if(Hero.getMoney()< 2){
                    this.clean = ("N/A. " + "Insufficient funds");
                    this.cleaningOption = 0;
                    break;
                }
                this.clean = "Basic clean: $2";
                Hero.health -= 3;
                Hero.agility += 1;
                Hero.money -= 2;
                this.cleanHealth = 3;
                break;
            case 2:
                if(Hero.getMoney()< 4){
                    this.clean = ("N/A. " + "Insufficient funds");
                    this.cleaningOption = 0;
                    break;
                }
                this.clean = "Intermediate Clean: $4";
                Hero.health -= 2;
                Hero.agility += 2;
                Hero.money -= 4;
                this.cleanHealth = 2;
                break;
            case 3:
                if(Hero.getMoney()< 6){
                    this.clean = ("N/A. " + "Insufficient funds");
                    this.cleaningOption = 0;
                    break;
                }
                this.clean = "Luxury Clean: $6";
                Hero.health -= 1;
                Hero.agility += 3;
                Hero.money -= 6;
                this.cleanHealth = 1;
                break;
            default:
                this.cleaningOption = 0;
                this.cleanHealth = 0;
                break;
        }
    }
    
    //getters and setters
    public int getCleanHealth() {
        return cleanHealth;
    }
    public void setCleanHealth(int cleanHealth) {
        this.cleanHealth = cleanHealth;
    }
    public Hero getHero(){
        return Hero;
    }
    public void setHero(Hero Hero){
        this.Hero = Hero;
    }   
    public int getCleaningOption(){
        return cleaningOption;
    }
    public void setCleaningOption(int cleaningOption){
        this.cleaningOption = cleaningOption;
    }   
    public String getClean(){
        return clean;
    }
    public void setClean(String clean){
        this.clean = clean;
    }
    
    //output to user the effects of clean
    public String cleanHero(){
        String cleanText = ("Hero has been given a " + clean
                        + "\nHero health is decreased by "+ this.cleanHealth + "\nHealth: " + Hero.health
                        + "\nHero agility is increased by " + cleaningOption + "\nagility: " + Hero.agility
                        + "\nMoney is decreased by " + cleaningOption*2 + "\nMoney: " + Hero.getMoney());
        return cleanText;
    }
}
