package dev.ipa;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Simple Bank");

        // Adding users
        System.out.println(bank.addUser("Alice"));
        System.out.println(bank.addUser("Bob"));
        System.out.println(bank.addUser("Alice")); // Duplicate user test

        // Adding transactions
        System.out.println(bank.addTransaction("Alice", 100.50));
        System.out.println(bank.addTransaction("Alice", -50.25));
        System.out.println(bank.addTransaction("Bob", 200.00));
        System.out.println(bank.addTransaction("Charlie", 300.00)); // User not found test

        // Printing statements
        bank.printStatement("Alice");
        bank.printStatement("Bob");
        bank.printStatement("Charlie"); // User not found test
    }
}
