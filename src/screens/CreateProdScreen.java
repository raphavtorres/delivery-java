package screens;
import components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProdScreen extends Screen implements ActionListener {
    JButton createProdBtn = new JButton("CADASTRAR");
    public CreateProdScreen(String path) {
        super(path);

        // ADD PRODUCT BUTTON
        createProdBtn.setBounds(122, 648, 182,50);
        createProdBtn.setBackground(Color.red);
        createProdBtn.addActionListener(this);
        add(createProdBtn);

        Navbar navbar = new Navbar(bgLabel, this);
        navbar.createNavbar();
//        add(navbar);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==createProdBtn) {
            dispose();
            new MenuScreen("menu-img.png");
        }
    }
}