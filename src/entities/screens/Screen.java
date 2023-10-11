package entities.screens;

import javax.swing.*;
import java.io.File;

public class Screen extends JFrame {
    ImageIcon backgroundImg;
    JLabel bgLabel;

    public Screen(String path) {
        setTitle("Pizzaria Torres");

        setSize(440, 965);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // File path background image
        File f = new File("");
        String imagePath = f.getAbsolutePath() + "\\src\\images\\" + path;

        backgroundImg = new ImageIcon(imagePath);
        bgLabel = new JLabel(backgroundImg);
        bgLabel.setBounds(-7, -19, 440, 965);
        add(bgLabel);
    }
}
