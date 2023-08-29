public class Main {
  public static void main(String[] args) {
    User user = new User("Kathryn");

    // Potential Null Pointer Exception!
    String city = user.getAddress().getCity();
    System.out.println("City: " + city);
  }
}

class User {
  private String name;
  private Address address;

  public User(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}

class Address {
  private String city;

  public Address(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }
}