package entities.components;

import entities.screens.CartScreen;
import entities.screens.HomeScreen;
import entities.screens.MenuScreen;
import entities.screens.Screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Navbar {
public class Navbar implements ActionListener {
    JButton goHomeBtn = new JButton("H");
    JButton goMenuBtn = new JButton("M");
    JButton goCartBtn = new JButton("C");

    JLabel bgLabel;
    Screen screen;

    JPanel navbar = new JPanel();
    public Navbar(JLabel bgLabel, Screen screen) {
        this.bgLabel = bgLabel;
        this.screen = screen;

        navbar.setLayout(null);
        goHomeBtn.setBounds(50, 5, 50,50);
        goHomeBtn.addActionListener((ActionListener) this);
        navbar.add(goHomeBtn);

        goMenuBtn.setBounds(200, 5, 50,50);
        goMenuBtn.addActionListener((ActionListener) this);
        navbar.add(goMenuBtn);

        goCartBtn.setBounds(340, 5, 50,50);
        goCartBtn.addActionListener((ActionListener) this);
        navbar.add(goCartBtn);

        navbar.setOpaque(false);
        navbar.setBounds(0, 885, 440, 60);
        this.bgLabel.add(navbar);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==goHomeBtn) {
            this.screen.dispose();
            new HomeScreen("home-img.png");
        } else if(e.getSource()==goMenuBtn) {
            this.screen.dispose();
            new MenuScreen("menu-img.png");
        } else if(e.getSource()==goCartBtn) {
            this.screen.dispose();
            new CartScreen("cart-img.png");
        }
    }
}
