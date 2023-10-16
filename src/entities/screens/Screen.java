package entities.screens;

import entities.classes.User;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class Screen extends JFrame {
    ImageIcon backgroundImg;
    JLabel bgLabel;

    // LIST USERS
    ArrayList<User> users = new ArrayList<>();

    // LIST FOOD

    public Screen(String path) {
        setTitle("Pizzaria Torres");

        setSize(440, 965);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // File path background image
        File f = new File("");
        String imagePath = f.getAbsolutePath() + "\\src\\images\\" + path;

        backgroundImg = new ImageIcon(imagePath);
        bgLabel = new JLabel(backgroundImg);
        bgLabel.setBounds(-7, -19, 440, 965);
        add(bgLabel);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(User user) {
        users.add(user);
        System.out.println(users);
        System.out.println(getUsers().get(0).getName());
    }
}
