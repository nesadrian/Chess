package chess;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
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
    JLabel icon;
    
    public Square(String name, int x, int y, Piece occupyingPiece, Square up, Square down, Square left, Square right,
    Square diagUpLeft, Square diagUpRight, Square diagDownLeft, Square diagDownRight, Color squareColor) throws IOException {
        this.squareName = name;
        this.posX = x;
        this.posY = y;
        this.occupyingPiece = occupyingPiece;
        if(occupyingPiece != null) {
            BufferedImage img = ImageIO.read(this.getClass().getResource(occupyingPiece.iconSrc));
            Image scaledImg = img.getScaledInstance(80, 80, img.SCALE_SMOOTH);
            icon = new JLabel(new ImageIcon(scaledImg));
            super.add(icon);
        }
        super.setBackground(squareColor);
        // Possibly change label color depending on square color
    }
    
    public void removePiece() {
        occupyingPiece = null;
        super.remove(icon);
    }
    
    public void replacePiece(Piece replacementPiece) throws IOException {
        occupyingPiece = replacementPiece;
        replaceIcon(replacementPiece.iconSrc);
    }
    
    private void replaceIcon(String imgSrc) throws IOException {
        super.remove(icon);
        BufferedImage img = ImageIO.read(this.getClass().getResource(imgSrc));
        Image scaledImg = img.getScaledInstance(80, 80, img.SCALE_SMOOTH);
        icon = new JLabel(new ImageIcon(scaledImg));
        super.add(icon);
    }
    
    public Piece getPiece() {
        return occupyingPiece;
    }
}
