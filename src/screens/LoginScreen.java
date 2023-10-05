package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends Screen implements ActionListener {
    JButton loginBtn = new JButton("Login");
    public LoginScreen(String path) {
        super(path);

        loginBtn.setBounds(122, 626, 183,50);
        loginBtn.setBackground(Color.red);
        loginBtn.addActionListener(this);
        add(loginBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginBtn) {
            dispose();
            new MenuScreen("menu-img.png");
        }
    }
}
