package com.proftelran.org.lessontwo.homework;

public class RadioPhone extends Phone {
    public RadioPhone() {
        super("radio phone", 769986476);
    }

    @Override
    void call(int toCallNumber) {
        System.out.print("The phone " + getPhoneName() + " with the number " + getOwnNumber() + " is ");
        super.call(toCallNumber);
    }

    @Override
    void receiveCall(int callerNumber) {
        System.out.print("The phone " + getPhoneName() + " with the number " + getOwnNumber() + " is ");
        super.receiveCall(callerNumber);
    }
}

