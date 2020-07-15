import java.io.*;
import java.util.*;

public class SalamanderTraceActivity
{
  /* ***** Topher's Code For Trace Activity *******/
  public static void main(String[] args) {
    ArrayList salamander = new ArrayList();

    //explicitly fill arraylist with intent to search for
    // present and nonpresent values...
    // generate an arraylist with an odd num of elems...
    salamander.add(4);
    salamander.add(8);
    salamander.add(15);
    salamander.add(16);
    salamander.add(23);
    System.out.println(salamander);


    System.out.println("BoogleCount.binSearch(salamander, 8) (1)");
    System.out.println(BoogleCount.binSearch(salamander, 8));  // 1
    System.out.println("BoogleCount.binSearch(salamander, 15) (2)");
    System.out.println(BoogleCount.binSearch(salamander, 15)); // 2
    System.out.println("BoogleCount.binSearch(salamander, 16) (3)");
    System.out.println(BoogleCount.binSearch(salamander, 16)); // 3

    //search for target not in the list
    System.out.println("BoogleCount.binSearch(salamander, 3) (-1)");
    System.out.println(BoogleCount.binSearch(salamander, 3)); // -1
    System.out.println("BoogleCount.binSearch(salamander, 9) (-1)");
    System.out.println(BoogleCount.binSearch(salamander, 9)); // -1

    //add another element, for an even num of elems
    salamander.add(42);
    System.out.println(salamander);
    //search for target in the list
    System.out.println("BoogleCount.binSearch(salamander, 8) (1)");
    System.out.println(BoogleCount.binSearch(salamander, 8));  // 1
    System.out.println("BoogleCount.binSearch(salamander, 15) (2)");
    System.out.println(BoogleCount.binSearch(salamander, 15)); // 2
    System.out.println("BoogleCount.binSearch(salamander, 16) (3)");
    System.out.println(BoogleCount.binSearch(salamander, 16)); // 3

    //search for target not in the list
    System.out.println("BoogleCount.binSearch(salamander, 3) (-1)");
    System.out.println(BoogleCount.binSearch(salamander, 3)); // -1
    System.out.println("BoogleCount.binSearch(salamander, 9) (-1)");
    System.out.println(BoogleCount.binSearch(salamander, 9)); // -1



  }//end main

  /***** End Trace Activity Code *******/

}//end class
