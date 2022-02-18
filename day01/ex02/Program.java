import user.User;
import user.UserArrayList;

public class Program {
    public static void main(String[] args) {
        User john = new User("John", -10);
        User peter = new User("Peter", 200);
        UserArrayList db = new UserArrayList();
        john.introduce();
        peter.introduce();
        System.out.println("-------------");

        try {
            db.addUser(john);
            System.out.println("User with id 1 : " + db.getUserById(1).get_name());
            db.addUser(peter);
            System.out.printf("There is %d number of users\n", db.getNumberOfUsers());
            System.out.println("User with id 2 : " + db.getUserById(2).get_name());
            System.out.println("User at index 1 : " + db.getUserByIndex(1).get_name());
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            db.addUser(peter);
            System.out.printf("There is %d number of users\n", db.getNumberOfUsers());
            System.out.println("Db size is " + db.get_size());
            System.out.println("User at index 14 : " + db.getUserByIndex(14).get_name());
            // System.out.println("User with id 14 : " + db.getUserById(14).get_name());
        }
        catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
