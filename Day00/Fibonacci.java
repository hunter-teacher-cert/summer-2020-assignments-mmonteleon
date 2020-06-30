public class Fibonacci
{
  public static void main(String[] args) {

    System.out.println("Fibonacci Sequence from n=1 to n=10");
    for(int i = 1; i <= 10; i++)
        System.out.print(fib(i) + " ");
    System.out.println();
  }

  //@param int n
  //@return the value of the nth element of a Fibonacci sequence
  public static int fib(int n)
  {
    if(n ==1 || n==2)
      return 1;
    else
      return fib(n-1) + fib(n-2);
  }
}
