import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cnpj;
    private ArrayList<Integer> location = new ArrayList<>();
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
    public ArrayList<Food> printMenu() {
        return menu;
    }

    // ADD FOOD TO MENU
    public void addFood(String name, Float price) {
        Food food = new Food(name, price);
        menu.add(food);
    }

    // REMOVE FOOD TO MENU
    public void removeFood(Food food) {
        menu.remove(food);
    }
}
