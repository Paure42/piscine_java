package edu.lyon42.chat.repositories;

import edu.lyon42.chat.models.Message;

import java.sql.SQLException;
import java.util.Optional;

public interface MessageRepository {

    Optional<Message> findById(Long id) throws SQLException;
}
