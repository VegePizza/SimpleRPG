package SimpleRPG;

// The Drawing class handles the display of ASCII Art.
public class Drawing {
    
    // This method takes an integer as a parameter and prints different ASCII art
    public static void displayASCIIArt(int choice) {
        switch (choice) {
            case 1:
                System.out.println("  :O  ");
                System.out.println("  /|\\ =[====> ");
                System.out.println("  / \\ ");
                break;
            case 2:
                System.out.println("  ;O  ");
                System.out.println("  /|\\ --===*** ");
                System.out.println("  / \\ ");
                break;
            case 3:
                System.out.println("  ~O  \\");
                System.out.println("  /|\\--)---> ");
                System.out.println("  / \\ /");
                break;
            default:
                System.out.println("Invalid choice.");
            }
        }
}
