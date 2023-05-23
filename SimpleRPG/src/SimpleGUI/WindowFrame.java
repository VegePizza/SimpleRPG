package SimpleGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class WindowFrame extends JFrame implements ActionListener {
    
    public WindowFrame() throws HeadlessException {
    }
    
    //Default GUI
    public WindowFrame(String title, String text) {
        this.add(new Panel(text));
        this.setTitle(title);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Verdana",Font.BOLD,14));
        closeButton.setBackground(Color.red);
        this.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener((ActionEvent e) -> {
            this.dispose();
        });
    }
    
    //GUI for showing player scores
    WindowFrame(String players_Scores, PlayerReport user) {
        this.add(new Panel(user));
        this.setTitle(players_Scores);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Verdana",Font.BOLD,14));
        closeButton.setBackground(Color.red);
        this.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener((ActionEvent e) -> {
            this.dispose();
        });
    }
    
    //GUI for showing the ending game text
    public void GUIend(String title, String text) {
        this.setTitle(title);
        this.setSize(450,500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        
        JTextArea textArea = new JTextArea(text);
        textArea.setFont(new Font("Serif", Font.PLAIN, 20));
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        this.add(scrollPane, BorderLayout.CENTER);
        
        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Verdana",Font.BOLD,14));
        closeButton.setBackground(Color.red);
        this.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener((ActionEvent e) -> {
            this.dispose();
        });
        
        JButton restartButton = new JButton("Restart");
        restartButton.setFont(new Font("Verdana",Font.BOLD,14));
        restartButton.setBackground(Color.green);
        this.add(restartButton, BorderLayout.NORTH);
        restartButton.addActionListener((ActionEvent e) -> {
            this.dispose();
            new FirstMainFrame().setVisible(true);
        });
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
    
}

