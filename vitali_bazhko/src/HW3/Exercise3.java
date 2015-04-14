//3 Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
package HW3;

/**
 * Created by Vitali_Bazhko on 4/13/2015.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String str = "any many money more";
        StringBuilder res = new StringBuilder();

        String [] words = str.split("\\s+");
        for ( String word : words )
            res.append(word.toCharArray()[word.length() - 1]);

        System.out.println("String: " + str);
        System.out.println("Result: " + res.toString());
    }

}
