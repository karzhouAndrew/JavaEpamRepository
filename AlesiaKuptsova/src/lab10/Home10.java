/*
Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0 
0 1 1 1 0
1 1 1 1 1 
 */

package lab10;

import java.util.Scanner;

public class Home10 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число=");
		int n = in.nextInt();
		in.close();
		int[][] butt = new int[n][n];
		for (int i=0; i<butt.length; ++i){
			if(i<=butt.length/2){
				for (int j=i; j<butt[i].length-i; ++j){
					butt[i][j]=1;
				}
			}
			else{
				for (int j=butt.length-i-1; j<=i; ++j){
					butt[i][j]=1;
				}
			}
		}
		for (int i=0; i<butt.length; ++i){
			for (int j=0; j<butt[i].length; ++j){
				System.out.print(butt[i][j]+" ");
			}
			System.out.println();
		}
	}
}
