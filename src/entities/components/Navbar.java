package entities.components;

import entities.classes.Order;
import entities.screens.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class Navbar {
public class Navbar implements ActionListener {
    JButton goHomeBtn = new JButton();
    JButton goMenuBtn = new JButton();
    JButton goCartBtn = new JButton();

    JLabel bgLabel;
    App screen;

    JPanel navbar = new JPanel();
    public Navbar(JLabel bgLabel, App screen) {
        this.bgLabel = bgLabel;
        this.screen = screen;

        navbar.setLayout(null);
        goHomeBtn.setBounds(50, 5, 50,50);
        goHomeBtn.setOpaque(false);
        goHomeBtn.setBackground(new Color(0, 0, 0));
        goHomeBtn.setBorder(BorderFactory.createEmptyBorder());
        goHomeBtn.addActionListener((ActionListener) this);
        navbar.add(goHomeBtn);

        goMenuBtn.setBounds(200, 5, 50,50);
        goMenuBtn.setOpaque(false);
        goMenuBtn.setBackground(new Color(0, 0, 0));
        goMenuBtn.setBorder(BorderFactory.createEmptyBorder());
        goMenuBtn.addActionListener((ActionListener) this);
        navbar.add(goMenuBtn);

        goCartBtn.setBounds(340, 5, 50,50);
        goCartBtn.setOpaque(false);
        goCartBtn.setBackground(new Color(0, 0, 0));
        goCartBtn.setBorder(BorderFactory.createEmptyBorder());
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
            if (App.isUserLogged) {
                if (App.currentRestaurant != null) {
                    this.screen.dispose();
                    new MenuScreen("menu-user-img.png");
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um Restaurante!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                this.screen.dispose();
                new MenuRestaurantScreen("menu-restaurant-img.png");
            }
        } else if(e.getSource()==goCartBtn) {
            this.screen.dispose();
            if (App.isUserLogged) {
                new CartScreen("cart-img.png");
            } else {
                new OrdersScreen("orders-img.png");
            }
        }
    }
}
