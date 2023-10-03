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

    public void addUser(String name, String cpf, String password, ArrayList<Integer> address) {
        User user = new User(name, cpf, password, address);
        users.add(user);
    }

    public void login(String name, String password) {
        // ...
    }

    public void createOrder(int user) {
        Order order = new Order(getRestaurant(), getUsers().get(user));
        orders.add(order);
    }

    public void createFood(String name, float price) {
        Food food = new Food(name, price);
        restaurant.addFood(food);
    }

    //    public void addRestaurant(String name, String cnpj, ArrayList<Integer> position) {
    //        Restaurant restaurant = new Restaurant(name, cnpj, position);
    //        restaurants.add(restaurant);
    //    }
}
