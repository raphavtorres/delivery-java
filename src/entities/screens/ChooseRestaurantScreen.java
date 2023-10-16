package entities.screens;
import entities.classes.Restaurant;
import entities.components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
//public class ChooseRestaurantScreen extends App implements ActionListener {
//
//    JButton chooseBtn = new JButton("Choose");
//    JComboBox<Restaurant> comboBox;
//    DefaultComboBoxModel<Restaurant> comboBoxModel;
//    JPanel panel = new JPanel();
//    public ChooseRestaurantScreen(String path) {
//        super(path);
//
//        comboBoxModel = new DefaultComboBoxModel<>(getRestaurants().toArray(new Restaurant[0]));
//        comboBox = new JComboBox<>(comboBoxModel);
//
//        panel.setBounds(120, 500, 107, 50);
//        panel.add(comboBox);
//        panel.setVisible(true);
//        add(panel);
//
//        chooseBtn.setBounds(122, 767, 178,50);
//        chooseBtn.setBackground(Color.red);
//        chooseBtn.addActionListener(this);
//        add(chooseBtn);
//
//        new Navbar(bgLabel, this);
//
//        setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == chooseBtn) {
//            System.out.println("ESCOLHI");
//            String selectedItem = (String) comboBox.getSelectedItem();
//
////            dispose();
////            new MenuScreen("menu-user-img.png");
//            JOptionPane.showMessageDialog(this, "Item selecionado: " + selectedItem);
//        }
//    }
//}

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ChooseRestaurantScreen extends App implements ActionListener {

    JButton chooseBtn = new JButton("Choose");
    JComboBox<Restaurant> comboBox;
    DefaultComboBoxModel<Restaurant> comboBoxModel;
    JPanel panel = new JPanel();

    public ChooseRestaurantScreen(String path) {
        super(path);

        comboBoxModel = new DefaultComboBoxModel<>(restaurants.toArray(new Restaurant[0]));
        comboBox = new JComboBox<>(comboBoxModel);

//        comboBox.setRenderer(new RestaurantComboBoxRenderer()); // Custom renderer to display restaurant names


        panel.setBounds(45, 345, 350, 350);
        panel.add(comboBox);
        panel.setVisible(true);
        bgLabel.add(panel);

        chooseBtn.setBounds(122, 767, 178, 50);
        chooseBtn.setBackground(Color.red);
        chooseBtn.addActionListener(this);
        add(chooseBtn);

        new Navbar(bgLabel, this);

        // Add item listener to capture selection changes
//

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseBtn) {
            System.out.println("Botão Choose pressionado");
            Restaurant selectedRestaurant = comboBox.getItemAt(comboBox.getItemCount()-1);
            if (selectedRestaurant != null) {
                System.out.println(selectedRestaurant.getMenu());
            }
        }
    }
}
