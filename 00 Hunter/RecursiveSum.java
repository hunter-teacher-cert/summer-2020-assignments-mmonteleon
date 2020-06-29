public class RecursiveSum
{
  public static void main(String[] args) {
    int[] arr = new int[100];
    for(int i = 0; i < 100; i++)
      arr[i] = i;
    System.out.println("Sum of digits between 0 & 5 inclusive: " +recursiveSum(arr, 0, 5));
    System.out.println("Sum of digits between 0 & 99 inclusive: " +recursiveSum(arr, 0, 99));

  }

  public static int recursiveSum(int[] ia, int start, int end) {
    if(start == end)
      return ia[start];
    else
      return ia[start] + recursiveSum(ia, start+1, end);

    }
}
