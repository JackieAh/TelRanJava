package com.proftelran.org.lessonthree.homeworkThree;

public class Revolut extends Atm {
    @Override
    public boolean checkPin(CreditCard card) {
        return true;
    }

    @Override
    public boolean withdraw(CreditCard card) {
return true;
    }

    @Override
    public void deposit(CreditCard card, int pin, double amount) {

    }

    public Revolut(String atmName, double cash) {
        super(atmName, cash);
    }



}
