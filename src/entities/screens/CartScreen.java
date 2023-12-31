package entities.screens;

import entities.classes.Food;
import entities.classes.Order;
import entities.classes.Restaurant;
import entities.classes.User;
import entities.components.Navbar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartScreen extends App implements ActionListener {
    JTextField idProd = new JTextField();
    JButton addBtn = new JButton();
    JButton removeBtn = new JButton();
    JButton endBtn = new JButton();

    JPanel panel = new JPanel();

    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;
    JLabel totalPriceLb = new JLabel();
    JLabel totalPriceFreightLb = new JLabel();
    User user = getCurrentUser();
    Restaurant restaurant = getCurrentRestaurant();
    Float totalPrice = 0.0F;
    Float freight = 0.0F;

    public CartScreen(String path) {
        super(path);

        idProd.setBounds(40, 302, 80,40);
        idProd.setBackground(new Color(235, 235, 235));
        idProd.setBorder(BorderFactory.createEmptyBorder());
        idProd.addActionListener(this);
        add(idProd);

        addBtn.setBounds(170, 304, 110,40);
        addBtn.setOpaque(false);
        addBtn.addActionListener(this);
        add(addBtn);

        removeBtn.setBounds(300, 304, 110,40);
        removeBtn.setOpaque(false);
        removeBtn.addActionListener(this);
        add(removeBtn);

        if(user.getOrders() != null) {
            model = new DefaultTableModel(new Object[]{"ID", "Nome", "Preço"},0);
            for (Food food : user.getOrders()) {
                Object[] row = {food.getId(), food.getName(), food.getPrice()};
                model.addRow(row);
            }

            table = new JTable(model);
            table.setDefaultEditor(Object.class, null);
            scrollPane = new JScrollPane(table);
            scrollPane.setPreferredSize(new Dimension(350, 200));

            panel.setBounds(45, 400, 350, 200);
            panel.add(scrollPane);
            panel.setVisible(true);
            bgLabel.add(panel);
        }

        int xRest = getCurrentRestaurant().getLocation().get(0);
        int yRest = getCurrentRestaurant().getLocation().get(1);
        int xUser = getCurrentUser().getAddress().get(0);
        int yUser = getCurrentUser().getAddress().get(1);
        freight = (float) Math.abs((xRest - xUser) + (yRest - yUser) / 2);

        totalPriceFreightLb.setText(""+freight);
        totalPriceFreightLb.setBounds(120, 713, 178,50);
        totalPriceFreightLb.setForeground(new Color(0x00FF00));
        bgLabel.add(totalPriceFreightLb);

        totalPriceLb.setText(""+totalPrice);
        totalPriceLb.setBounds(330, 713, 178,50);
        totalPriceLb.setForeground(new Color(0x00FF00));
        bgLabel.add(totalPriceLb);

        endBtn.setBounds(122, 767, 178,50);
        endBtn.setOpaque(false);
        endBtn.addActionListener(this);
        add(endBtn);



        new Navbar(bgLabel, this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addBtn) {
            for(Food food : restaurant.showMenu()) {
                if(idProd.getText().equals(String.valueOf(food.getId()))) {
                    user.createOrder(food);
                    updateTableData();
                }
            }
        } else if(e.getSource()==removeBtn) {
            for(Food food : restaurant.showMenu()) {
                if(idProd.getText().equals(String.valueOf(food.getId()))) {
                    user.getOrders().remove(food);
                    updateTableData();
                }
            }
        } else if (e.getSource()==endBtn) {
            int id = getCurrentRestaurant().getOrders().size() + 1;
            restaurant.createOrder(new Order(id, restaurant, user, user.getOrders(), totalPrice+freight));
            dispose();
            new MenuScreen("menu-user-img.png");
        }
    }
    private void updateTableData() {
        idProd.setText("");
        model.setRowCount(0); // Cleans table data
        totalPrice = 0.0F;

        for (Food food : user.getOrders()) {
            Object[] row = {food.getId(), food.getName(), food.getPrice()};
            model.addRow(row);
            totalPrice += food.getPrice();
            totalPriceLb.setText(""+(totalPrice+freight));
        }
        totalPriceLb.repaint();
        table.repaint();
    }

}
