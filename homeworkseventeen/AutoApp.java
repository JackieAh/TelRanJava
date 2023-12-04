package com.proftelran.org.lessonseventeen.homeworkseventeen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoApp {
    public static void main(String[] args) {
        List<Auto> listAuto = new ArrayList<>();
        listAuto.add(new Auto(1, "black", "Mercedes", 0, 27000));
        listAuto.add(new Auto(2, "red", "BMW", 20000, 35000));
        listAuto.add(new Auto(3, "black", "Audi", 0, 50000));
        listAuto.add(new Auto(4, "white", "BMW", 100000, 15000));
        listAuto.add(new Auto(5, "red", "Mercedes", 20000, 32000));
        listAuto.add(new Auto(6, "black", "VW", 0, 40000));
        listAuto.add(new Auto(7, "black", "BMW", 100000, 29000));
        listAuto.add(new Auto(8, "white", "Audi", 20000, 30000));
        listAuto.add(new Auto(9, "red", "Audi", 10000, 41000));
        listAuto.add(new Auto(10, "black", "Renault", 1000, 11000));


        List<Auto> blackCarsWithZeroMileage = listAuto.stream()
                .filter(a -> a.getColor().equals("black") && a.getMileage() == 0)
                .collect(Collectors.toList());
        System.out.println("Black cars with 0 mileage: " + blackCarsWithZeroMileage);
        System.out.println();
        System.out.println("The number of unique brand names of cars in the price range of 30.000 and 50.000: " + listAuto.stream()
                .filter(a -> a.getPrice() >= 30000 && a.getPrice() <= 50000)
                .map(Auto::getBrand)
                .distinct()
                .count()
        );
    }
}