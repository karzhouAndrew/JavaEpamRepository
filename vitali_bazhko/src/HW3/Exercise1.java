//1 Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
package HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    public static void main(String[] args) {
        String sourceString = "some , !text, about)nothing, and ! another{one?!";

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(sourceString);

        Integer n = 0;
        while (matcher.find()) {
            n++;
        }
        System.out.println(n);
    }
}
