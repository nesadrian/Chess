package chess;

import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    
    boolean isWhiteTurn;
    ChessBoard newBoard;
    Scanner playerInput;
    ArrayList<String> moveList;
    
    public GameController() {
        isWhiteTurn = true;
        newBoard = new ChessBoard();
        playerInput = new Scanner(System.in);
        moveList = new ArrayList();
    }
    
    public void startGame() {
        System.out.println("This program uses algebraic chess notation as input to determine moves.");
        System.out.println("The response from input your will vary depending on the legality of your move.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("White player's turn");
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    public void playerTurn(String move) {
        checkMoveLegality(move);
        isWhiteTurn = !isWhiteTurn;
        moveList.add(move);
        printRoundInfo();
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    public boolean checkMoveLegality(String move) {
        return true;
    }
    
    public void printRoundInfo() {
        System.out.print("-------------------");
        for(int i = 0; i < moveList.size(); i++) {
            if(i % 2 == 0) {
                System.out.println("");
                System.out.print((i/2) + 1 + ". ");
            }
            System.out.print(moveList.get(i) + " ");
        }
        System.out.println("");
        System.out.println("-------------------");
        
        if (isWhiteTurn) {
            System.out.println("White player's turn");
        }
        else if (!isWhiteTurn) {
            System.out.println("Black player's turn");
        }
    }
}
