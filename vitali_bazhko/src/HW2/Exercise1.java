//1 Определить число, полученное выписыванием в обратном порядке цифр четырехзначного целого числа n.

package HW2;

/**
 * Created by Vitali_Bazhko on 4/13/2015.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int a = 735;
        int b = (((a % 10) / 1) * 100) + (((a % 100) / 10) * 10) + (((a % 1000) / 100) * 1);
        System.out.println("Результат a="+a);
        System.out.println("Результат b="+b);
    }


}
