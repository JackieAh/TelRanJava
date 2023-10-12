package com.proftelran.org.lessonthree.homeworkThree;

import java.util.Scanner;

public abstract class Atm {

    public abstract boolean checkPin(CreditCard card);
    public abstract boolean withdraw(CreditCard card);
    public abstract void deposit(CreditCard card, int pin, double amount);

    public String atmName;
    public final String currency = "USD";
    private double cash;

    public double amount;

    public Atm(String atmName, double cash) {
        this.atmName = atmName;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
    public double setAmount() {
        Scanner scanner = new Scanner(System.in);
        return amount = (scanner.nextDouble());
    }

    // public abstract double convert(double amount);
}
