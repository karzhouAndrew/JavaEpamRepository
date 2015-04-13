// Определить число, полученное выписыванием в обратном порядке цифр четырехзначного целого числа n.

package lab1;

import java.util.Scanner;

public class Home1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		int x;
		int y;
		int c;
		int d;
		System.out.print("Введите число=");
		a = in.nextInt();       
		b=a/1000; 
		d=a/100%10; 
		c=a/10%10; 
		x=a%10;
		y=x*1000+c*100+d*10+b; 
		System.out.println("Результат="+y);
	}        
}