package entities.screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpScreen extends Screen implements ActionListener {
    JButton signUpBtn = new JButton("CADASTRAR");
    public SignUpScreen(String path) {
        super(path);
        signUpBtn.setBounds(122, 761, 183,50);
        signUpBtn.setBackground(Color.red);
        signUpBtn.addActionListener(this);
        add(signUpBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUpBtn) {
            dispose();
            new LoginScreen("login-img.png");
        }
    }
}