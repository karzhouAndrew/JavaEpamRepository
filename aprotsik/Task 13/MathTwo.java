import static java.lang.Math.*;

class MathTwo
{
   public static void main(String args[])
   {
      double x = 3;
      double t = 2;
      double s = 1;

      double y = 0;

      y = pow(sin(pow(x,t)),2)/sqrt(1+pow(x,s));
 
      System.out.println("y = " + y);
   }
}