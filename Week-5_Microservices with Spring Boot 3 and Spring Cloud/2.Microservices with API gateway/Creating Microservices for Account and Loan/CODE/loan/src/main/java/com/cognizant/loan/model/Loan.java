package com.cognizant.loan.model;

public class Loan {
    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;
    
    public Loan(String number, String type, int loan, int emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }
    
    // Getters
    public String getNumber() {
        return number;
    }
    
    public String getType() {
        return type;
    }
    
    public int getLoan() {
        return loan;
    }
    
    public int getEmi() {
        return emi;
    }
    
    public int getTenure() {
        return tenure;
    }
    
    // Setters
    public void setNumber(String number) {
        this.number = number;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setLoan(int loan) {
        this.loan = loan;
    }
    
    public void setEmi(int emi) {
        this.emi = emi;
    }
    
    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}
