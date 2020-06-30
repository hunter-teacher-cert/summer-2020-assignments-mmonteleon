import java.util.Scanner;
public class Craps
{
  public static Scanner in = new Scanner (System.in);

  public static void main(String[] args) {

      printTitle();
      System.out.println("How many rounds of Craps would you like to play?");
      int rounds = in.nextInt();
      in.nextLine();
      int numWins = 0;
      for(int i = 0; i < rounds; i++)
      {
        System.out.printf("\n***** Round %d *****\n", (i+1));
        if(round())
          numWins++;
      }


  }


  /*roll:  accepts an integer parameter and returns a random number between 1 and that number, inclusive.*/
  public static int roll(int n)
  {
    int dice = (int)(Math.random()*n)+1;
    // System.out.println("Dice Roll: " + dice);
    printDice(dice);
    return dice;
  }

  /*shoot:  accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.*/
  public static int shoot(int numDice, int max)
  {
    System.out.print("\nPress enter to shoot dice.");
    in.nextLine();
    int sum = 0;
    for(int i = 0; i < numDice; i++)
      sum += roll(max);
    System.out.println("Total: " + sum);
    return sum;
  }

  /*round: It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

  A round is played as follows:

    The shooter shoots (rolls) the dice.

    If they roll a 2,3, or 12,that’s Craps and they lose.
    If they roll a 7 or 11, that’s a Natural and they win.
    Otherwise:

  the value they rolled is now called the Point
  the shooter continues to shoot (roll) until they either rolls the Point again at which point they win or he rolls a 7 at which point they lose.*/
  public static boolean round()
  {
    int shootDice = shoot(2,6);
    if(shootDice==2 ||shootDice==3 ||shootDice==12)
    {
        System.out.println("Craps!");
        System.out.println("You lose this round!");
        return false;
    }
    else if (shootDice==7 ||shootDice==11)
    {
      System.out.println("Natural!");
      System.out.println("You win this round!");
      return true;
    }
    else
    {
      System.out.println("Point!\nShoot again.");
      while(true)
      {
        int shootDice2 = shoot(2,6);
        if(shootDice2==shootDice)
        {
          System.out.println("You win this round!");
          return true;
        }
        if(shootDice2==7)
        {
          System.out.println("You lose this round!");
          return false;
        }
        System.out.println("Shoot again.");
      }
    }
  }

  public static void printTitle()
  {
   System.out.println(" ██████╗██████╗  █████╗ ██████╗ ███████╗");
   System.out.println("██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝");
   System.out.println("██║     ██████╔╝███████║██████╔╝███████╗");
   System.out.println("██║     ██╔══██╗██╔══██║██╔═══╝ ╚════██║");
   System.out.println("╚██████╗██║  ██║██║  ██║██║     ███████║");
   System.out.println(" ╚═════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚══════╝");

  }

  public static void printDice(int n)
  {
    if(n==1)
    {
      System.out.println(" ---");
      System.out.println("|   |");
      System.out.println("| o |");
      System.out.println("|   |");
      System.out.println(" ---");
    }
    if(n==2)
    {
      System.out.println(" ---");
      System.out.println("|o  |");
      System.out.println("|   |");
      System.out.println("|  o|");
      System.out.println(" ---");
    }
    if(n==3)
    {
      System.out.println(" ---");
      System.out.println("|o  |");
      System.out.println("| o |");
      System.out.println("|  o|");
      System.out.println(" ---");
    }
    if(n==4)
    {
      System.out.println(" ---");
      System.out.println("|o o|");
      System.out.println("|   |");
      System.out.println("|o o|");
      System.out.println(" ---");
    }
    if(n==5)
    {
      System.out.println(" ---");
      System.out.println("|o o|");
      System.out.println("| o |");
      System.out.println("|o o|");
      System.out.println(" ---");
    }
    if(n==6)
    {
      System.out.println(" ---");
      System.out.println("|o o|");
      System.out.println("|o o|");
      System.out.println("|o o|");
      System.out.println(" ---");
    }
  }

}
