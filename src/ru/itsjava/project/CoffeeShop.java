package ru.itsjava.project;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeShop {

    public static void main(String[] args) {
        String[] items = new String[]{"Frappuccino", "Espresso", "Americano", "Cappuccino"};
        Scanner consoleShop = new Scanner(System.in);

        int menuNum;
        printMenu();
        System.out.println("Введите номер меню");
        while ((menuNum = consoleShop.nextInt()) != 0) {
            if (menuNum == 1) {
                printItems(items);
            } else if (menuNum == 2) {
                items = addItem(items, consoleShop);
            } else if (menuNum == 3) {
                items = removeItem(items, consoleShop);
            } else if (menuNum == 4) {
                printContainsItem(items, consoleShop);
            } else if (menuNum == 5) {
                sortItems(items);
            }
            System.out.println("Введите номер меню");
        }
    }

    private static String[] removeItem(String[] items, Scanner consoleShop) {
        System.out.println("Введи кофе, который хотите купить");
        String inputItem = consoleShop.next();

        if (!isContains(items, inputItem)) {
            System.out.println("Такого кофе нет");
            return items;
        }

        String[] resItems = new String[items.length - 1];

        int index;
        for (index = 0; index < items.length; index++) {
            if (inputItem.equals(items[index])) {
                break;
//            } else if ((index == items.length - 1)) {
//                return items;
            } else {
                resItems[index] = items[index];
            }
        }

        for (int i = index; i < resItems.length; i++) {
            resItems[i] = items[i + 1];
        }

        return resItems;
    }

    private static void sortItems(String[] items) {
        for (int j = 0; j < items.length; j++) {
            for (int i = 0; i < items.length - 1 - j; i++) {
                if (items[i].charAt(0) > items[i + 1].charAt(0)) {
                    String tempName = items[i];
                    items[i] = items[i + 1];
                    items[i + 1] = tempName;
                }
            }
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

        if (isContains(items, inputCoffee)) {
            System.out.println("Есть в наличии");
        } else {
            System.out.println("Такого кофе нет");
        }
    }

    private static boolean isContains(String[] items, String inputCoffee) {
        boolean isContains = false;
        for (String coffee : items) {
            if (inputCoffee.equals(coffee)) {
                isContains = true;
                break;
            }
        }
        return isContains;
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

//HW: Сортировка не пузырьком сложностью O(NlogN)