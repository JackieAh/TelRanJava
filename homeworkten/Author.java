package com.proftelran.org.lessonten.homeworkten;

public class Author {
    public String name;
    public String surname;
    public int yearOfBirth;

    public Author(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }
    public Author() {}

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
