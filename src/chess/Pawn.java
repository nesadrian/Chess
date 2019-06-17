package chess;

public class Pawn extends Piece {
     
    public Pawn(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Pawn");
        if(pieceIsWhite) {
            iconSrc = ("/images/WPawn.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BPawn.png");
        }
    }
}
