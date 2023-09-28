import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Integer> address;
    private String cpf;

    public User(String name, String cpf,  ArrayList<Integer> address) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Integer> address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
