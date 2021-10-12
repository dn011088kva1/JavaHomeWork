package com.pb.Koritskiy.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        x=in.nextInt();
        if (x>=0 && x<=14){
            System.out.print("Диапозон числа [0-14]");}
            else if (x>=15 && x<=35){
            System.out.print("Диапозон числа [15-35]");}
            else if (x>=36 && x<=50){
            System.out.print("Диапозон числа [36-50]");}
             else if (x>=51 && x<=100){
            System.out.print("Диапозон числа [51-100]");}
             else {
                 System.out.print("Введенное число > 100");
        }
    }
}
