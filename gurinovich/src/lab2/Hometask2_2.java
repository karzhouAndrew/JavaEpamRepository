package lab2;
/**
 * Дано четырехзначное натуральное  n. Верно ли, что все  цифры числа различны?
 */
public class Hometask2_2 {
    public static void main(String[] args) {
        int number = 3114;
        int newNum = number;
        int digits=0;
        boolean truth = true;

        while(newNum!=0) {
            newNum/=10;
            digits++;
        }

        if (digits==4) {
            for (int i=1; i<digits; i++) {
                int last = number % 10;
                for (int left = number / 10; left > 0; left /= 10) {
                    if (last == left % 10) {
                        truth = false;
                    }
                }
                number/=10;
            }
        }
        if (truth) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}