public class Person
{
  private String lastName;
  private String firstName;
  private String phoneNumber;

  public Person(String last, String first, String phone)
  {
    this.lastName = last;
    this.firstName = first;
    this.phoneNumber = phone;
  }

  public String getLast()
  {
    return this.lastName;
  }

  public String getFirst()
  {
    return this.firstName;
  }

  public String getPhone()
  {
    return this.phoneNumber;
  }

  public String toString()
  {
    return lastName + ", " + firstName + " " + phoneNumber;
  }
}
