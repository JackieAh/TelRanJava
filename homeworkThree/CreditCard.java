package com.proftelran.org.lessonthree.homeworkThree;

public class CreditCard {
    private int number;
    private int pin;
    public String currency;
    private double balance;

    public CreditCard(int number, int pin, String currency, double balance) {
        this.number = number;
        this.pin = pin;
        this.currency = currency;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
