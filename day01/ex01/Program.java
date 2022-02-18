import user.User;

public class Program {
    public static void main(String[] args) {
        User john = new User("John", -10);
        User peter = new User("Peter", 200);

        john.introduce();
        peter.introduce();

    }
}
