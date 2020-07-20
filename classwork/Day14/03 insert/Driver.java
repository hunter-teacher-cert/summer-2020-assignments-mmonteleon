import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		BSTree t = new BSTree();

		t.seed();
		int value;

		t.insert(69);

		t.insert(4);

		t.insert(3);

		t.insert(17);


		System.out.println("Get values from right-most branch: ");
    TreeNode cur = t.getRoot();
    while(cur != null)
    {
      System.out.println(cur.getData());
      cur = cur.getRight();
    }

		System.out.println("Root-Right-Left-Right");
		System.out.println(t.getRoot().getData());
		System.out.println(t.getRoot().getRight().getData());
		System.out.println(t.getRoot().getRight().getLeft().getData());
		System.out.println(t.getRoot().getRight().getLeft().getRight().getData());

	}
}
