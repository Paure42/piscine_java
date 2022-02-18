package user;
import java.util.UUID;

public class User {

    public User(UUID identifier, String name, int balance) {
        _identifier = identifier;
        _name = name;
        _balance = (balance >= 0) ? balance : 0;
    }

    public UUID get_identifier() {
        return _identifier;
    }

    public void set_identifier(UUID new_id) {
       _identifier = new_id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String new_name) {
        _name = new_name;
    }

    public int get_balance() {
        return _balance;
    }

    public void set_balance(int new_balance) {
        _balance = (new_balance >= 0) ? new_balance : 0;
    }

    public void introduce() {
        System.out.println("Hi my name is " + _name +
                           "\nmy identifier is " +
                           _identifier.toString() +
                           " \nand I have " + _balance + " money on my account");
    }

    private UUID _identifier;
    private String _name;
    private int _balance;
}
