package ru.skillbox.M4_1;

public class ExampleStringLength {

  public static void main(String[] args) {
    /*
     метод length() объекта String
     возвращает длину строки в виде int
     можно сделать вывод что максимальная длина строки это максимальное значение типа Integer
     */

    // строка для работы
    String string = "skillbox";

    // получим длину строки и распечатаем значение
    int length = string.length();
    System.out.println(length);

    System.out.println();

    // как вариант, можно использовать длину строки как условия для перебора символов в строке
    for (int i = 0; i < string.length(); i++) {
      System.out.println(string.charAt(i));
    }

    System.out.println();

    // c помощью длины строки можно проверить пустая строка или нет
    if (string.length() == 0) {
      System.out.println("Cтрока пустая");
    } else {
      System.out.println("Строка не пуста");
    }

    // при этом для проверки есть метод isEmpty(), который делает точно такую же проверку
    // и возвращает boolean
    if (string.isEmpty()) {
      System.out.println("Cтрока пустая");
    } else {
      System.out.println("Строка не пуста");
    }

  }
}
