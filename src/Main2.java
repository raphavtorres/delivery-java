import java.util.ArrayList;

public class Main2 {
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
        app.addUser("Raphael", "99999999999", "321", userAdress);
        System.out.println("USERS");
        System.out.println(app.getUsers());

        // CADASTRO DE PRODUTO
        app.createFood("Pizza de calabresa", 46.90F);

        // TELA DE MENU (adicionar produto ao carrinho)
        app.createOrder(0); // pass user <id> I just put a random
        System.out.println("ORDERS");
        System.out.println(app.getOrders());

        // TELA DE MENU
        // show menu
        ArrayList<Food> menu = app.getRestaurant().showMenu();
        for (Food food : menu) {
            System.out.println("FIRST FOOD SHOW");
            System.out.println(food.getName());
        }

        // remove from menu
        app.getRestaurant().removeFood(0);  // pass food <id> I just put a random
        for (Food food : menu) {
            System.out.println("REMOVING FOOD");
            System.out.println(food.getName());
        }
    }
}