import java.io.*;
import java.util.*;

public class BSTree
{
  private TreeNode root;

  public BSTree()
  {
     root = null;
  }

  public void insert(int key)
  { //these guys deserve their own space... just sayin'

    //Create the new TreeNode with the key
    TreeNode newNode = new TreeNode(key);

    // if the tree is empty
    // manually insert the new node as the root
    if (root==null)
    {
      root = newNode;
      return;
    }

    TreeNode front = root;
    TreeNode trailer = null;

    while (front != null)
    {
      int frontValue = front.getData();
      if (frontValue == key)
      {
        // if we're here, it means the key is
        // already in the tree so we can
        // update this node in some way
        // and then return
        return;
      }
      else if (frontValue < key)
      {
        trailer = front;
        front = front.getRight();
      }
      else
      {
        trailer = front;
        front = front.getLeft();
      }
    }//end while

    if(trailer != null)
    {
      if (key > trailer.getData())
      {
        // insert on the right
        trailer.setRight(newNode);
      }
      else
      {
        // insert on left
        trailer.setLeft(newNode);
    }

  }//end insert


  public int search(int key)
  {
    TreeNode current = root;

    while (current != null)
    {
      int currentValue = current.getData();
      if (currentValue == key)
      {
        return currentValue;
      }
      else if (currentValue < key)
      {
        current = current.getRight();
      }
      else
      {
        current = current.getLeft();
      }
    }//end while

    //If the TreeNode doesn't exist, throw a NullPointerException
    throw new NullPointerException();
  }//end search

  public void seed()
  {
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);
  }//end seed

  public TreeNode getRoot()
  {
    return root;
  }

}//end class
