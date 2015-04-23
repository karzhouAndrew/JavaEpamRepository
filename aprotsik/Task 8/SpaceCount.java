class SpaceCount
{
   public static void main(String args[])
   {
      String s1 = " This  string  has a lot   of spaces! ";
      int sum = 0;
      
      if (s1.charAt(0) != ' ')
        sum++;
      for(int i = 0; i < s1.length()-1; i++)
      {
        if ( s1.charAt(i) == ' ' && s1.charAt(i+1) != ' ' )
          sum++;
      }

      System.out.println("The number of words in a given string is "+sum);
   }
}