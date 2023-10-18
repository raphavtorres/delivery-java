package entities.screens;

import entities.classes.Order;
import entities.classes.Restaurant;
import entities.classes.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginScreen extends App implements ActionListener {
    JButton loginBtn = new JButton("Login");
    JButton backBtn = new JButton("<<");
    JTextField userNameField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    HashMap<String, String> loginInfo;

    public LoginScreen(String path) {
        super(path);

        userNameField.setBounds(45, 337, 280, 45);
        userNameField.setBackground(new Color(235, 235, 235));
        userNameField.setBorder(BorderFactory.createEmptyBorder());
        add(userNameField);

        userPassField.setBounds(45, 446, 280, 45);
        userPassField.setBackground(new Color(235, 235, 235));
        userPassField.setBorder(BorderFactory.createEmptyBorder());
        add(userPassField);

        loginBtn.setBounds(122, 626, 183,50);
        loginBtn.setOpaque(false);
        loginBtn.addActionListener(this);
        add(loginBtn);

        backBtn.setBounds(20, 140, 70,50);
        backBtn.setBackground(new Color(235, 235, 235));
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        backBtn.addActionListener(this);
        add(backBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginBtn) {
            String userName = userNameField.getText();
            String pass = String.valueOf(userPassField.getPassword());
            ArrayList<User> users = getUsers();
            ArrayList<Restaurant> restaurants = getRestaurants();

            for(User user : users) {
                if(user.getCpf().equals(userName) && user.getPassword().equals(pass)) {
                    setCurrentUser(user);
                    setIsUserLogged(true);
                    getCurrentUser().emptyOrders();
                    dispose();
                    new ChooseRestaurantScreen("chooseRestaurant-img.png");
                }
            }

            for(Restaurant restaurant : restaurants) {
                if(restaurant.getCnpj().equals(userName) && restaurant.getPassword().equals(pass)) {
                    setCurrentRestaurant(restaurant);
                    setIsUserLogged(false);
                    dispose();
                    new MenuRestaurantScreen("menu-restaurant-img.png");
                } else {
                    userNameField.setText("");
                    userPassField.setText("");
                }
            }
        }

        else if(e.getSource()==backBtn) {
            dispose();
            new HomeScreen("home-img.png");
        }
    }
}
