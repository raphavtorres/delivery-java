package entities.screens;

import entities.classes.Food;
import entities.components.Navbar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuScreen extends App {
    JButton addProdBtn = new JButton("+");

    JPanel panel = new JPanel();

    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;

    public MenuScreen(String path) {
        super(path);

        model = new DefaultTableModel(new Object[]{"ID", "Nome", "Preço"},0);
        for (Food food : getCurrentRestaurant().getMenu()) {
            Object[] row = {food.getId(), food.getName(), food.getPrice()};
            model.addRow(row);
        }

        table = new JTable(model);
        table.setDefaultEditor(Object.class, null);
        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(350, 350));

        panel.setBounds(45, 345, 350, 350);
        panel.add(scrollPane);
        panel.setVisible(true);
        bgLabel.add(panel);

        new Navbar(bgLabel, this);

        setVisible(true);
    }
}
