import java.io.*;
import java.util.*;

public class LList
{
  private Node head;
  private int length;

  //Default constructor
  //Initializes an empty linked list.
  public LList()
  {
    head = null;
    length = 0;
  }

  //public void addFront(String value)
  //Add a new Node containing value to the front of the list.
  public void addFront(String data)
  {
    //Create the new Node
    Node noob = new Node(data);

    // first point the new node to the beginning
    noob.setNext(head);

    // point head to the new node
    head = noob;

    // increment the length instance variable
    length++;
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
    int num = 0;    //initial node
    Node pointer = head;

    //Loop until end of the list OR reached index
    while(pointer != null && num != index)
    {
      num++;
      pointer = pointer.getNext();
    }

    // If a Node exists at the index, return the data from that Node
    if(pointer != null)
      return pointer.getData();

    // If index NOT found, return null
    return null;
  }

  // Set the Node at index to contain value
  // If index is invalid, do nothing.
  public void set(int index, String value)
  {
    int num = 0;    //initial node
    Node pointer = head;

    // loop until end of the list OR reached index
    while(pointer != null && num != index)
    {
      num++;
      pointer = pointer.getNext();
    }

    // If the Node exists, change the Data
    if(pointer != null)
      pointer.setData(value);
  }

  // Insert a new Node containing value at index.
  // If index is invalid, do nothing.
  public void insert(int index, String value)
  {
    int num = 0;    //initial node index
    Node previous = null, pointer = head;

    //Traverse the list until you reach the Node at index (if it exists)
    // loop until end of the list OR reached index
    while(pointer != null && num != index)
    {
      previous = pointer;
      num++;
      pointer = pointer.getNext();
    }

    // Check if index is valid
    // *adding to the end of the list is valid in this version of insert*
    if(num == index)
    {
      if(pointer != null) //not the end of the list
      {
        Node noob = new Node(value, pointer);
        if(previous != null)  //if noob is NOT the 0th Node
          previous.setNext(noob);
        else    //if noob is going to the front of the LList
          head = noob;
      }
      else  //index is after the end of the list -->insert at the end
      {
        Node noob = new Node(value);
        previous.setNext(noob);
      }
      length++; //increment length of the list
    }//end index is valid
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

    // loop until end of the list OR reached index
    while(pointer != null && num != index)
    {
      previous = pointer;
      num++;
      pointer = pointer.getNext();
    }

    if(pointer != null)  //make sure the Node you want to remove exists
    {
      if(previous == null)  //Check to see if we are removing the 0th Node
        head = pointer.getNext();
      else
        previous.setNext(pointer.getNext());

      length--;
    }
  }

  public int length()
  {
    return length;
  }

}//End Class
