package com.proftelran.org.lessonseventeen.homeworkseventeen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ClientApp {
    public static void main(String[] args) {

        List<Phone> one = new ArrayList<>();
        one.add(new Phone("Telefon", "Landline"));
        one.add(new Phone("Mobila", "Mobile"));

        List<Phone> two = new ArrayList<>();
        two.add(new Phone("Cell", "Mobile"));
        two.add(new Phone("Mobila", "Mobile"));

        List<Phone> three = new ArrayList<>();
        three.add(new Phone("Home", "Landline"));
        three.add(new Phone("Work", "Landline"));

        List<Client> clientList = new ArrayList<>();
        clientList.add(new Client(1, "Ivan", 1990, one));
        clientList.add(new Client(2, "Mary", 1999, two));
        clientList.add(new Client(3, "Alex", 1970, three));

        System.out.println(clientList.stream()
                .filter(client -> client.getPhones().stream().anyMatch(phone -> "Landline".equals(phone.phoneType)))
                .min((c1, c2) -> Integer.compare(c1.getBirthYear(), c2.getBirthYear())));
    }
}