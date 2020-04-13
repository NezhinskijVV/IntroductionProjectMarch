package ru.itsjava.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionPractice {

    public static void main(String[] args) {
        //Задача: Вычислить факториал числа. 5! = 5 * 4 * 3 * 2 * 1 = 120
        // 0! = 1! = 1;
//        System.out.println("Введите ваше число");
        Scanner scanner = new Scanner(System.in);
//        int inputNumber = scanner.nextInt();
//
//        System.out.println("Факториал: " + factorial(inputNumber));
//        System.out.println("Факториал: " + recursionFactorial(inputNumber));

        //                      0  1   2   3   4   5   6   7
        int[] array = new int[]{1, 5, 10, 37, 43, 56, 76, 100};
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println("Индекс элемента " + num + ": " + binarySearch(num, 0, array.length, array));
    }

    public static int binarySearch(int num, int start, int end, int[] array) {
        int midIndex = (end + start) / 2;
        if (num == array[midIndex]) {
            return midIndex;
        } else if (num > array[midIndex]) {
            return binarySearch(num, midIndex + 1, end, array);
        }
        return binarySearch(num, start, midIndex - 1, array);
    }

    public static int factorial(int num) {
        int fact = 1;
        if (num < 0) {
            System.err.println("Число меньше 0. Факториал не определен");
            return -1;
        } else {
            for (int i = num; i > 1; i--) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static int recursionFactorial(int num) {
        if ((num == 1) || (num == 0)) {
            return 1;
        } else {
            return num * recursionFactorial(num - 1);
        }
    }
}

//1. Debugger
//2. Переписать программу Факториал через цикл while
//3. Вывести все элементы массива от 1 до n. (recursion)
//4. Числа Фибоначчи. Посчитать n -й член последовательности Фибоначчи  1 1 2 3 5 8 13 21
//5. Рекурсия (почитать) обратный ход рекурсии