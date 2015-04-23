package lab1;

/**
 * 3) Determine the sum of the first three digits of the fractional part of a given positive real number.
 */
public class hw3 {
    public static void main(String[] args) {
        double d = 123.4567;
        d = d * 1000;
        int i = (int) d;
        int sum = 0;

        for (int k = 0; k < 3; k++) {
            sum += i % 10;
            i = i / 10;
        }
        System.out.println("Sum:" + sum);

    }
}
