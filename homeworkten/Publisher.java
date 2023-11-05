package com.proftelran.org.lessonten.homeworkten;

public class Publisher {
    public String namePublisher;
    public int foundationYear;

    public Publisher(String namePublisher, int foundationYear) {
        this.namePublisher = namePublisher;
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "namePublisher='" + namePublisher + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
