class IsSimple
{
   public static void main(String args[])
   {
      int n = 5; 
 
      for(int i = 2; i*i <= n; i++)
      {
          if(n % i == 0)
          {
            System.out.println("The number is not simple");
            System.exit(0);
          }
                      
      }
 
      System.out.println("The number is simple");
   }
}