package entities.screens;
import entities.components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProdScreen extends Screen implements ActionListener {
//    JLabel bgLabel = new JLabel();
    JButton signInBtn = new JButton("CADASTRAR");
    public CreateProdScreen(String path) {
        super(path);

        // ADD PRODUCT BUTTON
        signInBtn.setBounds(122, 648, 182,50);
        signInBtn.setBackground(Color.red);
        signInBtn.addActionListener(this);
        add(signInBtn);

        new Navbar(bgLabel, this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signInBtn) {
            dispose();
            new MenuScreen("menu-img.png");
        }
    }
}