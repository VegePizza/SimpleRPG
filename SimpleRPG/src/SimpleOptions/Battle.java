package SimpleOptions;

import SimpleCharacters.Hero;

public class Battle {
    private Hero Hero;
    private int battleOption;
    private String battle;
    private int battleHealth;

    //Battle method affects energy stats depending on user input
    public Battle(Hero Hero, int battleOption){
        this.Hero = Hero;
        this.battleOption = battleOption;
        
        //allow battle method only if Hero.money is high enough
        switch(battleOption){
            case 1:
                if(Hero.getMoney()< 2){
                    this.battle = ("N/A. " + "Insufficient funds");
                    this.battleOption = 0;
                    break;
                }
                this.battle = "AUT professors: $2";
                Hero.health += 3;
                Hero.energy += 1;
                Hero.money -= 2;
                this.battleHealth = 3;
                break;
            case 2:
                if(Hero.getMoney()< 4){
                    this.battle = ("N/A. " + "Insufficient funds");
                    this.battleOption = 0;
                    break;
                }
                this.battle = "Library Revolving Door: $4";
                Hero.health += 2;
                Hero.energy += 2;
                Hero.money -= 4;
                this.battleHealth = 2;
                break;
            case 3:
                if(Hero.getMoney()< 6){
                    this.battle = ("N/A. " + "Insufficient funds");
                    this.battleOption = 0;
                    break;
                }
                this.battle = "Kiwi Bird On Waiheke Inland: $6";
                Hero.health -= 1;
                Hero.energy += 3;
                Hero.money -= 6;
                this.battleHealth = 1;
                break;
            default:
                this.battleOption = 0;
                this.battleHealth = 0;
                break;
        }
    }
    
    //getters and setters
    public int getBattleHealth() {
        return battleHealth;
    }
    public void setBattleHealth(int battleHealth) {
        this.battleHealth = battleHealth;
    }
    public Hero getHero(){
        return Hero;
    }
    public void setHero(Hero Hero){
        this.Hero = Hero;
    }   
    public int getBattleOption(){
        return battleOption;
    }
    public void setBattleOption(int battleOption){
        this.battleOption = battleOption;
    }   
    public String getBattle(){
        return battle;
    }
    public void setBattle(String battle){
        this.battle = battle;
    }
    
    //output to user the effects of battle
    public String battleHero(){
        String battleText = ("Hero was battle with " + battle
                        + "\nHero health is decreased by "+ this.battleHealth + "\nHealth: " + Hero.health
                        + "\nHero energy is increased by " + battleOption + "\nenergy: " + Hero.energy
                        + "\nMoney is decreased by " + battleOption*2 + "\nMoney: " + Hero.getMoney());
        return battleText;
    }
}
