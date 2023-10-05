package components;

import screens.CartScreen;
import screens.Screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }

    public void createNavbar() {
        navbar.setLayout(null);
        goHomeBtn.setBounds(50, 5, 50,50);
        navbar.add(goHomeBtn);

        goMenuBtn.setBounds(200, 5, 50,50);
        navbar.add(goMenuBtn);

        goCartBtn.setBounds(340, 5, 50,50);
        navbar.add(goCartBtn);

//        navbar.setBackground(Color.blue);
        navbar.setOpaque(false);
        navbar.setBounds(0, 885, 440, 60);
        bgLabel.add(navbar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==goCartBtn) {
            System.out.println("ENTREI");
            screen.dispose();
            new CartScreen("cart-img.png");
        }
    }
}
