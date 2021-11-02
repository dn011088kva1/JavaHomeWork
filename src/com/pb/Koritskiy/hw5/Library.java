package com.pb.Koritskiy.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.FIO = "Петров В.В. ";
        System.out.println(reader.takeBook());
        reader.takeBook("Приключения, ","Словарь, ","Энциклопедия.");
        reader.takeBook("Приключения","Иванов И.И.", "2000");

    }
    }

