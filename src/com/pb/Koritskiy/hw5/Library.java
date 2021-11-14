package com.pb.Koritskiy.hw5;

import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.",123,"ИТ", LocalDate.of(1988, 01, 01), "0631788847");
        Reader reader2 = new Reader("Иванов И.И.",124,"ИТ", LocalDate.of(1989, 07, 21), "1234555667");
        System.out.println(reader1);
        System.out.println(reader2);

        Book book1 = new Book("Приключения","Иванов И. И.",2000);
        Book book2 = new Book("Словарь","Сидоров А. В.",1980);
        Book book3 = new Book("Энциклопедия","Гусев К. В.",2010);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);


        reader1.takeBook(3);
        reader1.takeBook("Приключения","Словарь","Энциклопедия");
       reader1.takeBook(book1,book2,book3);


        reader1.returnBook(3);
        reader1.returnBook("Приключения","Словарь","Энциклопедия");
        reader1.returnBook(book1,book2,book3);




    }
}


