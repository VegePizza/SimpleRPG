package SimpleGUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class Panel extends JPanel{
    
    static final int SCREEN_WIDTH = 700;
    static final int SCREEN_HEIGHT = 500;
    
    public Image image;

    /**
     * Draw the background of this panel.
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 0, 0, null);
    }
   
    //creates a panel and sets the background image
    Panel(String text){
        this.image = new ImageIcon("./images/HowToPlayBG.jpg").getImage();
        JTextArea gameText = new JTextArea();
        gameText.setText(text);
        gameText.setEditable(false);
        gameText.setFont(new Font("Verdana",Font.PLAIN,14));
        this.add(gameText);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setVisible(true);
    }
    
    //creates a panel and sets the background image for Hero report gui
    Panel(PlayerReport user){
        this.image = new ImageIcon("./images/HowToPlayBG.jpg").getImage();
        JTextArea gamePlayers = new JTextArea();
        gamePlayers.append("Player: " + user.getUsername() + "     Score: " + user.getScore());
        gamePlayers.setEditable(false);
        gamePlayers.setFont(new Font("Verdana",Font.PLAIN,16));
        this.add(gamePlayers);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setVisible(true);
    }
    
}

