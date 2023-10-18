package entities.screens;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuRestaurantScreen extends MenuScreen implements ActionListener {
    public MenuRestaurantScreen(String path) {
        super(path);

        // ADD PRODUCT BUTTON
        addProdBtn.setBounds(40, 730, 60,60);
        addProdBtn.setOpaque(false);
        addProdBtn.addActionListener(this);
        add(addProdBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addProdBtn) {
            dispose();
            new CreateProdScreen("createProduct-img.png");
        }
    }
}
