class LastLetters
{
   public static void main(String args[])
   {
      String s1 = "This string has many letters";
      String s2 = "";

      for(int i = 0; i < s1.length()-1; i++)
      {
        if ( s1.charAt(i) != ' ' && s1.charAt(i+1) == ' ' )
          s2 += s1.charAt(i);
      }
      
      if (s1.charAt(s1.length()-1) != ' ')
      s2 += s1.charAt(s1.length()-1);

      System.out.println("The string made of last letters is "+s2);
   }
}