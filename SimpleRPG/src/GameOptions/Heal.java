/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameOptions;

import Characters.Hero;

/**
 *
 * @author jc
 */
public class Heal{
    private Hero hero;
    private int healOption;
    private String healType;
    private int healAmount;

    public Heal(Hero hero, int healOption){
        this.hero = hero;
        this.healOption = healOption;
        
        switch (healOption) {
            case 1:
                if(hero.getGold() < 2){
                    this.healType = ("N/A. " + "Insufficient funds");
                    this.healOption = 0;
                    break;
                }
                this.healType = "Basic Healing: $2";
                hero.setHealth(hero.getHealth() + 10);
                hero.setGold(hero.getGold() - 2);
                this.healAmount = 10;
                break;
            case 2:
                if(hero.getGold() < 4){
                    this.healType = ("N/A. " + "Insufficient funds");
                    this.healOption = 0;
                    break;
                }
                this.healType = "Intermediate Healing: $4";
                hero.setHealth(hero.getHealth() + 20);
                hero.setGold(hero.getGold() - 4);
                this.healAmount = 20;
                break;
            case 3:
                if(hero.getGold() < 6){
                    this.healType = ("N/A. " + "Insufficient funds");
                    this.healOption = 0;
                    break;
                }
                this.healType = "Luxury Healing: $6";
                hero.setHealth(hero.getHealth() + 30);
                hero.setGold(hero.getGold() - 6);
                this.healAmount = 30;
                break;
            default:
                this.healOption = 0;
                this.healAmount = 0;
                break;
        }
    }

    //getters and setters
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public int getHealOption() {
        return healOption;
    }
    public void setHealOption(int healOption) {
        this.healOption = healOption;
    }  
    public String getHealType() {
        return healType;
    }   
    public void setHealType(String healType) {
        this.healType = healType;
    }  
    public int getHealAmount() {
        return healAmount;
    }
    public void setHealAmount(int healAmount) {
        this.healAmount = healAmount;
    }

    //output to user effects of heal method
    public String healHero(){
        String healText = ("Hero is given " + getHealType() 
                        + "\nHero Health is increased by " + getHealAmount() + "\nHealth: " + getHero().getHealth()
                        + "\nGold is decreased by " + getHealOption()*2 + "\nGold: " + getHero().getGold());
        
        return healText;
    }
}
