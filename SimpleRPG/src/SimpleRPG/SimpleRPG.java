package SimpleRPG;

import java.util.Scanner;

public class SimpleRPG {
    
    // This method validates the input ensuring that it is a valid integer.
    private static int safelyParseInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            try {
                // Try to parse the input string to an integer.
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // If it fails, print an error message and loop again.
                System.out.println("--- Invalid input. Please enter a number. ---");
            }
        }
    }

    public static void main(String[] args) {
        
        // Display the game manual.
        GameManual.printGameManual();

        int startChoice = 0;
        // Loop until a valid main menu choice is entered.
        while (startChoice < 1 || startChoice > 3) {
            System.out.println("1. *** Start a new game ***");
            System.out.println("2.    ** Resume game **");
            System.out.println("3.         * Quit *");
            System.out.println("");
            System.out.println("Enter your choice: ");
            startChoice = safelyParseInt();

            if (startChoice < 1 || startChoice > 3) {
                System.out.println("--- Invalid input. Please choose a valid option. ---");
            }
        }
        // If the player chooses to quit, exit the game.
        if (startChoice == 3) {
            System.out.println("Thank you for playing! Goodbye!");
            System.exit(0);
        }
        // If a new game is chosen, delete the old save file.
        if (startChoice == 1) {
            Game.deleteSaveFile();
        }
        // Try to load the game.
        Hero hero = Game.loadGame();
        
        // If no game was loaded (i.e., it's a new game), create a new hero.
        if (hero == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of your hero: ");
            String name = scanner.nextLine();

            int choice = 0;
            while (choice < 1 || choice > 3) {
                System.out.println("Choose your hero's occupation: ");
                System.out.println("1. Swordsman");
                System.out.println("2. Wizard");
                System.out.println("3. Archer");
                choice = safelyParseInt();

                if (choice < 1 || choice > 3) {
                    System.out.println("--- Invalid input. Please choose a valid option. ---");
                }
            }

            hero = Game.createHero(name, choice);
            Drawing.displayASCIIArt(choice);
            Game.printHeroStats(hero);
        } else {
            System.out.println("Welcome back, " + hero.name + " the " + hero.type + "!");
        }
        // Start the adventure with the hero.
        Adventure adventure = new Adventure(hero);
        adventure.start();
    }
}
