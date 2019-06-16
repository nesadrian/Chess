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
    
    public void move() {
        
    }
    
    public boolean checkPieceIsMoversColor(boolean isWhiteTurn) {
        if(isWhiteTurn == pieceIsWhite) {
            return true;
        }
        else if(isWhiteTurn != pieceIsWhite) {
            System.out.println("Selected piece belongs to other player");
            return false;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    
}