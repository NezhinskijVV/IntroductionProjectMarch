package ru.itsjava.oop;

public class Lawn {
    public static void main(String[] args) {
      //тип имя объекта (знак присваивания (=)) оператор new (оператор выделения памяти) конструктор
        Cow murka = new Cow("Голштинская","Молочный");
        Cow gurka = new Cow("Симментальская","Коричневый");

        System.out.println("murka.getColor() = " + murka.getColor());
        //gurka

        System.out.println("gurka.getColor() = " + gurka.getColor());

        murka.setColor("Черный");

        System.out.println("(После окрашивания в черный) murka.getColor() = " + murka.getColor());

        murka.setColor("Белый");

        System.out.println("(После окрашивания в белый) murka.getColor() = " + murka.getColor());

        Cow emptyCow = new Cow();

        Cow goodCow = new Cow("GOOOOOOOOOD");

        System.out.println("emptyCow.getColor() = " + emptyCow.getColor());

        System.out.println("goodCow.getNameBreed() = " + goodCow.getNameBreed());
        System.out.println("goodCow.getColor() = " + goodCow.getColor());
    }
}

//HW:
//1.  Создать 5 коров, у 3 из них поменять цвет
//2.  Написать set get для поля nameBreed .
//3.  В методе main сменить пароду и вывести на экран
//4.  Создать классы:  Man, Shop, Cup, Telephone, Notebook и 3 своих
//5.  Создать классы для запуска
//6. Создать get и set для всех полей
//7. Создать конструкторы от разного числа параметров

// Эккель Брюс Философия Java
