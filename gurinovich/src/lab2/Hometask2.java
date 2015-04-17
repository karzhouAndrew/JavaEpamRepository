package lab2;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр четырехзначного целого числа n.
 */
public class Hometask2
{
    public static void main(String[] args)
    {
        int invertedNum = 0;
        int dec;
        int num = 1674;
        int newNum;
        newNum = num;
        int k=0;
        while(newNum!=0)
        {
            newNum/=10;
            k++;
        }
        if (k==4)
        {
            while (num!=0)
            {
                invertedNum*=10;
                dec=num%10;
                num/=10;
                invertedNum+=dec;
            }
        }
        System.out.println(invertedNum);
    }
}

