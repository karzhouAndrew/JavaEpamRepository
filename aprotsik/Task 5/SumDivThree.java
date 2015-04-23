class SumDivThree
{
   public static void main(String args[])
   {
      int n = 3; 
      int k = 0;
      int sum = 0;
      int i = 1;

      while ( k < n )
      {
          if( k == n )
            break;
          if( i % 3 == 0 )
          {
            sum = sum + i;
            k++;
          }
          i++;
      }
 
      System.out.println("The sum of the first" + n + "digits that are divisible into 3 is " + sum);
   }
}