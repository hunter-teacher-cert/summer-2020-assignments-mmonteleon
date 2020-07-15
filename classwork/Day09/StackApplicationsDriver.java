import java.util.Scanner;
public class StackApplicationsDriver
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word and I will reverse it. ");
    String word = input.nextLine();
    System.out.println("Reversed: " + StackApplications.reverse(word));

    System.out.println("Enter a word and I will tell you if it is a palindrome: ");
    String pal = input.nextLine();
    System.out.println("Palindrome? " + StackApplications.isPalindrome(pal));

    System.out.println("Enter a sentence and I will reverse it: ");
    String sentence = input.nextLine();
    System.out.println("Reversed Sentence: " + StackApplications.huh(sentence));

    System.out.println("Enter a sentence and I check to see if it is a palindrome: ");
    String palSentence = input.nextLine();
    System.out.println("Palindrome Sentence? " + StackApplications.isPalindrome2(palSentence));

    System.out.println("Enter a mathematical expression and I will check if the parenthesis match: ");
    String math1 = input.nextLine();
    System.out.println("Matching Parenthesis? " + StackApplications.parenCheck(math1));

    input.close();

  }
}
