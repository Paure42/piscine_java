package edu.lyon42.chat.models;

import java.util.List;
import java.util.Objects;

public class Chatroom {

    public Chatroom(long id,
                    String name,
                    User owner,
                    List<Message> messages) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.messages = messages;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public List<Message> getMessages() {
        return messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Chatroom))
            return false;
        Chatroom c = (Chatroom)obj;

        return (id == c.id &&
                name.equals(c.name) &&
                owner == c.owner &&
                messages.equals(c.messages));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, owner, messages);
    }

    @Override
    public String toString() {
        return ("Chatroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", messages=" + messages);
    }



    private long id;
    private String name;
    private User owner;
    private List<Message> messages;
}
