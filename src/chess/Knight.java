package chess;

public class Knight extends Piece {
     
    public Knight(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Pawn");
        if(pieceIsWhite) {
            iconSrc = ("/images/WKnight.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BKnight.png");
        }
        
    }
}
