package com.pb.Koritskiy.hw5;

public class Reader {
   String FIO;
   int numberTicket;
   String faculty;
   int dateOfBirth;
   int numberPhone;

   String takeBook() {
       return  FIO + "взял 3 книги";
   }

   public void takeBook(String nameBook1,String nameBook2,String nameBook3){
      System.out.print("Петров В.В. взял книги: " + nameBook1 + nameBook2 + nameBook3);
   }

   public void takeBook(String nameBook1,String nameBook2,String nameBook3,String FIO1, String FIO2,String FIO3, int year1,int year2,int year3){
      System.out.print("Петров В.В. взял книги: " + nameBook1 +'('+ FIO1 + year1 + ") , " + nameBook2 +'('+ FIO2 + year2 + ") , " + nameBook3 +'('+ FIO3 + year3 + "). ");
   }

}








