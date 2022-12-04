/*
 * Game of Ur based on MARDA framework.
 * Jimena Gdur Vargas - B93250.
 * Álvaro Miranda Villegas - B84964.
 * Ronald Palma Villegas - B95811.
 */
package controller;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import model.Board;

import model.Piece;
import model.Tile;
import model.UrPiece;
import model.UrTile;

/**
* Main class that starts program.
* @author Mauricio Palma, Alvaro Miranda, Jimena Gdur
*/
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Doesn't test other methods that can't be accesed through parent
            System.out.println("Testing classes");
            
            System.out.println("\nTesting Tile and Piece classes");
            testTileAndPieceClasses();
            
            System.out.println("\nTesting Board class");
            testBoardClasses();
        });
    }
    
    public static void testTileAndPieceClasses() {
        Tile tile = new UrTile(2,3, false);
        System.out.println("Tile after constructor: " + tile);
        Piece piece = new UrPiece(Color.RED);
        System.out.println("Piece after constructor: " + piece);
        System.out.println("Setting piece in tile: " + piece);
        tile.setPiece(piece);
        System.out.println("Tile after: " + tile.toString());
        System.out.println("Piece after: " + piece.toString());
        
        // TODO: piece isInPlay is not changed
    }
    
    public static void testBoardClasses() {
        int vertexNumberFromFile = 24;
        int rowNumberFromFile = 8;
        int colNumberFromFile = 3;
        
        Board board = new Board(UrTile::new, vertexNumberFromFile, rowNumberFromFile, colNumberFromFile);
        //System.out.println("Board after constructor: " + board);
        
        // TODO: set safe tiles
        Tile safeTile1 = board.getTile(0, 0);
        //safeTile1.setAsSafe();
        Tile safeTile2 = board.getTile(0, 2);
        //safeTile2.setAsSafe();
        Tile safeTile3 = board.getTile(6, 0);
        //safeTile3.setAsSafe();
        Tile safeTile4 = board.getTile(6, 2);
        //safeTile4.setAsSafe();
        
        boolean[][] adjacentMatrixFromFile =
        {
            {false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 0
            {false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 1
            {false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 2
            {true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 3
            {false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 4
            {false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 5
            {false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 6
            {false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 7
            {false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 8
            {false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 9
            {false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false}, // 10
            {false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 11
            {false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 12
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false}, // 13
            {false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false}, // 14
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 15
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false}, // 16
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false}, // 17
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false}, // 18
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false}, // 19
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false}, // 20
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false}, // 21
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true},  // 22
            {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false}, // 23
        };
        board.setAdjacentMatrix(adjacentMatrixFromFile);
        //System.out.println("Board after setting adjacentMatrix: " + board);
        
        System.out.println("Getting tile adjacents:");
        ArrayList<Integer> possibleTiles = board.getTilesAdjacents(5,1, 3);
        System.out.println("possibleTiles: " + possibleTiles);
        //board.setPieceInTile(3,0, )
                
        //ArrayList<Integer> possibleTiles1 = board.getTilesAdjacents(7,1, 3);
    }
}
