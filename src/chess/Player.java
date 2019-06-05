package chess;

import java.util.Scanner;

public class Player {
    
    boolean isWhiteTurn;
    ChessBoard newBoard;
    Scanner playerInput;
    
    public Player() {
        isWhiteTurn = true;
        newBoard = new ChessBoard();
        playerInput = new Scanner(System.in);
    }
    
    public void startGame() {
        System.out.println("This program uses algebraic chess notation as input to determine moves.");
        System.out.println("The input response will vary depending on the legality of your move.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("White player's turn");
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
        
    }
    
    public void playerTurn(String move) {
        checkMoveLegality(move);
        isWhiteTurn = !isWhiteTurn;
        
        if (isWhiteTurn) {
            System.out.println("White player's turn");
        }
        else if (!isWhiteTurn) {
            System.out.println("Black player's turn");
        }
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    public boolean checkMoveLegality(String move) {
        
        return true;
    }
}
