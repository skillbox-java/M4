package ru.skillbox.M4_4;

public class ExampleStringSubstring {

    public static void main(String[] args) {
        /*
        метод класса String
        substring(int startIndex, int endIndex)
        substring(int startIndex)
        данный метод возвращает String, который является подстрокой, которая начинается со
        startIndex и заканчивается endIndex.
        Если endIndex не указан, то подстрока начинается от startIndex до конца строки
         */

        //создадим строковую переменную которую будем использовать для демонстрации
        String phrase = "Цени в себе свинец";

        //метод который печатает строку с индексами символов
        printWithIndexes(phrase);

        // 1. получим подстроку по начальному и конченому индексу
        // обратите внимание, последний индекс не входит в результирующую строку
        // то есть мы получаем символы на индексах 7 8 9 10
        String you = phrase.substring(7, 11);
        System.out.println("[1] " + you);

        // 2. пример использованию метода без конечного индекса
        // то есть нам вернется подстрока в которой нулевой индекс является 12 в phrase
        String plumbum = phrase.substring(12);
        System.out.println("[2] " + plumbum);
        System.out.println();

        // 3. substring используется вместе с методами indexOf() и lastIndexOf()
        // например, можно заменит в строке вхождения одной строки на другую
        String text = "кокосовары варят в скорококосоварках кокосовый сок.";
        String search = "кокос";
        String sub = "ананас";

        System.out.println("[3] Исходная строка: " + text);

        int i;
        do {
            i = text.indexOf(search);
            if (i != -1) {
                text = text.substring(0, i) + sub + text.substring(i + search.length());
            }
        } while (i != -1);

        //печатаем результат с заменой
        System.out.println("Строка после замен: " + text + "\n");

        // 4. если указать несуществующий индекс, то будет выбращено исключение StringIndexOutOfBoundsException
        try {
            text.substring(100);
        } catch (Exception e) {
            System.out.println("[4]");
            e.printStackTrace();
        }
    }

    private static void printWithIndexes(String string) {
        StringBuilder letters = new StringBuilder().append("char: ");
        StringBuilder indexes = new StringBuilder().append("index:");
        for (int i = 0; i < string.length(); i++) {
            letters.append(String.format("%3s", string.charAt(i)));
            indexes.append(String.format("%3d", i));
        }
        System.out.println(letters);
        System.out.println(indexes.append(System.lineSeparator()));
    }
}
