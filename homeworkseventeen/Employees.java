package com.proftelran.org.lessonseventeen.homeworkseventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employees {
    public static void main(String[] args) {
        List<String> lastNames = Arrays.asList("Averin", "Yakovlev", "Zaycev", "Ploskov", "Kozlov", "Ivanov", "Sherbakov", "Krasnov", "Kiselev", "Yudin");
        System.out.println(lastNames.stream()
                .filter(s -> s.startsWith("K"))
                .collect(Collectors.toList()));

        System.out.println(lastNames.stream()
                .sorted()
                .collect(Collectors.toList()));
    }
}
