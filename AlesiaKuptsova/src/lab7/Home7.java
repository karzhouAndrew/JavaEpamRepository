/*
 Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */

package lab7;

import java.util.Scanner;

public class Home7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print ("Введите строку:");
		String str = sc.nextLine();
		sc.close();
		int sum=0;
		for(int i=0; i<str.length(); i++){
			if ( str.charAt(i)==',' || str.charAt(i)==':' || str.charAt(i)==';' || str.charAt(i)=='.')
				sum++;
		}
		System.out.println("Кол-во знаков: "+sum);
	}
}
