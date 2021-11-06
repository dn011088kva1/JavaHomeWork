package com.pb.Koritskiy.hw5;

public class Reader {
  public  String FIO;
   public int numberTicket;
   public String faculty;
   public int dateOfBirth;
   public int numberPhone;

   public void takeBook (int bookCount) {
      System.out.println(this.FIO + " взял " + bookCount + " книг");
   }


   public void takeBook(String nameBook1,String nameBook2,String nameBook3){
      System.out.println(this.FIO + "взял книги: " + nameBook1 + nameBook2 + nameBook3);
   }

  public void takeBook(String nameBook1,String author1,String year1,String nameBook2,String author2,String year2,String nameBook3,String author3,String year3){
      System.out.println(this.FIO + "взял книги: " + nameBook1 + '('+ author1 + year1 + ") , " + nameBook2 +'('+ author2 + year2 + ") , " + nameBook3 +'('+ author3 + year3 + "). ");
   }

   public void returnBook (int bookCount) {
      System.out.println(this.FIO + " вернул " + bookCount + " книги");
   }

      public void returnBook(String nameBook1,String nameBook2,String nameBook3){
         System.out.println(this.FIO + "вернул книги: " + nameBook1 + nameBook2 + nameBook3);
      }

      public void returnBook(String nameBook1,String author1,String year1,String nameBook2,String author2,String year2,String nameBook3,String author3,String year3){
         System.out.println(this.FIO + "вернул книги: " + nameBook1 + '('+ author1 + year1 + ") , " + nameBook2 +'('+ author2 + year2 + ") , " + nameBook3 +'('+ author3 + year3 + "). ");
      }

   }











