/*
 Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */

package lab9;

import java.util.Scanner;

public class Home9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print ("Введите строку:");
		String str = sc.nextLine();
		sc.close();
		String[] n=str.split(" ");
		String result = "";
		for (int i=0; i<n.length; ++i){
			if (!n[i].isEmpty()){
				int k=n[i].length()-1;
				result+=n[i].charAt(k);
			}
		}
		System.out.println("Слово: "+result);
	}
}
