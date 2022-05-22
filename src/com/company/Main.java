package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank();
        MicrocreditCompany microcreditCompany = new MicrocreditCompany();
        CreditUnion creditUnion = new CreditUnion();

        int loanAmount = 10000;
        int deposit = 2000;
        int moneyTransfer = 3000;

        bank.setLoanAmount(loanAmount);
        bank.setInterestRate(35);
        bank.setTaxForInterest(5);
        bank.setDeposit(deposit);
        bank.setMoneyTransfer(moneyTransfer);
        System.out.println(bank.toString());
        System.out.println();

        microcreditCompany.setLoanAmount(loanAmount);
        microcreditCompany.setInterestRate(40);
        System.out.println(microcreditCompany.toString());
        System.out.println();

        creditUnion.setLoanAmount(loanAmount);
        creditUnion.setInterestRate(38);
        System.out.println(creditUnion.toString());

    }
}
