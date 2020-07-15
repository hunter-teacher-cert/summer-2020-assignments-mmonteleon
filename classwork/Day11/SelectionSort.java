import java.util.*;
public class SelectionSort
{

  public static void selectionSort(ArrayList<Integer> arr)
  {
    for(int i = 0; i < arr.size()-1; i++)
    {
      int smallestIndex = findSmallest(arr, i, arr.size()-1);
      swap(arr, i, smallestIndex);
    }
  }

  /*
  * Purpose: Swaps the elements in the array at the given indices
  */
  public static void swap(ArrayList<Integer> arr, int index1, int index2)
  {
    int temp = arr.get(index1);
    arr.set(index1, arr.get(index2));
    arr.set(index2, temp);
  }


  /*
  * Purpose: Returns the index of the smallest value in an Integer array in the given range.
  */
  public static int findSmallest(ArrayList<Integer> al, int lo, int hi)
  {
    if(al == null || al.size()==0 || lo < 0 || hi >= al.size())
      throw new IllegalArgumentException();

    int smallestIndex = lo;
    int smallestElem = al.get(lo);

    for(int i = lo + 1; i <= hi; i++)
    {
      if(al.get(i) < smallestElem)
      {
        smallestIndex = i;
        smallestElem = al.get(i);
      }
    }

    return smallestIndex;
  }

  /*
  * Purpose: Returns the index of the smallest value in an Integer aray.
  */
  public static int findSmallest(ArrayList<Integer> al)
  {
    if(al == null || al.size() == 0)
      return -1;

    return findSmallest(al, 0, al.size()-1);
  }

  /*
  * Purpose: Generate an array of random Integers with "num" elements
  */
  public static ArrayList<Integer> makeItArRain(int num) //Topher, you're not the only punny one.
  {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i < num; i++)
    {
      int rando = (int)(num * Math.random());
      arr.add(rando);
    }
    return arr;
  }


}//end class
