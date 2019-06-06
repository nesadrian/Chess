package chess;

public class Piece {
    int posX;
    int posY;
    boolean isWhite;
    String iconSrc;
    
    public Piece(int x, int y, boolean isWhite) {
        this.posX = x;
        this.posY = y;
        this.isWhite = isWhite;
    }
}