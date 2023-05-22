package SimpleOptions;

import SimpleCharacters.Hero;

public class Eat extends Hero{
    private Hero Hero;
    private int foodOption;
    private String food;
    private int foodHygiene;
    
    //feeds Hero based on user input to the options on what food....
    public Eat(Hero Hero, int foodOption){
        this.Hero = Hero;
        this.foodOption = foodOption;
        
        //user input decides which option is selected
        switch (foodOption) {
            //certain options locked behind money stat
            case 1:
                    if(Hero.getMoney()< 2){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Basic Food: $2";
                Hero.happiness += 1;
                Hero.hunger -= 1;
                Hero.hygiene -= 3;
                Hero.money -= 2;
                this.foodHygiene = 3;
                break;
            case 2:
                if(Hero.getMoney()< 4){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Intermediate Food: $4";
                Hero.happiness += 2;
                Hero.hunger -= 2;
                Hero.hygiene -= 2;
                Hero.money -= 4;
                this.foodHygiene = 2;
                break;
            case 3:
                if(Hero.getMoney()< 6){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Luxury Food: $6";
                Hero.happiness += 3;
                Hero.hunger -= 3;
                Hero.hygiene -= 1;
                Hero.money -= 6;
                this.foodHygiene = 1;
                break;
            default:
                this.foodOption = 0;
                this.foodHygiene = 0;
                break;
        }
    }

    //getters and setters
    public Hero getHero() {
        return Hero;
    }
    public void setHero(Hero Hero) {
        this.Hero = Hero;
    }
    public int getFoodOption() {
        return foodOption;
    }
    public void setFoodOption(int foodOption) {
        this.foodOption = foodOption;
    }  
    public String getFood() {
        return food;
    }   
    public void setFood(String food) {
        this.food = food;
    }  
    public int getFoodHygiene() {
        return foodHygiene;
    }
    public void setFoodHygiene(int foodHygiene) {
        this.foodHygiene = foodHygiene;
    }
    
    //output to user effects of feed method
    public String feedHero(){
        String feedText = ("Hero is fed " + getFood() 
                        + "\nHero Happiness is increased by " + getFoodOption() + "\nHappiness: " + getHero().happiness
                        + "\nHero Hunger is decreased by " + getFoodOption() + "\nHunger: " + getHero().hunger
                        + "\nHero Hygiene is decreased by " + getFoodHygiene() + "\nHygiene: " + getHero().hygiene
                        + "\nMoney is decreased by " + getFoodOption()*2 + "\nMoney: " + getHero().money);
        
        return feedText;
    }
     
}

