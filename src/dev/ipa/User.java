package dev.ipa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Double> transactions;

    public User(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransacton() {
        return transactions;
    }

    public void setTransatction(Double amount) {
       transactions.add(amount);
    }



}
