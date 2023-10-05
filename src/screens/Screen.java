package screens;

import javax.swing.*;

public class Screen extends JFrame {
    JButton btn = new JButton("Clique aqui");
    public Screen() {
        setTitle("Pizzaria Torres");

        setSize(440, 965);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        setVisible(true);
    }
}
