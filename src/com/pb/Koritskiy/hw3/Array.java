package com.pb.Koritskiy.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int  array [];
        int sum = 0;
        int counter =0;
        Scanner input = new Scanner(System.in);
        array = new int [10];
        System.out.println("Введите 10 произвольных чисел: ");
        for (int i = 0; i < 10; i++) {
            array [i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма всех елементов массива = " +sum);

      for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
                counter ++;
            }

        }
      System.out.println("Количество положительных элементов массива = "+counter);




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