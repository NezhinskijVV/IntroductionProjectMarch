package ru.itsjava.methods;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, -2, 3, 0, -47, 63, 100};
        printArray(numbers);
//        int[] numbers2 = new int[]{0, 0, 3, 10, -147, 263, 10};
//        printArray(numbers2);
        numbers = arrayFirst3Elements(numbers);
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] arrayFirst3Elements(int[] array){
        int[] resultArray = new int[3];
        resultArray[0] = array[0];
        resultArray[1] = array[1];
        resultArray[2] = array[2];
        return resultArray;
    }
}