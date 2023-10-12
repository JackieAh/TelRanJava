package com.proftelran.org.lessonthree.homeworkThree;

public interface Convertible {

     default double convert(double amount) {
        return amount * 1.15;
    }
}
