package user;

import java.util.ArrayList;

public class UserArrayList implements UserList {

    public UserArrayList() {
        _size = 10;
        _user_array = new ArrayList<User>(_size);
    }

    public int get_size() {
        return _size;
    }

    public void realloc_array() {
        _size += _size / 2;
        _user_array.ensureCapacity(_size);
    }

    public void  addUser(User new_user) {
        if (_user_array.size() == _size)
            realloc_array();
        _user_array.add(new_user);
    }

    public User getUserById(int id) throws UserException {
        for (User value : _user_array) {
            if (value.get_identifier() == id)
                return value;
        }
        throw new UserException("UserNotFoundException");
    }

    public User getUserByIndex(int index) throws UserException {
       if (index <= _user_array.size())
            return _user_array.get(index);
        throw new UserException("UserNotFoundException");
   }

    public int getNumberOfUsers() {
        return _user_array.size();
    }

    private ArrayList<User> _user_array;
    private int _size;
}
