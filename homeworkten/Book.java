package com.proftelran.org.lessonten.homeworkten;

import java.util.Objects;

public class Book {

    public String title;
    public int pagesNumber;
    public int releaseYear;

    public String name;
    public String surname;
    public int yearOfBirth;

    public String namePublisher;
    public int foundationYear;

    public Book(String title, int pagesNumber, int releaseYear, String name, String surname, int yearOfBirth, String namePublisher, int foundationYear) {
        this.title = title;
        this.pagesNumber = pagesNumber;
        this.releaseYear = releaseYear;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.namePublisher = namePublisher;
        this.foundationYear = foundationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber && releaseYear == book.releaseYear && yearOfBirth == book.yearOfBirth && foundationYear == book.foundationYear && Objects.equals(title, book.title) && Objects.equals(name, book.name) && Objects.equals(surname, book.surname) && Objects.equals(namePublisher, book.namePublisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pagesNumber, releaseYear, name, surname, yearOfBirth, namePublisher, foundationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", releaseYear=" + releaseYear +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", namePublisher='" + namePublisher + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
