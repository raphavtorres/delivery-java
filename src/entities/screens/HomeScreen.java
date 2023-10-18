package entities.screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends App implements ActionListener {
    JButton goToLoginBtn = new JButton("Login");
    JButton goToSignUpBtn = new JButton("Cad User");
    JButton goToCreateRest = new JButton("Cad Rest");
    public HomeScreen(String path) {
        super(path);

        goToLoginBtn.setBounds(120, 682, 185,50);
        goToLoginBtn.setOpaque(false);  // btn transparent
        goToLoginBtn.addActionListener(this);
        add(goToLoginBtn);

        goToSignUpBtn.setBounds(120, 762, 185,50);
        goToSignUpBtn.setOpaque(false);
        goToSignUpBtn.addActionListener(this);
        add(goToSignUpBtn);

        goToCreateRest.setBounds(120, 843, 185,50);
        goToCreateRest.setOpaque(false);
        goToCreateRest.addActionListener(this);
        add(goToCreateRest);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==goToLoginBtn) {
            dispose();
            new LoginScreen("login-img.png");
        }else if(e.getSource()==goToSignUpBtn) {
            dispose();
            new SignUpScreen("createUser-img.png");
        }else if(e.getSource()==goToCreateRest) {
            dispose();
            new CreateRestaurantScreen("createRestaurant-img.png");
        }
    }
}
