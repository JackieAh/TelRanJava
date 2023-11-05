package com.proftelran.org.lessonten.homeworkten;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookshelfApp {
    public static void main(String[] args) {
        Book one = new Book("Peace and War", 1100, 1865, "Lev", "Tolstoy", 1828, "Exmo", 1989);
        Book two = new Book("Moby Dick", 378, 1851, "Herman", "Melville", 1819, "Parker", 1876);
        Book three = new Book("On the Road", 320, 1957, "Jack", "Kerouac", 1922, "Viking", 2007);
        Book four = new Book("Ulysses", 732, 1920, "James", "Joyce", 1882, "Sylvia Beach", 1887);
        Book five = new Book("Crime and Punishment", 527, 1866, "Fyodor", "Dostoevsky", 1821, "The Russian Messenger", 1808);
        Book six = new Book("The Magus", 299, 1965, "John", "Fowles", 1926, "Johnatan Cape", 1921);
        Book seven = new Book("Journey to the End of the Night", 400, 1932, "Ferdinand", "Celine", 1894, "New Directions", 1930);

        List<Book> bookShelf = Arrays.asList(one, two, three, four, five, six, seven);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bookshelf App! Please select the method of sorting the books on your bookshelf: 1 - to sort by author, 2 - to sort by publisher, 3 - to sort by book release year. Please only enter a number");
        int selectedOption = scanner.nextInt();
        if (selectedOption == 1) {
            Collections.sort(bookShelf, new SortBooksByAuthor());
            System.out.println("The books on your bookshelf are sorted by author: ");
            for (Book book : bookShelf) {
                System.out.println(book);
            }
        } else if (selectedOption == 2) {
            Collections.sort(bookShelf, new SortByPublisher());
            System.out.println("The books on your bookshelf are sorted by publisher: ");
            for (Book book : bookShelf) {
                System.out.println(book);
            }
        } else if (selectedOption == 3) {
            Collections.sort(bookShelf, new SortByReleaseYear());
            System.out.println("The books on your bookshelf are sorted by release year: ");
            for (Book book : bookShelf) {
                System.out.println(book);
            }
        } else {
            System.out.println("Incorrect selection. Try relaunching the app");
        }
    }
}
