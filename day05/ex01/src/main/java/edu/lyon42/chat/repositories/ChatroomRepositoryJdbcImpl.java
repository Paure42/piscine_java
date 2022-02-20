package edu.lyon42.chat.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ArrayList;
import edu.lyon42.chat.models.Chatroom;

public class ChatroomRepositoryJdbcImpl implements ChatroomRepository {

    private final Connection dataSource;
    private final UserRepositoryJdbcImpl userRepository;
    private final String QUERY_TEMPLATE = "SELECT * FROM chat.rooms WHERE id=?";

    public ChatroomRepositoryJdbcImpl(Connection dataSource, UserRepositoryJdbcImpl userRepository) {
        this.dataSource = dataSource;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<Chatroom> findById(Long id) {
        Chatroom ret = null;
        ResultSet resultset = null;

        try {
            PreparedStatement query = dataSource.prepareStatement(QUERY_TEMPLATE);
            query.setLong(1, id);
            resultset = query.executeQuery();
            if (resultset.next()) {
                ret = new Chatroom(
                                   resultset.getLong("id"),
                                   resultset.getString("name"),
                                   userRepository.findById(resultset.getLong("owner")).orElse(null),
                                   new ArrayList<>()
                                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (Optional.ofNullable(ret));
    }
}
