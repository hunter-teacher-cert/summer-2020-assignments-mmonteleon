import java.util.*;
public class StackApplications
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    // System.out.println("Enter a word and I will reverse it. ");
    // String word = input.nextLine();
    // System.out.println("Reversed: " + reverse(word));
    //
    // System.out.println("Enter a word and I will tell you if it is a palindrome: ");
    // String pal = input.nextLine();
    // System.out.println("Palindrome? " + isPalindrome(pal));

    System.out.println("Enter a sentence and I will reverse it: ");
    String sentence = input.nextLine();
    System.out.println("Reversed Sentence: " + reverseWords(sentence));

    System.out.println("Enter a sentence and I check to see if it is a palindrome: ");
    String palSentence = input.nextLine();
    System.out.println("Palindrome Sentence? " + isPalindromeSentence(palSentence));

    input.close();

  }

  public static String reverse(String s)
  {
    // Creat a Stack to hold the individual letters
    Stack<Character> letters = new Stack<Character>();

    // Add the individual letters from String s to the Stack
    for(int i = 0; i < s.length(); i++)
    {
      letters.push(s.charAt(i));
    }

    // Create a new String to hold the reversed order
    String reversed = "";
    // Top of the stack holds the last letter entered.  Pop to reverse the order
    while(!letters.empty())
    {
      reversed += letters.pop();
    }

    return reversed;
  }

  public static boolean isPalindrome(String s)
  {
    return s.equals(reverse(s));
  }

  public static String reverseWords(String s)
  {
    //Isolate the individual words and put into the "words" ArrayList
    ArrayList<String> words = words = stringToWordList(s);

    // Creat a Stack to hold the individual words
    Stack<String> wordStack = new Stack<String>();

    // Add each word in "words" to the Stack "wordStack".
    for(String word: words)
    {
      wordStack.push(word);
    }

    // Reverse the word order
    String reversed = "";
    while(!wordStack.empty())
    {
      reversed += wordStack.pop() + " " ;
    }

    return reversed.substring(0, reversed.length()-1);
  } //End reversedWords


  private static ArrayList<String> stringToWordList(String s)
  {
    //Create a String ArrayList to hold individual words
    ArrayList<String> words = new ArrayList<String>();

    // Iterate through the String s,
    // If the letter is NOT a space, add letters to the String "word".
    // else add "word" to the list & reset "word" to an empty string.
    String word = "";
    for(int i = 0; i < s.length(); i++)
    {
      char ch = s.charAt(i);
      if(ch != ' ')
      {
        word += ch;
      }
      else
      {
        if(word.length() != 0)
          words.add(word);
        word = "";
      }
    }// end for
    words.add(word);

    return words;
  }

  public static boolean isPalindromeSentence(String s)
  {
    return s.equals(reverseWords(s));
  }


}//End Class
