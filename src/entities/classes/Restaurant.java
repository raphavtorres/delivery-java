package entities.classes;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cnpj;
    private String password;
    private ArrayList<Integer> location;

    // LIST FOOD
//    public static Food food1 = new Food(1, "Calabresa", 42.53F);
//    public static Food food2 = new Food(2, "Portuguesa", 46.90F);
//    public static Food food3 = new Food(3, "Muçarela", 48.75F);
//    public static ArrayList<Food> menu = new ArrayList<>() {
//        {
//            add(food1);
//            add(food2);
//            add(food3);
//        }
//    };
    public ArrayList<Food> menu = new ArrayList<>();
    public ArrayList<Order> orders = new ArrayList<>();

    @Override
    public String toString() {
        return name;
    }

    public Restaurant(String name, String cnpj, String password, ArrayList<Integer> location) {
        this.name = name;
        this.cnpj = cnpj;
        this.password = password;
        this.location = location;
    }

    public String getName() {
        return name;
    }


    public String getCnpj() {
        return cnpj;
    }

    public ArrayList<Integer> getLocation() {
        return location;
    }


    // PRINT MENU
    public ArrayList<Food> showMenu() {
        return this.menu;
    }

    // ADD FOOD TO MENU
    public void addFood(Food food) {
        this.menu.add(food);
    }

    public String getPassword() {
        return password;
    }

    // ORDERS

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void createOrder(Order order) {
        this.orders.add(order);
        for (Order o : this.orders) {
            System.out.println("ORDER CREATED");
            System.out.println(o.getUser());
        }
    }

    // REMOVE FOOD TO MENU
    public void removeFood(int idFood) {
        menu.remove(idFood);
    }
}
