package lab6.Task2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Hometask_6_2 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scan.nextLine();
        scan.close();

        // quick test
        //input = "some string containing some words. hello world and other words.";

        // делим введенную строку на слова методом split, используя регулярное выражение для знаков препинания
        String[] words = input.split("[,;:.!?\\s]+");
        // словарь, в котором будут храниться пары: слово - его встречаемость в тексте
        Map<String, Integer> dict = new HashMap<String, Integer>();
        // временная переменная-счетчик
        Integer wordCount = 0;

        // перебираем все слова из массива words
        for (String word: words) {
            // пробуем получить слово из словаря. если оно есть, получаем встречаемость
            wordCount = dict.get(word);
            // если слова в словаре еще нет, то get() вернет null. обнуляем счетчик
            if (wordCount == null){
                wordCount = 0;
            }
            // прибавляем к счетчику единицу для текущего слова
            dict.put(word, wordCount + 1);
        }

        // вывод результатов, для каждого ключа из словаря
        System.out.println(dict);
        /*for (String key: dict.keySet()) {
            System.out.println(String.format("Word '%s': %d times", key, dict.get(key)));
        }*/
    }
}
