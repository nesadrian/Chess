package chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Square extends JPanel {
    String squareName;
    int posX;
    int posY;
    Piece occupyingPiece;
    
    public Square(String name, int x, int y, Piece occupyingPiece, Color squareColor) throws IOException {
        this.squareName = name;
        this.posX = x;
        this.posY = y;
        this.occupyingPiece = occupyingPiece;
        if(occupyingPiece != null) {
            BufferedImage img = ImageIO.read(this.getClass().getResource(occupyingPiece.iconSrc));
            JLabel icon = new JLabel(new ImageIcon(img));
            super.add(icon);
        }
        super.setBackground(squareColor);
        // Possibly change label color depending on square color
    }
}
