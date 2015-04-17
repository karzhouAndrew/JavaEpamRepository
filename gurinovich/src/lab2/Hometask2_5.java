package lab2;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Hometask2_5
{
    public static void main(String[] args)
    {
        int n = 3;

        int i = 0;
        int sum = 0;
        int number = 1;

        do
        {
            if (number%3 == 0)
            {
                sum+=number;
                i++;
            }
            number++;
        }
        while (i < n);

        System.out.println("Sum of " + n + " numbers is " + sum);
    }
}
