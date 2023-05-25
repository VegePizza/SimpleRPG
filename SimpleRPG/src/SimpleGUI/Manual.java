package SimpleGUI;

public class Manual{
    
    //Game manual when called explains to user the basics of the game
    public static void main(){
        String text = ("        ***** Welcome to the SimpleRPG game *****\n"
                + "In this game, you will create a hero and embark on a journey to\n"
                + "explore various locations and fight against a range of enemies.\n"
                + "\n"
                + "The aim of the game is to make your Hero Stats as high as possible!\n"
                + "\n"
                + "Multiple actions are available each effecting different aspects of your Hero such as,\n"
                + "Health, hunger, strength, energy and money.\n"
                + "Every action has some positive effect on your Hero but watch out as there are negatives as well,\n"
                + "Train - Strength\n"
                + "Battle - Energy\n"
                + "Treasure Hunt - Money\n"
                + "Heal - Hunger\n"
                + "Adventure - Health\n"
                + "\n"
                + "You want to keep your hunger level down while raising other stats up\n"
                + "\n"
                + "Hint for earning Money: Inability to go for Treasure Hunt without proper training\n");
      
        new WindowFrame("Game Manual", text);
       
    }
}
