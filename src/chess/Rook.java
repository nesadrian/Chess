package chess;

public class Rook extends Piece {

    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite, "Rook");
        if(isWhite) {
            iconSrc = ("/images/WRook.png");
        }
        else if(!isWhite) {
            iconSrc = ("/images/BRook.png");
        }
        
    }
    @Override
    public void move(){
        
    }
}
