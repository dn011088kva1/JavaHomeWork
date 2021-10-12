package com.pb.Koritskiy.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        Scanner in= new Scanner(System.in);
        System.out.print("Введите первое число: ");
        operand1=in.nextInt();
        System.out.print("Введите второе число: ");
        operand2=in.nextInt();
        String sign;
        System.out.print("Введите арифметический знак: ");
        sign=in.next();
        switch(sign){
            case "+":  System.out.print(operand1 + operand2);break;
            case "-":  System.out.print(operand1 - operand2);break;
            case "*":  System.out.print(operand1 * operand2);break;
            case "/":  System.out.print(operand1 / operand2);break;
            default: System.out.print("Ввели неправильный арифметический знак");
        }
    }
}
