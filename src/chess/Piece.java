package chess;

public class Piece {
    int posX;
    int posY;
    boolean pieceIsWhite;
    String iconSrc;
    String name;
    boolean hasMoved;
    
    public Piece(int x, int y, boolean isWhite, String name) {
        this.posX = x;
        this.posY = y;
        this.pieceIsWhite = isWhite;
        this.name = name;
        hasMoved = false;
    }
    
    public boolean checkMovementPatternValidity(int xMovement, int yMovement) {
        return false;
    }
    
    public boolean checkPieceIsMoversColor(boolean isWhiteTurn) {
        if(isWhiteTurn == pieceIsWhite) {
            return true;
        }
        else if(isWhiteTurn != pieceIsWhite) {
            return false;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    public void illegalMovementMessage() {
        System.out.println("Illegal " + name + " movement");
    }
    
    
}