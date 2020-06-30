public class Arrays
{
  public static void main(String[] args) {
    // Write a program named Arrays.java and in it solve exercises 1, 4 and 5 from chapter 8 in Think Java.
    System.out.println("****** Arrays.java ******");

    System.out.println("\nExercise 1-1:  Powers");
    double[] numbers = {1,2,3,4,5};
    System.out.print("Original Array: ");
    printArr(numbers);
    System.out.print("Squared Array: ");
    printArr(powArray(numbers, 2));
    System.out.print("Cubed Array: ");
    printArr(powArray(numbers, 3));

    System.out.println("\nExercise 1-2: Histogram");
    int[] scores = {1, 2, 5, 5, 5, 1, 2, 3, 1, 2, 0, 2, 2};
    int[] hist = histogram(scores, 5);
    System.out.print("Scores Array: ");
    printArr2(scores);
    System.out.println("Histogram Array: ");
    for(int i = 0; i < hist.length; i++)
    {
      System.out.printf("Score: %d, Frequency: %d\n", i, hist[i]);
    }

    //Print a bar graph of the Score Frequency Histogram
    int max = getMaxFreq(hist);
    System.out.println("\nScore Frequency");

    for(int row = max; row > 0; row--)
    {
      for(int col = 0; col <= 5; col++)
      {
        if(hist[col] >= row)
          System.out.print("x ");
        else
          System.out.print("  ");
      }
      System.out.println("");
    }
    System.out.println("0 1 2 3 4 5");

    System.out.println("\nExercise 4: Index of Max Value");
    int[] randomNums = {9, 4, 7, 2, 3, 1, 8, 4, 4, 10, 6, 8, 2, 7};
    int maxIndex = indexOfMax(randomNums);
    System.out.print("Array: ");
    printArr2(randomNums);
    System.out.printf("The max index is at %d and has the element is %d\n", maxIndex , randomNums[maxIndex]);

    System.out.println("\nExercise 5: Sieve of Eratosthenes");
    System.out.println("Primes from 2-30:");
    printArr2(sieve(30));
    System.out.println("Primes from 2-100:");
    printArr2(sieve(100));


    System.out.println("\nExercise 8: Recursive Max In Range");
    double[] randomDoubles = {1, 3.5, 7, 2.18, 29, 3, 0, 5};
    System.out.print("Array: ");
    printArr(randomDoubles);
    System.out.printf("The max element is %f\n", maxInRange(randomDoubles, 0, randomDoubles.length-1));

    System.out.println("****** END ******");

  }

  public static double[] powArray(double[] a, int power)
  {
    double[] output = new double[a.length];

    for(int i = 0; i < output.length; i++)
    {
      output[i] = Math.pow(a[i], power);
    }

    return output;

  }

  public static void printArr(double[] arr)
  {
    for(double n: arr)
    {
      System.out.print(n + " ");
    }
    System.out.println("");
  }

  public static void printArr2(int[] arr)
  {
    for(int n: arr)
    {
      System.out.print(n + " ");
    }
    System.out.println("");
  }


  public static int[] histogram(int[] scores, int count)
  {
    int[] hist = new int[count+1];
    for(int score: scores)
    {
      hist[score]++;
    }
    return hist;
  }

  public static int getMaxFreq(int[] arr)
  {
    int max = 0;
    for(int freq: arr)
      if(freq > max)
        max = freq;
    return max;
  }

  public static int indexOfMax(int[] array)
  {
    int maxIndex = 0;
    int maxVal= array[0];
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] > maxVal)
      {
        maxIndex = i;
        maxVal = array[i];
      }
    }
    return maxIndex;
  }

  public static double maxInRange(double[] arr, int a, int b)
  {
    if(a==b)
      return arr[a];
    else
    {
      int mid = (a+b)/2;
      return Math.max(maxInRange(arr,a,mid),maxInRange(arr,mid+1,b));
    }
  }

  /*  From https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
  algorithm Sieve of Eratosthenes is
    input: an integer n > 1.
    output: all prime numbers from 2 through n.

    let A be an array of Boolean values, indexed by integers 2 to n,
    initially all set to true.

    for i = 2, 3, 4, ..., not exceeding √n do
        if A[i] is true
            for j = 2i, 3i, 4i ..., not exceeding n do
                A[j] := false

    return all i such that A[i] is true.
    */
    public static int[] sieve(int n)
    {
      //Create Boolean array set indices 2-n to true
      boolean[] isPrime = new boolean[n+1];
      isPrime[0] = false;
      isPrime[1] = false;
      for(int i = 2; i <=n; i++)
        isPrime[i] = true;

      //Set all multiples of the prime numbers to false
      for(int i = 2; Math.pow(i,2) <=n; i++)
        if(isPrime[i])
          for(int j = i+i; j <=n; j+=i )
            isPrime[j] = false;

      //Count the number prime (need this count to generate new array of primes)
      int primeCount = 0;
      for(boolean b: isPrime)
        if(b)
          primeCount++;

      //Create new array of primes
      int[] primes = new int[primeCount];
      int primesIndex = 0;
      for(int i = 0; i <=n; i++)
      {
        if(isPrime[i])
        {
          primes[primesIndex] = i;
          primesIndex++;
        }
      }

      return primes;

    }

}
