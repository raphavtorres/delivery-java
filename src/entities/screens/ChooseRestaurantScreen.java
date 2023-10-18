package entities.screens;
import entities.classes.Restaurant;
import entities.components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChooseRestaurantScreen extends App implements ActionListener {

    JButton chooseBtn = new JButton();
    JComboBox<Restaurant> comboBox;
    DefaultComboBoxModel<Restaurant> comboBoxModel;
    JPanel panel = new JPanel();

    public ChooseRestaurantScreen(String path) {
        super(path);

        comboBoxModel = new DefaultComboBoxModel<>(restaurants.toArray(new Restaurant[0]));
        comboBox = new JComboBox<>(comboBoxModel);

        panel.setBounds(45, 345, 350, 350);
        panel.add(comboBox);
        panel.setVisible(true);
        bgLabel.add(panel);

        chooseBtn.setBounds(122, 767, 178, 50);
        chooseBtn.setOpaque(false);
        chooseBtn.addActionListener(this);
        add(chooseBtn);

        new Navbar(bgLabel, this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseBtn) {
            Restaurant selectedRestaurant = (Restaurant) comboBox.getSelectedItem();
//            Restaurant selectedRestaurant = comboBox.getItemAt(comboBox.getItemCount()-1);
            if (selectedRestaurant != null) {
                setCurrentRestaurant(selectedRestaurant);
                System.out.println(getCurrentRestaurant());
                System.out.println(selectedRestaurant);
                dispose();
                new MenuScreen("menu-user-img.png");

            }
        }
    }
}
