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
    
    public boolean validMovementPattern(Square xMovement, Square yMovement) {
        return false;
    }
    
    public boolean pieceMoversColor(boolean isWhiteTurn) {
        return isWhiteTurn == pieceIsWhite;
    }
    
    public void illegalMovementMessage() {
        System.out.println("Illegal " + name + " movement");
    }
    
    public int getPieceMovementX(Square x, Square y) {
        int xMovement = x.posX - y.posX;
        xMovement = (xMovement < 0) ? -xMovement : xMovement;
        return xMovement;
    }
    
    public int getPieceMovementY(Square x, Square y) {
        int yMovement = x.posY - y.posY;
        yMovement = (yMovement < 0) ? -yMovement : yMovement;
        return yMovement;
    }
}