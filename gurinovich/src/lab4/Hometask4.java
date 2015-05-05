package lab4;

/* Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число.
 */

import java.util.Scanner;
import static java.lang.Math.*;

public class Hometask4 {
    public static void main(String[] args) {

        //формула №1
        System.out.println("Введите целое число х:");
        Scanner in = new Scanner(System.in);
        double x1 = (double)in.nextInt();
        in.close();
        double y1 = 0;
        double numerator1 = 0;
        double denominator1 = 0;

        numerator1 = Math.exp(Math.log(cos(pow(E, x1)) + pow(E, Math.sqrt(x1)) + Math.pow((1/x1), (1/2)))/4);
        denominator1 = Math.pow((cos(PI*(pow(x1, 3))) + log(pow((1 + x1), 2))),sin(x1));
        y1 = numerator1/denominator1;
        System.out.println("y1 = " + y1);

        //формула №2
        System.out.println("Введите целое число х:");
        Scanner input = new Scanner(System.in);
        double x2 = (double)in.nextInt();
        System.out.println("Введите целое число t:");
        int t = in.nextInt();
        System.out.println("Введите целое число s:");
        int s = in.nextInt();
        input.close();
        double y2 = 0;
        double numerator2 = 0;
        double denominator2 = 0;

        numerator2 = (1 - cos(2*pow(x2, t))) / 2;
        denominator2 = Math.pow((1 + pow(x2, s)), 1 / 2);
        y2 = numerator2/denominator2;
        System.out.println("y2 = " + y2);
    }
}
