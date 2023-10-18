package entities.screens;

import entities.classes.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignUpScreen extends App implements ActionListener {
    JTextField userNameField = new JTextField();
    JTextField cpfField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JTextField xAddressField = new JTextField();
    JTextField yAddressField = new JTextField();
    ArrayList<Integer> address = new ArrayList<>();
    JButton backBtn = new JButton("<<");
    User user;

    JButton signUpBtn = new JButton();
    public SignUpScreen(String path) {
        super(path);
        // USERNAME
        userNameField.setBounds(45, 310, 280, 45);
        userNameField.setBackground(new Color(235, 235, 235));
        userNameField.setBorder(BorderFactory.createEmptyBorder());
        add(userNameField);
        // CPF
        cpfField.setBounds(45, 419, 280, 45);
        cpfField.setBackground(new Color(235, 235, 235));
        cpfField.setBorder(BorderFactory.createEmptyBorder());
        add(cpfField);
        // PASSWORD
        userPassField.setBounds(45, 528, 280, 45);
        userPassField.setBackground(new Color(235, 235, 235));
        userPassField.setBorder(BorderFactory.createEmptyBorder());
        add(userPassField);
        // X ADDRESS
        xAddressField.setBounds(80, 653, 90, 45);
        xAddressField.setBackground(new Color(235, 235, 235));
        xAddressField.setBorder(BorderFactory.createEmptyBorder());
        add(xAddressField);
        // Y ADDRESS
        yAddressField.setBounds(270, 653, 90, 45);
        yAddressField.setBackground(new Color(235, 235, 235));
        yAddressField.setBorder(BorderFactory.createEmptyBorder());
        add(yAddressField);
        // SIGNIN BUTTON
        signUpBtn.setBounds(122, 761, 183,50);
        signUpBtn.setOpaque(false);
        signUpBtn.addActionListener(this);
        add(signUpBtn);

        backBtn.setBounds(20, 140, 70,50);
        backBtn.setBackground(new Color(235, 235, 235));
        backBtn.setBorder(BorderFactory.createEmptyBorder());
        backBtn.addActionListener(this);
        add(backBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUpBtn) {
            String userName = userNameField.getText();
            String cpf = cpfField.getText();
            String password = String.valueOf(userPassField.getPassword());
            int addressX = Integer.parseInt(xAddressField.getText());
            int addressY = Integer.parseInt(yAddressField.getText());

            address.add(addressX);
            address.add(addressY);

            user = new User(userName, cpf, password, address);
            this.setUsers(user);
            dispose();
            new LoginScreen("login-img.png");
        } else if(e.getSource()==backBtn) {
            dispose();
            new HomeScreen("home-img.png");
        }
    }
}