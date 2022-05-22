package com.company;

public class Finance {
    private int loanAmount;
    private double interestRate;
    private double interestPayment;

    public Finance(){
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestPayment() {
        interestPayment = loanAmount * interestRate / 100;
        return interestPayment;
    }
}
