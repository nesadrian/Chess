package chess;

public class Queen extends Piece {
     
    public Queen(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Pawn");
        if(pieceIsWhite) {
            iconSrc = ("/images/WQueen.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BQueen.png");
        }
        
    }
}
