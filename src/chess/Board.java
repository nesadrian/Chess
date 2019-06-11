package chess;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JFrame;

public class Board {
    boolean isWhiteTurn;
    public JFrame boardFrame;
    public GridLayout boardGrid;
    public HashMap squareAndPiece;
    Square a1;
    Square a2;
    Square a3;
    Square a4;
    Square a5;
    Square a6;
    Square a7;
    Square a8;
    
    Square b1;
    Square b2;
    Square b3;
    Square b4;
    Square b5;
    Square b6;
    Square b7;
    Square b8;
    
    Square c1;
    Square c2;
    Square c3;
    Square c4;
    Square c5;
    Square c6;
    Square c7;
    Square c8;
    
    Square d1;
    Square d2;
    Square d3;
    Square d4;
    Square d5;
    Square d6;
    Square d7;
    Square d8;
    
    Square e1;
    Square e2;
    Square e3;
    Square e4;
    Square e5;
    Square e6;
    Square e7;
    Square e8;
    
    Square f1;
    Square f2;
    Square f3;
    Square f4;
    Square f5;
    Square f6;
    Square f7;
    Square f8;
    
    Square g1;
    Square g2;
    Square g3;
    Square g4;
    Square g5;
    Square g6;
    Square g7;
    Square g8;
    
    Square h1;
    Square h2;
    Square h3;
    Square h4;
    Square h5;
    Square h6;
    Square h7;
    Square h8;
    
