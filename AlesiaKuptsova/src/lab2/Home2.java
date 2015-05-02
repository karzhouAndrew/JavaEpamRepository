/*
Дано  четырехзначное натуральное  n. Верно ли, что все  цифры числа различны?
 */

package lab2;

import java.util.Scanner;

public class Home2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num;
		int b;
		int x;
		int c;
		int d;
		System.out.print ("Введите число=");
		num = in.nextInt();
		in.close();
		b=num/1000; 
		d=num%1000/100; 
		c=num%100/10; 
		x=num%10;
		if ((b!=d) && (d!=c) &&(c!=x) && (b!=c) && (b!=x) && (d!=x)){
			System.out.println("Верно");
		}else{
			System.out.println("Не верно");
		}
	}
}
