/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Mauricio Palma
 */
public class PlayerViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlayerViewPanel
     */
    public PlayerViewPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainTitle = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        playerTurnText = new javax.swing.JLabel();
        firstPlayerPanel = new javax.swing.JPanel();
        firstPlayerText = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        secondPlayerPanel = new javax.swing.JPanel();
        secondPlayerText = new javax.swing.JLabel();

        mainTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mainTitle.setText("Royal Game of Ur");

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));

        playerTurnText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        playerTurnText.setText("Waiting...");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(playerTurnText)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(playerTurnText)
                .addGap(99, 99, 99))
        );

        firstPlayerPanel.setBackground(new java.awt.Color(153, 153, 153));

        firstPlayerText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstPlayerText.setText("Player 1 Score:");

        javax.swing.GroupLayout firstPlayerPanelLayout = new javax.swing.GroupLayout(firstPlayerPanel);
        firstPlayerPanel.setLayout(firstPlayerPanelLayout);
        firstPlayerPanelLayout.setHorizontalGroup(
            firstPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPlayerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPlayerText)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        firstPlayerPanelLayout.setVerticalGroup(
            firstPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPlayerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(firstPlayerText)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        okButton.setText("Play");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        secondPlayerPanel.setBackground(new java.awt.Color(153, 153, 153));

        secondPlayerText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secondPlayerText.setText("Player 2 Score:");

        javax.swing.GroupLayout secondPlayerPanelLayout = new javax.swing.GroupLayout(secondPlayerPanel);
        secondPlayerPanel.setLayout(secondPlayerPanelLayout);
        secondPlayerPanelLayout.setHorizontalGroup(
            secondPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPlayerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondPlayerText)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        secondPlayerPanelLayout.setVerticalGroup(
            secondPlayerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPlayerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(secondPlayerText)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(mainTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(okButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(secondPlayerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(mainTitle)
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(secondPlayerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstPlayerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okButtonActionPerformed

     /**
     * Method that is trigger when the user clicks the button associated
     * @param listenForButton Event that will trigger the action designed for the button
     */
    public void addButtonClickListener(ActionListener listenForButton) {
        okButton.addActionListener(listenForButton);
    }
    

    /**
     * Method that allows to set the id of the plaer who will be playing at a given turn
     * @param playerID The id that will be printed on the screen
     */
    public void setplayerTurnsText(int playerID){
        playerTurnText.setText("Player: " + playerID + " plays!");
    }
    
    /**
     * Method that allows to set the the score of the first player that will be playing the game
     * @param score The score that will be added to the player
     */
    public void setFirstPlayerScore(int score) {
        firstPlayerText.setText("Player 1 Score: " + score);
    }
    
    /**
     * Method that allows to set the the score of the second player that will be playing the game
     * @param score The score that will be added to the player
     */
    public void setSecondPlayerScore(int score) {
        secondPlayerText.setText("Player 2 Score: " + score);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel firstPlayerPanel;
    private javax.swing.JLabel firstPlayerText;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel playerTurnText;
    private javax.swing.JPanel secondPlayerPanel;
    private javax.swing.JLabel secondPlayerText;
    // End of variables declaration//GEN-END:variables
}