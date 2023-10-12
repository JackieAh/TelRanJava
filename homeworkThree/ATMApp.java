package com.proftelran.org.lessonthree.homeworkThree;


public class ATMApp {
    public static void main(String[] args) {

        Atm atm1 = new Revolut("ATM One", 15000.89);
        Atm atm2 = new Sparkasse("ATM Two", 7999.88);
        Atm atm3 = new N26("ATM Three", 9745.32);
        Atm atm4 = new Sparkasse("ATM Four", 10000.00);

        Atm[] atms = {atm1, atm2, atm3, atm4};
        CreditCard card = new CreditCard(657898980,
                1234,
                "EUR",
                10000.88);

        for (Atm atm : atms) {
            if (atm instanceof Convertible) {
                atm.checkPin(card);
                System.out.println("How much money do you want to withdraw in EUR?");
                double v = atm.setAmount();
                double amount = (((Convertible) atm).convert(v));
                System.out.println("Your amount is converted to " + amount + " USD. Do you agree? Enter any number to continue");
                atm.withdraw(card);
                double newCash = atm.getCash() - amount;
                System.out.println("Your card number " + card.getNumber() + " remaining balance is " + (card.getBalance() - v) + " EUR");
                System.out.println("This ATM " + atm.atmName + " remaining balance is " + newCash + " USD");
                break;

            } else
                System.out.println("This atm doesn't accept non-USD cards. Try next one");
        }
    }
}