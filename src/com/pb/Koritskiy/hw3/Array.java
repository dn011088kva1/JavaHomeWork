package com.pb.Koritskiy.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int i, array [];
        Scanner input = new Scanner(System.in);
        array = new int [10];
        System.out.println("Введите 10 произвольных чисел: ");
        for (i = 0; i < 10; i++) {
            array [i] = input.nextInt();
        }
        System.out.println("Сумма всех чисел равна: " + (array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]));







        bubbleSort (array);
        System.out.println("Сортировка массива от меньшего к большему: " + Arrays.toString(array));


    }
    public static void bubbleSort (int[] num) {
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < num.length -1; j++){
                if (num [j] > num [j + 1]) {
                    temp = num [j];
                    num [j] = num [j + 1];
                    num [j +1] = temp;
                    flag = true;
                }
            }
        }
    }

}