public class Node
{
  /* instance variables */
  private int value;
  private Node leftChild;
  private Node rightChild;

  /* constructors */
  public Node(int value)
  {
    this.value = value;
    this.leftChild = null;
    this.rightChild = null;
  }

  public Node()
  {
    this.value = 0;
    this.leftChild = null;
    this.rightChild = null;
  }

  /* methods */
  public int getValue()
  {
    return this.value;
  }

  public Node getLeft()
  {
    return this.leftChild;
  }

  public Node getRight()
  {
    return this.rightChild;
  }

  public void setValue(int val)
  {
    this.value = val;
  }

  public void setLeft(Node child)
  {
    this.leftChild = child;
  }

  public void setRight(Node child)
  {
    this.rightChild = child;
  }


}
