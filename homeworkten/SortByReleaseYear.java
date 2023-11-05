package com.proftelran.org.lessonten.homeworkten;

import java.util.Comparator;

public class SortByReleaseYear implements Comparator <Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.releaseYear - o2.releaseYear;
    }
}
