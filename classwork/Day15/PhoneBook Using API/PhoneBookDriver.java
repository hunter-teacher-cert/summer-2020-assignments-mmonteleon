public class PhoneBookDriver
{
  public static void main(String[] args)
  {
    //Create PhoneBook object
    PhoneBook whitePages = new PhoneBook();

    //Create Person objects
    Person p1 = new Person("Zamansky", "Mike", "212-555-5555");
    Person p2 = new Person("Mykolyk", "Topher", "212-222-2222");
    Person p3 = new Person("DW", "JonAlf", "718-555-5555");

    //Add Person objects to the PhoneBook
    whitePages.add(p1);
    whitePages.add(p2);
    whitePages.add(p3);

    //Print the PhoneBook
    System.out.println(whitePages);

    //Find DW
    System.out.println("Looking up DW: ");
    System.out.println(whitePages.find("DW"));

    //Remove DW
    whitePages.remove("DW");
    System.out.println("\nRemoving DW");
    System.out.println(whitePages);

    //Reverse reverseLookup
    System.out.println("Reverse Lookup 212-555-5555");
    System.out.println(whitePages.reverseLookup("212-555-5555"));

  }
}
