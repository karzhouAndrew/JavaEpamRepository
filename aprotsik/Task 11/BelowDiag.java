import java.util.Random;

class BelowDiag
{
   public static void main(String args[])
   {  
      int m = 5;
      int n = 5;
      int[][] multi = new int[m][n];
      Random rand = new Random();
      int sum = 0;
      int p = 1;

     for( int i = 0; i < m; i++)
  {

      for( int j = 0; j < n; j++)
      {  
         multi[i][j] = rand.nextInt(20);
         System.out.printf("%5d ", multi[i][j]);  
      }
      System.out.println();
  }

     for( int i = 0; i < m; i++)
  {
      for( int j = 0; j < p; j++)
      {  
          sum += multi[i][j];  
      }
     p++;
  }

  System.out.println("The sum of the elements below the first diagonal is "+sum);

   }
}