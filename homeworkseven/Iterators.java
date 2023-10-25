package com.proftelran.org.lessonseven.homeworkseven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

     // 1. перебрать for-each loop
/*        long start = System.currentTimeMillis();
        for (Integer element : list) {
        int temp = i;
            System.out.print(" " + element);
        }
        System.out.println(" ");
            long end = System.currentTimeMillis();
            System.out.println(" Time for for-each loop is " + (end - start)); */


        // 2. classic for и вызываем list.size() для каждой итерации
/*        long startTwo = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
        long endTwo = System.currentTimeMillis();
        System.out.println(" Time for classic for is " + (endTwo - startTwo)); */

        // 3. classic for, но list.size() определяем в переменную
    /*    long startThree = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = i;
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
        long endThree = System.currentTimeMillis();
        System.out.println(" Time for classic for with a variable is " + (endThree - startThree));*/

        // 4. classic for, list.size() определяем в переменную, перебираем с конца (i--)
       /* long startFour = System.currentTimeMillis();
        for (int i = list.size()-1; i > 0; i--) {
            int temp = i;
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
        long endFour = System.currentTimeMillis();
        System.out.println(" Time for classic for with a variable and backwards iteration is " + (endFour - startFour));
*/
        // 5. iterator
/*
        long startFive = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");
        long endFive = System.currentTimeMillis();
        System.out.println(" Time for iterator " + (endFive - startFive));
*/

        // 6. listIterator
        long startSix = System.currentTimeMillis();
        ListIterator<Integer> reverse = list.listIterator(list.size());
        while (reverse.hasPrevious()) {
            System.out.print(" " + reverse.previous());
        }
        System.out.println(" ");
        long endSix = System.currentTimeMillis();
        System.out.println(" Time for list iterator " + (endSix - startSix));

    }
}
