import java.util.HashMap;

public class PhoneBook
{
  HashMap<String, Person> pb;

  public PhoneBook()
  {
    pb = new HashMap<String, Person>(26);
  }

  public PhoneBook(int size)
  {
    pb = new HashMap<String, Person>(size);
  }

  public void add(Person p)
  {
    pb.put(p.getLast(), p);
  }

  public Person find(String last)
  {
    return pb.get(last);
  }

  public Person remove(String last)
  {
    return pb.remove(last);
  }

  public String toString()
  {
    String output = "PhoneBook:\n";
    for (Person p : pb.values())
      output += p.toString() + "\n";
    return output;
  }

  public Person reverseLookup(String number)
  {
    for(Person p: pb.values())
    {
      if(p.getPhone().equals(number))
        return p;
    }
    return null;
  }

}//end class
