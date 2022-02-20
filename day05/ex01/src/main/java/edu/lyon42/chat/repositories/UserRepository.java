package edu.lyon42.chat.repositories;

import java.sql.SQLException;
import java.util.Optional;

import edu.lyon42.chat.models.User;

public interface UserRepository {

	Optional<User> findById(Long id) throws SQLException;
}
