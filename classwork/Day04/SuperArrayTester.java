public class SuperArrayTester
{
  public static void main(String[] args) {
    SuperArray arr = new SuperArray();

        for(int i = 0; i < 10; i++)
        {
            arr.add(i);
        }

        System.out.println("Original");
        System.out.println(arr);

        System.out.println("\nAdding 99 to the 3rd element.");
        arr.add(3,99);
        System.out.println("Element 3: " + arr.get(3) + "\n");

        System.out.println("After 99 was added:");
        System.out.println(arr);

        System.out.println("\nRemoving 0");
        arr.remove(0);

        System.out.println("After 0 was removed.");
        System.out.println(arr);


  }
}
