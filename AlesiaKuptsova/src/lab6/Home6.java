/*
  Создайте число. Определите, является ли последняя цифра семеркой
 */

package lab6;

import java.util.Scanner;

public class Home6 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n=0;
		System.out.print ("Введите число=");
		n = in.nextInt();
		in.close();
		int k=Math.abs(n%10);
		if (k==7){
			System.out.println("Верно");
		}else{
			System.out.println("Неверно");
		}
	}
}
