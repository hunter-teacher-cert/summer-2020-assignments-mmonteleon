import java.io.*;
import java.util.*;

public class Boogle
{

  //return index of first occurence of target, or -1 if not found
  public static int linSearch( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end linSearch()

  /******** Margie Wuz Here ************/
  public static int binSearch(ArrayList al, int target)
  {
      return binSearch(al, target, 0, al.size()-1);
  }

  //return index of target, or -1 if not found
  public static int binSearch( ArrayList al, int target, int min, int max )
  {
    if(al == null  || al.size() == 0)
      return -1;

    if(min <= max)
    {
      int middle = (min + max) / 2;
      if((int)(al.get(middle)) == target)
        return middle;
      else if((int)(al.get(middle)) > target)
        return binSearch(al, target, min, middle-1);
      else if((int)(al.get(middle)) < target)
        return binSearch(al, target, middle + 1, max);
    }
    return -1;
  }//end binSearch()


  //return index of target, or -1 if not found
  public static int binSearch2(ArrayList al, int target)
  {
    if(al == null  || al.size() == 0)
      return -1;

    int min = 0;
    int max = al.size()-1;
    while(min <= max)
    {
      int middle = (min + max) / 2;
      if((int)(al.get(middle)) == target)
        return middle;
      else if((int)(al.get(middle)) > target)
        max = middle-1;
      else if((int)(al.get(middle)) < target)
        min = middle + 1;
    }
    return -1;
  }//end binSearch()

  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()


  //return ArrayList of random ints, sorted in ascending order
  public static ArrayList prestoSortedArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    for(int i=1; i<numItems; i++) {
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()

  /* OVERLOADED prestoSortedArrayListo */
  public static ArrayList<Integer> prestoSortedArrayListo(int numItems)
  {
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(numItems * Math.random()) );

    for(int i=1; i<numItems; i++)
      retArr.add( (int)retArr.get(i-1)
                  + (int)( 1+ 5*Math.random()) ); //previous + random int [1,5]

    return retArr;
  }

  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    // test battery using sorted ArrayLists as search space
    int testCount = 0;
    while(true)
    {
      //Create random sized list (0-20 items inclusive)
      int numItems = (int)(Math.random()*11); //[0,10]
      ArrayList<Integer> al = prestoSortedArrayListo(numItems);  //I overloaded the method
      int target = (int)(Math.random()*20);

      //Print generated array, target, search method results
      System.out.println(" ***** Search Methods Test #" + testCount + " *****");
      System.out.println(al);
      System.out.println("Target: " + target);
      System.out.println("linSearch: " + linSearch(al, target));
      System.out.println("binSearch (recursive): " + binSearch(al, target));
      System.out.println("binSearch (iterative): " + binSearch2(al, target));

      //Run more tests?
      System.out.println("\nEnter to run more tests or Q to quit");
      String choice = input.nextLine();
      if(choice.equals("q") || choice.equals("Q"))
        break;

      testCount++;
    }
  }//end main

}//end class
