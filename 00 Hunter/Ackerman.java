public class Ackerman
{
  public static void main(String[] args) {
    System.out.println("Ackermann(1,2): " +ack(1,2));
    System.out.println("Ackermann(4,0): " +ack(4,0));
    System.out.println("Ackermann(3,3): " +ack(3,3));
  }


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
