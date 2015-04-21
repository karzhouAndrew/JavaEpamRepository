package lab3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class Hometask3_3 {
    public static void main(String[] args) {
        String text = "hgt - jhg, hfgy jfhf  jfjfj try u - jhy, jhfg.";
        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group(1)); //group(1)="\\b"
        }
    }
}
