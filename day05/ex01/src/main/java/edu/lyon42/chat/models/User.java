package edu.lyon42.chat.models;

import java.util.List;
import java.util.Objects;


public class User {

    public User(int id,
                String login,
                String password,
                List<Chatroom> createdRooms,
                List<Chatroom> rooms)  {
        this.id = id;
        this.login = login;
        this.password = password;
        this.createdRooms = createdRooms;
        this.rooms = rooms;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Chatroom> getCreatedRooms() {
        return createdRooms;
    }
    public void setCreatedRooms(List<Chatroom> createdRooms) {
        this.createdRooms = createdRooms;
    }
    public List<Chatroom> getRooms() {
        return rooms;
    }
    public void setRooms(List<Chatroom> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof User))
            return false;
        User c = (User)obj;

        return (id == c.id &&
            login.equals(c.login) &&
            password.equals(c.password) &&
            createdRooms.equals(c.createdRooms) &&
            rooms.equals(c.rooms));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, createdRooms, rooms);
    }

    @Override
    public String toString() {
        return ("User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", createdRooms=" + createdRooms +
                ", rooms=" + rooms +
                '}';)
            }

    private int id;
    private String login;
    private String password;
    private List<Chatroom> createdRooms;
    private List<Chatroom> rooms;
}
