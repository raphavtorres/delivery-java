public class Order {
    private Restaurant restaurant;
    private User user;


    public Order(Restaurant restaurant, User user) {
        this.restaurant = restaurant;
        this.user = user;
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
