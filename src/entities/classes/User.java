package entities.classes;

import java.util.ArrayList;

public class User {
    private String name;
    private String cpf;
    private String password;
    private ArrayList<Integer> address;
    private final ArrayList<Food> orders = new ArrayList<>();


    public User(String name, String cpf, String password, ArrayList<Integer> address) {
        this.name = name;
        this.cpf = cpf;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Integer> address) {
        this.address = address;
    }

    public ArrayList<Food> getOrders() {
        return orders;
    }

    public void setOrders(Food food) {
        orders.add(food);
    }
}
