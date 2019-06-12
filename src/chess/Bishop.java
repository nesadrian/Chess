package chess;

public class Bishop extends Piece {
     
    public Bishop(int x, int y, boolean isWhite) {
        super(x, y, isWhite, "Bishop");
        if(isWhite) {
            iconSrc = ("/images/WBishop.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BBishop.png");
        }
        
    }
}
