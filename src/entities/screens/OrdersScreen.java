package entities.screens;

import entities.classes.Food;
import entities.classes.Order;
import entities.components.Navbar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrdersScreen extends App implements ActionListener {
    JPanel panel = new JPanel();
    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;
    JButton delOrder = new JButton();
    public OrdersScreen(String path) {
        super(path);

        model = new DefaultTableModel(new Object[]{"ID", "Valor", "Cliente"},0);
        for (Order order : getCurrentRestaurant().getOrders()) {
            Object[] row = {order.getId(), order.getTotalPrice(), order.getUser().getName()};
            model.addRow(row);
        }

        table = new JTable(model);
        table.setDefaultEditor(Object.class, null);
        scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(350, 300));

        panel.setBounds(45, 345, 350, 300);
        panel.add(scrollPane);
        panel.setVisible(true);
        bgLabel.add(panel);

        delOrder.setBounds(122, 770, 182,50);
        delOrder.setOpaque(false);
        delOrder.addActionListener(this);
        add(delOrder);

        new Navbar(bgLabel, this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delOrder) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                model.removeRow(selectedRow);
            }
        }
    }
}
