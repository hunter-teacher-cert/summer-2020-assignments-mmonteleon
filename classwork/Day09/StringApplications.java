import java.util.*;
public class StringApplications
{
  public static String reverse(String s)
  {
    String rev = "";
    for(int i = s.length() -1; i >= 0; i--)
      rev += s.charAt(i);
    return rev;
  }

  public static boolean isPalindrome(String s)
  {
    return s.equals(reverse(s));
  }

  public static String reverse2(String sentence)
  {
    ArrayList<String> words = stringToWordList(sentence);
    String rev = "";
    for(String word: words)
      rev = word + " " + rev;
    return rev.substring(0, rev.length()-1); //get rid of the space at the end
  }

  public static boolean isPalindrome2(String sentence)
  {
    return sentence.equals(reverse2(sentence));
  }

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

}// End main
