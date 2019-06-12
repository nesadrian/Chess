package chess;

public class Queen extends Piece {
     
    public Queen(int x, int y, boolean isWhite) {
        super(x, y, isWhite, "Pawn");
        if(isWhite) {
            iconSrc = ("/images/WQueen.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BQueen.png");
        }
        
    }
}
