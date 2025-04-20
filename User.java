package com.dmdev.oop.part2;
import java.util.Objects;

public class User {

    private final int id;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object u) {
        if (this == u) return true;                      // если сравниваем с самим собой
        if (u == null || getClass() != u.getClass()) return false; // если другой объект null или другого класса

        User user = (User) u; // приведение типа

        return id == user.id && email.equals(user.email); // сравнение полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }


    @Override
    public String toString() {
        return "User{id=" + id + "," + name + ", email=" + email + "}";
    }
}
