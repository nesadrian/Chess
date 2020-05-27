package chess;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
    Board chessBoard;
    Scanner playerInput;
    ArrayList<String> moveList;

    public GameController() throws IOException {
        chessBoard = new Board();
        playerInput = new Scanner(System.in);
        moveList = new ArrayList();
    }
    
    public void startGame() throws IOException, NoSuchFieldException {
        System.out.println("This program uses coordinate chess notation as input to determine moves, e.g. E2-E4");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("White player's turn");
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    private void playerTurn(String move) throws IOException {
        if(chessBoard.movePiece(move)) {
            moveList.add(move);
            printRoundInfo();
        }
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    private void printRoundInfo() {
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
        
        if (chessBoard.isWhiteTurn) {
            System.out.println("White player's turn");
        }
        else if (!chessBoard.isWhiteTurn) {
            System.out.println("Black player's turn");
        }
    }
}
