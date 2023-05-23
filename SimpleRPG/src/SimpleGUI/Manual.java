package SimpleGUI;

public class Manual{
    
    //Game manual when called explains to user the basics of the game
    public static void main(){
        String text = ("        ***** Welcome to the SimpleRPG game *****\n"
                + "In this game, you will create a hero and embark on a journey to\n"
                + "explore various locations and fight against a range of enemies.\n"
                + "\n"
                + "*** About Occupation ***\n" 
                + "Each occupation has its unique set of starting attributes,\n"
                + "such as health, strength, agility, wisdom, and attack.\n" 
                + "\n"
                + "*** About adventure ***\n"
                + "Each adventure has a different enemy type, and some locations\n"
                + "have special effects on your hero's attributes.\n" 
                + "When you choose a location, you will encounter an enemy and\n"
                + "engage in a fight and your hero will level up.\n"
                + "\n"
                +"*** About Inventory ***\n"
                + "There are three kinds of weapon and shield: paper/iron/diamond.\n"
                + "Your hero will acuquire only one of them for each flight randomly.\n"
                + "The item will give you a stat boost by 20-80 once equipped.\n" 
                + "\n"
                + "*** Winning & Losing conditions ***\n" 
                + "- Your hero's health drops to 0 or below, game over.\n" 
                + "- Your hero reaches level 100, and you win the game.\n");
      
        new MainWindow("Game Manual", text);
        
    }

    
}
