import java.io.*;
import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		BSTree t = new BSTree();

		t.seed();

		System.out.println("Original: ");
		t.inorderTraverse();

		//Checking Leaf
		System.out.println("Deleting leaf 8:");
		t.delete(8);
		t.inorderTraverse();
		//IT WORKS!

		//Inserting Some More TreeNodes
		t.insert(3);
		t.insert(4);
		t.insert(25);
		System.out.println("Inserting 3, 4, and 25");
		t.inorderTraverse();

		//Deleting Node with one child (child on right)
		t.delete(22);
		System.out.println("Deleting TreeNode with one child: Node 22");
		t.inorderTraverse();
		//IT WORKS

		//Deleting Node with one child (child on left)
		t.delete(5);
		System.out.println("Deleting TreeNode with one child: Node 5");
		t.inorderTraverse();
		//IT WORKS

		//Inserting Some More TreeNodes
		t.insert(1);
		t.insert(2);
		System.out.println("Inserting 1 and 22");
		t.inorderTraverse();

		//Delete Node with 2 children
		t.delete(3);
		System.out.println("Deleting TreeNode with 2 children: Node 3");
		t.inorderTraverse();
		//IT WORKS!!!!!

		//Delete root
		t.delete(10);
		System.out.println("Deleting Root: Node 10");
		t.inorderTraverse();
		//IT WORKS!!!!!

	}//end main
}//end class
