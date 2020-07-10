import java.util.ArrayList;
public class MyStack
{
    private ArrayList<String> stack;

      public MyStack()
      {
          stack = new ArrayList<String>();
      }

      // push data on to the stack
      public void push(String data)
      {
          stack.add(0, data);
      }

      // add code to remove and return the
      // item on the top of the stack
      public String pop()
      {
          /**You can't eat a pancake that doesn't exist**/
          if(this.isEmpty())
            throw new IndexOutOfBoundsException("You can't pop from an empty stack.");

          return stack.remove(0);
      }

      // add code to return but not remove the
      // item on the top of the stack
      public String top()
      {
        /**You can't eat a pancake that doesn't exist**/
        if(stack.size() == 0)
          throw new IndexOutOfBoundsException("You can't top from an empty stack.");

        return stack.get(0);
      }

      // return true if the stack has no data, false otherwise
      public boolean isEmpty()
      {
          return stack.size() == 0;
      }

      // add code to return the number of items currently on the stack
      public int size()
      {
          return stack.size();
      }

      public String toString()
      {
        if(this.isEmpty())
          return "Nothing to print here.  Empty Stack.  Move along.";

        String str = "";

        str += "*******Top*******\n";
        for(String s: stack)
          str += s+"\n";
        str += "*******Bottom*******";

        return str;
      }

}
