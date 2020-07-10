public class MyStackDriver
{
  public static void main(String[] args)
  {
    MyStack s = new MyStack();
    /* Print an empty Stack */
    System.out.println(s);

    /* Testing push*/
    s.push("Don't");
    s.push("push");
    s.push("me!");
    System.out.println(s);

    /* Testing pop*/
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
    /* This should print me! push Don't" */

    //Should throw an exception when uncommented.
    // System.out.println(s.pop());

    //Should throw an exception when uncommented.
    // System.out.println(s.top());

    /* Add some more words to the stack */
    s.push("yoink");
    s.push("yeet");
    s.push("boomer");
    s.push("meme words");
    System.out.println(s);

    /* Test top */
    System.out.println(s.top());
    System.out.println(s.top());
    /* Should print meme words twice*/

  }
}
