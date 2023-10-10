package com.proftelran.org.lessontwo.homework;

public class ButtonPhone extends Phone {
    public ButtonPhone() {
        super("button phone", 876987608);
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
