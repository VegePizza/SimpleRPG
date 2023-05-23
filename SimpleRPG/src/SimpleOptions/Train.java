package SimpleOptions;

import SimpleCharacters.Hero;

public class Train {
    //initialise variables
    private Hero Hero;
    private int trainOption;
    private String train;
    private int trainHunger;
    private int trainenergy;
    
    //Train method to increase strength, health and hunger while decreasing energy
    public Train(Hero Hero, int trainOption){
        this.Hero = Hero;
        this.trainOption = trainOption;
        
        switch (trainOption) {
            case 1:
                //lowest option
                this.train = "Basic Training";
                Hero.health += 1;
                Hero.strength += 1;
                Hero.hunger += 3;
                Hero.energy -= 3;
                this.trainHunger = 3;
                this.trainenergy = 3;
                break;
            case 2:
                //middle option
                this.train = "Intermediate Training";
                Hero.health += 2;
                Hero.strength += 2;
                Hero.hunger += 2;
                Hero.energy -= 2;
                this.trainHunger = 2;
                this.trainenergy = 2;
                break;
            case 3:
                //highest option
                this.train = "Luxury Training";
                Hero.health += 3;
                Hero.strength += 3;
                Hero.hunger += 1;
                Hero.energy -= 1;
                this.trainHunger = 1;
                this.trainenergy = 1;
                break;
            default:
                this.trainHunger = 0;
                this.trainenergy = 0;
                this.trainOption = 0;
                break;
        }
    }

    //getter and setters
    public int getTrainHunger() {
        return trainHunger;
    }
    public void setTrainHunger(int trainHunger) {
        this.trainHunger = trainHunger;
    }
    public int getTrainenergy() {
        return trainenergy;
    }
    public void setTrainenergy(int trainenergy) {
        this.trainenergy = trainenergy;
    }
    public Hero getHero() {
        return Hero;
    }
    public void setHero(Hero Hero) {
        this.Hero = Hero;
    }
    public int getTrainOption() {
        return trainOption;
    }
    public void setTrainOption(int trainOption) {
        this.trainOption = trainOption;
    }  
    public String getTrain() {
        return train;
    }
    public void setFood(String train) {
        this.train = train;
    }
   
    //output to user effects of train
    public String trainHero(){
        String trainText = ("Hero has been given " + train
                        + "\nHero Health is increased by " + trainOption + "\nHealth: " + Hero.health
                        + "\nHero Strength is increased by " + trainOption + "\nStrength: " + Hero.strength
                        + "\nHero Hunger is increased by " + this.trainHunger + "\nHunger: " + Hero.hunger
                        + "\nHero energy is decreased by " + this.trainenergy + "\nenergy: " + Hero.energy);
        return trainText;
    }
     
}
