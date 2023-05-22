/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleLogic;

/**
 *
 * @author jc
 */

public class Hero {

    private String name;
    private int health;
    private int strength;
    private int intelligence;
    private int agility;
    private int gold;
    private int stamina;
    private int experience;

    public Hero() {
        this.name = "";
        this.health = 100;
        this.strength = 10;
        this.intelligence = 10;
        this.agility = 10;
        this.gold = 50;
        this.stamina = 100;
        this.experience = 0;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }    
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    // Prints out hero's stats
    public String printInfo() {
        String heroStats = (this.name + "'s Stats:"
                + "\nHealth: " + this.health
                + "\nStrength: " + this.strength
                + "\nIntelligence: " + this.intelligence
                + "\nAgility: " + this.agility
                + "\nGold: " + this.gold);

        return heroStats;
    }

    // Checks health level, ends game if health is 0
    public String checkHealth() {
        String healthStatus = "";
        if (this.health <= 0) {
            healthStatus = this.name + " has fallen. Game over.";
        } else {
            healthStatus = this.name + "'s health: " + this.health;
        }
        return healthStatus;
    }

    // Print Hero report card
    public String printReportCard() {
        String heroReport = ("\nHero report card for " + this.name
                + "\nHero details: \n"
                + "Health: " + this.health
                + "\nStrength: " + this.strength
                + "\nIntelligence: " + this.intelligence
                + "\nAgility: " + this.agility
                + "\nGold: " + this.gold);
        return heroReport;
    }
}

