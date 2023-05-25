package SimpleCharacters;

public abstract class Hero implements InterfaceCharacter{
   
    public String heroName;
    public String gender;
    public int health;
    public int hunger;
    public int strength;
    public int energy;
    public int intelligence;
    public int money;
    public int HeroScore;
    
    //initialise all variable statistics for hero
    public Hero(){
        this.heroName = "";
        this.gender = "";
        this.health = 0;
        this.hunger = 0;
        this.energy = 0;
        this.intelligence = 0;
        this.money = 30;
        this.strength = 0;
        this.HeroScore = 0;          
    }
    // if you create an instance of Swordsman, Wizard, or Archer, and call 
    // the getCharacterClass() method, it will return the corresponding class type.
    public abstract String getCharacterClass();
    
    @Override
    public void attack() {
        int baseDamage = this.strength;
        System.out.println(this.heroName + " attacks for " + baseDamage + " damage!");
    }
    
    //getters and setters for above stats
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }    
    public int getHeroScore() {
        return HeroScore;
    }    
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }   
    public int getEnergy(){
        return energy;
    }   
    public void setEnergy(int energy){
        this.energy = energy;
    }   
    public String getHeroName() {
        return this.heroName;
    }    
    public void setHeroName(String heroName){
        this.heroName = heroName;
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
        String HeroStats = (this.heroName + " Stats:"
                + "\nHunger: " + this.hunger
                + "\nHealth: " + this.health
                + "\nStrength: " + this.strength
                + "\nenergy: " + this.energy
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
    public String checkHealth(Hero Hero) {
        Hero.health = health;
        String healthText = "";

        if(health >= 1 && health < 10)
        {
            healthText = ("\n" + this.heroName + " has a very low health level\n");
        }
        else if(health >= 10 && health < 20)
        {
            healthText = ("\n" + this.heroName + " is still ok!\n");
        }
        else if(health >= 20 && health < 30)
        {
            healthText = ("\n" + this.heroName + "'s health level is good!\n");
        }
        else if(health >= 30 && health < 40)
        {
            healthText = ("\n" + this.heroName + " is strong as hell!\n");
        }
        this.HeroScore = this.health + this.hunger + this.energy + this.intelligence
                + this.money + this.strength;
        return healthText;
    }

    //checks energy level and if energy is less than 0, health and strength decreases by 5
    public String checkenergy(Hero Hero){
        String energyText = "";
        if (Hero.energy <= 0){
            Hero.health -= 5;
            Hero.strength -= 5;
            Hero.energy = 0;
            if(Hero.health <= 0){
               Hero.health = 0;
               energyText = ("\n" + Hero.heroName + "'s energy level is nearly 0. Meditation Needed!"
                            + "\nHealth and Strength decreased by 5"
                            + "\nHealth cannot be below zero"
                            + "\nenergy cannot be below zero"
                            + "\nHealth: " + Hero.health + "\nStrength: " + Hero.strength
                            + "\nenergy: " + Hero.energy);
            }
            if(Hero.strength <= 0){
                Hero.strength = 0;
                energyText = ("\n" + Hero.heroName + "'s energy level is nearly 0. Meditation Needed!"
                            + "\nHealth and Strength decreased by 5"
                            + "\nStrength cannot be below zero"
                            + "\nenergy cannot be below zero"
                            + "\nHealth: " + Hero.health + "\nStrength: " + Hero.strength
                            + "\nenergy: " + Hero.energy);
            }
            if(Hero.health <= 0 && Hero.strength <= 0){
               Hero.health = 0;
               Hero.strength = 0;
               energyText = ("\n" + Hero.heroName + "'s energy level is nearly 0. Meditation Needed!"
                            + "\nHealth and Strength decreased by 5"
                            + "\nHealth and Strength cannot be below zero"
                            + "\nenergy cannot be below zero"
                            + "\nHealth: " + Hero.health + "\nStrength: " + Hero.strength
                            + "\nenergy: " + Hero.energy);
            }else{
            energyText = ("\n" + Hero.heroName + "'s energy level is nearly 0. Meditation Needed!"
                            + "\nHealth and Strength decreased by 5"
                            + "\nenergy cannot be below zero"
                            + "\nHealth: " + Hero.health + "\nStrength: " + Hero.strength
                            + "\nenergy: " + Hero.energy);
            }
        }
        return energyText;
    }
    
    //checks hunger level and if hunger is equal or more than 10, health decreases by 10.
    public String checkHunger(Hero Hero){
        String hungerText = "";
        if (Hero.hunger >= 10){
            Hero.health -= 10;
            if(Hero.health <= 0){
                Hero.health = 0;
                hungerText = ("\n" + Hero.heroName + " feel the emptiness in stomach"
                        + "\nHero Health is decreased by 10"
                        + "\nHealth cannot be below zero"
                        + "\nHealth: " + Hero.health);
            }else{
            hungerText = ("\n" + Hero.heroName + " feel the emptiness in stomach"
                        + "\nHero Health is decreased by 10"
                        + "\nHealth: " + Hero.health);
            }
        }if (Hero.hunger <= 0){
            Hero.hunger = 0;
            hungerText =("\nHunger cannot be less than 0"
                    + "\nHunger: " + Hero.hunger);
        }
        return hungerText;
    }
    
    //Write to file and print to user, hero stat information
    public String printReportCard(){
        String HeroReport = ("\n" + "Hero report card for " + this.heroName
                + "\nHero details: \n"
                + "Health: " + this.health
                + "\ngender: " + this.gender
                + "\nHunger: " + this.hunger
                + "\nStrength: " + this.strength
                + "\nenergy: " + this.energy
                + "\nIntelligence: " + this.intelligence
                + "\nMoney: " + this.money
                + "\nHero Score: " + this.HeroScore);
        return HeroReport;
    }
}

