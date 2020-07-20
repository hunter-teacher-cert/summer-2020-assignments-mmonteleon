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


		System.out.println("Get values from right-most branch: ");
    TreeNode cur = t.getRoot();
    while(cur != null)
    {
      System.out.println(cur.getData());
      cur = cur.getRight();
    }
	}
}
