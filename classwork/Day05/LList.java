import java.io.*;
import java.util.*;

public class LList
{
  private Node head;

  //Default constructor
  //Initializes an empty linked list.
  public LList()
  {
    head = null;
  }

  //public void addFront(String value)
  //Add a new Node containing value to the front of the list.
  public void addFront(String data)
  {
    Node noob = new Node(data);

    // first point the new node to the beginning
    noob.setNext(head);

    // point head to the new node
    head = noob;
  }//END add

  //Returns true if the list is empty, false otherwise.
  public boolean isEmpty()
  {
    return head == null;
  }

  // Returns the value (not the Node) at the nth Node.
  // Numbering starts at 0
  // If index is out of bounds, return null.
  public String get(int index)
  {
    String str = "null";  //Default string
    int num = 0;    //initial node
    Node pointer = head;

    //loop until reached index OR until the list ends
    while(pointer != null && num != index)
    {
      num++;
      pointer = pointer.getNext();
    }

    if(pointer != null)  //You can only call getData on a Node object
      str = pointer.getData();

    return str;
  }

  // Set the Node at index to contain value
  // If index is invalid, do nothing.
  public void set(int index, String value)
  {
    int num = 0;    //initial node
    Node pointer = head;

    //loop until reached index OR until the list ends
    while(pointer != null && num != index)
    {
      num++;
      pointer = pointer.getNext();
    }

    if(pointer != null)  //You can only call setData on a Node object
      pointer.setData(value);
  }

  // Insert a new Node containing value at index.
  // If index is invalid, do nothing.
  public void insert(int index, String value)
  {
    int num = 0;    //initial node
    Node previous = null, pointer = head;

    //loop until reached index OR until the list ends
    while(pointer != null && num != index)
    {
      previous = pointer;
      num++;
      pointer = pointer.getNext();
    }

    if(num == index)  // index is valid
    {
      if(pointer != null) //not the end of the list
      {
        Node noob = new Node(pointer.getData(), pointer.getNext());
        pointer.setData(value);
        pointer.setNext(noob);
      }
      else
      {
        Node noob = new Node(value);
        previous.setNext(noob);
      }
    }
  }


  //Returns a String representation of the list.
  public String toString()
  {
    String s = "";

    Node tmp;
    tmp = head;
    while (tmp != null)
    {
      s = s + tmp.getData()+"-->";
      // how can we now move tmp to the next node
      // this is the magic linked list idiom!!!!
      // this moves a pointer to the next node!!!
      // It's analagous to i=i+1 for an array (for loop)
      tmp = tmp.getNext();
    }

    s = s + "null";
    return s;
  }//End toString()

  // Returns the index of the first time key occurs in the list.
  // Returns -1 if key is not found.
  public int search(String key)
  {
    int index = 0;
    Node pointer = head;
    while(pointer != null && !pointer.getData().equals(key))
    {
      index++;
      pointer = pointer.getNext();
    }

    if(pointer == null)
      return -1;

    return index;
  }

  // Removes the Node at index from the list.
  // If index is invalid, do nothing.
  public void remove(int index)
  {
    int num = 0;    //initial node
    Node previous = null, pointer = head;

    //loop until reached index OR until the list ends
    while(pointer != null && num != index)
    {
      previous = pointer;
      num++;
      pointer = pointer.getNext();
    }

    if(pointer != null)
    {
      if(previous == null)
        head = pointer.getNext();
      else
        previous.setNext(pointer.getNext());

    }
  }


}//End Class
