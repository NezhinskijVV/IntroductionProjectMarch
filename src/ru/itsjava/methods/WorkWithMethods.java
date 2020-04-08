package ru.itsjava.methods;

import java.util.Scanner;

public class WorkWithMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 2 numbers");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        System.out.println(maxValue(num1, num2));
//
//        System.out.println("Enter 2 numbers");
//        num1 = scanner.nextInt();
//        num2 = scanner.nextInt();
//
////        if (num1 > num2) {
////            System.out.println(num1);
////        } else {
////            System.out.println(num2);
////        }
//        System.out.println(maxValue(num1, num2));
//
//        System.out.println("Enter 2 numbers");
//        num1 = scanner.nextInt();
//        num2 = scanner.nextInt();
//
////        if (num1 > num2) {
////            System.out.println(num1);
////        } else {
////            System.out.println(num2);
////        }
//
//        System.out.println(maxValue(num1, num2));

//        printMaxValue(scanner);
//        printMaxValue(scanner);
//        printMaxValue(scanner);

        System.out.println("Сумма " + summa(3, 4));
    }

    public static int maxValue(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void printMaxValue(Scanner console) {
        System.out.println("Enter 2 numbers");
        int num1 = console.nextInt();
        int num2 = console.nextInt();

//        if (num1 > num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);
//        }

        System.out.println(maxValue(num1, num2));

    }

    public static int summa(int num1, int num2) {
        return num1 + num2;
    }


}