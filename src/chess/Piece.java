package chess;

public class Piece {
    int posX;
    int posY;
    boolean isWhite;
    String iconSrc;
    String name;
    boolean hasMoved;
    
    public Piece(int x, int y, boolean isWhite, String name) {
        this.posX = x;
        this.posY = y;
        this.isWhite = isWhite;
        this.name = name;
        hasMoved = false;
    }
    
    public void move() {
        
    }
    
    public boolean checkPieceIsMoversColor(boolean isWhiteTurn) {
        if(isWhiteTurn == isWhite) {
            return true;
        }
        else if(isWhiteTurn != isWhite) {
            System.out.println("Selected piece belongs to other player");
            return false;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    
}