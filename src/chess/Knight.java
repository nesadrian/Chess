package chess;

public class Knight extends Piece {
     
    public Knight(int x, int y, boolean isWhite) {
        super(x, y, isWhite, "Pawn");
        if(isWhite) {
            iconSrc = ("/images/WKnight.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BKnight.png");
        }
        
    }
}
