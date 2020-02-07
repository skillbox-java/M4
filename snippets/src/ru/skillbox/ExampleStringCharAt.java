package ru.skillbox;

public class ExampleStringCharAt {

  public static void main(String[] args) {
    /** метод объекта String charAt(int index)
     * получаем символ строки по индексу
     * индекс в строке начинается с 0, то есть если строка длиной 5 символов, то последний индекс 4
     */

    // строка для работы
    String string = "skillbox";

    // получим и распечатаем символ под индексом 0, это символ s
    Character character = string.charAt(0);
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
