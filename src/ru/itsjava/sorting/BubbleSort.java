package ru.itsjava.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] numsArray = new int[]{-1, 0, -77, 43, 13, 24, -5};
//        System.out.println("Изначальный массив:     " + Arrays.toString(numsArray));
//
//        for (int j = 0; j < numsArray.length; j++) {
//            for (int i = 0; i < numsArray.length - 1 - j; i++) {
//                if (numsArray[i] > numsArray[i + 1]) {
//                    int tempNum = numsArray[i];
//                    numsArray[i] = numsArray[i + 1];
//                    numsArray[i + 1] = tempNum;
//                }
//            }
//        }
//
//
//        System.out.println("Отсортированный массив: " + Arrays.toString(numsArray));

        String[] namesArray = new String[]{"Евгений", "Ярослав", "Георгий", "Дмитрий", "Даниил", "Виталий"};
//        String[] namesArray = new String[]{"Daniil", "Evgeniy", "Yaroslav", "Georgie", "Dmitriy", "Vitaliy"};

        System.out.println(namesArray[0].charAt(0) - namesArray[1].charAt(0));
        System.out.println("Изначальный массив:     " + Arrays.toString(namesArray));

//        if (array[i].charAt(0) > array[j].charAt(0))


        for (int j = 0; j < namesArray.length; j++) {
            for (int i = 0; i < namesArray.length - 1 - j; i++) {
                if (namesArray[i].charAt(0) > namesArray[i + 1].charAt(0)) {
                    String tempName = namesArray[i];
                    namesArray[i] = namesArray[i + 1];
                    namesArray[i + 1] = tempName;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(namesArray));

    }
}
