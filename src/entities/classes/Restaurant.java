package entities.classes;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cnpj;
    private ArrayList<Integer> location;
    private ArrayList<Food> menu = new ArrayList<>();

    public Restaurant(String name, String cnpj, ArrayList<Integer> location) {
        this.name = name;
        this.cnpj = cnpj;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Integer> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }

    public ArrayList<Food> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Food> menu) {
        this.menu = menu;
    }

    // PRINT MENU
    public ArrayList<Food> showMenu() {
        return menu;
    }

    // ADD FOOD TO MENU
    public void addFood(Food food) {
        menu.add(food);
    }

    // REMOVE FOOD TO MENU
    public void removeFood(int idFood) {
        menu.remove(idFood);
    }
}
