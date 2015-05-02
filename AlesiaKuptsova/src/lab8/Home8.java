/*
 Имеется строка с текстом. Подсчитать количество слов в тексте. 
 Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать
 */

package lab8;

import java.util.Scanner;

public class Home8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print ("Введите строку:");
		String str = sc.nextLine();
		sc.close();
		String[] n=str.split(" ");
		int count=0;
		for (int i=0; i<n.length; ++i){
			if (!n[i].isEmpty()){
				count++;
			}
		}
		System.out.println("Кол-во слов в тексте: "+count);
	}
}
