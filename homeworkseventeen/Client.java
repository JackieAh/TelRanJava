package com.proftelran.org.lessonseventeen.homeworkseventeen;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private int birthYear;
    private List<Phone> phones;

    public Client(int id, String name, int birthYear, List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.phones = phones;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", phones=" + phones +
                '}';
    }
}




