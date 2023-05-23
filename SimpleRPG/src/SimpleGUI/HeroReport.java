package SimpleGUI;

import SimpleCharacters.Hero;

public class HeroReport {
    
    public static void main(Hero Hero) {
        String HeroReport = ("\nThank you for playing Simple RPG game!"
                        + "\n" + Hero.printReportCard());
        WindowFrame gui;
        gui = new WindowFrame("Hero Report",HeroReport);
    }

}
