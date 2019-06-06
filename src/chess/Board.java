package chess;
import java.awt.Color;
import java.awt.GridLayout;
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
    
    public void displayBoard() {
        boardFrame.setLayout(boardGrid);
        boardFrame.add(new Square("a1", 1, 1, null, Color.blue), 0, 0);
        boardFrame.add(new Square("a2", 2, 1, null, Color.white), 0, 1);
        boardFrame.add(new Square("b1", 1, 2, null, Color.blue), 1, 1);
        boardFrame.setVisible(true);
        boardFrame.pack();
    }
    
}
