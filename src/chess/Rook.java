package chess;

public class Rook extends Piece {

    public Rook(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Rook");
        if(pieceIsWhite) {
            iconSrc = ("/images/WRook.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BRook.png");
        }
        
    }
    @Override
    public void move(){
        
    }
}
