package lab2;
/**
 * Определить число, полученное выписыванием в обратном порядке цифр четырехзначного целого числа n.
 */
public class Hometask2 {
    public static void main(String[] args) {
        int invertedNum = 0;
        //int dec;
        int num = 16747908;
        /*int newNum = num;
        int digits = 0;
        while(newNum!=0) {
            newNum/=10;
            digits++;
        }
        if (digits==4) {
            while (num!=0) {
                invertedNum*=10;
                dec=num%10;
                num/=10;
                invertedNum+=dec;
            }
        }*/

        while (num>0){
            invertedNum = invertedNum*10 + (num%10);
            num/=10;
        }
        System.out.println(invertedNum);
    }
}

