package com.proftelran.org.lessonten.homeworkten;

import java.util.Comparator;

public class SortByPublisher implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.namePublisher.compareTo(o2.namePublisher);
    }
}
