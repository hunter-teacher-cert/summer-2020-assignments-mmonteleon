import java.io.*;
import java.util.*;

public class BoogleCount
{
  //return index of first occurence of target, or -1 if not found
  // Code stolen from Topher & Dragon.
  public static int linSearch( ArrayList al, int target )
  {
    int count = 0;
    for( int pos=0; pos<al.size(); pos++) {
      count++;
      if (al.get(pos).equals(target))
      {
        System.out.println("linSearch count: " + count);
        return pos;
      }

    }
    System.out.println("linSearch count: " + count);
    return -1;
  }//end linSearch()

  /******** Margie's work here *************/

  public static ArrayList<Integer> getPredictableArray(int numElems)
  {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0; i < numElems; i++)
      arr.add(2*i);
    return arr;
  }
  //Recursive binary search
  public static int binSearch(ArrayList al, int target)
  {
      return binSearch(al, target, 0, al.size()-1, 0);
  }

  //Recursive binSearch helper (overloaded method)
  public static int binSearch( ArrayList al, int target, int min, int max, int count )
  {
    if(al == null  || al.size() == 0)
    {
      System.out.println("binSearchR count: " + count);
      return -1;
    }


    if(min <= max)
    {
      int middle = (min + max) / 2;
      if((int)(al.get(middle)) == target)
      {
        System.out.println("binSearchR count: " + count);
        return middle;
      }
      else if((int)(al.get(middle)) > target)
        return binSearch(al, target, min, middle-1, count+1);
      else if((int)(al.get(middle)) < target)
        return binSearch(al, target, middle + 1, max, count+1);
    }
    System.out.println("binSearchR count: " + count);
    return -1;
  }//end binSearch()


  //Iterative binary search
  public static int binSearch2(ArrayList al, int target)
  {
    int count = 0;
    if(al == null  || al.size() == 0)
    {
      System.out.println("binSearchI count: " + count);
      return -1;
    }


    int min = 0;
    int max = al.size()-1;
    while(min <= max)
    {
      count++;
      int middle = (min + max) / 2;
      if((int)(al.get(middle)) == target)
      {
        System.out.println("binSearchI count: " + count);
        return middle;
      }
      else if((int)(al.get(middle)) > target)
        max = middle-1;
      else if((int)(al.get(middle)) < target)
        min = middle + 1;
    }
    return -1;
  }//end binSearch()



}//end class
