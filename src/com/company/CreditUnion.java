package com.company;

public class CreditUnion extends Finance{

   public CreditUnion(){

   }

   @Override
   public String toString(){
      return "Сумма полученного кредита в Кредитном Союзе - " + getLoanAmount() + " сом." +
              "\nСумма процента за кредит в Кредитном Союзе - " + getInterestPayment() + " сом.";
   }
}
