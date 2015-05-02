/*
 Дана действительная матрица порядка n. 
 Найти сум¬му элементов, расположенных в закрашенной части матрицы на рисунке.
 */

package lab11;

import java.util.Random;
import java.util.Scanner;

public class Home11 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число=");
		int n = in.nextInt();
		in.close();
		Random randomGenerator = new Random();
		int[][] butt = new int[n][n];
		for (int i=0; i<butt.length; ++i){
			for (int j=0; j<butt[i].length; ++j){
				butt[i][j]=randomGenerator.nextInt(10);
			}
		}
		int sum=0;
		for (int i=0; i<butt.length; ++i){
			for (int j=0; j<i+1; ++j){
				sum+=butt[i][j];
			}
		}
		for (int i=0; i<butt.length; ++i){
			for (int j=0; j<butt[i].length; ++j){
				System.out.print(butt[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Сумма:"+sum);
	}
}
