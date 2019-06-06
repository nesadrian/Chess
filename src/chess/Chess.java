package chess;

import java.io.IOException;

public class Chess {

    public static void main(String[] args) throws IOException {
        GameController newGame = new GameController();
        newGame.startGame();
    }
    
}
