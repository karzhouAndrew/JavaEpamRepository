class PunctMarks
{
   public static void main(String args[])
   {
      String s1 = "It's , a ; string - full . of ? pointless : punctuation!";
      int sum = 0;
      
      for(int i = 0; i < s1.length(); i++)
      {
      switch(s1.charAt(i))
       { 
     case '.':
        sum++;
        break;
     case ',':
        sum++;
        break;
     case ';':
        sum++;
        break;
     case ':':
        sum++;
        break;
     case '?':
        sum++;
        break;
     case '!':
        sum++;
        break;
     case '-':
        sum++;
        break;               
       }
     }

      System.out.println("The number of puctuation marks in a given string is "+sum);
   }
}