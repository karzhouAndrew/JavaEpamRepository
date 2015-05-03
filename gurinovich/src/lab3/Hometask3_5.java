package lab3;
import java.util.Random;
/* Дана действительная матрица порядка n.
   Найти сум¬му элементов, расположенных в закрашенной части матрицы на рисунке */

public class Hometask3_5 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        int[][] matrix = new int[n][n];
        Random rand = new Random();

        for (int row=0; row<n; row++) {
            for (int col=0; col< n; col++) {
                matrix[row][col] = rand.nextInt(n+n);
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        for (int row=n-1; row>=0; row--) {
            for (int col=row; col>=0; col--) {
                sum += matrix[row][col];
            }
        }
        System.out.println("Sum =" + sum);
    }
}
