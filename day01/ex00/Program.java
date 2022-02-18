import user.User;
import transaction.Transaction;
import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User john = new User(java.util.UUID.randomUUID(), "John", -10);
        User peter = new User(java.util.UUID.randomUUID(), "Peter", 200);

        john.introduce();
        peter.introduce();

        Transaction t1 = new Transaction(java.util.UUID.randomUUID(), john, peter, 180);
        t1.do_tranfer();
        john.introduce();
        peter.introduce();
}
}
