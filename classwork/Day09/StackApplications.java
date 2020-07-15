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
    Stack<String> stacky = new Stack<String>();
    int middle = (s.length()-1)/2;

    for(int i = 0; i <= middle; i++)
    {
        String ch = s.substring(i,i+1);  //isolate the character at index i
        stacky.push(ch);
    }

    if(s.length() % 2 == 1) //odd lengths have a shared middle character
      stacky.pop();

    for(int i = middle + 1; i < s.length(); i++)
    {
      String ch = s.substring(i,i+1);
      if(!(stacky.pop().equals(ch)))  // if letters don't match
        return false;
    }

    return stacky.isEmpty();
  }

  /*
  * This palindrome checker is for SENTENCES
  * Checks if the words are palindrome ex: "I palindrome I"
  * FYI: "I palindrome I" is a They Might Be Giants Song
  */
  public static boolean isPalindrome2(String s)
  {
    Stack<String> stacky = new Stack<String>();
    String[] words = s.split(" ");
    int middle = (words.length-1)/2;

    for(int i = 0; i <= middle; i++)
    {
        String word = words[i];  //isolate the word at index i
        stacky.push(word);
    }

    if(words.length % 2 == 1) //odd lengths have a shared middle word
      stacky.pop();

    for(int i = middle + 1; i < words.length; i++)
    {
      String word = words[i];
      if(!(stacky.pop().equals(word)))  // if words don't match
        return false;
    }

    return stacky.isEmpty();
  }

  /*
  * This version of reverse reverse WORD order and NOT CHARACTERS
  * returns a String with the reversed words
  */
  public static String huh(String s)
  {
    // Create a Stack to hold the individual words
    Stack<String> wordStack = new Stack<String>();
    //Split the string into words
    String[] wordsArr = s.split(" ");

    for(String word: wordsArr)
      wordStack.push(word);
    // Bottom of stack holds first word, top holds last.

    // Reverse the word order
    String reversed = "";
    while(!wordStack.empty())
    {
      reversed += wordStack.pop() + " " ;
    }

    return reversed.substring(0, reversed.length()-1);
  } //End reversedWords



  public static boolean parenCheck(String s)
  {
    Stack<String> stacky = new Stack<String>();

    for(int i = 0; i < s.length(); i++)
    {
      char ch = s.charAt(i);
      if(ch == '(')
        stacky.push("(");
      else if(ch == ')')
      {
        if(!stacky.isEmpty())
          stacky.pop();
        else
          return false;
      }
    }
    return stacky.isEmpty();
  }


}//End Class
