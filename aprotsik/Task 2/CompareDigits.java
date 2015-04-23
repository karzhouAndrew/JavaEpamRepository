class CompareDigits
{
   public static void main(String args[])
   {
      int n = 2752; 
      int cur = 0;
      int k = 0;
      int next = 0;
 
      while( n != 0 )
      {
          cur = n%10;
          k = n/10;
          while( k != 0)
          {
            next = k%10;
            k = k/10;
            if (cur == next)
            {
              System.out.println("Not all the digits are unique!");
              System.exit(0);
            }
          }
          n = n/10;
      }
 
      System.out.println("All the digits are unique!");
   }
}