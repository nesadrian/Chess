package chess;

public class Pawn extends Piece {
     
    public Pawn(int x, int y, boolean pieceIsWhite) {
        super(x, y, pieceIsWhite, "Pawn");
        if(pieceIsWhite) {
            iconSrc = ("/images/WPawn.png");
        }
        else if(!pieceIsWhite) {
            iconSrc = ("/images/BPawn.png");
        }
    }
    @Override
    public boolean checkMovementPatternValidity(Square xSquare, Square ySquare){
        int xMovement = getPieceMovementX(xSquare, ySquare);
        int yMovement = xSquare.posY - ySquare.posY; //Used to check directional movement
        System.out.println(xMovement + " " + yMovement);
        if(pieceIsWhite) {
            if(xMovement == 0 && yMovement == -1) {
                return true;
            }
            else if(ySquare.getPiece() != null && xMovement == 1 && yMovement == -1) {
                return true;
            }
            else if(super.hasMoved == false && xMovement == 0 && yMovement == -2) {
                return true;
            }
            else {
                illegalMovementMessage();
                return false;
            }
        }
        else if(!pieceIsWhite) {
            if(xMovement == 0 && yMovement == 1) {
                return true;
            }
            else if(ySquare.getPiece() != null && xMovement == 1 && yMovement == 1) {
                return true;
            }
            else if(super.hasMoved == false && xMovement == 0 && yMovement == 2) {
                return true;
            }
            else {
                illegalMovementMessage();
                return false;
            }
        }
        else {
            illegalMovementMessage();
            return false;
        } 
    }
}
