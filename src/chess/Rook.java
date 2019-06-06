package chess;

public class Rook extends Piece {
     
    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
        if(isWhite) {
            iconSrc = ("/images/WRook.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BRook.png");
        }
        
    }
}
