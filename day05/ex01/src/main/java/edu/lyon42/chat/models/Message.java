package edu.lyon42.chat.models;

import java.time.LocalDateTime;
import java.util.Objects;

import user.User;


/**
 * Message
 */
public class Message {

    public Message(long id,
                   User author,
                   Chatroom room,
                   String text,
                   LocalDateTime messageDateTime) {
        this.id = id;
        this.author = author;
        this.room = room;
        this.text = text;
        this.messageDateTime = messageDateTime;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public Chatroom getRoom() {
        return room;
    }
    public void setRoom(Chatroom room) {
        this.room = room;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public LocalDateTime getMessageDateTime() {
        return messageDateTime;
    }
    public void setMessageDateTime(LocalDateTime messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Message))
            return false;
        Message c = (Message)obj;

        return (id == c.id &&
                author == c.author &&
                room == c.room &&
                text.equals(c.text) &&
                messageDateTime == c.messageDateTime
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, room, text, messageDateTime);
    }

    @Override
    public String toString() {
        return ("Message{" +
                "id=" + id +
                ", author=" + author +
                ", room=" + room +
                ", text='" + text + '\'' +
                ", messageDateTime=" + messageDateTime);
    }

    private long id;
    private User author;
    private Chatroom room;
    private String text;
    private LocalDateTime messageDateTime;
}
