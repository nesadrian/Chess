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
    Color blackSquareColor;
    Color whiteSquareColor;
    
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
        blackSquareColor = Color.decode("#5a91c7");
        whiteSquareColor = Color.decode("#fffefc");
       
        //Name, x, y, piece, Up, Down, Left, Right, DUL, DUR, DDL, DDR
        a1 = new Square("a1", 1, 1, new Rook(1, 8, true), blackSquareColor);
        a2 = new Square("a2", 1, 2, new Pawn(2, 8, true),whiteSquareColor);
        a3 = new Square("a3", 1, 3, null, blackSquareColor);
        a4 = new Square("a4", 1, 4, null, whiteSquareColor);
        a5 = new Square("a5", 1, 5, null, blackSquareColor);
        a6 = new Square("a6", 1, 6, null, whiteSquareColor);
        a7 = new Square("a7", 1, 7, new Pawn(7, 1, false), blackSquareColor);
        a8 = new Square("a8", 1, 8, new Rook(8, 8, false), whiteSquareColor);
        
        b1 = new Square("b1", 2, 1, new Knight(1, 7, true), whiteSquareColor);
        b2 = new Square("b2", 2, 2, new Pawn(2, 7, true), blackSquareColor);
        b3 = new Square("b3", 2, 3, null, whiteSquareColor);
        b4 = new Square("b4", 2, 4, null, blackSquareColor);
        b5 = new Square("b5", 2, 5, null, whiteSquareColor);
        b6 = new Square("b6", 2, 6, null, blackSquareColor);
        b7 = new Square("b7", 2, 7, new Pawn(7, 1, false), whiteSquareColor);
        b8 = new Square("b8", 2, 8, new Knight(8, 7, false), blackSquareColor);
        
        c1 = new Square("c1", 3, 1, new Bishop(1, 6, true), blackSquareColor);
        c2 = new Square("c2", 3, 2, new Pawn(2, 6, true), whiteSquareColor);
        c3 = new Square("c3", 3, 3, null, blackSquareColor);
        c4 = new Square("c4", 3, 4, null, whiteSquareColor);
        c5 = new Square("c5", 3, 5, null, blackSquareColor);
        c6 = new Square("c6", 3, 6, null, whiteSquareColor);
        c7 = new Square("c7", 3, 7, new Pawn(7, 1, false), blackSquareColor);
        c8 = new Square("c8", 3, 8, new Bishop(8, 6, false), whiteSquareColor);
       
        d1 = new Square("d1", 4, 1, new Queen(1, 5, true), whiteSquareColor);
        d2 = new Square("d2", 4, 2, new Pawn(2, 5, true), blackSquareColor);
        d3 = new Square("d3", 4, 3, null, whiteSquareColor);
        d4 = new Square("d4", 4, 4, null, blackSquareColor);
        d5 = new Square("d5", 4, 5, null, whiteSquareColor);
        d6 = new Square("d6", 4, 6, null, blackSquareColor);
        d7 = new Square("d7", 4, 7, new Pawn(7, 1, false), whiteSquareColor);
        d8 = new Square("d8", 4, 8, new Queen(8, 5, false), blackSquareColor);
       
        e1 = new Square("e1", 5, 1, new King(1, 4, true), blackSquareColor);
        e2 = new Square("e2", 5, 2, new Pawn(2, 4, true), whiteSquareColor);
        e3 = new Square("e3", 5, 3, null, blackSquareColor);
        e4 = new Square("e4", 5, 4, null, whiteSquareColor);
        e5 = new Square("e5", 5, 5, null, blackSquareColor);
        e6 = new Square("e6", 5, 6, null, whiteSquareColor);
        e7 = new Square("e7", 5, 7, new Pawn(7, 1, false), blackSquareColor);
        e8 = new Square("e8", 5, 8, new King(8, 4, false), whiteSquareColor);
        
        f1 = new Square("f1", 6, 1, new Bishop(1, 3, true), whiteSquareColor);
        f2 = new Square("f2", 6, 2, new Pawn(2, 3, true), blackSquareColor);
        f3 = new Square("f3", 6, 3, null, whiteSquareColor);
        f4 = new Square("f4", 6, 4, null, blackSquareColor);
        f5 = new Square("f5", 6, 5, null, whiteSquareColor);
        f6 = new Square("f6", 6, 6, null, blackSquareColor);
        f7 = new Square("f7", 6, 7, new Pawn(7, 1, false), whiteSquareColor);
        f8 = new Square("f8", 6, 8, new Bishop(8, 3, false), blackSquareColor);
       
        g1 = new Square("g1", 7, 1, new Knight(1, 2, true), blackSquareColor);
        g2 = new Square("g2", 7, 2, new Pawn(2, 2, true), whiteSquareColor);
        g3 = new Square("g3", 7, 3, null, blackSquareColor);
        g4 = new Square("g4", 7, 4, null, whiteSquareColor);
        g5 = new Square("g5", 7, 5, null, blackSquareColor);
        g6 = new Square("g6", 7, 6, null, whiteSquareColor);
        g7 = new Square("g7", 7, 7, new Pawn(7, 1, false), blackSquareColor);
        g8 = new Square("g8", 7, 8, new Knight(8, 2, false), whiteSquareColor);
        
        h1 = new Square("h1", 8, 1, new Rook(1, 1, true), whiteSquareColor);
        h2 = new Square("h2", 8, 2, new Pawn(2, 1, true), blackSquareColor);
        h3 = new Square("h3", 8, 3, null, whiteSquareColor);
        h4 = new Square("h4", 8, 4, null, blackSquareColor);
        h5 = new Square("h5", 8, 5, null, whiteSquareColor);
        h6 = new Square("h6", 8, 6, null, blackSquareColor);
        h7 = new Square("h7", 8, 7, new Pawn(7, 1, false), whiteSquareColor);
        h8 = new Square("h8", 8, 8, new Rook(8, 1, false), blackSquareColor);
       
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
        Square xSquare = squares[0];
        Square ySquare = squares[1];
        if(validPieces(xSquare,ySquare)) {
            if(playerCastling(move)) {
                //TODO: Develop a better castling implementation
                switch (move) {
                    case "E1-G1":
                        if(f1.pieceExists() || g1.pieceExists()) {
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
                        if(d1.pieceExists() || c1.pieceExists() || b1.pieceExists()) {
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
                        if(d8.pieceExists() || c8.pieceExists() || b8.pieceExists()) {
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
                        if(f8.pieceExists() || g8.pieceExists()) {
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
                if(xSquare.occupyingPiece.checkMovementPatternValidity(xSquare, ySquare)) {
                    if(noMovementCollision(xSquare, ySquare)) {
                        ySquare.replacePiece(xSquare.occupyingPiece);
                        xSquare.removePiece();
                        ySquare.getPiece().hasMoved = true;
                        isWhiteTurn = !isWhiteTurn;
                    }
                }
            }
            boardFrame.repaint();
            boardFrame.revalidate();
        }
    }
    
    public boolean noMovementCollision(Square xSquare, Square ySquare) {
        if(xSquare.occupyingPiece.name.equals("Knight")) {
            return true;
        }
        int xTotalMovement = ySquare.posX - xSquare.posX;
        int yTotalMovement = ySquare.posY - xSquare.posY;
        int xMovementDirection = getSingleSquareMovement(xTotalMovement);
        int yMovementDirection = getSingleSquareMovement(yTotalMovement);
        Square currentSquare = xSquare;
        int currentPosX = xSquare.posX;
        int currentPosY = xSquare.posY;
        while(currentSquare != ySquare) {
            if(currentPosX != ySquare.posX) {
                currentPosX += xMovementDirection;
            }
            if(currentPosY != ySquare.posY) {
                currentPosY += yMovementDirection;
            }
            currentSquare = getSquareFromCoordinates(currentPosX, currentPosY);
            if(currentSquare.occupyingPiece != null && currentSquare != ySquare) {
                System.out.println("Selected piece will collide with another piece");
                return false;
            }
        }
        return true;
    }
    
    private boolean validPieces(Square x, Square y) {
        if(x.pieceExists() && x.getPiece().checkPieceIsMoversColor(isWhiteTurn)) {
            if(y.pieceExists()) {
                if(y.getPiece().checkPieceIsMoversColor(!isWhiteTurn)) {
                    return true;
                }
                else {
                    System.out.println("Captured piece is movers color");
                    return false;
                }
            }
            else if(!y.pieceExists()) {
                return true;
            }
        }
        else {
            System.out.println("Moving piece does not exist or is opponents color");
            return false;
        }
        return false;
    }
    
    private String[] moveToArray(String move) {
        String[] parts = move.split("-");
        String xSquare = parts[0].toLowerCase();
        String ySquare = parts[1].toLowerCase();
        String[] moves = {xSquare, ySquare};
        return moves;
    }
    
    private Square[] getSquaresFromNames(String[] squareNames) {
        Square xSquare = null;
        Square ySquare = null;
        for(Component comp : jpanelsHolder.getComponents()) {
            if(comp instanceof Square) {
                Square square = (Square) comp;
                if(square.squareName.equals(squareNames[0])) {
                    xSquare = square;
                }
                else if(square.squareName.equals(squareNames[1])) {
                    ySquare = square;
                }
                
            }
        }
        return new Square[]{xSquare, ySquare};
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
    
    private boolean playerCastling(String move) {
        return move.equals("E1-G1") || move.equals("E1-C1") || move.equals("E8-C8") || move.equals("E8-G8");
    }
    
    private int getSingleSquareMovement(int totalMovement) {
        if(totalMovement < 0) {
            return -1;
        }
        else if(totalMovement > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
