/**
 * 1)	Определить число, полученное выписыванием в обратном порядке цифр четырехзначного целого числа n.
 */
public class hw1 {
    public static void main(String[] args) {
        int n = 1539;
        int c1 = n / 1000; //to define 1st number
        int c11 = n % 1000;
        int c2 = c11 / 100; //to define 2nd number
        int c21 = c11 % 100;
        int c3 = c21 / 10; //to define 3rd number
        int c4 = n % 10; //to define 4th number

        int a = c4 * 1000 + c3 * 100 + c2 * 10 + c1;
        System.out.println("New value:" + a);
    }
}
