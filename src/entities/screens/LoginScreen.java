package entities.screens;

import entities.classes.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginScreen extends Screen implements ActionListener {
    JButton loginBtn = new JButton("Login");
    JTextField userNameField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    HashMap<String, String> loginInfo;

    public LoginScreen(String path) {
        super(path);

        userNameField.setBounds(45, 337, 335, 45);
        userNameField.setBackground(Color.red);
        add(userNameField);

        userPassField.setBounds(45, 446, 335, 45);
        userPassField.setBackground(Color.red);
        add(userPassField);

        loginBtn.setBounds(122, 626, 183,50);
        loginBtn.setBackground(Color.red);
        loginBtn.addActionListener(this);
        add(loginBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginBtn) {
            String userName = userNameField.getText();
            String pass = String.valueOf(userPassField.getPassword());
            ArrayList<User> users = getUsers();

            for(User user : users) {
                if(user.getName().equals(userName) && user.getPassword().equals(pass)) {
                    setCurrentUser(user);
                    dispose();
                    new MenuScreen("menu-img.png");
                } else {
                    userNameField.setText("");
                    userPassField.setText("");
                }
            }
        }
    }
}
