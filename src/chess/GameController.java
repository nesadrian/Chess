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
        printPlayerTurn();
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    private void playerTurn(String move) throws IOException {
        if(chessBoard.movePiece(move)) {
            moveList.add(move);
            printMoveHistory();
            printPlayerTurn();
        }
        String nextMove = playerInput.nextLine();
        playerTurn(nextMove);
    }
    
    private void printMoveHistory() {
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
    }
    
    private void printPlayerTurn() {
        String playerTurnColor = chessBoard.getPlayerTurnColor();
        System.out.println(playerTurnColor + " player's turn");
    }
}
