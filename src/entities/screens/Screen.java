package entities.screens;

import entities.classes.Food;
import entities.classes.User;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class Screen extends JFrame {
    ImageIcon backgroundImg;
    JLabel bgLabel;

    // LIST USERS
    public static ArrayList<User> users = new ArrayList<>();

    // LIST FOOD
    public static Food food1 = new Food(1, "food1", 20.09F);
    public static Food food2 = new Food(2, "food2", 30.09F);
    public static Food food3 = new Food(3, "food3", 40.09F);
    public static ArrayList<Food> foods = new ArrayList<>() {
        {
            add(food1);
            add(food2);
            add(food3);
        }
    };

    // CURRENT USER
    public static User currentUser;

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
    }

    public static ArrayList<Food> getFoods() {
        return foods;
    }

    public static void setFoods(Food food) {
        foods.add(food);
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        Screen.currentUser = currentUser;
    }
}
