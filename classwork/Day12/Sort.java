import java.util.*;
public class Sort
{
  
  public static void insertionSort(ArrayList<Integer> arr)
  {
    //if arr contains less than 2 elements, it's already sorted
    if(arr == null || arr.size() < 2)
      return;

    // i is the  index of the unsorted item to be inserted
    // *Start at 1 because a 1 item list is already sorted
    for(int i = 1; i < arr.size(); i++)
    {
      // cur is the index of the item inside the sorted part of the list that
      // we are comparing to the element to be inserted, i
      int cur = i;

      //loop until the unsorted item is placed inside the correct position
      //inside the sorted part of the list
      while(cur-1 >=0  && arr.get(cur-1) > arr.get(cur))
      {
        //swap curr with the element before it in the array
        swap(arr, cur-1, cur);
        cur--;
      }//end while
    }//end for
  }//end insertionSort


  public static void selectionSort(ArrayList<Integer> arr)
  {
    if(arr == null || arr.size() < 2) //STOLEN FROM TSEE
      return;

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
    if(arr == null || index1 < 0 || index1 >= arr.size() || index2 < 0 || index2 >= arr.size())
      throw new IllegalArgumentException();

    int temp = arr.get(index1);
    arr.set(index1, arr.get(index2));
    arr.set(index2, temp);
  }


  /*
  * Purpose: Returns the index of the smallest value in an Integer array in the given range.[lo, hi]
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
