import java.util.ArrayList;

public class App {
    private Restaurant restaurant;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public App(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addUser(String name, String cpf, ArrayList<Integer> address) {
        User user = new User(name, cpf, address);
        users.add(user);
    }

//    public void addRestaurant(String name, String cnpj, ArrayList<Integer> position) {
//        Restaurant restaurant = new Restaurant(name, cnpj, position);
//        restaurants.add(restaurant);
//    }

    public void createOrder() {
        // After pass id user instead of 0
        Order order = new Order(getRestaurant(), getUsers().get(0));
        orders.add(order);
    }
}
