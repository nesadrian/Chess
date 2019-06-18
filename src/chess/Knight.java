package chess;

public class Knight extends Piece {
     
    public Knight(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Pawn");
        if(pieceIsWhite) {
            iconSrc = ("/images/WKnight.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BKnight.png");
        }
    }
    @Override
        public boolean checkMovementPatternValidity(Square xSquare, Square ySquare){
        int xMovement = getPieceMovement(xSquare);
        int yMovement = getPieceMovement(ySquare);
        if((xMovement == 3 && yMovement == 1) || (xMovement == 1 && yMovement == 3)) {
            return true;
        }
        else {
            illegalMovementMessage();
            return false;
        }
    }
}
