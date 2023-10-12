package com.proftelran.org.lessonthree.homeworkThree;

public class Sparkasse extends Atm {
    @Override
    public boolean checkPin(CreditCard card) {
        return false;
    }

    @Override
    public boolean withdraw(CreditCard card) {
        return true;
    }

    @Override
    public void deposit(CreditCard card, int pin, double amount) {

    }

    public Sparkasse(String atmName, double cash) {
        super(atmName, cash);
    }



}
