package com.proftelran.org.lessontwo.homework;

public abstract class Phone {
    private String phoneName;
    private int ownNumber;
    private int toCallNumber;
    private int callerNumber;

    public Phone(String phoneName, int ownNumber) {
        this.phoneName = phoneName;
        this.ownNumber = ownNumber;
    }
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    public int getToCallNumber() {
        return toCallNumber;
    }

    public int getCallerNumber() {
        return callerNumber;
    }

    void call(int toCallNumber) {
        System.out.println("trying to call the number " + toCallNumber);
    }

    void receiveCall(int callerNumber) {
        System.out.println("receiving a call from the number " + callerNumber);
    }

    public void call() {
    }

    public void receiveCall() {
    }
}
