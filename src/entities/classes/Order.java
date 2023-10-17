package entities.classes;

import java.util.ArrayList;

public class Order {
    private int id;
    private Restaurant restaurant;
    private User user;
    private ArrayList<Food> foods;
    private Float totalPrice;


    public Order(int id, Restaurant restaurant, User user, ArrayList<Food> foods, Float totalPrice) {
        this.id = id;
        this.restaurant = restaurant;
        this.user = user;
        this.foods = foods;
        this.totalPrice = totalPrice;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String printOrder(String order) {
        System.out.println("order: " + order);
        return order;
    }  // REVISAR
}
