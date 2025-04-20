package com.dmdev.oop.part2;
import java.util.HashSet;
import java.util.Set;

public class UserManager{

    private static final Set<User> users = new HashSet<>();

    public static void addUser(User u){
        // Проверяем, если объект уже есть в списке
        for (User existingU : users) {
            if (existingU.equals(u)) {
                System.out.println("Объект уже существует: " + u);
                return;  // Если объект найден, не добавляем новый
            }
        }
        // Если объект не найден, добавляем его
        users.add(u);
        System.out.println("Объект добавлен: " + u);
    }

    public static Set<User> getUsers() {
        return users;
    }

    public static void main(String[] args) {

        User u1 = new User(55);
        u1.setName("Вася");
        u1.setEmail("a@ya.ru");

        System.out.println(u1);

        User u2 = new User(55);
        u2.setName("Коля");
        u2.setEmail("b@ya.ru");

        System.out.println(u2);

        User u3 = new User(55);
        u3.setName("Олег");
        u3.setEmail("b@ya.ru");

        System.out.println(u2);

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("Уникальные пользователи:");
        for (User user : UserManager.getUsers()) {
            System.out.println(user);
        }

        System.out.println("Количество уникальных пользователей: " + UserManager.getUsers().size());
    }
}
