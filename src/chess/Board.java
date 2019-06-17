package chess;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {
    public boolean isWhiteTurn;
    private JFrame boardFrame;
    private JPanel jpanelsHolder;
    private final GridLayout boardGrid;
    
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
        jpanelsHolder = new JPanel();
        boardFrame = new JFrame();
        boardGrid = new GridLayout(8, 8);
        jpanelsHolder.setSize(800, 800);
        jpanelsHolder.setLayout(boardGrid);
        boardFrame.add(jpanelsHolder);
        
        //Name, x, y, piece, Up, Down, Left, Right, DUL, DUR, DDL, DDR
        a1 = new Square("a1", 1, 1, new Rook(1, 8, true), a2, null, null, b1, null, b2, null, null, Color.decode("#1fafae"));
        a2 = new Square("a2", 1, 2, new Pawn(2, 8, true), a3, a1, null, b2, null, b3, null, b1, Color.decode("#fffefc"));
        a3 = new Square("a3", 1, 3, null, a4, a2, null, b3, null, b4, null, b2, Color.decode("#1fafae"));
        a4 = new Square("a4", 1, 4, null, a5, a3, null, b4, null, b5, null, b3, Color.decode("#fffefc"));
        a5 = new Square("a5", 1, 5, null, a6, a4, null, b5, null, b6, null, b4, Color.decode("#1fafae"));
        a6 = new Square("a6", 1, 6, null, a7, a5, null, b6, null, b7, null, b5, Color.decode("#fffefc"));
        a7 = new Square("a7", 1, 7, new Pawn(7, 1, false), a8, a6, null, b7, null, b8, null, b6, Color.decode("#1fafae"));
        a8 = new Square("a8", 1, 8, new Rook(8, 8, false), null, a7, null, b8, null, null, null, b7, Color.decode("#fffefc"));
        
        b1 = new Square("b1", 2, 1, new Knight(1, 7, true), b2, null, a1, c1, a2, c2, null, null, Color.decode("#fffefc"));
        b2 = new Square("b2", 2, 2, new Pawn(2, 7, true), b3, b1, a2, c2, a3, c3, a1, c1, Color.decode("#1fafae"));
        b3 = new Square("b3", 2, 3, null, b4, b2, a3, c3, a4, c4, a2, c2, Color.decode("#fffefc"));
        b4 = new Square("b4", 2, 4, null, b5, b3, a4, c4, a5, c5, a3, c3, Color.decode("#1fafae"));
        b5 = new Square("b5", 2, 5, null, b6, b4, a5, c5, a6, c6, a4, c4, Color.decode("#fffefc"));
        b6 = new Square("b6", 2, 6, null, b7, b5, a6, c6, a7, c7, a5, c5, Color.decode("#1fafae"));
        b7 = new Square("b7", 2, 7, new Pawn(7, 1, false), b8, b6, a7, c7, a8, c8, a6, c6, Color.decode("#fffefc"));
        b8 = new Square("b8", 2, 8, new Knight(8, 7, false), null, b7, a8, c8, null, null, a7, c7, Color.decode("#1fafae"));
        
        c1 = new Square("c1", 3, 1, new Bishop(1, 6, true), c2, null, b1, d1, b2, d2, null, null, Color.decode("#1fafae"));
        c2 = new Square("c2", 3, 2, new Pawn(2, 6, true), c3, c1, b2, d2, b3, d3, b1, d1, Color.decode("#fffefc"));
        c3 = new Square("c3", 3, 3, null, c4, c2, b3, d3, b4, d4, b2, d2, Color.decode("#1fafae"));
        c4 = new Square("c4", 3, 4, null, c5, c3, b4, d4, b5, d5, b3, d3, Color.decode("#fffefc"));
        c5 = new Square("c5", 3, 5, null, c6, c4, b5, d5, b6, d6, b4, d4, Color.decode("#1fafae"));
        c6 = new Square("c6", 3, 6, null, c7, c5, b6, d6, b7, d7, b5, d5, Color.decode("#fffefc"));
        c7 = new Square("c7", 3, 7, new Pawn(7, 1, false), c8, c6, b7, d7, b8, d8, b6, d6, Color.decode("#1fafae"));
        c8 = new Square("c8", 3, 8, new Bishop(8, 6, false), null, c7, b8, d8, null, null, b7, d7, Color.decode("#fffefc"));
       
        d1 = new Square("d1", 3, 1, new Queen(1, 5, true), d2, null, c1, e1, c2, e2, null, null, Color.decode("#fffefc"));
        d2 = new Square("d2", 3, 2, new Pawn(2, 5, true), d3, d1, c2, e2, c3, e3, c1, e1, Color.decode("#1fafae"));
        d3 = new Square("d3", 3, 3, null, d4, d2, c3, e3, c4, e4, c2, e2, Color.decode("#fffefc"));
        d4 = new Square("d4", 3, 4, null, d5, d3, c4, e4, c5, e5, c3, e3, Color.decode("#1fafae"));
        d5 = new Square("d5", 3, 5, null, d6, d4, c5, e5, c6, e6, c4, e4, Color.decode("#fffefc"));
        d6 = new Square("d6", 3, 6, null, d7, d5, c6, e6, c7, e7, c5, e5, Color.decode("#1fafae"));
        d7 = new Square("d7", 3, 7, new Pawn(7, 1, false), d8, d6, c7, e7, c8, e8, c6, e6, Color.decode("#fffefc"));
        d8 = new Square("d8", 3, 8, new Queen(8, 5, false), null, d7, c8, e8, null, null, c7, e7, Color.decode("#1fafae"));
       
        e1 = new Square("e1", 4, 1, new King(1, 4, true), e2, null, d1, f1, d2, f2, null, null, Color.decode("#1fafae"));
        e2 = new Square("e2", 4, 2, new Pawn(2, 4, true), e3, e1, d2, f2, d3, f3, d1, f1, Color.decode("#fffefc"));
        e3 = new Square("e3", 4, 3, null, e4, e2, d3, f3, d4, f4, d2, f2, Color.decode("#1fafae"));
        e4 = new Square("e4", 4, 4, null, e5, e3, d4, f4, d5, f5, d3, f3, Color.decode("#fffefc"));
        e5 = new Square("e5", 4, 5, null, e6, e4, d5, f5, d6, f6, d4, f4, Color.decode("#1fafae"));
        e6 = new Square("e6", 4, 6, null, e7, e5, d6, f6, d7, f7, d5, f5, Color.decode("#fffefc"));
        e7 = new Square("e7", 4, 7, new Pawn(7, 1, false), e8, e6, d7, f7, d8, f8, d6, f6, Color.decode("#1fafae"));
        e8 = new Square("e8", 4, 8, new King(8, 4, false), null, e7, d8, f8, null, null, d7, f7, Color.decode("#fffefc"));
        
        f1 = new Square("f1", 5, 1, new Bishop(1, 3, true), f2, null, e1, g1, e2, g2, null, null, Color.decode("#fffefc"));
        f2 = new Square("f2", 5, 2, new Pawn(2, 3, true), f3, f1, e2, g2, e3, g3, e1, g1, Color.decode("#1fafae"));
        f3 = new Square("f3", 5, 3, null, f4, f2, e3, g3, e4, g4, e2, g2, Color.decode("#fffefc"));
        f4 = new Square("f4", 5, 4, null, f5, f3, e4, g4, e5, g5, e3, g3, Color.decode("#1fafae"));
        f5 = new Square("f5", 5, 5, null, f6, f4, e5, g5, e6, g6, e4, g4, Color.decode("#fffefc"));
        f6 = new Square("f6", 5, 6, null, f7, f5, e6, g6, e7, g7, e5, g5, Color.decode("#1fafae"));
        f7 = new Square("f7", 5, 7, new Pawn(7, 1, false), f8, f6, e7, g7, e8, g8, e6, g6, Color.decode("#fffefc"));
        f8 = new Square("f8", 5, 8, new Bishop(8, 3, false), null, f7, e8, g8, null, null, e7, g7, Color.decode("#1fafae"));
        
        g1 = new Square("g1", 6, 1, new Knight(1, 2, true), g2, null, f1, h1, f2, h2, null, null, Color.decode("#1fafae"));
        g2 = new Square("g2", 6, 2, new Pawn(2, 2, true), g3, g1, f2, h2, f3, h3, f1, h1, Color.decode("#fffefc"));
        g3 = new Square("g3", 6, 3, null, g4, g2, f3, h3, f4, h4, f2, h2, Color.decode("#1fafae"));
        g4 = new Square("g4", 6, 4, null, g5, g3, f4, h4, f5, h5, f3, h3, Color.decode("#fffefc"));
        g5 = new Square("g5", 6, 5, null, g6, g4, f5, h5, f6, h6, f4, h4, Color.decode("#f1fafae"));
        g6 = new Square("g6", 6, 6, null, g7, g5, f6, h6, f7, h7, f5, h5, Color.decode("#fffefc"));
        g7 = new Square("g7", 6, 7, new Pawn(7, 1, false), g8, g6, f7, h7, f8, h8, f6, h6, Color.decode("#1fafae"));
        g8 = new Square("g8", 6, 8, new Knight(8, 2, false), null, g7, f8, h8, null, null, f7, h7, Color.decode("#fffefc"));
        
        h1 = new Square("h1", 7, 1, new Rook(1, 1, true), h2, null, g1, null, g2, null, null, null, Color.decode("#fffefc"));
        h2 = new Square("h2", 7, 2, new Pawn(2, 1, true), h3, h1, g2, null, g3, null, g1, null, Color.decode("#1fafae"));
        h3 = new Square("h3", 7, 3, null, h4, h2, g3, null, g4, null, g2, null, Color.decode("#fffefc"));
        h4 = new Square("h4", 7, 4, null, h5, h3, g4, null, g5, null, g3, null, Color.decode("#1fafae"));
        h5 = new Square("h5", 7, 5, null, h6, h4, g5, null, g6, null, g4, null, Color.decode("#fffefc"));
        h6 = new Square("h6", 7, 6, null, h7, h5, g6, null, g7, null, g5, null, Color.decode("#1fafae"));
        h7 = new Square("h7", 7, 7, new Pawn(7, 1, false), h8, h6, g7, null, g8, null, g6, null, Color.decode("#fffefc"));
        h8 = new Square("h8", 7, 8, new Rook(8, 1, false), null, h7, g8, null, null, null, g7, null, Color.decode("#1fafae"));
        
        jpanelsHolder.add(a8);
        jpanelsHolder.add(b8);
        jpanelsHolder.add(c8);
        jpanelsHolder.add(d8);
        jpanelsHolder.add(e8);
        jpanelsHolder.add(f8);
        jpanelsHolder.add(g8);
        jpanelsHolder.add(h8);
        
        jpanelsHolder.add(a7);
        jpanelsHolder.add(b7);
        jpanelsHolder.add(c7);
        jpanelsHolder.add(d7);
        jpanelsHolder.add(e7);
        jpanelsHolder.add(f7);
        jpanelsHolder.add(g7);
        jpanelsHolder.add(h7);
        
        jpanelsHolder.add(a6);
        jpanelsHolder.add(b6);
        jpanelsHolder.add(c6);
        jpanelsHolder.add(d6);
        jpanelsHolder.add(e6);
        jpanelsHolder.add(f6);
        jpanelsHolder.add(g6);
        jpanelsHolder.add(h6);
        
        jpanelsHolder.add(a5);
        jpanelsHolder.add(b5);
        jpanelsHolder.add(c5);
        jpanelsHolder.add(d5);
        jpanelsHolder.add(e5);
        jpanelsHolder.add(f5);
        jpanelsHolder.add(g5);
        jpanelsHolder.add(h5);
        
        jpanelsHolder.add(a4);
        jpanelsHolder.add(b4);
        jpanelsHolder.add(c4);
        jpanelsHolder.add(d4);
        jpanelsHolder.add(e4);
        jpanelsHolder.add(f4);
        jpanelsHolder.add(g4);
        jpanelsHolder.add(h4);
        
        jpanelsHolder.add(a3);
        jpanelsHolder.add(b3);
        jpanelsHolder.add(c3);
        jpanelsHolder.add(d3);
        jpanelsHolder.add(e3);
        jpanelsHolder.add(f3);
        jpanelsHolder.add(g3);
        jpanelsHolder.add(h3);
        
        jpanelsHolder.add(a2);
        jpanelsHolder.add(b2);
        jpanelsHolder.add(c2);
        jpanelsHolder.add(d2);
        jpanelsHolder.add(e2);
        jpanelsHolder.add(f2);
        jpanelsHolder.add(g2);
        jpanelsHolder.add(h2);
        
        jpanelsHolder.add(a1);
        jpanelsHolder.add(b1);
        jpanelsHolder.add(c1);
        jpanelsHolder.add(d1);
        jpanelsHolder.add(e1);
        jpanelsHolder.add(f1);
        jpanelsHolder.add(g1);
        jpanelsHolder.add(h1);
        
        boardFrame.setVisible(true);
    }
    
    public void movePiece(String move) throws IOException {
        Square[] squares = getSquaresFromNames(moveToArray(move));
        Square originSquare = squares[0];
        Square destinationSquare = squares[1];
        if(validPieces(originSquare,destinationSquare)) {
            if(playerCastling(move)) {
                //TODO: Develop a better castling implementation
                switch (move) {
                    case "E1-G1":
                        if(pieceExists(f1) || pieceExists(g1)) {
                            System.out.println("Error: Square/s between king and rook is occupied");
                        }
                        else if(e1.getPiece().hasMoved || g1.getPiece().hasMoved) {
                            System.out.println("Error: King or rook has moved");
                        }
                        else {
                            g1.replacePiece(e1.getPiece());
                            e1.removePiece();
                            f1.replacePiece(h1.getPiece());
                            h1.removePiece();
                            isWhiteTurn = !isWhiteTurn;
                        }
                    break;
                    case "E1-C1":
                        if(pieceExists(d1) || pieceExists(c1) || pieceExists(b1)) {
                            System.out.println("Error: Square/s between king and rook is occupied");
                        }
                        else if(e1.getPiece().hasMoved || g1.getPiece().hasMoved) {
                            System.out.println("Error: King or rook has moved");
                        }
                        else {
                            c1.replacePiece(e1.getPiece());
                            e1.removePiece();
                            d1.replacePiece(a1.getPiece());
                            a1.removePiece();
                            isWhiteTurn = !isWhiteTurn;
                        }
                    break;
                    case "E8-C8":
                        if(pieceExists(d8) || pieceExists(c8) || pieceExists(b8)) {
                            System.out.println("Error: Square/s between king and rook is occupied");
                        }
                        else if(e1.getPiece().hasMoved || g1.getPiece().hasMoved) {
                            System.out.println("Error: King or rook has moved");
                        }
                        else {
                            c8.replacePiece(e8.getPiece());
                            e8.removePiece();
                            d8.replacePiece(a8.getPiece());
                            a8.removePiece();
                            isWhiteTurn = !isWhiteTurn;
                        }
                    break;
                    case "E8-G8":
                        if(pieceExists(f8) || pieceExists(g8)) {
                                System.out.println("Error: Square/s between king and rook is occupied");
                        }
                        else if(e1.getPiece().hasMoved || g1.getPiece().hasMoved) {
                                System.out.println("Error: King or rook has moved");
                        }
                        else {
                            g8.replacePiece(e8.getPiece());
                            e8.removePiece();
                            f8.replacePiece(h8.getPiece());
                            h8.removePiece();
                            isWhiteTurn = !isWhiteTurn;
                        }
                    break;
                }
            }
            else {
                int xMovement = pieceMovement(originSquare);
                int yMovement = pieceMovement(destinationSquare);
                if(originSquare.occupyingPiece.checkMovementPatternValidity(xMovement, yMovement)) {
                    
                    destinationSquare.replacePiece(originSquare.occupyingPiece);
                    originSquare.removePiece();
                    isWhiteTurn = !isWhiteTurn;
                }
            }
            boardFrame.repaint();
            boardFrame.revalidate();
        }
    }
    
    private boolean validPieces(Square x, Square y) {
        if(pieceExists(x) && x.getPiece().checkPieceIsMoversColor(isWhiteTurn)
            && y.getPiece().checkPieceIsMoversColor(isWhiteTurn)) {
            return true;
        }
        else {
            System.out.println("Your piece does not exist or one of the selected pieces is wrong color");
            return false;
        }
    }
    
    private int pieceMovement(Square x) {
        int xMovement = x.posX - x.posY;
        xMovement = (xMovement < 0) ? -xMovement : xMovement;
        return xMovement;
    }
    
    private String[] moveToArray(String move) {
        String[] parts = move.split("-");
        String originalSquare = parts[0].toLowerCase();
        String destinationSquare = parts[1].toLowerCase();
        String[] moves = {originalSquare, destinationSquare};
        return moves;
    }
    
    private Square[] getSquaresFromNames(String[] squareNames) {
        Square originSquare = null;
        Square destinationSquare = null;
        for(Component comp : jpanelsHolder.getComponents()) {
            if(comp instanceof Square) {
                Square square = (Square) comp;
                if(square.squareName.equals(squareNames[0])) {
                    originSquare = square;
                }
                else if(square.squareName.equals(squareNames[1])) {
                    destinationSquare = square;
                }
                
            }
        }
        return new Square[]{originSquare, destinationSquare};
    }
    
    //Use (and possibly modify) this method when rewriting castling
    private Square getSquareFromCoordinates(int posX, int posY) {
        for(Component comp : jpanelsHolder.getComponents()) {
            if(comp instanceof Square) {
                Square square = (Square) comp;
                if(square.posX == posX && square.posY == posY) {
                    return square;
                }
            }
        }
        return null;
    }
    
    private boolean pieceExists(Square square) {
        if(square.getPiece() != null) {
            return true;
        }
        else if(square.getPiece() == null) {
            System.out.println("Selected piece does not exist in square");
            return false;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    private boolean playerCastling(String move) {
        return move.equals("E1-G1") || move.equals("E1-C1") || move.equals("E8-C8") || move.equals("E8-G8");
    }
}
