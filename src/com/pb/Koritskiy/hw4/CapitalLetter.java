package com.pb.Koritskiy.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {

        String words;
        String upperWords = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Введите фразу");
        words = input.nextLine();
        upperWords =myMethod(upperWords);
    }
        public static String myMethod(String words,String upperWords){

        upperWords = upperWords + words.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < words.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(words.substring(i-1, i)))
                upperWords = upperWords + words.substring(i, i+1).toUpperCase();
            else
                upperWords = upperWords + words.substring(i, i+1);
        }
        System.out.println(upperWords);

}

}
