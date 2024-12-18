package dev.ipa;

import java.util.ArrayList;

public class Bank {

    public String name;
    private ArrayList<User> users;

    public Bank(String name, ArrayList<User> user) {
        this.name = name;
        this.users = new ArrayList<>(); // initialize array
    }

    public String addUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return "user exists";
            }

        }
        users.add(new User(userName, new ArrayList<>()));
        return "user added";
    }

    public void toString() {

        System.out.println()
    }
}
