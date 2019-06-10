package chess;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Board {
    boolean isWhiteTurn;
    ArrayList<String> moveList;
    public JFrame boardFrame;
    public GridLayout boardGrid;
    
    public Board() {
        isWhiteTurn = true;
        moveList = new ArrayList();
        boardFrame = new JFrame();
        boardGrid = new GridLayout(8, 8);
        boardFrame.setSize(800, 800);
        // Define starting pieces
        
        
    }
    
    public void movePiece(String move) {
        if(checkMoveLegality(move)) {
            isWhiteTurn = !isWhiteTurn;
            moveList.add(move);
            
        }
        else {
            
        }
    }
    
    public boolean checkMoveLegality(String move) {
        return true;
    }
    
    public void displayBoard() throws IOException {
        boardFrame.setLayout(boardGrid);
        boardFrame.add(new Square("a8", 8, 8, new Rook(8, 8, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("b8", 8, 7, new Knight(8, 7, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("c8", 8, 6, new Bishop(8, 6, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("d8", 8, 5, new Queen(8, 5, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("e8", 8, 4, new King(8, 4, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("f8", 8, 3, new Bishop(8, 3, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("g8", 8, 2, new Knight(8, 2, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("h8", 8, 1, new Rook(8, 1, false), Color.decode("#1fafae")));
        
        boardFrame.add(new Square("a7", 7, 8, new Pawn(7, 1, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("b7", 7, 7, new Pawn(7, 1, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("c7", 7, 6, new Pawn(7, 1, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("d7", 7, 5, new Pawn(7, 1, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("e7", 7, 4, new Pawn(7, 1, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("f7", 7, 3, new Pawn(7, 1, false), Color.decode("#fffefc")));
        boardFrame.add(new Square("g7", 7, 2, new Pawn(7, 1, false), Color.decode("#1fafae")));
        boardFrame.add(new Square("h7", 7, 1, new Pawn(7, 1, false), Color.decode("#fffefc")));
        
        boardFrame.add(new Square("a6", 6, 8, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("b6", 6, 7, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("c6", 6, 6, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("d6", 6, 5, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("e6", 6, 4, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("f6", 6, 3, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("g6", 6, 2, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("h6", 6, 1, null, Color.decode("#1fafae")));
        
        boardFrame.add(new Square("a5", 5, 8, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("b5", 5, 7, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("c5", 5, 6, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("d5", 5, 5, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("e5", 5, 4, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("f5", 5, 3, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("g5", 5, 2, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("h5", 5, 1, null, Color.decode("#fffefc")));
        
        boardFrame.add(new Square("a4", 4, 8, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("b4", 4, 7, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("c4", 4, 6, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("d4", 4, 5, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("e4", 4, 4, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("f4", 4, 3, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("g4", 4, 2, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("h4", 4, 1, null, Color.decode("#1fafae")));
       
        boardFrame.add(new Square("a3", 3, 8, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("b3", 3, 7, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("c3", 3, 6, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("d3", 3, 5, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("e3", 3, 4, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("f3", 3, 3, null, Color.decode("#fffefc")));
        boardFrame.add(new Square("g3", 3, 2, null, Color.decode("#1fafae")));
        boardFrame.add(new Square("h3", 3, 1, null, Color.decode("#fffefc")));
        
        boardFrame.add(new Square("a2", 2, 8, new Pawn(2, 8, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("b2", 2, 7, new Pawn(2, 7, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("c2", 2, 6, new Pawn(2, 6, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("d2", 2, 5, new Pawn(2, 5, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("e2", 2, 4, new Pawn(2, 4, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("f2", 2, 3, new Pawn(2, 3, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("g2", 2, 2, new Pawn(2, 2, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("h2", 2, 1, new Pawn(2, 1, true), Color.decode("#1fafae")));
        
        boardFrame.add(new Square("a1", 1, 8, new Rook(1, 8, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("b1", 1, 7, new Knight(1, 7, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("c1", 1, 6, new Bishop(1, 6, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("d1", 1, 5, new Queen(1, 5, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("e1", 1, 4, new King(1, 4, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("f1", 1, 3, new Bishop(1, 3, true), Color.decode("#fffefc")));
        boardFrame.add(new Square("g1", 1, 2, new Knight(1, 2, true), Color.decode("#1fafae")));
        boardFrame.add(new Square("h1", 1, 1, new Rook(1, 1, true), Color.decode("#fffefc")));
        
        boardFrame.setVisible(true);

    }
    
}
