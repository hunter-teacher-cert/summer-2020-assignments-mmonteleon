import java.util.Arrays;
public class RecursiveSum
{
  public static void main(String[] args) {
    int[] arr = new int[100];
    for(int i = 0; i < 100; i++)
      arr[i] = i;
    System.out.println("Sum of digits between 0 & 5 inclusive: " +recursiveSum(arr, 0, 5));
    System.out.println("Sum of digits between 0 & 99 inclusive: " +recursiveSum(arr, 0, 99));
    System.out.println("Sum of Elements in array: " +recursiveSum2(arr));

  }

  public static int recursiveSum(int[] ia, int start, int end) {
    if(start == end)
      return ia[start];
    else
      return ia[start] + recursiveSum(ia, start+1, end);

    }

   public static int recursiveSum2(int[] ia)
   {
     if(ia.length == 0)
      return 0;
      else
        return ia[0] + recursiveSum2(Arrays.copyOfRange(ia, 1, ia.length));
   }
}
