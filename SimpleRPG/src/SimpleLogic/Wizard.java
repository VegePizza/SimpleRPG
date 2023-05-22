/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleLogic;

/**
 *
 * @author jc
 */
public class Wizard extends Hero {
    private String magicType;

    public Wizard(String name, String magicType) {
        super.setName(name);
        this.magicType = magicType;
        super.setHealth(80);
        super.setStrength(7);
        super.setIntelligence(18);
        super.setAgility(10);
        super.setGold(50);
    }

    public String getMagicType() {
        return ("Magic Type: " + magicType);
    }
    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }
}
