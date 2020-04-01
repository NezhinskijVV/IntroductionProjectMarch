package ru.itsjava.arrays.lecture;

public class ArraysPractice2 {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, -3, -4, 0, -5, 0, -10, -1, 0};

        //Вывести все элементы массива большие нуля
        System.out.println("Положительные значения массива");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.print(nums[i] + " ");
            }
        }

        System.out.println("\nОтрицательные значения массива");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.print(nums[i] + " ");
            }
        }

        int summa = 0;
        for (int i = 0; i < nums.length; i++) {
            summa = summa + nums[i];
        }
        System.out.println("\nСумма элементов массива: " + summa);

        //Вывести элементы, находящиеся на четных индексах массива

        System.out.println("Элементы с четными индексами");
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }

//        for (int i = 0; i < nums.length; i = i + 2) {
//            System.out.print(nums[i] + " ");
//        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("\n Максимум массива: " + max);

        //break  continue
        for (int i = 0; i < 10; i++) {
            break;
//            System.out.println("Я люблю Java");
        }

//        //Найти индекс первого элемента равного 0
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                System.out.println("Индекс первого элемента равного 0: " + i);
//                break;
//            }
//        }

        //Найти индексы двух элементов равных 0
        int countOfZeroElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                System.out.println("Индекс элемента равного 0: " + i);
                countOfZeroElements++;
                if (countOfZeroElements == 2) {
                    break;
                }
            }
        }


    }
}

/*
// 1. Вывести элементы большие нуля в обратном порядке
// 2. Вывести индексы элементов равных нулю
// 3. Произведение всех элементов массива
// 4. Найти среднеарифметическое массива
// 5. Найти сумму элементов с четными индексами
// 6. Произведение элементов с нечетными индексами
// 7. Найти минимальный элемент массива
// 8. Найти сумму отрицательных элементов массива
// 9. Найти элементы делящиеся на 5.
//10. Реализовать свою задачу.
//10* Найти 2 максимальных элемента массива, элементы не повторяются
//11. Найти индекс элемента равного 10
//12. Вывести на экран "Хороший массив",
 если в нем по крайне мере 3 положительных элемента
 */