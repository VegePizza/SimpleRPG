package SimpleOptions;

import SimpleCharacters.Hero;

public class Eat extends Hero{
    private Hero Hero;
    private int foodOption;
    private String food;
    private int foodagility;
    
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
                Hero.health += 1;
                Hero.hunger -= 1;
                Hero.agility -= 3;
                Hero.money -= 2;
                this.foodagility = 3;
                break;
            case 2:
                if(Hero.getMoney()< 4){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Intermediate Food: $4";
                Hero.health += 2;
                Hero.hunger -= 2;
                Hero.agility -= 2;
                Hero.money -= 4;
                this.foodagility = 2;
                break;
            case 3:
                if(Hero.getMoney()< 6){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Luxury Food: $6";
                Hero.health += 3;
                Hero.hunger -= 3;
                Hero.agility -= 1;
                Hero.money -= 6;
                this.foodagility = 1;
                break;
            default:
                this.foodOption = 0;
                this.foodagility = 0;
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
    public int getFoodagility() {
        return foodagility;
    }
    public void setFoodagility(int foodagility) {
        this.foodagility = foodagility;
    }
    
    //output to user effects of feed method
    public String feedHero(){
        String feedText = ("Hero is fed " + getFood() 
                        + "\nHero Happiness is increased by " + getFoodOption() + "\nHappiness: " + getHero().health
                        + "\nHero Hunger is decreased by " + getFoodOption() + "\nHunger: " + getHero().hunger
                        + "\nHero agility is decreased by " + getFoodagility() + "\nagility: " + getHero().agility
                        + "\nMoney is decreased by " + getFoodOption()*2 + "\nMoney: " + getHero().money);
        
        return feedText;
    }
     
}

