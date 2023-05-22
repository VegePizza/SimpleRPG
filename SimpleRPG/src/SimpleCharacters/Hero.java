package SimpleCharacters;

public class Hero {
   
    public String animalName;
    public String nationality;
    public int happiness;
    public int hunger;
    public int obedience;
    public int hygiene;
    public int intelligence;
    public int money;
    public int HeroScore;
    
    //initialise all variable statistics for animal
    public Hero(){
        this.animalName = "";
        this.nationality = "";
        this.happiness = 0;
        this.hunger = 0;
        this.hygiene = 0;
        this.intelligence = 0;
        this.money = 30;
        this.obedience = 0;
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
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getObedience() {
        return obedience;
    }
    public void setObedience(int obedience) {
        this.obedience = obedience;
    }   
    public int getHygiene(){
        return hygiene;
    }   
    public void setHygiene(int hygiene){
        this.hygiene = hygiene;
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
                + "\nHappiness: " + this.happiness
                + "\nObedience: " + this.obedience
                + "\nHygiene: " + this.hygiene
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money);

        return HeroStats;
    }

    //check happiness level, exit game if happiness = 40 or 0 respectively
    /**
     *
     * @param Hero
     * @return
     */
    public String checkHappiness(Hero Hero) {
        Hero.happiness = happiness;
        String happinessText = "";

        if(happiness >= 1 && happiness < 10)
        {
            happinessText = ("\n" + this.animalName + " is not very happy\n");
        }
        else if(happiness >= 10 && happiness < 20)
        {
            happinessText = ("\n" + this.animalName + " is happy!\n");
        }
        else if(happiness >= 20 && happiness < 30)
        {
            happinessText = ("\n" + this.animalName + " is very happy!\n");
        }
        else if(happiness >= 30 && happiness < 40)
        {
            happinessText = ("\n" + this.animalName + " is extremely happy!\n");
        }
        this.HeroScore = this.happiness + this.hunger + this.hygiene + this.intelligence
                + this.money + this.obedience;
        return happinessText;
    }

    //checks hygiene level and if hygiene is less than 0, happiness and obedience decreases by 5
    public String checkHygiene(Hero Hero){
        String hygieneText = "";
        if (Hero.hygiene <= 0){
            Hero.happiness -= 5;
            Hero.obedience -= 5;
            Hero.hygiene = 0;
            if(Hero.happiness <= 0){
               Hero.happiness = 0;
               hygieneText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHappiness cannot be below zero"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + Hero.happiness + "\nObedience: " + Hero.obedience
                            + "\nHygiene: " + Hero.hygiene);
            }
            if(Hero.obedience <= 0){
                Hero.obedience = 0;
                hygieneText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nObedience cannot be below zero"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + Hero.happiness + "\nObedience: " + Hero.obedience
                            + "\nHygiene: " + Hero.hygiene);
            }
            if(Hero.happiness <= 0 && Hero.obedience <= 0){
               Hero.happiness = 0;
               Hero.obedience = 0;
               hygieneText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHappiness and Obedience cannot be below zero"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + Hero.happiness + "\nObedience: " + Hero.obedience
                            + "\nHygiene: " + Hero.hygiene);
            }else{
            hygieneText = ("\n" + Hero.animalName + " is Dirty!"
                            + "\nHappiness and Obedience decreased by 5"
                            + "\nHygiene cannot be below zero"
                            + "\nHappiness: " + Hero.happiness + "\nObedience: " + Hero.obedience
                            + "\nHygiene: " + Hero.hygiene);
            }
        }
        return hygieneText;
    }
    
    //checks hunger level and if hunger is equal or more than 10, happiness decreases by 10.
    public String checkHunger(Hero Hero){
        String hungerText = "";
        if (Hero.hunger >= 10){
            Hero.happiness -= 10;
            if(Hero.happiness <= 0){
                Hero.happiness = 0;
                hungerText = ("\n" + Hero.animalName + " is very hungry!"
                        + "\nHero Happiness is decreased by 10"
                        + "\nHappiness cannot be below zero"
                        + "\nHappiness: " + Hero.happiness);
            }else{
            hungerText = ("\n" + Hero.animalName + " is very hungry!"
                        + "\nHero Happiness is decreased by 10"
                        + "\nHappiness: " + Hero.happiness);
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
                + "Happiness: " + this.happiness
                + "\nNationality: " + this.nationality
                + "\nHunger: " + this.hunger
                + "\nObedience: " + this.obedience
                + "\nHygiene: " + this.hygiene
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money
                + "\nHero Score: " + this.HeroScore);
        return HeroReport;
    }
    
}

