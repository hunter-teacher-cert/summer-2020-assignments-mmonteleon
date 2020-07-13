import java.util.*;
public class StackApplications
{
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
    // Create a Stack to hold the individual words
    Stack<String> wordStack = pushWordsToStack(s);
    // Bottom of stack holds first word, top holds last.

    // Reverse the word order
    String reversed = "";
    while(!wordStack.empty())
    {
      reversed += wordStack.pop() + " " ;
    }

    return reversed.substring(0, reversed.length()-1);
  } //End reversedWords


  private static Stack<String> pushWordsToStack(String s)
  {
    //Create a String ArrayList to hold individual words
    Stack<String> words = new Stack<String>();

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
          words.push(word);
        word = "";
      }
    }// end for
    words.push(word);

    return words;
  }

  public static boolean isPalindromeSentence(String s)
  {
    return s.equals(reverseWords(s));
  }

}//End Class
