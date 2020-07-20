public class NodeTester
{
  public static void main(String[] args) {
    Node start = new Node(0);
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);

    start.setLeft(n1);
    start.setRight(n2);

    n1.setLeft(n3);
    n1.setRight(n4);

    n2.setLeft(n5);
    n2.setRight(n6);

    System.out.println("Get values from left-most branch: ");
    Node cur = start;
    while(cur.getLeft() != null)
    {
      System.out.println(cur.getValue());
      cur = cur.getLeft();
    }

    System.out.println("Get values from right-most branch: ");
    cur = start;
    while(cur.getRight() != null)
    {
      System.out.println(cur.getValue());
      cur = cur.getRight();
    }

    System.out.println("Multiply the right-most Node's in the tree by 10:");
    cur = start;
    while(cur.getRight() != null)
    {
      cur.setValue(cur.getValue()*10);
      System.out.println(cur.getValue());
      cur = cur.getRight();
    }

    System.out.println("Destroy the right branch of the tree.");
    start.setRight(null);
    System.out.println(cur.getRight());

    System.out.println("Get values from right-most branch: ");
    cur = start;
    while(cur.getRight() != null)
    {
      System.out.println(cur.getValue());
      cur = cur.getRight();
    }





  }
}
