/*
 Определить является ли заданное числом простым?
 */

package lab4;

import java.util.Scanner;

public class Home4 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int n=0;
		System.out.print ("Введите число=");
		n = in.nextInt();
		in.close();
		boolean  a = false;
		for (int i = 2; i <=Math.sqrt(n); ++i) {
			if (n % i == 0) {
				a = true;
				break;
			}
		}
		if (a) {
			System.out.println("число не простое");
		} else {
			System.out.println("число  простое");
		}
	}
}
