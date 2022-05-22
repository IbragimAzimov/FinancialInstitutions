package com.company;

public class MicrocreditCompany extends Finance{

    public MicrocreditCompany(){

    }

    @Override
    public String toString(){
        return "Сумма полученного кредита в МКК - " + getLoanAmount() + " сом." +
                "\nСумма процента за кредит в МКК - " + getInterestPayment() + " сом.";

    }

}
