package ru.skillbox.M4_1;

public class ExampleStringCharAt {

  public static void main(String[] args) {
    /*
     метод объекта String charAt(int index)
     получаем символ строки по индексу
     индекс в строке начинается с 0, то есть если строка длиной 5 символов, то последний индекс 4
     */

    // строка для работы
    String string = "skillbox";

    // получим и распечатаем символ под индексом 0, это символ s
    //Всё просто! Для понимания: s - это индекс 0, k - 1, i - 2, l - 3, l - 4, b - 5, o - 6, x - 7
    Character character = string.charAt(0);//По данному индексу выведется значение "s"
    System.out.println(character);

    // получим и распечатаем символ под индексом 5, это символ b
    // в качестве значения индекса можно использовать переменную типа int
    int index = 5;
    character = string.charAt(index);
    System.out.println(character);

    // если вы попытаетесь получить символ по индексу
    // который выходит за пределы максимального индекса (длина строки - 1) или меньше 0,
    // то вы получите ошибку StringIndexOutOfBoundsException
    character = string.charAt(100);

  }
}
