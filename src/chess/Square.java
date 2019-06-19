package chess;

import java.awt.Color;
import java.awt.GridBagLayout;
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
    JLabel squareNameLabel;
    
    public Square(String name, int x, int y, Piece occupyingPiece, Color squareColor) throws IOException {
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
        squareNameLabel = new JLabel(squareName);
        super.add(squareNameLabel);
        super.setBackground(squareColor);
    }
    
    public void removePiece() {
        occupyingPiece = null;
        super.remove(icon);
    }
    
    public void replacePiece(Piece replacementPiece) throws IOException {
        occupyingPiece = replacementPiece;
        if(icon != null) {
            super.remove(icon);
        }
        BufferedImage img = ImageIO.read(this.getClass().getResource(occupyingPiece.iconSrc));
        Image scaledImg = img.getScaledInstance(80, 80, img.SCALE_SMOOTH);
        icon = new JLabel(new ImageIcon(scaledImg));
        super.add(icon);
    }
    
    public boolean pieceExists() {
        if(occupyingPiece != null) {
            return true;
        }
        else {
            System.out.println("Piece in " + squareName + " does not exist");
            return false;
        }
    }
    
    public Piece getPiece() {
        return occupyingPiece;
    }
}
