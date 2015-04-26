package lab2;
import java.math.BigDecimal;
/**
 * Создайте число. Определите, является ли последняя цифра семеркой.
 */
public class Hometask2_6 {
    public static void main(String[] args) {
        int number_1 = 83590678;
        int last_1 = number_1%10;

        if (last_1 == 7) {
            System.out.println("Last digit of Number1 is 7");
        } else {
            System.out.println("Last digit of Number1 is not 7 ! It is " + last_1);
        }

        double number_2 = 43.097897;
        int last_2 = 0;
        String s2 = String.valueOf(number_2);
        //String s2 = Double.toString(number_2);
        String s1 = String.valueOf((int)number_2);
        int length = s2.length() - s1.length() - 1;

        for (int i=0; i<length; i++) {
            number_2 -= (int)number_2;
            BigDecimal x = new BigDecimal(number_2);
            x = x.setScale(length, BigDecimal.ROUND_HALF_UP); /* length - количество знаков после запятой */
            number_2 = x.doubleValue();
            number_2 *= 10;
            last_2 = (int)number_2;
        }

        if (last_2 == 7) {
            System.out.println("Last digit of Number2 is 7");
        } else {
            System.out.println("Last digit of Number2 is not 7 ! It is " + last_2);
        }
    }
}
