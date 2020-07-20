import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree()
    {
	     root = null;
    }

  /* Returns the TreeNode with the given value or null if it doesn't exist
   * Why are we returning the value of the key we just searched for???
   * Why not return the actual TreeNode? OR make this a boolean?
   */
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
      else if (currentValue > key)
      {
        current = current.getLeft();
      }
      else
      {
        current = current.getRight();
      }
    }
    throw new NullPointerException();
  }

    public void seed(){
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

	}


}
