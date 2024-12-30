package dev.ipa;

import java.util.ArrayList;

public class Bank {

    public String name;
    private ArrayList<User> users;

    public Bank(String name) {
        this.name = name;
        this.users = new ArrayList<>(); // initialize array
    }

    public String addUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return "user exists";
            }

        }
        users.add(new User(userName));
        return "user added";
    }

    public String addTransaction(String userName, Double amount) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.addTransaction(amount);
                return "Transaction added successfully.";
            }
        }
        return "User not found.";
    }

    public void printStatement(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                System.out.println("Statement for " + user.getName() + ":");
                for (double transaction : user.getTransactions()) {
                    System.out.println("Transaction: " + transaction);
                }
                System.out.println("-".repeat(30));
                return;
            }
        }
        System.out.println("User not found.");
    }
}