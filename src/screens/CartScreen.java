package screens;
import components.ImagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartScreen extends Screen implements ActionListener {
    public CartScreen() {
        // File path background image
        String imagePath = "C:\\Users\\rapha\\OneDrive\\Área de Trabalho\\delivery-java\\src\\images\\cart-img.png";

        ImagePanel imagePanel = new ImagePanel(imagePath);
        imagePanel.setBounds(0, 0, 428, 926);
        add(imagePanel);

        // tirar texto
        btn.setBounds(198, 302, 150,40);
        btn.setOpaque(false);  // btn transparent
//        btn.setContentAreaFilled(false);  // Remove a área preenchida do botão
//        btn.setBorderPainted(false);  // Remove a borda do botão
        btn.addActionListener(this);
        add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn) {
            dispose();
            new MenuScreen();
        }
    }
}
