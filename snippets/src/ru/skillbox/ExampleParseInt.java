package ru.skillbox;

import org.w3c.dom.ls.LSOutput;

public class ExampleParseInt {

  public static void main(String[] args) {
    /** статический метод объекта Integer.parseInt(String string)
     * преобразует объект типа String в объект типа Integer
     * если формат строки возможно интерпертировать как число, иначе получим ошибку
     */

    // 1. преобразуем строку в число, для проведения над числом арифметических операций
    String text = "153244";
    Integer number = Integer.parseInt(text);
    System.out.println(number);

    number = number + 100;
    System.out.println(number);

    // если мы попытаемся "прибавить" строку к строке, то строки "склеятся"
    // такая операция называется Конкатенация
    System.out.println(text + "100");

    // если мы попытаемся конвертировать строку которую нельзя инетрпертировать как число
    // то получим ошибку NumberFormatException, даже присутсвие пробела вызовет ошибку
    // для конвертации в целое число необходимо чтобы в строке были только цифры 0-9
    number = Integer.parseInt(" 12345");

  }
}
