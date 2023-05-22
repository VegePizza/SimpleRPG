/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleLogic;

/**
 *
 * @author jc
 */
public class Quest {
    // initialize variables
    private Hero hero;
    private int questOption;
    private String activity;
    private int questStaminaCost;
    private int questExperienceReward;

    // Quest method to decrease stamina but increase experience
    public Quest(Hero hero, int questOption){
        this.hero = hero;
        this.questOption = questOption;
        
        switch (questOption) {
            case 1:
                // lowest option
                this.activity = "Minor Quest";
                hero.setExperience(hero.getExperience() + 100);
                hero.setStamina(hero.getStamina() - 10);
                this.questStaminaCost = 10;
                this.questExperienceReward = 100;
                break;
            case 2:
                // middle option
                this.activity = "Intermediate Quest";
                hero.setExperience(hero.getExperience() + 250);
                hero.setStamina(hero.getStamina() - 20);
                this.questStaminaCost = 20;
                this.questExperienceReward = 250;
                break;
            case 3:
                // highest option
                this.activity = "Major Quest";
                hero.setExperience(hero.getExperience() + 500);
                hero.setStamina(hero.getStamina() - 30);
                this.questStaminaCost = 30;
                this.questExperienceReward = 500;
                break;
            default:
                this.questStaminaCost = 0;
                this.questOption = 0;
                this.questExperienceReward = 0;
                break;
        }
    }

    // Getters and Setters
    public int getQuestStaminaCost() {
        return questStaminaCost;
    }
    public void setQuestStaminaCost(int questStaminaCost) {
        this.questStaminaCost = questStaminaCost;
    }
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public int getQuestOption() {
        return questOption;
    }
    public void setQuestOption(int questOption) {
        this.questOption = questOption;
    }    
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
   
    // output to user the effects of Quest
    public String questOutcome(){
        String questText = ("Hero has undertaken a " + activity
                       + "\nHero Experience is increased by " + questExperienceReward + "\nCurrent Experience: " + hero.getExperience()
                       + "\nHero Stamina is decreased by " + questStaminaCost + "\nCurrent Stamina: " + hero.getStamina());
        return questText;
    }
}