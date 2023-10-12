package com.proftelran.org.lessonthree.homeworkThree;

import java.util.Scanner;

public class N26 extends Atm implements Convertible {
    private double cash;
    public double amount;

    @Override
    public double getCash() {
        return super.getCash();
    }

    @Override
    public double setAmount() {
        return super.setAmount();
    }

    @Override
    public boolean checkPin(CreditCard card) {
        System.out.println("Welcome to N26! Please enter your pin");
        Scanner scanner = new Scanner(System.in);
        int pinAttempt = scanner.nextInt();
        if (pinAttempt == card.getPin()) {
            System.out.println("Success!");
            return true;
        }
        else System.out.println("Error! Incorrect pin");
        return false;
    }

    @Override
    public boolean withdraw(CreditCard card) {
        if (setAmount() < getCash()) {
            System.out.println("Please take your cash! Thanks for using our service!");
                return true;
            } else System.out.println("This ATM doesn't have enough cash. Try to withdraw smaller amount of money");
        return false;
    }

    @Override
    public void deposit(CreditCard card, int pin, double amount) {
        double newCash2 = cash + amount;
    }



    public N26(String atmName, double cash) {
        super(atmName, cash);
    }

   /* @Override
    public double convert(double amount) {
        this.amount = amount;
        newAmount = new Convertible(amount);
        return newAmount;
    }

    */
   public double convert() {
    return amount;
}
}