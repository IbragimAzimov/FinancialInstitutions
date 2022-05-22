package com.company;

public class Bank extends Finance {
    private double taxForInterest;
    private int deposit;
    private int moneyTransfer;

    public double getTaxForInterest() {
        return taxForInterest;
    }

    public void setTaxForInterest(double taxForInterest) {
        this.taxForInterest = taxForInterest;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getMoneyTransfer() {
        return moneyTransfer;
    }

    public void setMoneyTransfer(int moneyTransfer) {
        this.moneyTransfer = moneyTransfer;
    }

    @Override
    public double getInterestPayment() {
        return (getLoanAmount() * getInterestRate() / 100) * (1 + taxForInterest / 100) ;
    }

    @Override
    public String toString(){
        return "Сумма полученного кредита в Банке - " + getLoanAmount() + " сом." +
                "\nСумма процента за кредит в Банке - " + getInterestPayment() + " сом." +
                "\n    в том числе сумма налога - " + (getInterestPayment() * getTaxForInterest()) / (100 + getTaxForInterest()) + " сом." +
                "\nСумма открытого депозита в Банке - " + getDeposit() + " сом." +
                "\nСумма переведенных денег через Банк - " + getMoneyTransfer() + " сом.";
    }
}
