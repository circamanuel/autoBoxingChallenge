package dev.ipa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Double> transactions;

    public User(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


    public void addTransaction(Double amount) {
        transactions.add(amount);
    }
}
