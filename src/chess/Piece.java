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
    
    public boolean checkMovementPatternValidity(Square xMovement, Square yMovement) {
        return false;
    }
    
    public boolean checkPieceIsMoversColor(boolean isWhiteTurn) {
        return isWhiteTurn == pieceIsWhite;
    }
    
    public void illegalMovementMessage() {
        System.out.println("Illegal " + name + " movement");
    }
    
    public int getPieceMovement(Square x) {
        int xMovement = x.posX - x.posY;
        xMovement = (xMovement < 0) ? -xMovement : xMovement;
        return xMovement;
    }
}