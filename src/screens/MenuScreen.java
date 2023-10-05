package screens;

import javax.swing.*;
import java.awt.*;

public class MenuScreen extends Screen {
    JLabel label = new JLabel("HELLO NEW PAGE");
    public MenuScreen() {
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        add(label);
    }
}
