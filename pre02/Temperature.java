import java.util.Scanner;
public class Temperature
{
  public static void main(String[] args) {
    /*
    ** 3.12 Exercise 2   Write a program that converts a temperature from Celsius to
    ** Fahrenheit. It should (1) prompt the user for input, (2) read a double
    ** value from the keyboard, (3) calculate the result, and (4) format the
    ** output to one decimal place. For example, it should display
    ** "24.0 C = 75.2 F".
    */

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a temperature in Celsius: ");
    double c = input.nextDouble();

    double f = 9.0/5 * c + 32;
    System.out.println(c + "C = " + f + "F");


  }
}
