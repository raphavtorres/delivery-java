import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> position = new ArrayList<>();
        position.add(1);
        position.add(10);

        ArrayList<Integer> userAdress = new ArrayList<>();
        userAdress.add(1);
        userAdress.add(10);

        // CREATE RESTAURANT
        Restaurant restaurant = new Restaurant("Pizzaria Torres", "290003", position);
        App app = new App(restaurant);


        // TELA DE CADASTRO DE USUÁRIO
        app.addUser("Raphael", "99999999999", userAdress);

        // TELA DE MENU (adicionar produto ao carrinho)
        app.createOrder();

        // CADASTRO DE PRODUTO
    }
}