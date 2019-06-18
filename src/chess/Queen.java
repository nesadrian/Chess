package chess;

public class Queen extends Piece {
     
    public Queen(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Queen");
        if(pieceIsWhite) {
            iconSrc = ("/images/WQueen.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BQueen.png");
        }   
    }
    @Override
    public boolean checkMovementPatternValidity(Square xSquare, Square ySquare){
        int xMovement = getPieceMovementX(xSquare, ySquare);
        int yMovement = getPieceMovementY(xSquare, ySquare);
        if(xMovement == 0 || yMovement == 0 || xMovement - yMovement == 0) {
            return true;
        }
        else {
            illegalMovementMessage();
            return false;
        }
    }
}
