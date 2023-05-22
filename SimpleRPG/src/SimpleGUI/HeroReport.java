/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleGUI;

import SimpleCharacters.Hero;

/**
 *
 * @author jessi
 */
public class HeroReport {
    
    public static void main(Hero Hero) {
        String HeroReport = ("\nThank you for playing Virtual Hero Game!"
                        + "\n" + Hero.printReportCard());
        GUI gui;
        gui = new GUI("Hero Report",HeroReport);
    }

}