    public Board() throws IOException {
        isWhiteTurn = true;
        boardFrame = new JFrame();
        boardGrid = new GridLayout(8, 8);
        boardFrame.setSize(800, 800);
        // Define starting pieces
        
        //Uo, Down, Left, Right, DUL, DUR, DDL, DDR
        a1 = new Square("a1", 1, 8, new Rook(1, 8, true), a2, null, null, b1, null, b2, null, null, Color.decode("#1fafae"));
        a2 = new Square("a2", 2, 8, new Pawn(2, 8, true), a3, a1, null, b2, null, b3, null, b1, Color.decode("#fffefc"));
        a3 = new Square("a3", 3, 8, null, a4, a2, null, b3, null, b4, null, b2, Color.decode("#1fafae"));
        a4 = new Square("a4", 4, 8, null, a5, a3, null, b4, null, b5, null, b3, Color.decode("#fffefc"));
        a5 = new Square("a5", 5, 8, null, a6, a4, null, b5, null, b6, null, b4, Color.decode("#1fafae"));
        a6 = new Square("a6", 6, 8, null, a7, a5, null, b6, null, b7, null, b5, Color.decode("#fffefc"));
        a7 = new Square("a7", 7, 8, new Pawn(7, 1, false), a8, a6, null, b7, null, b8, null, b6, Color.decode("#1fafae"));
        a8 = new Square("a8", 8, 8, new Rook(8, 8, false), null, a7, null, b8, null, null, null, b7, Color.decode("#fffefc"));
        
        b1 = new Square("b1", 1, 7, new Knight(1, 7, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        b2 = new Square("b2", 2, 7, new Pawn(2, 7, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        b3 = new Square("b3", 3, 7, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        b4 = new Square("b4", 4, 7, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        b5 = new Square("b5", 5, 7, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        b6 = new Square("b6", 6, 7, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        b7 = new Square("b7", 7, 7, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        b8 = new Square("b8", 8, 7, new Knight(8, 7, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        
        c1 = new Square("c1", 1, 6, new Bishop(1, 6, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        c2 = new Square("c2", 2, 6, new Pawn(2, 6, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        c3 = new Square("c3", 3, 6, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        c4 = new Square("c4", 4, 6, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        c5 = new Square("c5", 5, 6, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        c6 = new Square("c6", 6, 6, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        c7 = new Square("c7", 7, 6, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        c8 = new Square("c8", 8, 6, new Bishop(8, 6, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        
        d1 = new Square("d1", 1, 5, new Queen(1, 5, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        d2 = new Square("d2", 2, 5, new Pawn(2, 5, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        d3 = new Square("d3", 3, 5, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        d4 = new Square("d4", 4, 5, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        d5 = new Square("d5", 5, 5, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        d6 = new Square("d6", 6, 5, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        d7 = new Square("d7", 7, 5, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        d8 = new Square("d8", 8, 5, new Queen(8, 5, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        
        e1 = new Square("e1", 1, 4, new King(1, 4, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        e2 = new Square("e2", 2, 4, new Pawn(2, 4, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        e3 = new Square("e3", 3, 4, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        e4 = new Square("e4", 4, 4, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        e5 = new Square("e5", 5, 4, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        e6 = new Square("e6", 6, 4, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        e7 = new Square("e7", 7, 4, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        e8 = new Square("e8", 8, 4, new King(8, 4, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        
        f1 = new Square("f1", 1, 3, new Bishop(1, 3, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        f2 = new Square("f2", 2, 3, new Pawn(2, 3, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        f3 = new Square("f3", 3, 3, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        f4 = new Square("f4", 4, 3, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        f5 = new Square("f5", 5, 3, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        f6 = new Square("f6", 6, 3, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        f7 = new Square("f7", 7, 3, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        f8 = new Square("f8", 8, 3, new Bishop(8, 3, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        
        g1 = new Square("g1", 1, 2, new Knight(1, 2, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        g2 = new Square("g2", 2, 2, new Pawn(2, 2, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        g3 = new Square("g3", 3, 2, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        g4 = new Square("g4", 4, 2, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        g5 = new Square("g5", 5, 2, null, null, null, null, null, null, null, null, null, Color.decode("#f1fafae"));
        g6 = new Square("g6", 6, 2, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        g7 = new Square("g7", 7, 2, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        g8 = new Square("g8", 8, 2, new Knight(8, 2, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        
        h1 = new Square("h1", 1, 1, new Rook(1, 1, true), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        h2 = new Square("h2", 2, 1, new Pawn(2, 1, true), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        h3 = new Square("h3", 3, 1, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        h4 = new Square("h4", 4, 1, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        h5 = new Square("h5", 5, 1, null, null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        h6 = new Square("h6", 6, 1, null, null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
        h7 = new Square("h7", 7, 1, new Pawn(7, 1, false), null, null, null, null, null, null, null, null, Color.decode("#fffefc"));
        h8 = new Square("h8", 8, 1, new Rook(8, 1, false), null, null, null, null, null, null, null, null, Color.decode("#1fafae"));
    }
    
    public void movePiece(String move) {
        if(checkMoveLegality(move)) {
            
            isWhiteTurn = !isWhiteTurn;
        }
        else {
            
        }
    }
    
    /*public Piece getPiece() {
        
    }*/
    
    private boolean checkMoveLegality(String move) {
        //Check if piece exist in square
        //Check if piece is right color
        return true;
    }
    
    public void displayBoard() throws IOException {
        boardFrame.setLayout(boardGrid);
        
        boardFrame.add(a8);
        boardFrame.add(b8);
        boardFrame.add(c8);
        boardFrame.add(d8);
        boardFrame.add(e8);
        boardFrame.add(f8);
        boardFrame.add(g8);
        boardFrame.add(h8);
        
        boardFrame.add(a7);
        boardFrame.add(b7);
        boardFrame.add(c7);
        boardFrame.add(d7);
        boardFrame.add(e7);
        boardFrame.add(f7);
        boardFrame.add(g7);
        boardFrame.add(h7);
        
        boardFrame.add(a6);
        boardFrame.add(b6);
        boardFrame.add(c6);
        boardFrame.add(d6);
        boardFrame.add(e6);
        boardFrame.add(f6);
        boardFrame.add(g6);
        boardFrame.add(h6);
        
        boardFrame.add(a5);
        boardFrame.add(b5);
        boardFrame.add(c5);
        boardFrame.add(d5);
        boardFrame.add(e5);
        boardFrame.add(f5);
        boardFrame.add(g5);
        boardFrame.add(h5);
        
        boardFrame.add(a4);
        boardFrame.add(b4);
        boardFrame.add(c4);
        boardFrame.add(d4);
        boardFrame.add(e4);
        boardFrame.add(f4);
        boardFrame.add(g4);
        boardFrame.add(h4);
        
        boardFrame.add(a3);
        boardFrame.add(b3);
        boardFrame.add(c3);
        boardFrame.add(d3);
        boardFrame.add(e3);
        boardFrame.add(f3);
        boardFrame.add(g3);
        boardFrame.add(h3);
        
        boardFrame.add(a2);
        boardFrame.add(b2);
        boardFrame.add(c2);
        boardFrame.add(d2);
        boardFrame.add(e2);
        boardFrame.add(f2);
        boardFrame.add(g2);
        boardFrame.add(h2);
        
        boardFrame.add(a1);
        boardFrame.add(b1);
        boardFrame.add(c1);
        boardFrame.add(d1);
        boardFrame.add(e1);
        boardFrame.add(f1);
        boardFrame.add(g1);
        boardFrame.add(h1);
        
        boardFrame.setVisible(true);

    }
    
}
