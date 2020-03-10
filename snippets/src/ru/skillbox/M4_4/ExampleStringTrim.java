package ru.skillbox.M4_4;

import java.util.Scanner;

public class ExampleStringTrim {

    public static void main(String[] args) {
        /*
        метод класса String
        trim()
        метод  возвращает копию данной строки, в которой удаляются начальные и конечные пробелы,
        или данную строку, если она не имеет начальных или конечных пробелов.
         */

        // создадим строковую переменную в которой будут пробелы в начале и конце строки
        String phrase = "     Луна́ — единственный естественный спутник Земли     ";

        // распечаетаем строку заключив ее в скобках для наглядности
        printWithHooks(phrase);

        // создадим новую строку, в которую сохраним результат выполнения trim()
        String phraseWithoutSpaces = phrase.trim();

        // распечаетаем строку без пробелов заключив ее в скобках для наглядности
        printWithHooks(phraseWithoutSpaces);

        // метод trim() применяется, например, для отчистки от пробелов входных данных от пользователя
        // запустим запрос строки в бесконечном цикле
        for (; ; ) {
            System.out
                .println("Введите строку с пробелами в конце и в начале (для выхода введите q):");

            // сразу удаляем пробелы после получения строки, так как trim возвращает копию String к
            // которой применяется метод
            String input = new Scanner(System.in).nextLine().trim();

            System.out.println("Ваша строка после удаления пробелов:");
            printWithHooks(input);

            if (input.equals("q")) {
                //break завершает текущий цикл
                break;
            }
        }
    }

    private static void printWithHooks(String string) {
        System.out.printf("[%s]%n", string);
    }


}
