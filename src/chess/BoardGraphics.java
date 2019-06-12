/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.GridLayout;
import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author adriannesvik
 */
public class BoardGraphics {   
    public JFrame boardFrame;
    private GridLayout boardGrid;
    
    public BoardGraphics(LinkedList<Square> squares) {
        boardFrame = new JFrame();
        boardGrid = new GridLayout(8, 8);
        boardFrame.setSize(800, 800);
        boardFrame.setLayout(boardGrid);
        
        for(Square square : squares) {
            boardFrame.add(square);
        }
        
        boardFrame.setVisible(true);
    }
    
    public void updateGraphics() {
        
    }
}
