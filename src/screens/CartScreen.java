package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartScreen extends Screen implements ActionListener {
    JButton btn = new JButton();
    public CartScreen(String path) {
        super(path);

        btn.setBounds(198, 302, 150,40);
//        btn.setOpaque(false);  // btn transparent
        btn.setBackground(Color.red);
        btn.addActionListener(this);
        add(btn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn) {
            dispose();
            new MenuScreen("menu-img.png");
        }
    }
}
