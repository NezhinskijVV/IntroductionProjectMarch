package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
        String myString = "Я строка";
        System.out.println(myString);

        String concatStrings = myString + "! :=)";
        System.out.println(concatStrings);
        System.out.println(myString.toLowerCase());
        System.out.println(myString.charAt(2));

        System.out.println("myString.equals(\"Я строка\") = " + myString.equals("Я строка"));

        System.out.println(" " + 5 + 5);
        System.out.println(myString.length());

    }
}
