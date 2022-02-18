package user;

public class User {

    public User(String name, int balance) {
        _name = name;
        _balance = (balance >= 0) ? balance : 0;
        _identifier = UserIdGenerator.getInstance().generateId();
    }

    public int get_identifier() {
        return _identifier;
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
                           _identifier +
                           " \nand I have " + _balance + " money on my account");
    }

    private final int _identifier;
    private String _name;
    private int _balance;
}
