package entities.screens;

import entities.classes.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignUpScreen extends Screen implements ActionListener {
    JTextField userNameField = new JTextField();
    JTextField cpfField = new JTextField();
    JPasswordField userPassField = new JPasswordField();
    JTextField xAddressField = new JTextField();
    JTextField yAddressField = new JTextField();
    ArrayList<Integer> address = new ArrayList<>();
    User user;

    JButton signUpBtn = new JButton("CADASTRAR");
    public SignUpScreen(String path) {
        super(path);
        // USERNAME
        userNameField.setBounds(45, 310, 335, 45);
        userNameField.setBackground(Color.red);
        add(userNameField);
        // CPF
        cpfField.setBounds(45, 420, 335, 45);
        cpfField.setBackground(Color.blue);
        add(cpfField);
        // PASSWORD
        userPassField.setBounds(45, 530, 335, 45);
        userPassField.setBackground(Color.green);
        add(userPassField);
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
        }
    }
}