package SimpleCharacters;

public class Hero {
   
    public String animalName;
    public String nationality;
    public int health;
    public int hunger;
    public int strength;
    public int agility;
    public int intelligence;
    public int money;
    public int HeroScore;
    
    //initialise all variable statistics for animal
    public Hero(){
        this.animalName = "";
        this.nationality = "";
        this.health = 0;
        this.hunger = 0;
        this.agility = 0;
        this.intelligence = 0;
        this.money = 30;
        this.strength = 0;
        this.HeroScore = 0;          
    }

    //getters and setters for above stats
    public String getColour() {
        return nationality;
    }
    public void setColour(String nationality) {
        this.nationality = nationality;
    }    
    public int getHeroScore() {
        return HeroScore;
    }    
    public int getHappiness() {
        return health;
    }
    public void setHappiness(int health) {
        this.health = health;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getObedience() {
        return strength;
    }
    public void setObedience(int strength) {
        this.strength = strength;
    }   
    public int getagility(){
        return agility;
    }   
    public void setagility(int agility){
        this.agility = agility;
    }   
    public String getanimalName() {
        return this.animalName;
    }    
    public void setanimalName(String animalName){
        this.animalName = animalName;
    }   
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    
    //Prints out Hero's stats
    public String printInfo() {
        String HeroStats = (this.animalName + " Stats:"
                + "\nHunger: " + this.hunger
                + "\nHappiness: " + this.health
                + "\nObedience: " + this.strength
                + "\nagility: " + this.agility
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money);

        return HeroStats;
    }

    //check health level, exit game if health = 40 or 0 respectively
    /**
     *
     * @param Hero
     * @return
     */
    public String checkHappiness(Hero Hero) {
        Hero.health = health;
        String healthText = "";

        if(health >= 1 && health < 10)
        {
            healthText = ("\n" + this.animalName + " is not very happy\n");
        }
        else if(health >= 10 && health < 20)
        {
            healthText = ("\n" + this.animalName + " is happy!\n");
        }
        else if(health >= 20 && health < 30)
        {
            healthText = ("\n" + this.animalName + " is very happy!\n");
        }
        else if(health >= 30 && health < 40)
        {
            healthText = ("\n" + this.animalName + " is extremely happy!\n");
        }
        this.HeroScore = this.health + this.hunger + this.agility + this.intelligence
                + this.money + this.strength;
        return healthText;
    }

    //checks agility level and if agility is less than 0, health and strength decreases by 5
    public String checkagility(Hero Hero){
        String agilityText = "";
        if (Hero.agility <= 0){
            Hero.health -= 5;
            Hero.strength -= 5;
            Hero.agility = 0;
            if(Hero.health <= 0){
               Hero.health = 0;
               agilityText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHappiness cannot be below zero"
                            + "\nagility cannot be below zero"
                            + "\nHappiness: " + Hero.health + "\nObedience: " + Hero.strength
                            + "\nagility: " + Hero.agility);
            }
            if(Hero.strength <= 0){
                Hero.strength = 0;
                agilityText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nObedience cannot be below zero"
                            + "\nagility cannot be below zero"
                            + "\nHappiness: " + Hero.health + "\nObedience: " + Hero.strength
                            + "\nagility: " + Hero.agility);
            }
            if(Hero.health <= 0 && Hero.strength <= 0){
               Hero.health = 0;
               Hero.strength = 0;
               agilityText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHappiness and Obedience cannot be below zero"
                            + "\nagility cannot be below zero"
                            + "\nHappiness: " + Hero.health + "\nObedience: " + Hero.strength
                            + "\nagility: " + Hero.agility);
            }else{
            agilityText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nagility cannot be below zero"
                            + "\nHappiness: " + Hero.health + "\nObedience: " + Hero.strength
                            + "\nagility: " + Hero.agility);
            }
        }
        return agilityText;
    }
    
    //checks hunger level and if hunger is equal or more than 10, health decreases by 10.
    public String checkHunger(Hero Hero){
        String hungerText = "";
        if (Hero.hunger >= 10){
            Hero.health -= 10;
            if(Hero.health <= 0){
                Hero.health = 0;
                hungerText = ("\n" + Hero.animalName + " is very hungry!"
                        + "\nHero Happiness is decreased by 10"
                        + "\nHappiness cannot be below zero"
                        + "\nHappiness: " + Hero.health);
            }else{
            hungerText = ("\n" + Hero.animalName + " is very hungry!"
                        + "\nHero Happiness is decreased by 10"
                        + "\nHappiness: " + Hero.health);
            }
        }if (Hero.hunger <= 0){
            Hero.hunger = 0;
            hungerText =("\nHunger cannot be less than 0"
                    + "\nHunger: " + Hero.hunger);
        }
        return hungerText;
    }
    
    //Write to file and print to user, animal stat information
    public String printReportCard(){
        String HeroReport = ("\n" + "Hero report card for " + this.animalName
                + "\nHero details: \n"
                + "Happiness: " + this.health
                + "\nNationality: " + this.nationality
                + "\nHunger: " + this.hunger
                + "\nObedience: " + this.strength
                + "\nagility: " + this.agility
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money
                + "\nHero Score: " + this.HeroScore);
        return HeroReport;
    }
    
}

