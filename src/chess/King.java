package chess;

public class King extends Piece {
    
    public King(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "King");
        if(pieceIsWhite) {
            iconSrc = ("/images/WKing.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BKing.png");
        }
        
    }
}
