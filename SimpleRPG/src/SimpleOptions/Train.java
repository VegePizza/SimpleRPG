package SimpleOptions;

import SimpleCharacters.Hero;

public class Train extends Hero{
    //initialise variables
    private Hero Hero;
    private int trainOption;
    private String train;
    private int trainHunger;
    private int trainHygiene;
    
    //Train method to increase obedience, health and hunger while decreasing hygiene
    public Train(Hero Hero, int trainOption){
        this.Hero = Hero;
        this.trainOption = trainOption;
        
        switch (trainOption) {
            case 1:
                //lowest option
                this.train = "Basic Training";
                Hero.health += 1;
                Hero.obedience += 1;
                Hero.hunger += 3;
                Hero.hygiene -= 3;
                this.trainHunger = 3;
                this.trainHygiene = 3;
                break;
            case 2:
                //middle option
                this.train = "Intermediate Training";
                Hero.health += 2;
                Hero.obedience += 2;
                Hero.hunger += 2;
                Hero.hygiene -= 2;
                this.trainHunger = 2;
                this.trainHygiene = 2;
                break;
            case 3:
                //highest option
                this.train = "Luxury Training";
                Hero.health += 3;
                Hero.obedience += 3;
                Hero.hunger += 1;
                Hero.hygiene -= 1;
                this.trainHunger = 1;
                this.trainHygiene = 1;
                break;
            default:
                this.trainHunger = 0;
                this.trainHygiene = 0;
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
    public int getTrainHygiene() {
        return trainHygiene;
    }
    public void setTrainHygiene(int trainHygiene) {
        this.trainHygiene = trainHygiene;
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
                        + "\nHero Happiness is increased by " + trainOption + "\nHappiness: " + Hero.health
                        + "\nHero Obedience is increased by " + trainOption + "\nObedience: " + Hero.obedience
                        + "\nHero Hunger is increased by " + this.trainHunger + "\nHunger: " + Hero.hunger
                        + "\nHero Hygiene is decreased by " + this.trainHygiene + "\nHygiene: " + Hero.hygiene);
        return trainText;
    }
     
}
