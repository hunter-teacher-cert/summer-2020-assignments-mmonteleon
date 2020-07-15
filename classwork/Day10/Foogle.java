/**
   classwork -- Day 10 | 0b1010 | 0x10

   class: Foogle

   A tester class for code analysis and search exploration.

   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.

   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Foogle
{


  //  search for target and return index
  public static int search( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end foo()


  //  Returns an ArrayList of random numbers from [lo, low+high) (lo inclusive, low+ high not inclusive)
  public static ArrayList makeRandomArray(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); //0
      //retArr.add( (int)(hi * Math.random()) ); // [0,?)
      retArr.add( lo + (int)(hi * Math.random()) ); // [?,?)
    }
    return retArr;
  }//end makeRandomArray()


  //  <YOUR DESCRIPTIVE COMMENT HERE>
  public static ArrayList randomStaircase(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    // 0 items, return an empty array
    if ( numItems<1 )
      return retArr;

    // add a number between 0 and lo-1
    retArr.add( (int)(lo * Math.random()) );

    // For the rest of the list create a random number GREATER than or equal to the previous
    // The previous value may be increased by a value of low(inclusive) to low + hi (not inclusive)
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); //0
      //retArr.add( (int)(hi * Math.random()) ); // [0,?)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [?,?)
      //System.out.println(retArr.get(i-1));  //diag.
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) );
    }

    return retArr;
  }//end randomStaircase()


  public static void main( String[] args )
  {
    // test battery for makeRandomArray()
    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~ */
    System.out.println("\n"+"al000"+":");
    ArrayList al000 = makeRandomArray(0,0,0);
    System.out.println(al000);
    System.out.println(search(al000,3));

    System.out.println("\n"+"al01"+":");
    ArrayList al01 = makeRandomArray(5,0,100);
    System.out.println(al01);
    System.out.println(search(al01,3));

    System.out.println("\n"+"al02"+":");
    ArrayList al02 = makeRandomArray(5,3,10);
    System.out.println(al02);
    System.out.println(search(al02,3));

    System.out.println("\n"+"al05"+":");
    ArrayList al05 = makeRandomArray(20,1,5);
    System.out.println(al05);
    System.out.println(search(al05,3));
    /*  ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


    // test battery for randomStaircase()
    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~*/
    System.out.println("\n"+"sal000"+":");
    ArrayList sal000 = randomStaircase(0,0,0);
    System.out.println(sal000);
    System.out.println(search(sal000,3));

    System.out.println("\n"+"sal00"+":");
    ArrayList sal00 = randomStaircase(5,0,100);
    System.out.println(sal00);
    System.out.println(search(sal00,3));

    System.out.println("\n"+"sal01"+":");
    ArrayList sal01 = randomStaircase(5,0,100);
    System.out.println(sal01);
    System.out.println(search(sal01,3));

    System.out.println("\n"+"sal02"+":");
    ArrayList sal02 = randomStaircase(5,3,100);
    System.out.println(sal02);
    System.out.println(search(sal02,3));

    System.out.println("\n"+"sal03"+":");
    ArrayList sal03 = randomStaircase(5,0,100);
    System.out.println(sal03);
    System.out.println(search(sal03,3));

    System.out.println("\n"+"sal04"+":");
    ArrayList sal04 = randomStaircase(20,0,3);
    System.out.println(sal04);
    System.out.println(search(sal04,3));

    System.out.println("\n"+"sal05"+":");
    ArrayList sal05 = randomStaircase(20,1,5);
    System.out.println(sal05);
    System.out.println(search(sal05,3));
    /*  ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


    // System.out.println("\n"+"al"+":");
    // ArrayList al = makeRandomArray(,0,100);
    // System.out.println(al);


  }//end main

}//end class
