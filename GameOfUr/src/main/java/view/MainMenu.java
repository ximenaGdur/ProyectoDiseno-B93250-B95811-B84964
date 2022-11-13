/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.RulesModel;

/**
 *
 * @author Jimena Gdur
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form MainMenuViewJPanel
     */
    public MainMenu() {
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

        colorButton = new javax.swing.JButton();
        gameName = new javax.swing.JLabel();
        rules = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        newGame1 = new javax.swing.JButton();
        rules1 = new javax.swing.JButton();

        colorButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        colorButton.setText("Choose a color");
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        gameName.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        gameName.setText("Royal Game Of Ur");

        rules.setBackground(new java.awt.Color(44, 37, 37));
        rules.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        rules.setForeground(new java.awt.Color(255, 255, 255));
        rules.setText("GAME RULES");
        rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesActionPerformed(evt);
            }
        });

        newGame.setBackground(new java.awt.Color(44, 37, 37));
        newGame.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        newGame.setForeground(new java.awt.Color(255, 255, 255));
        newGame.setText("LOAD GAME");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        newGame1.setBackground(new java.awt.Color(44, 37, 37));
        newGame1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        newGame1.setForeground(new java.awt.Color(255, 255, 255));
        newGame1.setText("START NEW GAME");
        newGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGame1ActionPerformed(evt);
            }
        });

        rules1.setBackground(new java.awt.Color(44, 37, 37));
        rules1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        rules1.setForeground(new java.awt.Color(255, 255, 255));
        rules1.setText("EXIT");
        rules1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rules1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gameName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newGame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rules1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(gameName)
                .addGap(112, 112, 112)
                .addComponent(newGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rules, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rules1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed

    }//GEN-LAST:event_colorButtonActionPerformed

    private void rulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rulesActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGameActionPerformed

    private void newGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGame1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newGame1ActionPerformed

    private void rules1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rules1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rules1ActionPerformed

public void addColorButtonClickListener(ActionListener listenForButton) {
        colorButton.addActionListener(listenForButton);
    }
    
    public void addRulesButtonClickListener(ActionListener listenForButton) {
        rules.addActionListener(listenForButton);
    }
    
    public void chooseColor() {
        Color initialColor = Color.RED;    
        chosenColor = JColorChooser.showDialog(this,"Select a color", initialColor);
    }
    
    public Color getChoosenColor() {
        return chosenColor;
    }
    
    public void showRules() {
        RulesModel rules = new RulesModel();
        
        JFrame frame = new JFrame("Swing Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);
        
        final JLabel title = new JLabel();
        title.setFont(new Font("Century Schoolbook", 1, 36));
        title.setText(rules.getRules()[0]);
        panel.add(title);
        
        for (int index = 1; index < rules.getLength(); index++) {
            final JLabel label = new JLabel();
            label.setFont(new Font("Century Schoolbook", 0, 18));
            label.setText(rules.getRules()[index]);
            panel.add(label);
        }
  
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        
        frame.setSize(560, 200);      
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
    }
    
    private Color chosenColor;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton colorButton;
    private javax.swing.JLabel gameName;
    private javax.swing.JButton newGame;
    private javax.swing.JButton newGame1;
    private javax.swing.JButton rules;
    private javax.swing.JButton rules1;
    // End of variables declaration//GEN-END:variables
}
