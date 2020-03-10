package ru.skillbox.M4_4;

public class ExampleStringIndexOf {

    public static void main(String[] args) {
        /*
        метод indexOf() класса String
        Метод indexOf() ищет в строке заданный символ или строку возвращает индекс первого вхождения.
        Если вхождения не найдено возвращает -1

        Есть перегруженный метод который ищет вхождение строки с указанного индекса
         */

        //создадим строковую переменную в которой будет искать вхождения
        String phrase = "Цени в себе свинец";

        //с помощью метода распечатаем строку и под каждым символом его индекс в строке
        printWithIndexes(phrase);

        //попробуем найди в строке символ 'е'
        final char ERu = 'е';
        int index = phrase.indexOf('е');
        System.out.printf("Первое вхождение символа '%s' находится по индексу %d%n", ERu, index);

        //попробуем поискать строку "свинец"
        //обратите внимание, что возвращшается индекс первого символа строки, то есть 'с'
        String plumbum = "свинец";
        int indexPlumbum = phrase.indexOf(plumbum);
        System.out
            .printf("Вхождение строки \"%s\" находится по индексу %d%n", plumbum, indexPlumbum);

        // попробует поискать строку "золото"
        String gold = "золото";
        int indexGold = phrase.indexOf(gold);
        System.out
            .printf("Вхождение строки \"%s\" не найдено, вернулся индекс %d%n", gold, indexGold);

        // поиск символа с заданого начального индекса
        char CRu = 'с';
        int startIndex = 8;
        int indexC = phrase.indexOf(CRu, startIndex);
        System.out
            .printf("Вхождение символа \"%s\" после индекса %d найдено, вернулся индекс %d%n%n",
                CRu,
                startIndex, indexC);

        // с помощью этого метода можно найти все индексы вхождения строки
        // вы можете менять значение part и смотреть как работает метод
        String tongueTwister = "Мы ели-ели ершей у еррли. Их еле-еле у ели доели.";
        String part = "ели";

        printWithIndexes(tongueTwister);
        System.out.printf("Вхождения строки \"%s\" найдена на индексах: ", part);

        int partIndex = -part.length();
        for (; ; ) {
            partIndex = tongueTwister.indexOf(part, partIndex + part.length());
            if (partIndex == -1) {
                break;
            }
            System.out.print(partIndex + " ");
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
