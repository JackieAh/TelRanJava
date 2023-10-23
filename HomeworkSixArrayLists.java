package com.proftelran.org.lessonsix.homeworksix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeworkSixArrayLists {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);
        listInt.add(8);
        listInt.add(9);
        listInt.add(10);

        System.out.println("All values are doubled ");
        doubleValues(listInt);

        List<String> listStr = new ArrayList<>();
        listStr.add("cat");
        listStr.add("dog");
        listStr.add("parrot");
        listStr.add("hamster");
        listStr.add("cat");
        listStr.add("cat");
        listStr.add("dog");
        listStr.add("parrot");
        listStr.add("hamster");
        listStr.add("hamster");
        listStr.add("dog");
        listStr.add("parrot");

        System.out.println("These are the lenghts of the words in the array ");
        List<Integer> lengths = getStringLengths(listStr);
        for (int length : lengths) {
            System.out.println(length);
        }

        System.out.println("Only odd values ");
        onlyOdd(listInt);

        List<String> deduplicatedList = deduplicate(listStr);
        System.out.println("Deduplicated List: " + deduplicatedList);

    }

    private static List<String> deduplicate(List<String> listStr) {
        List<String> deduplicatedList = listStr.stream()
                .distinct()
                .collect(Collectors.toList());
        return deduplicatedList;
    }

    private static int doubleValues (List<Integer> listInt) {
        int result = 0;
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(result = listInt.get(i) * 2); ;
        }
        return result;
    }
    public static List<Integer> getStringLengths(List<String> listStr) {
        List<Integer> lengths = new ArrayList<>();
        for (String str : listStr) {
            lengths.add(str.length());
        }
        return lengths;
    }

    public static void onlyOdd (List<Integer> listInt) {
        int result = 0;
        for (int i = 0; i < listInt.size(); i++) {
            if (listInt.get(i) % 2 != 0) {
                System.out.println(result = listInt.get(i));
            }
        }
    }
}
