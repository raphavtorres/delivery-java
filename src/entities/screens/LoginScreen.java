package entities.screens;

import entities.classes.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginScreen extends Screen implements ActionListener {

    IDandPasswords idandPass = new IDandPasswords();
    JButton loginBtn = new JButton("Login");
    JTextField userNameField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    HashMap<String, String> loginInfo;

    public LoginScreen(String path) {
        super(path);
        loginInfo = idandPass.getLoginInfo();

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
//        if(e.getSource()==loginBtn) {
//            String userName = userNameField.getText();
//            String pass = String.valueOf(userPassField.getPassword());
//
//            if(loginInfo.containsKey(userName) && loginInfo.get(userName).equals(pass)) {
//                dispose();
//                new MenuScreen("menu-img.png");
//            } else {
//                userNameField.setText("");
//                userPassField.setText("");
//            }
//        }
        if(e.getSource()==loginBtn) {
            String userName = userNameField.getText();
            String pass = String.valueOf(userPassField.getPassword());
            ArrayList<User> users = getUsers();
            System.out.println("aaaaaaaaaa");
            System.out.println(getUsers().get(0).getName());
            for(User user : users) {
                System.out.println("User: " + user.getName());
                System.out.println("Pass: " + user.getPassword());
            }

//            if(loginInfo.containsKey(userName) && loginInfo.get(userName).equals(pass)) {
//                dispose();
//                new MenuScreen("menu-img.png");
//            } else {
//                userNameField.setText("");
//                userPassField.setText("");
//            }
        }
    }
}
