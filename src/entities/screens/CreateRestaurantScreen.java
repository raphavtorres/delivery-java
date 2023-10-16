package entities.screens;


import entities.classes.Restaurant;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CreateRestaurantScreen extends App implements ActionListener {
    JTextField restaurantFieldField = new JTextField();
    JTextField cnpjField = new JTextField();
    JPasswordField restaurantPassField = new JPasswordField();
    JTextField xAddressField = new JTextField();
    JTextField yAddressField = new JTextField();
    ArrayList<Integer> address = new ArrayList<>();
    JButton backBtn = new JButton("<-");
    Restaurant restaurant;

    JButton signUpBtn = new JButton("CADASTRAR");
    public CreateRestaurantScreen(String path) {
        super(path);
        // USERNAME
        restaurantFieldField.setBounds(45, 310, 335, 45);
        restaurantFieldField.setBackground(Color.red);
        add(restaurantFieldField);
        // CNPJ
        cnpjField.setBounds(45, 420, 335, 45);
        cnpjField.setBackground(Color.blue);
        add(cnpjField);
        // PASSWORD
        restaurantPassField.setBounds(45, 530, 335, 45);
        restaurantPassField.setBackground(Color.green);
        add(restaurantPassField);
        // X ADDRESS
        xAddressField.setBounds(80, 653, 120, 45);
        xAddressField.setBackground(Color.yellow);
        add(xAddressField);
        // Y ADDRESS
        yAddressField.setBounds(270, 653, 120, 45);
        yAddressField.setBackground(Color.red);
        add(yAddressField);
        // SIGNIN BUTTON
        signUpBtn.setBounds(122, 761, 183,50);
        signUpBtn.setBackground(Color.red);
        signUpBtn.addActionListener(this);
        add(signUpBtn);

        backBtn.setBounds(20, 140, 70,50);
        backBtn.setBackground(Color.green);
        backBtn.addActionListener(this);
        add(backBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUpBtn) {
            String userName = restaurantFieldField.getText();
            String cnpj = cnpjField.getText();
            String password = String.valueOf(restaurantPassField.getPassword());
            int addressX = Integer.parseInt(xAddressField.getText());
            int addressY = Integer.parseInt(yAddressField.getText());

            address.add(addressX);
            address.add(addressY);

            restaurant = new Restaurant(userName, cnpj, password, address);
            this.setRestaurants(restaurant);
            dispose();
            new LoginScreen("login-img.png");
        } else if(e.getSource()==backBtn) {
            dispose();
            new HomeScreen("home-img.png");
        }
    }
}