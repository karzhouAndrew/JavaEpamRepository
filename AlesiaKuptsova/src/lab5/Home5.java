/*
 Найдите сумму первых n целых чисел, которые делятся на 3.
 */

package lab5;

import java.util.Scanner;

public class Home5 {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n=0;
		System.out.print ("Введите число=");
		n = in.nextInt();
		in.close();
		int sum = 0;
		for (int k=1; k<=n; k++){
			sum+=3*k; 		
		}
		System.out.println("Суммма:" +sum);
	}
}
