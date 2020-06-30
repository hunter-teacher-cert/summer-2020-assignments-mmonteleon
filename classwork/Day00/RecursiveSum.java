import java.util.Arrays;
public class RecursiveSum
{
  public static void main(String[] args) {

    //Generate an array of random integers
    int[] arr = new int[1000];
    for(int i = 0; i < arr.length; i++)
      arr[i] = (int)(Math.random()*100 + 1);

    System.out.println("Recursive Sum v1: " + recursiveSum(arr));
    System.out.println("Recursive Sum v2: " + recursiveSum2(arr));

    /* Time Difference between recursiveSum and recursiveSum2
    * Observations: When the array is small, the difference is negligible.
    * When the array is large, recursiveSum is the faster method.  I believe
    * this is because in recursiveSum2, the array is copied in memory every time
    * copyOfRange is called.  This takes time and memory resources.
    */
    // double rsStart, rsEnd, rs2Start, rs2End;
    // rsStart = System.nanoTime();
    // System.out.println("Recursive Sum V1: " +recursiveSum(arr));
    // rsEnd = System.nanoTime();
    // double rsTime = rsEnd - rsStart;
    //
    // rs2Start = System.nanoTime();
    // System.out.println("Recursive Sum V2: " +recursiveSum2(arr));
    // rs2End = System.nanoTime();
    // double rs2Time = rs2End - rs2Start;
    //
    // System.out.println("V1 Time: "+ rsTime + " V2 Time: " + rs2Time + " Difference: "+ (rs2Time - rsTime) + " nanoseconds");

  }

    /*
    * return the sum of integers in array "ia" from the "start" index until
    *  the "end" index (inclusive)
    */
    public static int recursiveSum(int[] ia, int start, int end) {
      if(start == end)
        return ia[start];
      else
        return ia[start] + recursiveSum(ia, start+1, end);
    }

    // return the sum of all the integers in an array
    public static int recursiveSum(int[] ia)
    {
      return recursiveSum(ia, 0, ia.length-1);
    }

    //return the sum of all the integers in an array
   public static int recursiveSum2(int[] ia)
   {
     if(ia.length == 0)
      return 0;
      else
        return ia[0] + recursiveSum2(Arrays.copyOfRange(ia, 1, ia.length));
   }
}
