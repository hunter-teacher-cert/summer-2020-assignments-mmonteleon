public class Loops
{
  public static void main(String[] args)
  {
    /*Write a program named Loops.java which has solutions to excercises 3, 4, and 5 from chapter 7 of Think Java.*/
    System.out.println("Exercise 3:  Iterative power method");
    System.out.println("2^3: " + power(2,3));
    System.out.println("10^4: " + power(10,4));
    System.out.println("");

    System.out.println("Exercise 4:  Iterative Factorial");
    System.out.println("3!: " + factorial(3));
    System.out.println("5!: " + factorial(5));
    System.out.println("");

    System.out.println("Exercise 5:  Iterative e^x");
    System.out.println("e^1: " + myExp(1, 8) + ", Math.exp(1): " + Math.exp(1));
    System.out.println("e^3: " + myExp(3, 10) + ", Math.exp(3): " + Math.exp(3));
    System.out.println("e^5: " + myExp(5, 8) + ", Math.exp(5): " + Math.exp(5));
    System.out.println("");

    System.out.println("*Note: myExp was written by me.  myExp2 was from Stack Overflow*");
    System.out.println("Terms\tmyExp\t\tmyExp2\t\tMath.exp");
    for(int i = 1; i <= 20; i++)
    {
      System.out.printf(i+ "\t%.5f\t\t%.5f\t\t%.5f\n", myExp(1, i), myExp2(1, i), Math.exp(1));
    }
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

  //Stack Overflow Version
  public static double myExp2(double myX, double myPower){

        double firstResult = myX;
        double denom = 1;
        double sum =myX;

        for(int count =1;count<myPower;count++){

            firstResult = firstResult*myX;//handles the numerator

            denom = denom*(denom+1);//handles the denominator

            firstResult = firstResult/denom;//handles the segment

            sum =sum+firstResult;// adds up the different segments
        }

        return (sum+1);//gets the final result
    }
}
