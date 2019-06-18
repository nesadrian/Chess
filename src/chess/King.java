package chess;

public class King extends Piece {
    
    public King(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "King");
        if(pieceIsWhite) {
            iconSrc = ("/images/WKing.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BKing.png");
        }
    }
    @Override
    public boolean checkMovementPatternValidity(Square xSquare, Square ySquare){
        int xMovement = getPieceMovementX(xSquare, ySquare);
        int yMovement = getPieceMovementY(xSquare, ySquare);
        if(xMovement <= 1 && yMovement <= 1) {
            return true;
        }
        else {
            illegalMovementMessage();
            return false;
        }
    }
}
