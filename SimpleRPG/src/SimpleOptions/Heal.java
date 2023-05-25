package SimpleOptions;

import SimpleCharacters.Hero;

public class Heal {
    private Hero Hero;
    private int foodOption;
    private String food;
    private int foodenergy;
    
    //heals Hero based on user input to the options on what food....
    public Heal(Hero Hero, int foodOption){
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
                this.food = "Tiny Red Potion: $2";
                Hero.health += 1;
                Hero.hunger -= 1;
                Hero.energy -= 3;
                Hero.money -= 2;
                this.foodenergy = 3;
                break;
            case 2:
                if(Hero.getMoney()< 4){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Whole Bottle of Red Potion: $4";
                Hero.health += 2;
                Hero.hunger -= 2;
                Hero.energy -= 2;
                Hero.money -= 4;
                this.foodenergy = 2;
                break;
            case 3:
                if(Hero.getMoney()< 6){
                    this.food = ("N/A. " + "Insufficient funds");
                    this.foodOption = 0;
                    break;
                }
                this.food = "Finest NZ Red Wine: $6";
                Hero.health += 3;
                Hero.hunger -= 3;
                Hero.energy -= 1;
                Hero.money -= 6;
                this.foodenergy = 1;
                break;
            default:
                this.foodOption = 0;
                this.foodenergy = 0;
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
    public int getFoodenergy() {
        return foodenergy;
    }
    public void setFoodenergy(int foodenergy) {
        this.foodenergy = foodenergy;
    }
    
    //output to user effects of heal method
    public String healHero(){
        String healText = ("Hero is healed " + getFood() 
                        + "\nHero Health is increased by " + getFoodOption() + "\nHealth: " + getHero().health
                        + "\nHero Hunger is decreased by " + getFoodOption() + "\nHunger: " + getHero().hunger
                        + "\nHero energy is decreased by " + getFoodenergy() + "\nenergy: " + getHero().energy
                        + "\nMoney is decreased by " + getFoodOption()*2 + "\nMoney: " + getHero().money);
        
        return healText;
    }
     
}

