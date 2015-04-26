//1 Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
package HW3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    public static void main(String[] args) {
        String stroka = "da, !da, da)d, ad-a! dada{dad?";
        Pattern pattern = Pattern.compile("([,]|[?]|[-]|[!]|[:]|[;]|[.][(]|[)]|[�]|[{]|[}])");
        Matcher matcher = pattern.matcher(stroka);
        Integer n = 0;
        while (matcher.find()) {
            n++;
        }
        System.out.println(n);
    }
}
