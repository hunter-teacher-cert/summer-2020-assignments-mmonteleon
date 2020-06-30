import java.util.Arrays;
public class Day01
{
  public static void main(String[] args)
  {
    int[][] arr = new int[20][20];

    System.out.println("rowPop(arr,0, 69)");
    rowPop(arr, 0, 69);  //Yes, I'm a child.
    print2d(arr);

    System.out.println("colPop(arr,5, 69)");
    colPop(arr,5, 69);
    print2d(arr);

    System.out.println("invert(arr)");
    invert(arr);
    print2d(arr);

    arr = new int[10][10];
    System.out.println("diagonal(arr, 2, 3, 0, 1)");
    diagonal(arr, 2, 3, 0, 8);
    print2d(arr);

    arr = new int[10][10];
    System.out.println("diagonal(arr, 2, 3, 1, 1)");
    diagonal(arr, 2, 3, 1, 8);
    print2d(arr);

    arr = new int[10][10];
    System.out.println("diagonal(arr, 2, 3, 2, 1)");
    diagonal(arr, 2, 3, 2, 8);
    print2d(arr);

    arr = new int[10][10];
    System.out.println("diagonal(arr, 2, 3, 3, 1)");
    diagonal(arr, 2, 3, 3, 8);
    print2d(arr);


  }

  public static void print2d(int[][] d2)
  {
    for (int r=0; r < d2.length; r++)
    {
      for (int c=0; c < d2[r].length; c++)
        System.out.printf("%d ", d2[r][c]);
      System.out.println();
    }//end r for
  }//end print2d

  //Populates row r in d2 with value
  public static void rowPop(int[][] d2, int r, int value)
  {
    for(int c = 0; c < d2[r].length; c++)
      d2[r][c] = value;
  }

  //Populates column c in d2 with value
  public static void colPop(int[][] d2, int c, int value)
  {
    for(int r = 0; r < d2.length; r++)
      d2[r][c] = value;
  }

  /*
    Goes through d2 and modifies each element like so:
    All 0s should become 255
    Any non-0 value should become 0
  */
  public static void invert(int[][] d2)
  {
    for (int r=0; r < d2.length; r++)
      for (int c=0; c < d2[r].length; c++)
        if(d2[r][c] == 0)
          d2[r][c] = 255;
        else
          d2[r][c] = 0;
  }
  /*
    Sets the diagonal starting at d2[r][c] going in direction to value
    direction is one of the following values:
      0: go up and to the left
      1: go up and to the right
      2: go down and to the left
      3: go down and to the right
  */
  public static void diagonal(int[][]d2, int r, int c, int direction, int value)
  {
    int vertical = 0, horizontal = 0;
    if(direction == 0 || direction == 1)
      vertical = -1;
    else
      vertical = 1;

    if(direction == 0 || direction == 2)
      horizontal = -1;
    else
      horizontal= 1;

    int row = r;
    int col = c;
    for(int diag = 0; row >= 0 && col >= 0 && row < d2.length && col < d2[row].length; diag++)
    {
      d2[row][col] = value;
      row += vertical;
      col += horizontal;
    }


  }
}//end class
