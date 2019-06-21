package chess;

public class Knight extends Piece {
     
    public Knight(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Knight");
        if(pieceIsWhite) {
            iconSrc = ("/images/WKnight.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BKnight.png");
        }
    }
    @Override
        public boolean validMovementPattern(Square xSquare, Square ySquare){
        int xMovement = getPieceMovementX(xSquare, ySquare);
        int yMovement = getPieceMovementY(xSquare, ySquare);
        if((xMovement == 2 && yMovement == 1) || (xMovement == 1 && yMovement == 2)) {
            return true;
        }
        else {
            illegalMovementMessage();
            return false;
        }
    }
}
