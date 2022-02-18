package user;

public final class UserIdGenerator {
    private static UserIdGenerator instance;
    public int value;

    private UserIdGenerator() {
        this.value = 0;
    }

    public static UserIdGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdGenerator();
        }
        return instance;
    }

    public static int generateId() {
        instance.value += 1;
        return instance.value;
    }
}
