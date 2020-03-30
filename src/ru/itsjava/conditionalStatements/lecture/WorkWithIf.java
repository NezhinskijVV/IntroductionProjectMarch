package ru.itsjava.conditionalStatements.lecture;

import java.util.Scanner;

public class WorkWithIf {

    //psvm
    public static void main(String[] args) {

//        System.out.println("Lecture2"); //sout
//        Scanner console = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int numFromConsole = console.nextInt();
//        System.out.println("Наше число: " + numFromConsole);
//
//        if (numFromConsole > 5) {
//            System.out.println("Число больше 5");
//        } else if (numFromConsole < 5) {
//            System.out.println("Число меньше 5");
//        } else {
//            System.out.println("Число равно 5");
//        }
//
//        int num2 = console.nextInt();
//
//        boolean b = num2 > 5 ? true : false;  //тернарный оператор
//        if (b) {
//            System.out.println("Число больше 5");
//        }

//Программа: призывник
        //меньше 0 ты еще не родился
        // от 0 до 18 -> Тебе еще рано
        // от 18 - 27 -> Иди служить
        // от 27 - 150 -> Тебе поздно
        //больше 150 -> Послужишь в другой жизни
        int num1 = 3;
        int num2 = 5;
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

//HW: 0. Нарисовать блок схему для программы призывник
//    1. Программа по определению високосного года
//    2. Найти максимум из двух чисел
//    3. Найти минимум из двух чисел
//    4. Поменять значение двух переменных не используя третью
//    5. Найти корни квадратного уравнения
//    6. Проверить делимость на 5
//    7. Вывести число вида  21 = 4 * 5 + 1   (делитель 5)
//    8. Найти максимум из трех чисел
//    9. Найти среднее из трех чисел
//   10. Найти сумму цифр двухзначеного числа  95 -> 14