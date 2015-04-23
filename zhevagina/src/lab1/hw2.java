package lab1;

/**
 * There is a 4-digit number. Is it true, that all digits are different?
 */
public class hw2 {
    public static void main(String[] args) {
        int n = 1231;

        int c1 = n / 1000; //to define 1st number
        int c11 = n % 1000;
        int c2 = c11 / 100; //to define 2nd number
        int c21 = c11 % 100;
        int c3 = c21 / 10; //to define 3rd number
        int c4 = n % 10; //to define 4th number

        if (c1 != c2 && c1 != c3 && c1 != c4 && c2 != c3 && c2 != c4 && c3 != c4) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("There are the same numbers");
        }


    }
}
