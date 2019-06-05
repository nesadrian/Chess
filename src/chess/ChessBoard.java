package chess;
import java.util.ArrayList;

public class ChessBoard {
    public static ChessPiece a1;
    public static ChessPiece a2;
    public static ChessPiece a3;
    public static ChessPiece a4;
    public static ChessPiece a5;
    public static ChessPiece a6;
    public static ChessPiece a7;
    public static ChessPiece a8;
    
    public static ChessPiece b1;
    public static ChessPiece b2;
    public static ChessPiece b3;
    public static ChessPiece b4;
    public static ChessPiece b5;
    public static ChessPiece b6;
    public static ChessPiece b7;
    public static ChessPiece b8;
    
    public static ChessPiece c1;
    public static ChessPiece c2;
    public static ChessPiece c3;
    public static ChessPiece c4;
    public static ChessPiece c5;
    public static ChessPiece c6;
    public static ChessPiece c7;
    public static ChessPiece c8;
    
    public static ChessPiece d1;
    public static ChessPiece d2;
    public static ChessPiece d3;
    public static ChessPiece d4;
    public static ChessPiece d5;
    public static ChessPiece d6;
    public static ChessPiece d7;
    public static ChessPiece d8;
    
    public static ChessPiece e1;
    public static ChessPiece e2;
    public static ChessPiece e3;
    public static ChessPiece e4;
    public static ChessPiece e5;
    public static ChessPiece e6;
    public static ChessPiece e7;
    public static ChessPiece e8;
    
    public static ChessPiece f1;
    public static ChessPiece f2;
    public static ChessPiece f3;
    public static ChessPiece f4;
    public static ChessPiece f5;
    public static ChessPiece f6;
    public static ChessPiece f7;
    public static ChessPiece f8;
    
    public static ChessPiece g1;
    public static ChessPiece g2;
    public static ChessPiece g3;
    public static ChessPiece g4;
    public static ChessPiece g5;
    public static ChessPiece g6;
    public static ChessPiece g7;
    public static ChessPiece g8;
    
    public static ChessPiece h1;
    public static ChessPiece h2;
    public static ChessPiece h3;
    public static ChessPiece h4;
    public static ChessPiece h5;
    public static ChessPiece h6;
    public static ChessPiece h7;
    public static ChessPiece h8;
    
    public ArrayList<ChessPiece> squareList;
    
    public ChessBoard() {
        
        // Define starting pieces
        squareList = new ArrayList<>();
        squareList.add(a1);
        squareList.add(a2);
        squareList.add(a3);
        squareList.add(a4);
        squareList.add(a5);
        squareList.add(a6);
        squareList.add(a7);
        squareList.add(a8);
        
        squareList.add(b1);
        squareList.add(b2);
        squareList.add(b3);
        squareList.add(b4);
        squareList.add(b5);
        squareList.add(b6);
        squareList.add(b7);
        squareList.add(b8);
        
        squareList.add(c1);
        squareList.add(c2);
        squareList.add(c3);
        squareList.add(c4);
        squareList.add(c5);
        squareList.add(c6);
        squareList.add(c7);
        squareList.add(c8);
        
        squareList.add(d1);
        squareList.add(d2);
        squareList.add(d3);
        squareList.add(d4);
        squareList.add(d5);
        squareList.add(d6);
        squareList.add(d7);
        squareList.add(d8);
        
        squareList.add(e1);
        squareList.add(e2);
        squareList.add(e3);
        squareList.add(e4);
        squareList.add(e5);
        squareList.add(e6);
        squareList.add(e7);
        squareList.add(e8);
        
        squareList.add(f1);
        squareList.add(f2);
        squareList.add(f3);
        squareList.add(f4);
        squareList.add(f5);
        squareList.add(f6);
        squareList.add(f7);
        squareList.add(f8);
        
        squareList.add(g1);
        squareList.add(g2);
        squareList.add(g3);
        squareList.add(g4);
        squareList.add(g5);
        squareList.add(g6);
        squareList.add(g7);
        squareList.add(g8);
        
        squareList.add(h1);
        squareList.add(h2);
        squareList.add(h3);
        squareList.add(h4);
        squareList.add(h5);
        squareList.add(h6);
        squareList.add(h7);
        squareList.add(h8);
    }
}
