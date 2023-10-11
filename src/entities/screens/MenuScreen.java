package entities.screens;

import entities.components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuScreen extends Screen implements ActionListener {
    JButton addProdBtn = new JButton("+");
    public MenuScreen(String path) {
        super(path);

        // ADD PRODUCT BUTTON
        addProdBtn.setBounds(40, 730, 60,60);
        addProdBtn.setBackground(Color.red);
        addProdBtn.addActionListener(this);
        add(addProdBtn);

        new Navbar(bgLabel, this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addProdBtn) {
            dispose();
            new CreateProdScreen("createProduct-img.png");
        }
    }
}
