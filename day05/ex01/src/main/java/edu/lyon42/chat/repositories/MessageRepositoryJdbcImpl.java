package edu.lyon42.chat.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import edu.lyon42.chat.models.Message;

public class MessageRepositoryJdbcImpl implements MessageRepository {

    private final Connection dataSource;
    private final UserRepositoryJdbcImpl userRepository;
    private final ChatroomRepository chatroomRepository;
    private final String QUERY_TEMPLATE = "SELECT * FROM chat.rooms WHERE id=?";

    public MessageRepositoryJdbcImpl(Connection dataSource,
                                     UserRepositoryJdbcImpl userRepository,
                                     ChatroomRepository chatroomRepository) {
        this.dataSource = dataSource;
        this.userRepository = userRepository;
        this.chatroomRepository = chatroomRepository;
    }

    @Override
    public Optional<Message> findById(Long id) {
        Message ret = null;
        ResultSet resultset = null;

        try {
            PreparedStatement query = dataSource.prepareStatement(QUERY_TEMPLATE);
            query.setLong(1, id);
            resultset = query.executeQuery();
            if (resultset.next()) {
                ret = new Message(
                                   resultset.getLong("id"),
                                   userRepository.findById(resultset.getLong("author")).orElse(null),
                                   chatroomRepository.findById(resultset.getLong("room")).orElse(null),
                                   resultset.getString("text"),
                                   resultset.getTimestamp("timestamp").toLocalDateTime()
                                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (Optional.ofNullable(ret));
    }
}
