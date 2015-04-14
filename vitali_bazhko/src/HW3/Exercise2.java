//2 Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
package HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) {
        final String WORD = "[a-zA-Z?-??-?]+";

        int i = 0;
        Pattern pattern = Pattern.compile(WORD);
        Matcher matcher = pattern.matcher("  hello world i'm    here again");
        while (matcher.find()) {
            i++;
        }
        System.out.println(i);
    }
}
