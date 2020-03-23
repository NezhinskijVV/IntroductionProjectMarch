package ru.itsjava;

public class Main {
    public static void main(String[] args) { //psvm
        System.out.println("Я люблю Java!");
        System.out.println("Я очень люблю Java!"); //sout
        /*
        Какие-то комментарии
         */
        //ctrl + alt + l - красивое форматирование кода
        System.out.println("Что-то");

        int num = 5;
        System.out.println("num = " + num);
//        num =  num + 3;
        num += 3;
        System.out.println("num = " + num);

        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;

        System.out.println("Сумма: " + sum);

        boolean isCold = true;
        System.out.println("isCold = " + isCold);

        double d1 = 5.0;
        System.out.println("d1 = " + d1);

        System.out.println(5.0 / 0.0);
        System.out.println(0 / 5);
        System.out.println(0.0 / 0.0);

        System.out.println("Инструкция до оператора if");
        if (5 == 5) {
            System.out.println("Условие if равно true");
        } else {
            System.out.println("Условие оператора if равно false");
        }
        System.out.println("Инструкция после оператора if");
    }
}

//HW: 1. Выполнить все операции над примитивными типами данных
//     (int, double, boolean)
//    2. Вывести таблицы истинности ( и и или) (&&  и ||) взаимоисклчающее или
//    3.* Побитовые операции
//    4.* Скомпилировать и запустить файл java через командную строку
//    P.S. Добавить переменную окружения (путь к java  в переменной PATH)