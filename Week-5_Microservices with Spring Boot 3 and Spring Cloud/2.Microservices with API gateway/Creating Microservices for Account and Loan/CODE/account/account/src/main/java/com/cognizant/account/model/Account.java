package com.cognizant.account.model;

public class Account {
    private String number;
    private String type;
    private int balance;
    
    public Account(String number, String type, int balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }
    
    // Getters are required for JSON serialization
    public String getNumber() {
        return number;
    }
    
    public String getType() {
        return type;
    }
    
    public int getBalance() {
        return balance;
    }
    
    // Setters (not required for this example but good practice)
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
