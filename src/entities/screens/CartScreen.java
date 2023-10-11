package entities.screens;

import entities.components.Navbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartScreen extends Screen implements ActionListener {
    JButton addBtn = new JButton("ADICIONAR");
    JButton endBtn = new JButton("FINALIZAR");
    public CartScreen(String path) {
        super(path);

        addBtn.setBounds(198, 302, 150,40);
        addBtn.setBackground(Color.red);
        addBtn.addActionListener(this);
        add(addBtn);

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
            System.out.println("PRODUTO ADICIONADO");
        } else if (e.getSource()==endBtn) {
            dispose();
            new MenuScreen("menu-img.png");
        }
    }
}
