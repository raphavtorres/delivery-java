package entities.classes;

import java.util.ArrayList;

public class Order {
    private Restaurant restaurant;
    private User user;
    private ArrayList<Food> foods;


    public Order(Restaurant restaurant, User user, ArrayList<Food> foods) {
        this.restaurant = restaurant;
        this.user = user;
        this.foods = foods;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String printOrder(String order) {
        System.out.println("order: " + order);
        return order;
    }  // REVISAR
}
