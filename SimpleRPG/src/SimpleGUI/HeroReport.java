package SimpleGUI;

import SimpleCharacters.Hero;

public class HeroReport {
    
    public static void main(Hero Hero) {
        String HeroReport = ("\nThank you for playing Virtual Hero Game!"
                        + "\n" + Hero.printReportCard());
        GUI gui;
        gui = new GUI("Hero Report",HeroReport);
    }

}
