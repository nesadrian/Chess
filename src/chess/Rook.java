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
    public boolean checkMovementPatternValidity(Square xSquare, Square ySquare){
        int xMovement = getPieceMovement(xSquare);
        int yMovement = getPieceMovement(ySquare);
        if(xMovement == 0 || yMovement == 0) {
            return true;
        }
        else {
            illegalMovementMessage();
            return false;
        }
    }
}
