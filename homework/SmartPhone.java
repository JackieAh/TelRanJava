package com.proftelran.org.lessontwo.homework;

public class SmartPhone extends Phone {

    public SmartPhone() {
        super("smartphone", 86576548);
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
