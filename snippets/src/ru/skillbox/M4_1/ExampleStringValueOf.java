package ru.skillbox.M4_1;

import java.util.Calendar;
import java.util.Date;

public class ExampleStringValueOf {

  public static void main(String[] args) {
    /*
     метод valueOf()
     метод преобразует любой объект в объект типа String
     метод похож на toString, только в этом случае мы передаем объект в аргумент метода, а
     не вызываем метод у объекта
     */

    //создадим новый объект типа Integer и выведем содержимое и тип переменной
    Integer integer = 12345;
    System.out.printf("значение %d - %s%n", integer, integer.getClass());

    //преобразуем Integer в String и выведем содержимое и тип переменной
    String integerString = String.valueOf(integer);
    System.out.printf("значение %s - %s%n", integerString, integerString.getClass());

    // преобразуем Date в String, будет вывод в читаемом формате
    // так как в классе Date, метод toString() переопределен для вывода "понятной" даты
    Date date = Calendar.getInstance().getTime();
    String dateString = String.valueOf(date);
    System.out.printf("значение %s - %s%n", dateString, dateString.getClass());

    // особенность метода - если объект не инициализирован, то результат преобразования будет
    // строка null, по факту у объекта вызывается метод toString, поэтому вывод будет в обоих
    // случаях "null"
    Object object = null;
    String objectString = String.valueOf(object);

    System.out.println(objectString);
    System.out.println(object);
  }
}
