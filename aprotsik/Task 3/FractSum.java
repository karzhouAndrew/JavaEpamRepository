class FractSum
{
   public static void main(String args[])
   {
      double n = 387.24045; 
      int sum = 0;
      double nmod = n*1000;
      int p = (int) nmod;

      for(int i = 0; i < 3; i++)
      {
          sum = sum + p%10;
          p = p/10;
      }
 
      System.out.println("The sum of the 3 fractional part digits is "+sum);
   }
}