package ru.skillbox.M4_1;

import java.util.Calendar;
import java.util.Date;

public class ExampleToString {

  public static void main(String[] args) {
    /*
     метод toString()
     метод преобразует любой объект в объект типа String
     метод toString есть у всех объектов Java, так как любой объект неявно наследует суперкласс Object
     У Object метод toString() возвращает хэшкод объекта
     */

    //создадим новый объект типа Integer и выведем содержимое и тип переменной
    Integer integer = 12345;
    System.out.printf("значение %d - %s%n", integer, integer.getClass());

    //преобразуем Integer в String и выведем содержимое и тип переменной
    String integerString = integer.toString();
    System.out.printf("значение %s - %s%n", integerString, integerString.getClass());

    // преобразуем Date в String, будет вывод в читаемом формате
    // так как в классе Date, метод toString() переопределен для вывода "понятной" даты
    Date date = Calendar.getInstance().getTime();
    System.out.printf("значение %s - %s%n", date, date.getClass());

    // если у класса нет реализации своего метода toString, то используется формат класса Object
    // имя класса + @ + хэш код;
    Object object = new Object();
    System.out.printf("значение %s - %s%n%n", object, object.getClass());

    // когда вы печатает объект в консоль - то он неявно вызывает у объекта метод toString
    // и печатает объект в виде строки
    System.out.println(object);
    System.out.println(date);
    System.out.println(integer);

  }
}
