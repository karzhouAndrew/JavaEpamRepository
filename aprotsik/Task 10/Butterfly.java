class Butterfly
{
   public static void main(String args[])
   {  
      int m = 5;
      int n = 5;
      byte[][] multi = new byte[m][n];
      int p = 0;
      int k = 0;

     for( int i = 0; i < m; i++)
  {

      for( int j = p; j < n - p; j++)
      {  
         multi[i][j] = 1;
         
         if ( n-2*p == 1 )
          k = 1;
      }

      if ( k == 0 )
      {
        p++;
      }
      else
      {
        p--;
      }
  }

      for( int i = 0; i < m; i++)
   {
      for( int j = 0; j < n; j++)
      {  

         System.out.printf("%5d ", multi[i][j]);
      }
      System.out.println();
   }

   }
}