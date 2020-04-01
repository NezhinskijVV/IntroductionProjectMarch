package ru.itsjava.arrays.lecture;

public class ArraysPractice2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, -3, 4, -5, 0, 1};

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




    }
}
