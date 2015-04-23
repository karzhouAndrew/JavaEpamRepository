class IsSeven
{
   public static void main(String args[])
   {
      int n = 8767; 
      int last = 0;
 
      last = n%10;

      if ( last == 7 )
      {
        System.out.println("The last number is 7 ");
      }       
      else
      System.out.println("The reverse number is not 7 ");
   }
}