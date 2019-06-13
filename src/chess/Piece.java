package chess;

public class Piece {
    int posX;
    int posY;
    boolean isWhite;
    String iconSrc;
    String name;
    
    public Piece(int x, int y, boolean isWhite, String name) {
        this.posX = x;
        this.posY = y;
        this.isWhite = isWhite;
        this.name = name;
    }
    public void move() {
        
    }
}