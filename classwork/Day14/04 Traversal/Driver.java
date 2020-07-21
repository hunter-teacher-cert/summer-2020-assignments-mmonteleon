import java.io.*;
import java.util.*;

public class Driver
{
	public static void main(String[] args)
	{
		BSTree t = new BSTree();

		t.seed();

		System.out.println("Preorder Traversal: ");
		t.preorderTraverse();

		System.out.println("Postorder Traversal: ");
		t.postorderTraverse();

		System.out.println("Inorder Traversal: ");
		t.inorderTraverse();


	}//end main
}//end class
