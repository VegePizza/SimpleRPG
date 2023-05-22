/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleLogic;

/**
 *
 * @author jc
 */
public class Train{
    private Hero hero;
    private int trainOption;
    private String trainingType;
    private int skillBoost;

    public Train(Hero hero, int trainOption){
        this.hero = hero;
        this.trainOption = trainOption;

        switch (trainOption) {
            case 1:
                this.trainingType = "Basic Training";
                hero.setStrength(hero.getStrength() + 10);
                this.skillBoost = 10;
                break;
            case 2:
                this.trainingType = "Intermediate Training";
                hero.setStrength(hero.getStrength() + 20);
                this.skillBoost = 20;
                break;
            case 3:
                this.trainingType = "Advanced Training";
                hero.setStrength(hero.getStrength() + 30);
                this.skillBoost = 30;
                break;
            default:
                this.trainOption = 0;
                this.skillBoost = 0;
                break;
        }
    }

    //getters and setters
    public int getTrainOption() {
        return trainOption;
    }
    public void setTrainOption(int trainOption) {
        this.trainOption = trainOption;
    }  
    public String getTrainingType() {
        return trainingType;
    }
    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }
    public int getSkillBoost() {
        return skillBoost;
    }
    public void setSkillBoost(int skillBoost) {
        this.skillBoost = skillBoost;
    }
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }

    //output to user effects of training
    public String trainHero(){
        String trainText = ("Hero has undergone " + trainingType
                        + "\nHero Strength is increased by " + skillBoost + "\nCurrent Strength: " + hero.getStrength());
        
        return trainText;
    }
     
}