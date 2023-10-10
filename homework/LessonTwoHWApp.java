package com.proftelran.org.lessontwo.homework;

import com.proftelran.org.lessontwo.Cat;

public class LessonTwoHWApp {
    public static void main(String[] args) {
        Phone button = new ButtonPhone();
        Phone radio = new RadioPhone();
        Phone smart = new SmartPhone();

        smart.call(334903);
        smart.receiveCall(383909);

        radio.call(994849);
        radio.receiveCall(983983);

        button.call(8935938);
        button.receiveCall(903409);

        Phone[] phones = {button, radio, smart};
        receiveCall(phones);
        makeCall(phones);
    }

    private static void receiveCall(Phone[] phones) {
        for (Phone phone : phones) {
            phone.receiveCall();
        }
    }

    private static void makeCall(Phone[] phones) {
        for (Phone phone : phones) {
            phone.call();
        }
    }
}
