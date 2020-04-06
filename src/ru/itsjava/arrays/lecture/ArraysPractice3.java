package ru.itsjava.arrays.lecture;

import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
//        int count = 0;
//        while (count < 5) {
//            System.out.println(count);
//            count++;
//        }
//        System.out.println("Завершение цикла while");
//
//        //С помощью цикла while вывести "Я люблю делать домашние задания"
//        int countPhrase = 0;
//        while (countPhrase < 3){
//            System.out.println("Я люблю делать домашние задания");
//            countPhrase++;
//        }
//        System.out.println("countPhrase = " + countPhrase);


//        boolean isInfinity = true;
//        while (isInfinity){
//            System.out.println("Infinity");
//        }

//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите число");
//        int numFromConsole;
//        while ((numFromConsole = console.nextInt()) != 5) {
//            System.out.println("Ваше число " + numFromConsole + ". Введите другое число");
//        }


        int[] array = new int[]{1, -5, 0, 3};

//        int index = 0;
//        while (index < array.length) {
//            System.out.println("array[" + index + "] = " + array[index]);
//            index++;
//        }

// ДЗ  Вывести сумму элементов до ввода пользователем числа 0

//        Scanner console = new Scanner(System.in);
//        int numFromConsole = console.nextInt();
//        int summa = numFromConsole;
//        while (numFromConsole != 0) {
//            numFromConsole = console.nextInt();
//            summa += numFromConsole;
//        }
//        System.out.println("Сумма: " + summa);


        Scanner console = new Scanner(System.in);
//        int numFromConsole;
//        int summa = 0;
//        while ((numFromConsole = console.nextInt()) != 0) {
//            summa += numFromConsole;
//        }
//        System.out.println("Сумма: " + summa);

//        int numFromConsole;
//        while (true) {
//            numFromConsole = console.nextInt();
//            if (numFromConsole == 5) {
//                System.out.println("Число равно 5");
//                break;
//            } else {
//                System.out.println("Число равно " + numFromConsole + ". Попробуйте еще раз!");
//            }
//        }

        String[] strings = new String[]{"Первая", "Вторая", "Третья"};
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
//        }

        for (String element : strings) {
            System.out.println(element);
        }
    }
}

//HW: WHILE
//Задача: Вывести 10 раз: "Я люблю Java!"
//Задача: Найти сумму цифр числа. 545  -> (5 + 4 + 5 =) 14
//Задача: Вывести все делители числа  15 -> 15, 5, 3, 1
//Потрогать строки
//Вывести количество строк равных "Я люблю программировать"  (for each)