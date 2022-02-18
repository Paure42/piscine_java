package user;

public interface UserList {
    void addUser(User new_user);
    User getUserById(int id) throws UserException;
    User getUserByIndex(int index) throws UserException;
    int  getNumberOfUsers();
}
