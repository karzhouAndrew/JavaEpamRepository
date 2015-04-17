package lab2;

/**
 * Определить сумму первых трех цифр дробной части заданного положительного вещественного числа.
 */
public class Hometask2_3
{
    public static void main(String[] args)
    {
        double number;
        number = 123.45678;
        int i;
        int sum = 0;

        if (number < 0)
        {
            System.out.println("Number is not positive!");
        }

        for(i=1; i<4; i++)
        {
            number-=(int)number;
            number*=10;
            sum+=(int)number;
        }
        System.out.println(sum);

    }
}
