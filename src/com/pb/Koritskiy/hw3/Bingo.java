package com.pb.Koritskiy.hw3;

import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        System.out.println("Отгадайте число которое задумала программа \"Bingo\" в диапазоне от 0 до 100 ");
        System.out.println("Если хотите выйти введите \"exit\"");
        int number = (int) ( Math.random() * 101 );
        final int max_attempt= 50;
        int attempt =0;
        Scanner in = new Scanner(System.in);

        while (attempt<max_attempt){
            attempt++;
            System.out.println("Попытка №" + attempt + ":");
            String user = in.next();

            if (user.equals("exit")){
                System.out.println("Попробуйте в следующий раз Arividerchi");
                break;
            }
            if (Integer.parseInt(user) > 100){
                System.out.println("Вы ввели число больше чем 100 ");
                break;

            }
            if (Integer.parseInt(user) < 0){
                System.out.println("Вы ввели число меньше 0 ");
                break;
            }

            if (Integer.parseInt(user) == number) {
                System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                break;
            }

            if (Integer.parseInt(user) > number) {
                System.out.println("Загаданное число меньше " + user);
            } else {
                if (Integer.parseInt(user) >= number) {
                    System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                    break;
                }

                System.out.println("Загаданное число больше " + user);
            }
        }
        System.out.println("Конец игры");





    }
}
