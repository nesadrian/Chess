package chess;

public class Pawn extends Piece {
     
    public Pawn(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        if(isWhite) {
            iconSrc = ("/images/WPawn.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BPawn.png");
        }
        
    }
}
