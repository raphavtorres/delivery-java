package entities.screens;

import entities.classes.Food;
import entities.classes.Order;
import entities.classes.User;
import entities.components.Navbar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartScreen extends App implements ActionListener {
    JTextField idProd = new JTextField();
    JButton addBtn = new JButton("ADICIONAR");
    JButton removeBtn = new JButton("REMOVER");
    JButton endBtn = new JButton("FINALIZAR");

    JPanel panel = new JPanel();

    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;
    JLabel totalPriceLb = new JLabel();
    User user = getCurrentUser();
    Float totalPrice = 0.0F;

    public CartScreen(String path) {
        super(path);

        idProd.setBounds(40, 302, 100,40);
        idProd.setBackground(Color.blue);
        idProd.addActionListener(this);
        add(idProd);

        addBtn.setBounds(170, 304, 110,40);
        addBtn.setBackground(Color.red);
        addBtn.addActionListener(this);
        add(addBtn);

        removeBtn.setBounds(300, 304, 110,40);
        removeBtn.setBackground(Color.red);
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

        totalPriceLb.setText(""+totalPrice);
        totalPriceLb.setBounds(140, 713, 178,50);
        totalPriceLb.setForeground(new Color(0x00FF00));
        bgLabel.add(totalPriceLb);

        endBtn.setBounds(122, 767, 178,50);
        endBtn.setBackground(Color.red);
        endBtn.addActionListener(this);
        add(endBtn);

        new Navbar(bgLabel, this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addBtn) {
            for(Food food : getCurrentRestaurant().getMenu()) {
                if(idProd.getText().equals(String.valueOf(food.getId()))) {
                    user.setOrders(food);
                    System.out.println("PRODUTO ADICIONADO");
                    updateTableData();
                }
            }
        } else if(e.getSource()==removeBtn) {
            for(Food food : getCurrentRestaurant().getMenu()) {
                if(idProd.getText().equals(String.valueOf(food.getId()))) {
                    user.getOrders().remove(food);
                    System.out.println("PRODUTO REMOVIDO");
                    updateTableData();
                }
            }
        } else if (e.getSource()==endBtn) {
//            new Order();
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
            totalPriceLb.setText(""+totalPrice);
        }
        totalPriceLb.repaint();
        table.repaint();
    }

}
