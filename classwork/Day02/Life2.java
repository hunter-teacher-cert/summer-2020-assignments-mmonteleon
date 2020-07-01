import java.io.*;
import java.util.*;
// import java.util.concurrent.TimeUnit;
class Life2
{
    /*
    *  create a new 2D array, fill it with ' '
    *  representing that the entire board is empty.
    */
  public static char[][] createNewBoard(int rows, int cols)
  {
    char[][] board = new char[rows][cols];
    for (int r = 0; r < rows; r++)
    {
      for (int c = 0; c < cols; c++)
      {
        board[r][c] = ' ';
      }
    }
    return board;
  }


  public static void printBoard(char[][] board)
  {
    for (int r = 0; r < board.length; r++)
    {
      for (int c = 0; c < board[r].length; c++)
      {
        System.out.printf("%c",board[r][c]);
      }
      System.out.println();
    }
    System.out.println("\n\n------------------\n\n");
  }

  /*
  *  set the cell (r,c) to value
  */
  public static void setCell(char[][] board, int r, int c, char val)
  {
    if (r>=0 && r<board.length && c>=0 && c<board[r].length)
    {
      board[r][c] = val;
    }
  }


    /*
    *   Count and return the number of living neigbords around board[r][c]
    */
  public static int countNeighbours(char[][] board, int r, int c)
  {
    int count = 0;

    //Account for EDGE cases
    int rowStart, colStart;
    if(r==0)
      rowStart = 0;
    else
      rowStart = r - 1;
    if(c == 0)
      colStart = 0;
    else
      colStart = c -1;

    //Loop through the 9 spots on the board
    for(int row = rowStart; row >=0 && row < board.length && row <= r+1 ; row++)
    {
      for(int col = colStart; col >=0 && col < board.length && col <= c+1 ; col++)
      {
          if(board[row][col] == 'X')
            count++;
      }
    }
    count -= board[r][c] == 'X' ? 1 : 0;
    return count;
  }//End countNeighbours

    /*
      given a board and a cell, determine, based on the rules for
      Conway's GOL if the cell is alive ('X') or dead (' ') in the
      next generation.

     */
    public static char getNextGenCell(char[][] board,int r, int c)
    {
      // Any LIVE cell with two or three live neighbours survives.
      // Any dead cell with three live neighbours becomes a live cell.
      // All other live cells die in the next generation. Similarly, all other dead cells stay dead.
      int count = countNeighbours(board, r, c);
      if(board[r][c] == 'X') //LIVE
      {
        if(count == 2 || count ==3)
          return 'X';
        else
          return ' ';
      }
      else //dead
      {
        if(count ==3)
          return 'X';
        else
          return ' ';
      }


    }

    /*
      scan the board to generate a NEW board with the
      next generation
    */
  public static char[][] generateNextBoard(char[][] board)
  {
    char newBoard[][] = new char[25][25];
    for(int r = 0; r < board.length; r++)
      for(int c = 0; c < board[r].length; c++)
        newBoard[r][c] = getNextGenCell(board, r, c);

    return newBoard;
  }

  //Generate a test "ten cell board"
  public static void tenCellRow(char[][] board)
  {
    for(int i = 8; i < 18; i++)
      setCell(board, 12, i, 'X');
  }

  public static void main(String[] args)
  {
    char[][] board;
    board = createNewBoard(25,25);
    tenCellRow(board);
    // printBoard(board);
    ImageTest.drawImage(board);

    Scanner in = new Scanner(System.in);
    while(true)
    {
      // System.out.println("Press enter to continue.  Q to quit.");
      // String keyPress = in.nextLine();
      // if(keyPress.equals("Q") || keyPress.equals("q"))
      //   break;
      board = generateNextBoard(board);
      // printBoard(board);
      ImageTest.drawImage(board);
      try
      {
        Thread.sleep(1000);
      }catch(InterruptedException ex){}
    }
  }
}//End Class
