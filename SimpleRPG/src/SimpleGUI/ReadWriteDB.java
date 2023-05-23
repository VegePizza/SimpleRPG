package SimpleGUI;

import SimpleDatabase.PlayerScores;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadWriteDB {
    private PlayerScores scores;
    
    private JTextField nameField;
    private JTextField scoreField;
    private JLabel messageLabel;
    
    public ReadWriteDB() {
        scores = new PlayerScores();
        
        JFrame frame = new JFrame("Score Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        panel.setLayout(new GridLayout(5, 2));
        
        panel.add(new JLabel("Player Name:"));
        nameField = new JTextField();
        panel.add(nameField);
        
        panel.add(new JLabel("Score:"));
        scoreField = new JTextField();
        panel.add(scoreField);
        
        JButton addButton = new JButton("Add Score");
        addButton.addActionListener(new AddScoreListener());
        panel.add(addButton);
        
        JButton updateButton = new JButton("Update Score");
        updateButton.addActionListener(new UpdateScoreListener());
        panel.add(updateButton);
        
        JButton deleteButton = new JButton("Delete Score");
        deleteButton.addActionListener(new DeleteScoreListener());
        panel.add(deleteButton);
        
        JButton getScoreButton = new JButton("Get Score");
        getScoreButton.addActionListener(new GetScoreListener());
        panel.add(getScoreButton);
        
        messageLabel = new JLabel("");
        panel.add(messageLabel);
        
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }
    
    class AddScoreListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            try {
                int score = Integer.parseInt(scoreField.getText());
                scores.createScoreTable(name, score);
                messageLabel.setText("Score added for " + name);
            } catch (NumberFormatException ex) {
                messageLabel.setText("Invalid score input. Please enter an integer.");
            }
        }
    }
    
    class UpdateScoreListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            try {
                int score = Integer.parseInt(scoreField.getText());
                scores.updatePlayerScore(name, score);
                messageLabel.setText("Score updated for " + name);
            } catch (NumberFormatException ex) {
                messageLabel.setText("Invalid score input. Please enter an integer.");
            }
        }
    }
    
    class DeleteScoreListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            scores.deletePlayerScore(name);
            messageLabel.setText("Score deleted for " + name);
        }
    }
    
    class GetScoreListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            try {
                int score = scores.getPlayerScore(name);
                messageLabel.setText("Score for " + name + ": " + score);
            } catch (NumberFormatException ex) {
                messageLabel.setText("Invalid score input. Please enter an integer.");
            }
        }
    }
    
    public static void main(String[] args) {
        new ReadWriteDB();
    }
}

