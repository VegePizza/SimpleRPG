/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleLogic;

/**
 *
 * @author jc
 */
public class Swordsman extends Hero {
    private String weapon;

    public Swordsman(String name, String weapon) {
        super.setName(name);
        this.weapon = weapon;
        super.setHealth(120);
        super.setStrength(15);
        super.setIntelligence(7);
        super.setAgility(10);
        super.setGold(50);
    }

    public String getWeapon() {
        return ("Weapon: " + weapon);
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}