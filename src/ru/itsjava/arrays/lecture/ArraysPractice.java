package ru.itsjava.arrays.lecture;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numsArray = new int[]{5, -7, 3, 0, 1, 3};
        System.out.println("Первый элемент массива: " + numsArray[0]);
        System.out.println("Последний элемент массива: " + numsArray[4]);
//        System.out.println(numsArray[5]); //выход за границу массива ArrayIndexOutOfBoundsException
        System.out.println("Длина массива: " + numsArray.length);

        double[] temperatureArray = new double[5];
        System.out.println("temperatureArray.length = "
                + temperatureArray.length);
        System.out.println("temperatureArray[0] = " + temperatureArray[0]);
        temperatureArray[1] = -3.0;
        System.out.println("temperatureArray[1] = " + temperatureArray[1]);

        System.out.println("Массив температур");
        for (int index = 0; index < temperatureArray.length; index++) {
            System.out.print(temperatureArray[index] + " ");
        }

        System.out.println();
        //вывести на экран 5 раз "Я люблю Java!"
        for (int i = 0; i < 5; i++) {
            System.out.println("Я люблю Java!");
        }

        System.out.println(Arrays.toString(numsArray));
        //Вывести все элементы, кроме первого
        for (int i = 1; i < numsArray.length; i++) {
            System.out.print(numsArray[i] + " ");
        }


        //Вывести все элементы, кроме последнего
        System.out.println("\nВывести все элементы, кроме последнего");
        for (int i = 0; i < numsArray.length - 1; i++) {
            System.out.print(numsArray[i] + " ");
        }

        //вывести массив задом наперед
        System.out.println("\nВывести массив задом наперед");
        for (int i = numsArray.length - 1; i >= 0; i--) {
            System.out.print(numsArray[i] + " ");
        }
    }
}
