package com.proftelran.org.lessonten.homeworkten;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayPairs {
    public static void main(String[] args) {
        String[][] names = {{"John", "Smith"}, {"John", "Doe"}, {"Jane", "Smith"}, {"Smith", "Johnson"}};
        Arrays.sort(names, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2) {
                int compareNames = o1[0].compareTo(o2[0]);
                if (compareNames != 0) {
                    return compareNames;
                } else {
                    return o1[1].compareTo(o2[1]);
                }
            }
        });
        for (String[] pair : names) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
