package lab2;

import java.util.Scanner;

/**
 * Определить является ли заданное числом простым
 */
public class Hometask2_4
{
    public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();*/
        int number = 0;
        boolean truth = true;

        if (number==0)
        {
            truth = false;
        }
        else
        {
            for (int i = 2; i < number/2; i++)//либо i < квадратный корень из number
            {
                if (number % i ==0)
                {
                    truth = false;
                }
            }
        }
        if (truth == false)
        {
            System.out.println("Not simple");
        } else
        {
            System.out.println("Simple");
        }

    }
}
//либо через while до первого делителя - если делится без остатка, то число НЕ простое!