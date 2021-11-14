package com.pb.Koritskiy.hw5;

import com.sun.source.util.SourcePositions;

import java.time.LocalDate;

public class Reader {
    private String fio;
    private int numTicket;
    private String faculty;
    private LocalDate birth;
    private String phone;

    public Reader(String fio, int numTicket, String faculty, LocalDate birth, String phone) {
        this.fio = fio;
        this.numTicket = numTicket;
        this.faculty = faculty;
        this.birth = birth;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int countBook){
        System.out.println(fio + "взял " + countBook + " книг(и)");
    }

    public void takeBook(String... nameBook){
        System.out.println(fio + "взял книги: ");
        for (String name: nameBook){
            System.out.print(name + " ");
        }
    }

    public void takeBook(Book... books){
        System.out.print("\n" + fio + "взял книги: ");
        for (Book book: books){
            System.out.println(book.getNameBook() + " (" + book.getAuthor() + " " + book.getYear() + ") ");
        }
    }
    public void returnBook(int countBook){
        System.out.println(fio + "вернул " + countBook + " книг(и)");
    }

    public void returnBook(String... nameBook){
        System.out.println(fio + "вернул книги: ");
        for (String name: nameBook){
            System.out.print(name + " ");
        }
    }

    public void returnBook(Book... books){
        System.out.print("\n" + fio + "вернул книги: ");
        for (Book book: books){
            System.out.println(book.getNameBook() + " (" + book.getAuthor() + " " + book.getYear() + ") ");
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", numTicket=" + numTicket +
                ", faculty='" + faculty + '\'' +
                ", birth=" + birth +
                ", phone='" + phone + '\'' +
                '}';
    }
}










