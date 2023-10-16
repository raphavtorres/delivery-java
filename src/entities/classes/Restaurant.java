package entities.classes;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cnpj;
    private String password;
    private ArrayList<Integer> location;

    // LIST FOOD
    public static Food food1 = new Food(1, "Calabresa", 42.53F);
    public static Food food2 = new Food(2, "Portuguesa", 46.90F);
    public static Food food3 = new Food(3, "Muçarela", 48.75F);
    public static ArrayList<Food> menu = new ArrayList<>() {
        {
            add(food1);
            add(food2);
            add(food3);
        }
    };

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

    public static ArrayList<Food> getFoods() {
        return menu;
    }

    public static void setFoods(Food food) {
        menu.add(food);
    }

    // PRINT MENU
    public ArrayList<Food> showMenu() {
        return menu;
    }

    // ADD FOOD TO MENU
    public void addFood(Food food) {
        menu.add(food);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // REMOVE FOOD TO MENU
    public void removeFood(int idFood) {
        menu.remove(idFood);
    }
}
