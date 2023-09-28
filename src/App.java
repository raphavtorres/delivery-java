import java.util.ArrayList;

public class App {
    ArrayList<Restaurant> restaurants = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

    public void addUser(String name, String cpf, ArrayList<Integer> address) {
        User user = new User(name, cpf, address);
        users.add(user);
    }

    public void addRestaurant(String name, String cnpj, ArrayList<Integer> position) {
        Restaurant restaurant = new Restaurant(name, cnpj, position);
        restaurants.add(restaurant);
    }

    public void createOrder(Restaurant restaurant, User user) {
        Order order = new Order(restaurant, user);
        orders.add(order);
    }
}
