package chess;

public class Bishop extends Piece {
     
    public Bishop(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Bishop");
        if(pieceIsWhite) {
            iconSrc = ("/images/WBishop.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BBishop.png");
        }
    }
    @Override
    public boolean validMovementPattern(Square xSquare, Square ySquare){
        int xMovement = getPieceMovementX(xSquare, ySquare);
        int yMovement = getPieceMovementY(xSquare, ySquare);
        if(xMovement - yMovement == 0) {
            return true;
        }
        else {
            illegalMovementMessage();
            return false;
        }
    }
}
