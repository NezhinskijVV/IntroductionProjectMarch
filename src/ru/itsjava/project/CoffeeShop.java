package ru.itsjava.project;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        String[] items = new String[]{"Frappuccino", "Cappuccino", "Americano", "Cappuccino"};
        Scanner consoleShop = new Scanner(System.in);

        int menuNum;
        printMenu();
        System.out.println("Введите номер меню");
        while ((menuNum = consoleShop.nextInt()) != 0) {
            if (menuNum == 1) {
                printItems(items);
            } else if (menuNum == 2) {
                items = addItem(items, consoleShop);
            } else if (menuNum == 4) {
                printContainsItem(items, consoleShop);
            }
            System.out.println("Введите номер меню");
        }
    }

    private static String[] addItem(String[] items, Scanner scanner) {
        System.out.println("Введи кофе");
        String coffee = scanner.next();
        String[] resItems = new String[items.length + 1];

        for (int i = 0; i < items.length; i++) {
            resItems[i] = items[i];
        }
        resItems[items.length] = coffee;

        return resItems;
    }

    private static void printContainsItem(String[] items, Scanner consoleShop) {
        System.out.println("Введите кофе, который хотите приобрести");
        String inputCoffee = consoleShop.next();

        boolean isContains = false;
        for (String coffee : items) {
            if (inputCoffee.equals(coffee)) {
                isContains = true;
                break;
            }
        }

        if (isContains) {
            System.out.println("Есть в наличии");
        } else {
            System.out.println("Такого кофе нет");
        }

    }

    public static void printItems(String[] items) {
        System.out.println(Arrays.toString(items));
    }

    public static void printMenu() {
        System.out.println("Меню:\n" +
                "1. Показать весь ассортимент кофе\n" +
                "2. Добавить кофе\n" +
                "3. Купить кофе\n" +
                "4. Проверить на наличие\n" +
                "5. Отсортировать товары\n" +
                "6.\n" +
                "7.\n" +
                "8.\n" +
                "0. Выход");
    }
}

//Меню:
//1. Показать весь ассортимент кофе
//2. Добавить кофе
//3. Купить кофе
//4. Проверить на наличие
//5. Отсортировать товары
//6.
//7.
//8.
//0. Выход


//HW:  Купить кофе

