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

    }//end if
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
  }

    public TreeNode searchNode(int key)
    {
      TreeNode current = root;

      while (current != null)
      {
        int currentValue = current.getData();
        if (currentValue == key)
        {
          return current;
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

  /* OVERLOADED METHOD
  ** preorderTraverse with no parameters calls preorderTraverse(root)
  ** Prints all the elements in the tree
  ** Element, Left, Right
  */
  public void preorderTraverse()
  {
    preorderTraverse(root);
    System.out.println("");
  }
  /* OVERLOADED METHOD
  ** preorderTraverse(root)prints all the elements in the subtree begining
  ** at "current" TreeNode
  */
  public void preorderTraverse(TreeNode current)
  {
    //If the node is null, return
    if(current == null)
      return;

    //Print the data first
    System.out.print(current.getData() + " ");

    //Traverse Left Subtree
    preorderTraverse(current.getLeft());

    //Traverse right Subtree
    preorderTraverse(current.getRight());
  }//end preorderTraverse

  /* OVERLOADED METHOD
  ** postorderTraverse with no parameters calls postorderTraverse(root)
  ** Prints all the elements in the tree.
  ** Left, Right, Element
  */
  public void postorderTraverse()
  {
    postorderTraverse(root);
    System.out.println("");
  }

  public void postorderTraverse(TreeNode current)
  {
    //If the node is null, return
    if(current == null)
      return;

    //Traverse Left Subtree
    postorderTraverse(current.getLeft());

    //Traverse right Subtree
    postorderTraverse(current.getRight());

    //Print the data last
    System.out.print(current.getData() + " ");
  }//end preorderTraverse

  /* OVERLOADED METHOD
  ** postorderTraverse with no parameters calls postorderTraverse(root)
  ** Prints all the elements in the tree.
  ** Left, Element, right
  ** Prints sorted list.
  */
  public void inorderTraverse()
  {
    inorderTraverse(root);
    System.out.println("");
  }

  public void inorderTraverse(TreeNode current)
  {
    //If the node is null, return
    if(current == null)
      return;

    //Traverse Left Subtree
    inorderTraverse(current.getLeft());

    //Print the data
    System.out.print(current.getData() + " ");

    //Traverse right Subtree
    inorderTraverse(current.getRight());

  }//end preorderTraverse

  /* This is Margie's no-peeking version of delete v1
  ** Pray for me.
  ** It is intended to delete the TreeNode containing the key.
  */
  public void delete(int key)
  {
    //Find the Node with the key
    TreeNode current = root;
    TreeNode previous = null;
    boolean fromLeft = true;
    while(current != null && current.getData() != key)
    {
      int data = current.getData();
      if(data > key)
      {
        previous = current;
        current = current.getLeft();
        fromLeft = true;
      }
      else if(data < key)
      {
        previous = current;
        current = current.getRight();
        fromLeft = false;
      }
    }

    //Case: The TreeNode does not exist
    if(current == null)
      throw new NullPointerException();

    //Case:  The TreeNode is the root
    //You don't have to deal with a "previous" node
    if(previous == null)
    {
      makeBiggestFromLeft(root);
    }
    //Case: The TreeNode is a leaf
    else if(current.getLeft() == null && current.getRight() == null)
    {
      if(fromLeft)
        previous.setLeft(null);
      else
        previous.setRight(null);
    }

    //Case: The TreeNode has exactly one child (Right)
    else if((current.getLeft() == null && current.getRight() != null))
    {
      if(fromLeft)
        previous.setLeft(current.getRight());
      else
        previous.setRight(current.getRight());
    }

    //Case: The TreeNode has exactly one child (Left)
    else if((current.getLeft() != null && current.getRight() == null))
    {
      if(fromLeft)
        previous.setLeft(current.getLeft());
      else
        previous.setRight(current.getLeft());
    }
    else //Case: The TreeNode has 2 children
    {
      makeBiggestFromLeft(current);
    }

  }

  public void makeBiggestFromLeft(TreeNode start)
  {

    //Start at the top of the left Subtree
    TreeNode prev = start;
    TreeNode cur = start.getLeft();
    boolean fromLeft = true;

    //Continually move right to get Node with largest value
    while(cur.getRight() != null)
    {
      fromLeft = false;
      prev = cur;
      cur = cur.getRight();
    }

    //Replace the data with the largest from the subtree
    start.setData(cur.getData());

    //Remove the largets leaf in the subtree
    if(fromLeft)
      prev.setLeft(null);
    else
      prev.setRight(null);
  }//end delete

}//end class
