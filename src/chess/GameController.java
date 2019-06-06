package chess;

import java.util.Scanner;

public class GameController {
    Board newBoard;
    Scanner playerInput;

    public GameController() {
        newBoard = new Board();
        playerInput = new Scanner(System.in);
    }
    
    public void startGame() {
        newBoard.displayBoard();
        System.out.println("This program uses algebraic chess notation as input to determine moves.");
        System.out.println("The response from input your will vary depending on the legality of your move.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("White player's turn");
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    public void playerTurn(String move) {
        newBoard.movePiece(move);
        printRoundInfo();
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    public void printRoundInfo() {
        System.out.print("-------------------");
        for(int i = 0; i < newBoard.moveList.size(); i++) {
            if(i % 2 == 0) {
                System.out.println("");
                System.out.print((i/2) + 1 + ". ");
            }
            System.out.print(newBoard.moveList.get(i) + " ");
        }
        System.out.println("");
        System.out.println("-------------------");
        
        if (newBoard.isWhiteTurn) {
            System.out.println("White player's turn");
        }
        else if (!newBoard.isWhiteTurn) {
            System.out.println("Black player's turn");
        }
    }
}
