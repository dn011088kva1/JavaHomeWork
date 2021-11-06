package com.pb.Koritskiy.hw5;

public class Library {
    public static void main(String[] args) {


        Reader reader1 = new Reader();
        reader1.FIO = "Петров В.В. ";
        reader1.takeBook(3);

        Book nameBook1 = new Book();
        Book nameBook2 = new Book();
        Book nameBook3 = new Book();

        nameBook1.nameBook = "Приключения, ";
        nameBook2.nameBook = "Словарь, ";
        nameBook3.nameBook = "Энциклопедия. ";

        reader1.takeBook(nameBook1.nameBook, nameBook2.nameBook,nameBook3.nameBook);

        Book author1 = new Book();
        Book author2 = new Book();
        Book author3 = new Book();
        author1.author="Иванов И. И.";
        author2.author="Сидоров А. В.";
        author3.author="Гусев К. В.";

        Book year1 =  new Book();
        Book year2 =  new Book();
        Book year3 =  new Book();

        year1.year="2000 г.";
        year2.year="1980 г.";
        year3.year="2010 г.";

        reader1.takeBook(nameBook1.nameBook,author1.author,year1.year,nameBook2.nameBook,author2.author,year2.year,nameBook3.nameBook,author3.author,year3.year);


        reader1.returnBook(3);
        reader1.returnBook(nameBook1.nameBook, nameBook2.nameBook,nameBook3.nameBook);
        reader1.returnBook(nameBook1.nameBook,author1.author,year1.year,nameBook2.nameBook,author2.author,year2.year,nameBook3.nameBook,author3.author,year3.year);
    }
    }

