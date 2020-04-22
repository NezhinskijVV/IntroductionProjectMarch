package ru.itsjava.strings;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
//        String myString = "Я строка";
//        System.out.println(myString);
//
//        String concatStrings = myString + "! :=)";
//        System.out.println(concatStrings);
//        System.out.println(myString.toLowerCase());
//        System.out.println(myString.charAt(2));
//
//        System.out.println("myString.equals(\"Я строка\") = " + myString.equals("Я строка"));
//
//        System.out.println(" " + 5 + 5);
//        System.out.println(myString.length());


        System.out.println('a');
        System.out.println('\u0070');

        char ch1 = 70;
        System.out.println(ch1);

        char ch2 = 'b';
        char ch3 = 'c';

        System.out.println(ch2 < ch3);

        Integer myInt = new Integer(5);

//        List<Integer> list = new ArrayList<>();
//        list.add(5);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int i = (5 == 5) ? 3 : 1;
        System.out.println(i);

    }
}
