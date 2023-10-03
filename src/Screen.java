import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    public Screen() {
        setTitle("Pizzaria Torres");
        setVisible(true);
        setSize(500, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btn = new JButton("Clique aqui");  // tirar texto
        btn.setBounds(100, 200, 250,70);
//        btn.setBackground();  colocar como transparente
        btn.setBackground(new Color(10, 10, 10, 0));
        add(btn);
    }
}
