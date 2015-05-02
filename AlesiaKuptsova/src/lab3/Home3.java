/*
Определить сумму первых трех цифр дробной части заданного положительного вещественного числа
 */

package lab3;

import java.util.Scanner;

public class Home3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double a;
		System.out.print ("Введите число=");
		a = in.nextDouble();
		in.close();
		int sum=0;
		for (int i=1; i<=3; ++i)
		{a=a*10;
		int v=(int) a;
		v=v%10;
		sum=sum+v;}
		System.out.println("Результат:"+sum);	    
	}
}
