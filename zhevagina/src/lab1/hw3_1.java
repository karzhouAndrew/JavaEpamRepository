package lab1;

/**
 * Created by Katsiaryna_Zhevahina on 23-Apr-15.
 */

import static java.lang.Math.*;

public class hw3_1 {
    public static void main(String[] args) {
        double x = 5.0;
        double y;
        y = pow(cos(pow(E, x)) + pow(E, pow(x, 2)) + pow(1 / x, 1 / 2), 1 / 4) / pow(cos(PI * pow(x, 3)) + log10(pow(1 + x, 2)), sin(x));
        System.out.println("y=" + y);

        double t = 3.0;
        double s = 2.0;
        y = pow(sin(pow(x, t)), 2) / pow(1 + pow(x, s), 1 / 2);
        System.out.println("y=" + y);

    }
}
