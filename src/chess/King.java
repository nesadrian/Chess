package chess;

public class King extends Piece {
    
    public King(int x, int y, boolean isWhite) {
        super(x, y, isWhite, "King");
        if(isWhite) {
            iconSrc = ("/images/WKing.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BKing.png");
        }
        
    }
}
