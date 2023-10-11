package entities.components;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private final Image backgroundImage;

    public ImagePanel(String imagePath) {
        backgroundImage = new ImageIcon(imagePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Used to redraw the component when it changes its properties
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
