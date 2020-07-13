import java.util.Scanner;
public class StringApplicationsDriver
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word and I will reverse it. ");
    String word = input.nextLine();
    System.out.println("Reversed: " + StringApplications.reverse(word));

    System.out.println("Enter a word and I will tell you if it is a palindrome: ");
    String pal = input.nextLine();
    System.out.println("Palindrome? " + StringApplications.isPalindrome(pal));

    System.out.println("Enter a sentence and I will reverse it: ");
    String sentence = input.nextLine();
    System.out.println("Reversed Sentence: " + StringApplications.reverse2(sentence));

    System.out.println("Enter a sentence and I check to see if it is a palindrome: ");
    String palSentence = input.nextLine();
    System.out.println("Palindrome Sentence? " + StringApplications.isPalindrome2(palSentence));

    input.close();

  }
}
