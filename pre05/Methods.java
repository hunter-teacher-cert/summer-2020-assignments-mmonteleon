/*
Write a program named Methods.java with methods that solve exercises 2, 3, and 8 from Chapter 6 in Think Java.
*/

public class Methods
{
  public static void main(String[] args)
  {
    System.out.println("Exercise 2");
    System.out.println("Is 10 divisible by 4? " + isDivisible(10,4));
    System.out.println("Is 12 divisible by 4? " + isDivisible(12,4));
    System.out.println("");

    System.out.println("Exercise 3");
    System.out.println("Could 3, 4, 5 be a triangle?  " + isTriangle(3, 4, 5));
    System.out.println("Could 3, 4, 8 be a triangle?  " + isTriangle(3, 4, 8));
    System.out.println("");

    System.out.println("Exercise 8");
    System.out.println("Ackermann(1,2): " +ack(1,2));
    System.out.println("Ackermann(4,0): " +ack(4,0));
    System.out.println("Ackermann(3,3): " +ack(3,3));

  }

  // Exercise 2
  public static boolean isDivisible(int n, int m)
  {
    return n % m == 0;
  }

  // Exercise 3
  public static boolean isTriangle(int a, int b, int c)
  {
    return a+b > c && b+c > a && a+c > b;
  }

  // Exercise 8
  public static int ack(int m, int n)
  {
    if(m == 0)
      return n+1;
    if(m>0 && n==0)
      return ack(m-1, 1);
    if(m>0 && n>0)
      return ack(m-1, ack(m, n-1));
    else
      return 0;
  }


}
