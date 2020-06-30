public class Loops
{
  public static void main(String[] args)
  {
    /*Write a program named Loops.java which has solutions to excercises 3, 4, and 5 from chapter 7 of Think Java.*/
    System.out.println("****** Loops.java ******");

    System.out.println("Exercise 3:  Iterative power method");
    System.out.println("2^3: " + power(2,3));
    System.out.println("10^4: " + power(10,4));
    System.out.println("");

    System.out.println("Exercise 4:  Iterative Factorial");
    System.out.println("3!: " + factorial(3));
    System.out.println("5!: " + factorial(5));
    System.out.println("");

    System.out.println("Exercise 5:  Iterative e^x");
    int hightestMatch = 0;
    int bestIndex = 0;
    for(int i = 1; i <= 100; i++)
    {
      double myCalc = myExp(2,i);
      double e2 = Math.exp(2);
      int matchingDigits = countSameDigits(myCalc, e2);
      if(matchingDigits > hightestMatch)
      {
        bestIndex = i;
        hightestMatch = matchingDigits;
      }
      // System.out.printf("%d\t\t%f\t\t%f\t%d\n", i, myCalc, e2, matchingDigits);
    }
    System.out.println("Math.exp(2): " + Math.exp(2));
    System.out.printf("Best Approximation of e^2 was myExp(2, %d): %f\n", bestIndex, myExp(2, bestIndex) );

  }

  //Exercise 3
  public static int power(double x, int n)
  {
    int result = 1;

    for(int i = 0; i < n; i++)
      result *= x;

    return result;
  }

  //Exercise 4
  public static int factorial(int n)
  {
    int result = 1;
    for(int i = n; i > 1; i--)
      result*=i;
    return result;
  }

  //Exercise 5
  public static double myExp(int x, int n)
  {
    double sum = 1;
    int num = 1;
    int den = 1;
    for(int i = 1; i <= n; i++)
    {
      num *= x;
      den *= i;
      sum += (double)num/den;
    }
    return sum;
  }

  public static int countSameDigits(double a, double b)
  {
    String strA = String.valueOf(a);
    String strB = String.valueOf(b);

    int count = 0;
    int charIndex = 0;
    while(charIndex < strA.length() && charIndex < strB.length())
    {
      if(strA.charAt(charIndex)==strB.charAt(charIndex))
      {
        count++;
        charIndex++;
      }
      else
      {
        break;
      }
    }
    return count;
  }

}
