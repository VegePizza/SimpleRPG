package SimpleGUI;

import SimpleOptions.Train;
import SimpleOptions.Adventure;
import SimpleOptions.TreasureHunt;
import SimpleOptions.Eat;
import SimpleOptions.Battle;
import static SimpleGUI.ChooseHero.Hero;
import static SimpleGUI.ChooseHero.HeroText;
import static SimpleGUI.FirstMainFrame.player;
import javax.swing.JFrame;

//third frame
public class HeroActions extends JFrame{
    
    private static JFrame frame = new JFrame();
 
    /**
     * Creates new form NewJPanel
     */
    public HeroActions() {
        initComponents();
        this.HeroTextArea.setText(HeroText);
        HeroStatsArea1.setText(Hero.printInfo());
        player.setScore(Hero.HeroScore);
        HeroGameArea.setText("What would you like to feed " + Hero.heroName
                + "\nOptions are:\n"
                + "1. Basic Food: $2\n"
                + "2. Intermediate Food: $4\n"
                + "3. Luxury Food: $6");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HeroTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        HeroStatsArea1 = new javax.swing.JTextArea();
        TitleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ScoresButton = new javax.swing.JButton();
        HeroReportButton = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        RestartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HeroActionsCombobox = new javax.swing.JComboBox<>();
        Option1 = new javax.swing.JRadioButton();
        Option2 = new javax.swing.JRadioButton();
        Option3 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        HeroGameArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");
        setMinimumSize(new java.awt.Dimension(720, 500));
        setSize(new java.awt.Dimension(720, 500));
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        HeroTextArea.setColumns(20);
        HeroTextArea.setRows(5);
        jScrollPane1.setViewportView(HeroTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 270, 210);

        HeroStatsArea1.setColumns(20);
        HeroStatsArea1.setRows(5);
        jScrollPane4.setViewportView(HeroStatsArea1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 280, 270, 165);

        TitleLabel.setBackground(new java.awt.Color(255, 255, 0));
        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleLabel.setText("Hero Stats");
        TitleLabel.setOpaque(true);
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(50, 20, 130, 30);

        jPanel3.setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel2.setOpaque(false);

        ScoresButton.setBackground(new java.awt.Color(255, 255, 102));
        ScoresButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScoresButton.setText("Scores");
        ScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoresButtonActionPerformed(evt);
            }
        });

        HeroReportButton.setBackground(new java.awt.Color(102, 255, 204));
        HeroReportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HeroReportButton.setText("Hero Report");
        HeroReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroReportButtonActionPerformed(evt);
            }
        });

        EndButton.setBackground(new java.awt.Color(255, 51, 0));
        EndButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EndButton.setText("End");
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });

        RestartButton.setBackground(new java.awt.Color(102, 255, 102));
        RestartButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RestartButton.setText("Restart");
        RestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RestartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HeroReportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(ScoresButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EndButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HeroReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RestartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EndButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(265, 0, 110, 252);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("What would you like to do with your Hero?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 20, 276, 17);

        HeroActionsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heal", "Play", "Battle", "Train", "Perform" }));
        HeroActionsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeroActionsComboboxActionPerformed(evt);
            }
        });
        jPanel1.add(HeroActionsCombobox);
        HeroActionsCombobox.setBounds(20, 50, 80, 23);

        Option1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Option1.setText("Option 1");
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });
        jPanel1.add(Option1);
        Option1.setBounds(0, 80, 80, 19);

        Option2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Option2.setText("Option 2");
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });
        jPanel1.add(Option2);
        Option2.setBounds(90, 80, 80, 19);

        Option3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Option3.setText("Option 3");
        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });
        jPanel1.add(Option3);
        Option3.setBounds(180, 80, 80, 19);

        HeroGameArea.setColumns(20);
        HeroGameArea.setRows(5);
        jScrollPane3.setViewportView(HeroGameArea);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 120, 260, 300);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(300, 10, 390, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FinalBG.jpg"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 480);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 700, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //when option 3 is selected Hero is given option 3 action
    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed

        if(null != HeroActionsCombobox.getSelectedItem().toString())
        switch (HeroActionsCombobox.getSelectedItem().toString()) {
            case "Heal":
            Eat feed = new Eat(Hero, 3);
            HeroGameArea.setText(feed.feedHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Battle":
            Battle battle = new Battle(Hero, 3);
            HeroGameArea.setText(battle.battleHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Play":
            Adventure play = new Adventure(Hero, 3);
            HeroGameArea.setText(play.playHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Train":
            Train train = new Train(Hero, 3);
            HeroGameArea.setText(train.trainHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Perform":
            TreasureHunt perform = new TreasureHunt(Hero, 3);
            HeroGameArea.setText(perform.performHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            default:
            break;
        }
        Option1.setSelected(false);
        Option2.setSelected(false);
        HeroGameArea.append(Hero.checkenergy(Hero));
        HeroGameArea.append(Hero.checkHunger(Hero));
        HeroGameArea.append(Hero.checkHealth(Hero));
        HeroStatsArea1.setText(Hero.printInfo());
        player.setScore(Hero.HeroScore);
        if (Hero.health >= 40){
            Ending.goodGame();
            HeroActions.super.dispose();
        } else if (Hero.health == 0){
            Ending.badGame();
            HeroActions.super.dispose();
        }
    }//GEN-LAST:event_Option3ActionPerformed

    //when option 2 is selected Hero is given option 2 action
    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed

        if(null != HeroActionsCombobox.getSelectedItem().toString())
        switch (HeroActionsCombobox.getSelectedItem().toString()) {
            case "Heal":
            Eat feed = new Eat(Hero, 2);
            HeroGameArea.setText(feed.feedHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Battle":
            Battle battle = new Battle(Hero, 2);
            HeroGameArea.setText(battle.battleHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Play":
            Adventure play = new Adventure(Hero, 2);
            HeroGameArea.setText(play.playHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Train":
            Train train = new Train(Hero, 2);
            HeroGameArea.setText(train.trainHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Perform":
            TreasureHunt perform = new TreasureHunt(Hero, 2);
            HeroGameArea.setText(perform.performHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            default:
            break;
        }
        Option1.setSelected(false);
        Option3.setSelected(false);
        HeroGameArea.append(Hero.checkenergy(Hero));
        HeroGameArea.append(Hero.checkHunger(Hero));
        HeroGameArea.append(Hero.checkHealth(Hero));
        HeroStatsArea1.setText(Hero.printInfo());
        player.setScore(Hero.HeroScore);
        if (Hero.health >= 40){
            Ending.goodGame();
            HeroActions.super.dispose();
        } else if (Hero.health == 0){
            Ending.badGame();
            HeroActions.super.dispose();
        }
    }//GEN-LAST:event_Option2ActionPerformed

    //when option 1 is selected Hero is given option 1 action
    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed

        if(null != HeroActionsCombobox.getSelectedItem().toString())
        switch (HeroActionsCombobox.getSelectedItem().toString()) {
            case "Heal":
            Eat feed = new Eat(Hero, 1);
            HeroGameArea.setText(feed.feedHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Battle":
            Battle battle = new Battle(Hero, 1);
            HeroGameArea.setText(battle.battleHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Play":
            Adventure play = new Adventure(Hero, 1);
            HeroGameArea.setText(play.playHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Train":
            Train train = new Train(Hero, 1);
            HeroGameArea.setText(train.trainHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            case "Perform":
            TreasureHunt perform = new TreasureHunt(Hero, 1);
            HeroGameArea.setText(perform.performHero());
            HeroStatsArea1.setText(Hero.printInfo());
            break;
            default:
            break;
        }
        Option2.setSelected(false);
        Option3.setSelected(false);
        HeroGameArea.append(Hero.checkenergy(Hero));
        HeroGameArea.append(Hero.checkHunger(Hero));
        HeroGameArea.append(Hero.checkHealth(Hero));
        HeroStatsArea1.setText(Hero.printInfo());
        player.setScore(Hero.HeroScore);
        if (Hero.health >= 40){
            Ending.goodGame();
            HeroActions.super.dispose();
        } else if (Hero.health == 0){
            Ending.badGame();
            HeroActions.super.dispose();
        }
    }//GEN-LAST:event_Option1ActionPerformed

    //displays list of Hero actions, when an action is selected it prints 3 options
    private void HeroActionsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroActionsComboboxActionPerformed
        // TODO add your handling code here:
        Option1.setSelected(false);
        Option2.setSelected(false);
        Option3.setSelected(false);
        if("Heal".equals(HeroActionsCombobox.getSelectedItem().toString())){
            HeroGameArea.setText("What would you like to feed " + Hero.heroName
                + "\nOptions are:\n"
                + "1. Basic Food: $2\n"
                + "2. Intermediate Food: $4\n"
                + "3. Luxury Food: $6");
        }
        if("Battle".equals(HeroActionsCombobox.getSelectedItem().toString())){
            HeroGameArea.setText("How would you like to Battle " + Hero.heroName
                + "\nOptions are:\n"
                + "1. Basic Battle\n"
                + "2. Intermediate Battle\n"
                + "3. Luxury Battle");
        }
        if("Play".equals(HeroActionsCombobox.getSelectedItem().toString())){
            HeroGameArea.setText("How would you like to Play with " + Hero.heroName
                + "\nOptions are:\n"
                + "1. Basic Fun\n"
                + "2. Intermediate Fun\n"
                + "3. Luxury Fun");
        }
        if("Train".equals(HeroActionsCombobox.getSelectedItem().toString())){
            HeroGameArea.setText("How would you like to Train " + Hero.heroName
                + "\nOptions are:\n"
                + "1. Basic Training\n"
                + "2. Intermediate Training\n"
                + "3. Luxury Training");
        }
        if("Perform".equals(HeroActionsCombobox.getSelectedItem().toString())){
            HeroGameArea.setText("What act would you and " + Hero.heroName + " like to perform"
                + "\nOptions are:\n"
                + "1. Basic Show\n"
                + "2. Intermediate Show\n"
                + "3. Advanced Show");
        }
    }//GEN-LAST:event_HeroActionsComboboxActionPerformed

    //restart program
    private void RestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtonActionPerformed
        // TODO add your handling code here:
        HeroActions.super.dispose();
        new FirstMainFrame().setVisible(true);
    }//GEN-LAST:event_RestartButtonActionPerformed

    //ends program
    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EndButtonActionPerformed

    //Hero report shown
    private void HeroReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeroReportButtonActionPerformed
        // TODO add your handling code here:
        HeroReport.main(Hero);
    }//GEN-LAST:event_HeroReportButtonActionPerformed

    //scores shown
    private void ScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoresButtonActionPerformed
        // TODO add your handling code here:
        PlayerReport.main(player);
    }//GEN-LAST:event_ScoresButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HeroActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HeroActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HeroActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HeroActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new HeroActions();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndButton;
    private javax.swing.JRadioButton Option1;
    private javax.swing.JRadioButton Option2;
    private javax.swing.JRadioButton Option3;
    private javax.swing.JComboBox<String> HeroActionsCombobox;
    private javax.swing.JTextArea HeroGameArea;
    private javax.swing.JButton HeroReportButton;
    private javax.swing.JTextArea HeroStatsArea1;
    private javax.swing.JTextArea HeroTextArea;
    private javax.swing.JButton RestartButton;
    private javax.swing.JButton ScoresButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
