/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintWriter;

import javax.swing.JLabel;

import model.UrBoardModel;

import model.UrDiceModel;
import model.UrPieceModel;
import model.UrPlayerModel;
import model.UrSerializerConstructor;
import model.UrTileModel;

import view.MainGameView;
import view.MainMenuView;


/**
 *
 * @author Mauricio Palma
 */
public class GameController {
    private final static int ROWS = 8;
    private final static int COLUMNS = 3;
    
    private UrBoardModel board;
    private UrDiceModel diceModel;
    private UrPieceModel piece;
    private MainMenuView mainMenuView;

    /*Atributos serializador?*/
    private UrPlayerModel player1;
    private UrPlayerModel player2;
    private UrSerializerConstructor serializer;
    
    private MainGameView gameView;
    private MainMenuView menu;

    
    private Color currentPlayer;
    private boolean diceThrown;
    
    public GameController(){
        try {
            this.diceModel = new UrDiceModel();
            this.gameView = new MainGameView();
            this.piece = new UrPieceModel();
            this.mainMenuView = new MainMenuView();

            initializeLabels();
            chooseNextPossibleLabel();        
            menuHandler();
        } catch(IOException e) {
            System.out.println("Images not found! Please check images path");
        }
    }
    
    public MainGameView getMainGameView() {
        return this.gameView;
    }
    
    public MainMenuView getMainMenuView(){
        return this.mainMenuView;
    }
    
    /* 
    public GameController(MainGameView gameView, UrPieceModel piece,
        MainMenuView menu, UrDiceController diceController)
    {
        this.gameView = gameView;
        this.piece = piece;
        this.menu = menu;
        
        this.diceThrown = false;
        
        this.serializer = new UrSerializerConstructor(board, player1, player2);
        
        initializeLabels();
        //chooseNextPossibleLabel();        
        menuHandler();
        UrDiceController.DiceListener diceListener = initializeDice(diceController); // TODO move this
        this.diceView.addDiceListener(diceListener);  
    }*/
    
    private void menuHandler(){
        this.gameView.addSaveAndLeaveButtonClickListener(new SaveAndLeaveClickListener());
        this.gameView.addthrowDiceButtonClickListener(new ThrowDiceClickListener());
        this.mainMenuView.addExitButtonClickListener(new ExitClickListener());
        this.mainMenuView.addLoadGameButtonClickListener(new LoadGameClickListener());
    }
    
    private void initializeLabels(){
        JLabel currentLabel;
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                currentLabel = gameView.getLabel(row, column);
                currentLabel.addMouseListener(new TileMouseListener(currentLabel,row,column));
            }
        }
    }
    
    private void playerTurn() {
        // while
            // tirar el dado
            // esperar que se estripe
            // chooseNextPossibleLabel
            
    }
    
    private void chooseNextPossibleLabel(int row, int column){
        UrTileModel chosenTile = board.getTile(row, column);
        int diceValue = diceModel.getRollResult();
        UrTileModel possibleTile = board.getPossibleTile(chosenTile, diceValue, currentPlayer);
        
        int x = possibleTile.getRow();
        int y = possibleTile.getColumn();
        
        //gameView.setNextPossibleLabel(x,y);
    }
      
    public void saveGame() {
        try (PrintWriter writer = new PrintWriter(new File("gameState.csv"))) {
            writer.write(serializer.saveGameState());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void loadGame() {
        // file chooser returns file name
        // open file name and get string
        // create array of strings by splitting by \n
        String fileContents = "";
        loadGameState(fileContents.split("\n", 0));
    }
    
    private UrPlayerModel createPlayer(String[] player) {
        Color playerColor = new Color(Integer.parseInt(player[0]));
        int playerScore = Integer.parseInt(player[2]);
        // Color playerColor, String playerName, int playerScore
        return new UrPlayerModel(playerColor, player[1], playerScore);
    }
    
    private void loadGameState(String[] fileContents) {
        // read player colors and score
        int fileContentsIndex = 0;
        int pieceIndex = 0;
        player1 = createPlayer(fileContents[fileContentsIndex].split("[,]", 0));
        
        fileContentsIndex++;
        player2 = createPlayer(fileContents[fileContentsIndex].split("[,]", 0));
        
        fileContentsIndex++;
        board = new UrBoardModel(player1.getColor(), player2.getColor());
        
        int actualCol = 0;
        for(int row = 0; row < UrBoardModel.ROWS; row++) {
            for(int col = 0; col < UrBoardModel.COLUMNS + 2; col++) {
                char character = fileContents[fileContentsIndex].charAt(col);
                if (character != ',') {
                    UrPieceModel piece;
                    if (Character.getNumericValue(character) == UrSerializerConstructor.OCCUPIED_P1) {
                        piece = player1.getPlayerPiece(pieceIndex);
                        gameBoard.setPiece(row, actualCol, piece);
                    } else if (Character.getNumericValue(character) == UrSerializerConstructor.OCCUPIED_P2) {
                        piece = player2.getPlayerPiece(pieceIndex);
                        gameBoard.setPiece(row, actualCol, piece);
                    }
                    actualCol++;
                }
            }
            fileContentsIndex++;
        }
        gameBoard.setPlayerTurn(new Color(Integer.parseInt(fileContents[fileContentsIndex])));
    }
    
    /*Setters */
    private void chooseNextPossibleLabel(){
        //gameView.setNextPossibleLabel(2,2);
    }

    public void setFirstPlayerName(String name){
        gameView.setFirstPlayerNameToLabel(name);
    }
    
    public void setFirstPlayerColor(Color color){
        try {
            gameView.setFirstPlayerPieceColor(color);
        } catch (IOException e) {
            System.out.println("Color piece icon not found");
        }
    }
    
    public void setSecondPlayerName(String name){
       gameView.setSecondPlayerNameToLabel(name);
    }
    
    public void setSecondPlayerColor(Color color){
        try {
            gameView.setSecondPlayerPieceColor(color);
        } catch (IOException e) {
            System.out.println("Color piece icon not found");
        }
    }

    
    /* Listeners */
    class TileMouseListener extends MouseAdapter {
        JLabel label;
        int row;
        int column;

        TileMouseListener(JLabel label, int row, int column){
            this.label = label;
            this.row = row;
            this.column = column;
        }

        @Override
        public void mousePressed(MouseEvent entered){
            if(diceThrown == true) {
                this.label.setBackground(Color.red);
                gameView.setNextPossibleLabel(0,0,gameView.getFirsPlayerIcon());
                //chooseNextPossibleLabel(row, column);
            }
        }

        @Override
        public void mouseEntered(MouseEvent entered){
            try {
                gameView.removeIconFromLabel(0,0); // TODO these numbers are not used yet.
            } catch (IOException e) {
                System.out.println("Images not found!");
            }
            this.label.setBackground(Color.decode("#2D3553"));
        }
    }
   
    class SaveAndLeaveClickListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        } 
    }
    
    class ThrowDiceClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int diceResult = getDiceResult();
        }
        
        private int getDiceResult(){
            gameView.cleanDice();
            diceThrown  = true;
            diceModel.rollDice();
            int diceResult = diceModel.getRollResult();
            gameView.showThrow(diceResult);
            gameView.setMoves(diceResult);
            return diceResult;
        }

    }
    
    class ExitClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    class LoadGameClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Teach me how to load a game!");
            
        }
    }
}
