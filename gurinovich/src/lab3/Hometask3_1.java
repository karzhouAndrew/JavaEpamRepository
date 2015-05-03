package lab3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
public class Hometask3_1 {
    public static void main(String[] args) {
        String str = "Петр сказал: \"Все свободны!\" - и громко хлопнул дверью.";
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        while (matcher.find()) {
            sum++;
        }
        System.out.println("Количество знаков препинания = " + sum);

        /*int sum = 0;
        char[] stringToCharArray = str.toCharArray();
        for(int i=0; i<str.length(); i++) {
            if (stringToCharArray[i] == '!'
                    || stringToCharArray[i] == '"'
                    || stringToCharArray[i] == '('
                    || stringToCharArray[i] == ')'
                    || stringToCharArray[i] == ','
                    || stringToCharArray[i] == '-'
                    || stringToCharArray[i] == '.'
                    || stringToCharArray[i] == ':'
                    || stringToCharArray[i] == ';'
                    || stringToCharArray[i] == '?') {
                sum++;
            }
        }
        System.out.println("Количество знаков препинания = " + sum);*/
    }
}
