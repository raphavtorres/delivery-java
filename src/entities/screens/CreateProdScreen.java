package entities.screens;
import entities.classes.Food;
import entities.components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProdScreen extends App implements ActionListener {
    JTextField prodName = new JTextField();
    JTextField prodPrice = new JTextField(10);
    JButton signInBtn = new JButton();
    public CreateProdScreen(String path) {
        super(path);

        prodName.setBounds(46, 385, 280, 45);
        prodName.setBackground(new Color(235, 235, 235));
        prodName.setBorder(BorderFactory.createEmptyBorder());
        add(prodName);

        prodPrice.setBounds(46, 494, 280, 45);
        prodPrice.setBackground(new Color(235, 235, 235));
        prodPrice.setBorder(BorderFactory.createEmptyBorder());
        add(prodPrice);

        // ADD PRODUCT BUTTON
        signInBtn.setBounds(122, 648, 182,50);
        signInBtn.setOpaque(false);
        signInBtn.addActionListener(this);
        add(signInBtn);

        new Navbar(bgLabel, this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = getCurrentRestaurant().showMenu().size() + 1;
        String prodNameText = prodName.getText();
        Float price = Float.parseFloat(prodPrice.getText());

        if(e.getSource()==signInBtn) {
            getCurrentRestaurant().addFood(new Food(id, prodNameText, price));
            dispose();
            new MenuScreen("menu-restaurant-img.png");
        }
    }
}