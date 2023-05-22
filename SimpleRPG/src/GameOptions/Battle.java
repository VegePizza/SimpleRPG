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
public class Battle {
    private Hero hero;
    private int battleOption;
    private String battleAction;
    private int damage;

    // Battle method affects health and gold stats depending on user input
    public Battle(Hero hero, int battleOption){
        this.hero = hero;
        this.battleOption = battleOption;
        
        switch(battleOption){
            case 1:
                this.battleAction = "Defend";
                hero.setHealth(hero.getHealth() + 5);
                break;
            case 2:
                this.battleAction = "Attack";
                damage = hero.getStrength() * 2;
                hero.setGold(hero.getGold() - 5);
                break;
            case 3:
                this.battleAction = "Use Special Power";
                damage = hero.getIntelligence() * 3;
                hero.setGold(hero.getGold() - 10);
                break;
            default:
                this.battleOption = 0;
                this.damage = 0;
                break;
        }
    }
    
    //getters and setters
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }   
    public int getBattleOption(){
        return battleOption;
    }
    public void setBattleOption(int battleOption){
        this.battleOption = battleOption;
    }   
    public String getBattleAction(){
        return battleAction;
    }
    public void setBattleAction(String battleAction){
        this.battleAction = battleAction;
    }

    //output to user the effects of the battle
    public String performBattleAction(){
        String battleText = ("Hero has chosen to " + battleAction
                        + "\nDamage done: "+ this.damage 
                        + "\nRemaining Health: " + hero.getHealth()
                        + "\nRemaining Gold: " + hero.getGold());
        return battleText;
    }
}
