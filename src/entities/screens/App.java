package entities.screens;

import entities.classes.Food;
import entities.classes.Restaurant;
import entities.classes.User;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame {
    ImageIcon backgroundImg;
    JLabel bgLabel;
    JLabel currentLoggedLb = new JLabel("TESTE");

    // LIST USERS
    public static ArrayList<User> users = new ArrayList<>();

    // LIST RESTAURANTS
    public static ArrayList<Restaurant> restaurants = new ArrayList<>();

    // CURRENT USER
    public static User currentUser;
    // CURRENT RESTAURANT
    public static Restaurant currentRestaurant;
    // LOGGED TYPE
    public static Boolean isUserLogged = true;

    public App(String path) {
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

        currentLoggedLb.setBounds(40, 50, 178,50);
        currentLoggedLb.setForeground(new Color(0xFFFFFF));
        Font newFont = currentLoggedLb.getFont().deriveFont(16.0f);
        currentLoggedLb.setFont(newFont);
        currentLoggedLb.setText(updateCurrentLoggedLb());  // Setting username
        bgLabel.add(currentLoggedLb);
    }

    public String updateCurrentLoggedLb() {
        if (isUserLogged) {
            if (currentUser != null) {
                currentLoggedLb.setText(currentUser.getName());
                return currentUser.getName();
            }
        } else {
            if (currentRestaurant != null) {
                currentLoggedLb.setText(currentRestaurant.getName());
                return currentRestaurant.getName();
            }
        }
        return "Teste";
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(User user) {
        users.add(user);
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Restaurant restaurant) {
        restaurants.add(restaurant);
    }


    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        App.currentUser = currentUser;
    }

    public static Restaurant getCurrentRestaurant() {
        return currentRestaurant;
    }

    public static void setCurrentRestaurant(Restaurant currentRestaurant) {
        App.currentRestaurant = currentRestaurant;
    }

    public static void setIsUserLogged(Boolean isUserLogged) {
        App.isUserLogged = isUserLogged;
    }

}
