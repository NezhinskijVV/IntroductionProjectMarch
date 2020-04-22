package ru.itsjava.oop;

public class Cow {
    private String nameBreed;  //состояние,поля класса
    private String color;

    public Cow(String nameBreed, String color){  //конструктор (метод по созданию объекта)
        this.nameBreed = nameBreed;  //ссылка на данный объект
        this.color = color;
    }

    public Cow(String nameBreed){  //конструктор (метод по созданию объекта)
        this.nameBreed = nameBreed;  //ссылка на данный объект
    }

    public Cow(){}

    public String getColor(){     // метод (поведение объекта)
        return color;
    }

    public String getNameBreed() {
        return nameBreed;
    }

    //    public void setColor(String inputColor){
//        color = inputColor;
//    }

    public void setColor(String color){ //изменили состояние объекта
        this.color = color;
    }

}