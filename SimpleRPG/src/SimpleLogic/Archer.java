/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleLogic;

/**
 *
 * @author jc
 */
public class Archer extends Hero {
    private String bowType;

    public Archer(String name, String bowType) {
        super.setName(name);
        this.bowType = bowType;
        super.setHealth(100);
        super.setStrength(10);
        super.setIntelligence(12);
        super.setAgility(15);
        super.setGold(50);
    }

    public String getBowType() {
        return ("Bow Type: " + bowType);
    }
    public void setBowType(String bowType) {
        this.bowType = bowType;
    }
}